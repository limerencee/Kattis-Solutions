import java.util.Arrays;
import java.util.Scanner;

class Main {

    static void run() {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCases; i++) {

            int headCount = Integer.parseInt(sc.nextLine());
            String[][] nameList = new String[headCount][11]; //name + 10-words max title

            for (int j = 0; j < headCount; j++) {
                String input = sc.nextLine();
                String[] nameAndTitle = input.split(" ");
                nameList[j][0] = nameAndTitle[0].replace(":", "");
                String[] titles = nameAndTitle[1].split("-");
                int titleIndex = 0;
                for (int k = 1; k < 11; k++) {
                    //Pre-pend and pad "middle" if the title length is not 10-words long
                    //Index[j][0] is the person's name, title starts from index 1-10
                    String word = titles.length < (11 - k) ? "middle" : titles[titleIndex++];
                    nameList[j][k] = word;
                }
            }

            Arrays.sort(nameList, (x, y) -> {
                for (int j = 10; j >= 1; j--) { //compare title words from right to left.
                    if ((x[j].equals("lower") && y[j].equals("middle")) || ((x[j].equals("lower") || x[j].equals("middle")) && y[j].equals("upper"))) return -1;
                    else if ((y[j].equals("lower") && x[j].equals("middle")) || ((y[j].equals("lower") || y[j].equals("middle")) && x[j].equals("upper"))) return 1;
                    else { //same title words
                        if (j != 1) continue; //if not end of title yet, keep comparing next
                        return y[0].compareTo(x[0]);
                    }
                }
                return 0;
            });

            for (int j = headCount - 1; j >= 0; j--) {
                System.out.println(nameList[j][0]);
            }

            System.out.println("==============================");

        }

    }

    public static void main(String[] args) {
        run();
    }

}
