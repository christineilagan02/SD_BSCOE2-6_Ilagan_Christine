// 4. Java code that will output the pattern below

public class PatternOutput {
    public static void main(String[] args) {
        int rows = 5;
        String title = "====== Pattern Output ======";

        int totalWidth = rows + (title.length() - rows) * 2;

        System.out.println("\u001B[33m" + centerText(title, totalWidth) + "\u001B[0m");

        for (int i = 1; i <= rows; i++) {
            int numSpaces = (totalWidth - (i * 2 - 1)) / 2;
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("\u001B[32m*\u001B[0m ");
            }

            System.out.println();
        }

        System.out.println("\u001B[33m\t   =============================\u001B[0m");

    }

    public static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < padding; i++) {
            sb.append(" ");
        }
        sb.append(text);
        return sb.toString();
    }

}
