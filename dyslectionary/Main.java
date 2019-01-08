import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    static void finishSet(ArrayList<String> list, int maxLength) {

        Collections.sort(list, Comparator.naturalOrder());
        for (String s : list) {
            System.out.println(String.format("%" + maxLength + "s", new StringBuilder(s).reverse().toString()));
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int maxLength = 0;
        int wordCount = 0;

        while (sc.hasNext() && wordCount < 100) {
            String currentLine = sc.nextLine();
            if (currentLine.equals("")) { //new set coming
                finishSet(list, maxLength);
                System.out.println();
                list.clear();
                maxLength = 0;
                wordCount = 0;
            } else {
                int currentLineLength = currentLine.length();
                if (currentLineLength > maxLength) {
                    maxLength = currentLineLength;
                }
                list.add(new StringBuilder(currentLine).reverse().toString());
                wordCount++;
            }
        }

        finishSet(list, maxLength);

    }

}
