package by.bsu.mmf.kazieva;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSimplifier {
    private final static String ARTICLE_REGEX_INSIDE = "\\W(a|A|The|the|An|an)\\W";
    private final static String ARTICLE_REGEX_START_OR_END = "^(a|A|The|the|An|an)\\W|\\W(a|A|The|the|An|an)$";
    private final static String DOUBLE_LETTER = "([a-z])\\1+";
    private final static String WORDS_ENDING_WITH_LETTER_E = "([a-zA-Z]+)(e|E)(\\W|$)";

    public static String simplifyText(String str) {
        str = removeArticles(str);
        str = removeLetterC(str);
        str = removeDoubleLetter(str);
        str = removeLetterE(str);
        if (!isSimpleText(str)) {
            simplifyText(str);
        }
        return str;
    }

    public static boolean isSimpleText(String str) {
        if (str.contains("ci") || str.contains("ce") || str.contains("ck") || str.contains("c")) {
            return false;
        }
        if (str.contains("ee") || str.contains("oo")) {
            return false;
        }
        Pattern pattern = Pattern.compile(DOUBLE_LETTER);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return false;
        }
        pattern = Pattern.compile(WORDS_ENDING_WITH_LETTER_E);
        matcher = pattern.matcher(str);
        if (matcher.find()) {
            return false;
        }
        return true;
    }

    public static String removeLetterC(String str) {
        str = str.replaceAll("ci", "si");
        str = str.replaceAll("ce", "se");
        str = str.replaceAll("ck", "k");
        str = str.replaceAll("c", "k");
        return str;
    }

    public static String removeDoubleLetter(String str) {
        str = str.replaceAll("ee", "i");
        str = str.replaceAll("oo", "u");
        str = str.replaceAll(DOUBLE_LETTER, "$1");
        return str;
    }

    public static String removeLetterE(String str) {
        str = str.replaceAll(WORDS_ENDING_WITH_LETTER_E, "$1$3");
        return str;
    }

    public static String removeArticles(String str) {
        str = str.replaceAll(ARTICLE_REGEX_START_OR_END, "");
        str = str.replaceAll(ARTICLE_REGEX_INSIDE, " ");
        return str;
    }

}

