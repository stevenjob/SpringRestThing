package hello;

import java.util.concurrent.ThreadLocalRandom;

public class QuoteGen {
    public static String getAQuote() {
        return quotes[ThreadLocalRandom.current().nextInt(0, quotes.length)];
    }

    private static final String[] quotes = {
            "And builds a Heaven in Hell's despair, " +
                    "And builds a Hell in Heaven's despite, " +
                    "The road of excess leads to the palace of wisdom.",
            "He who desires but acts not, breeds pestilence.",
            "If the fool would persist in his folly he would become wise.",
            "Prisons are built with stones of Law, " +
                    "Brothels with bricks of Religion.",
            "The lust of the goat is the bounty of God.",
            "The wrath of the lion is the wisdom of God.",
            "The nakedness of woman is the work of God.",
            "Every thing possible to be believ'd is an image of truth.",
            "The tygers of wrath are wiser than the horses of instruction.",
            "Every Wolf's & Lion's howl raises from Hell a Human Soul.",
            "Thy Heaven doors are my Hell Gates",
            "Truly, My Satan, thou art but a Dunce",
            "Now the sneaking serpent walks in mild humility " +
                    "And the just man rages in the wilds where lions roam.",
            "O Urizen! Creator of men! mistaken Demon of heaven!",
            "Mad, he danc'd on his mountains high & dark as heaven.",
            "But Mark! Active Evil is better than Passive Good.",
            "This Angel, who is now become a Devil, is my particular friend",
            "A dragon form, clashing his scales: at midnight he arose, " +
                    "America is darken'd; and my punishing Demons, terrified, " +
                    "the study of angels, the workmanship of demons " +
                    "Art thou she that made the nations drunk with the cup of Religion?",
            "furious lions sound the song of Joy",
            "The cruel joy of Luvah's daughters, lacerating with knives",
            "They catch the shrieks in cups of gold," +
                    "But the Human Wine stood wondering;",
            "I must Create a System or be enslav'd by another Man's.",
            "I will not Reason & Compare: my business is to Create.",
            "the reason you is against abortion is because you yourself was aborted?",
            "Don't be a spannah, 'IT' ain't a real word. It's short for innit, innit?",
            "R.E.S.T.E.C.P! Do ya even know wha it spellz?",
            "A virtuous abstinence from the joys of pederasty " +
                    "comes most easily to those who have no taste for it.",
            "As long as war is regarded as wicked, it will always have its " +
                    "fascination. When it is looked upon as vulgar, it will cease " +
                    "to be popular.",
            "Democracy means simply the bludgeoning of " +
                    "the people by the people for the people.",
            "Fashion is a form of ugliness so intolerable " +
                    "that we have to alter it every six months.",
            "The only way to behave to a woman is to make love to " +
                    "her if she is pretty and to someone else if she is plain.",
            "The only way to get rid of a temptation is to yield to it.",
            "There is only one thing in the world worse than being talked about, " +
                    "and that is not being talked about.",
            "Whenever people agree with me I always feel I must be wrong.",
            "Why was I born with such contemporaries?",
            "Young men want to be faithful and are not; " +
                    "old men want to be faithless and cannot.",
            "Sex can lead to nasty things like herpes, gonorrhea, and something called relationships",
            "America national sport is called baseballs. It very similar to our sport, shurik, where we" +
                    " take dogs, shoot them in a field, and then have a party.",
            "Do you think if house music was around in the Thirties, World War II would have even happened?"
    };
}
