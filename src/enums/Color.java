package enums;

/**
 *
 * Файл енумс с цветами.
 *
 */

public enum Color {

    ANSI_RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private String color;
    private static final Integer NUM = 8;

    Color(final String color1) {
        this.color = color1;
    }

    public String getColor() {
        return color;
    }

    static String getRandomColor() {
        int min = 1;
        int max = NUM;
        max -= min;
        double avg = (Math.random() * max) + min;
        return Color.values()[(int) avg].getColor();
    }

}


