var templates = {};

function render(template, model, url) {
    var compiledTemplate;
    if (templates[url] === undefined) {
        compiledTemplate = Handlebars.compile(template);
        templates[url] = compiledTemplate;
    } else {
        compiledTemplate = templates[url];
    }
    return compiledTemplate(toJsonObject(model));
}

function toJsonObject(model) {
    var object = {};
    for (var key in model) {
        // Convert Java Iterable and List to real Javascript arrays 
        if (model[key] instanceof Java.type("java.lang.Iterable")) {
            object[key] = Java.from(model[key]);
        } else {
            object[key] = model[key];
        }
    }
    return object;
}
