package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/quotes")
    public List<Quote> makeQuotes() {
        List<Quote> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            list.add(new Quote(counter.incrementAndGet(), QuoteGen.getAQuote()));
        }
        return list;
    }
}