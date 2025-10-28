package c_test;

public class ColorUtils {
    public static final String RESET = "\u001B[0m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_CYAN = "\u001B[96m";

    // rainbow color array
    public static final String[] RAINBOW_COLORS = {
            BRIGHT_RED, BRIGHT_YELLOW, BRIGHT_GREEN, BRIGHT_CYAN, BRIGHT_BLUE, BRIGHT_PURPLE
    };

    // method 1: rainbow effect
    public static String rainbow(String text){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            String color = RAINBOW_COLORS[i % RAINBOW_COLORS.length];
            sb.append(color);
            sb.append(text.charAt(i));
        }
        sb.append(RESET);
        return sb.toString();
    }
    
    public static String question(String text){
        return BRIGHT_WHITE + text + RESET;
    }
    public static String intro(String text) {
        return BRIGHT_WHITE + text + RESET;
    }
    public static String introquestion(String text){
        return BRIGHT_PURPLE + text + RESET;
    }
    public static String red(String text){
        return BRIGHT_RED + text + RESET;
    }

    public static String yellow(String text){
        return BRIGHT_YELLOW + text + RESET;
    }

    public static String green(String text){
        return BRIGHT_GREEN + text + RESET;
    }

    public static String cyan(String text){
        return BRIGHT_CYAN + text + RESET;
    }

    public static String purple(String text){
        return BRIGHT_PURPLE + text + RESET;
    }

    public static String blue(String text){
        return BRIGHT_BLUE + text + RESET;
    }

    public static String intro(int number){
        return BRIGHT_WHITE + number + RESET;
    }

}
