package lesson10.homework1;

public class StringEdit {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private static boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean stringCheck(String s) {
        if (s.length() == 22) {
            String[] text_block = s.split("-");
            if (!isDigit(text_block[0])) {
                System.out.println("Wrong string at " + ANSI_RED + text_block[0] + ANSI_RESET);
                return false;
            } else if (!isAlpha(text_block[1])) {
                System.out.println("Wrong string at " + ANSI_RED + text_block[1] + ANSI_RESET);
                return false;
            } else if (!isDigit(text_block[2])) {
                System.out.println("Wrong string at " + ANSI_RED + text_block[2] + ANSI_RESET);
                return false;
            } else if (!isAlpha(text_block[3])) {
                System.out.println("Wrong string at " + ANSI_RED + text_block[3] + ANSI_RESET);
                return false;
            } else if (!isAlpha(String.valueOf(text_block[4].charAt(1) + text_block[4].charAt(3))) &&
                    !isDigit(String.valueOf(text_block[4].charAt(0) + text_block[4].charAt(2)))) {
                System.out.println("Wrong string at " + ANSI_RED + text_block[4] + ANSI_RESET);
                return false;
            } else return true;
        } else {
            System.out.println("Wrong string");
            return false;
        }
    }

    public static void show2Block(String s) {
        String[] text_block = s.split("-");
        System.out.println(text_block[0] + text_block[2]);
    }

    public static void showReplacedChars(String s) {
        StringBuilder new_s = new StringBuilder(s);
        System.out.println(new_s.replace(5, 8, "***").replace(14, 17, "***"));
    }

    public static void showOnlyLowerChars(String s) {
        String[] text_block = s.split("-");
        StringBuilder new_s = new StringBuilder();
        System.out.println(new_s.append(text_block[1].toLowerCase()).append("/").append(text_block[3].toLowerCase())
                .append("/").append(String.valueOf(text_block[4].charAt(1)).toLowerCase()).append("/").append(String.valueOf(text_block[4].charAt(3))));
    }

    public static void showOnlyUpperChars(String s) {
        String[] text_block = s.split("-");
        StringBuilder new_s = new StringBuilder();
        System.out.println(new_s.append("Letters:").append(text_block[1].toUpperCase()).append("/").append(text_block[3].toUpperCase())
                .append("/").append(String.valueOf(text_block[4].charAt(1)).toUpperCase()).append("/").append(String.valueOf(text_block[4].charAt(3)).toUpperCase()));
    }

    public static void showABCmathes(String s) {
        if (s.regionMatches(true, 5, "abc", 0, 3) ||
                s.regionMatches(true, 14, "abc", 0, 3)) {
            System.out.println("ABC is present");
        } else System.out.println("ABC is absent");
    }

    public static void showStartWith555(String s) {
        if (s.startsWith("555")) {
            System.out.println("String starts with 555");
        } else System.out.println("String doen't start with 555");
    }

    public static void showEndWith1a2b(String s) {
        if (s.endsWith("1a2b")) {
            System.out.println("String ends with 1a2b");
        } else System.out.println("String doen't end with 1a2b");
    }
}

