import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] paragraph = new String[100];
        int currentLine = 0;
        int maxLength = 1;
        int raggedness = 0;

        //Populate String[] and store longest line count
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
            paragraph[currentLine++] = line;
        }

        //Calculate raggedness for each line except the last (max - current)^2
        for (int i = 0; i < currentLine - 1; i++) {
            raggedness += (maxLength - paragraph[i].length()) * (maxLength - paragraph[i].length());
        }

        System.out.println(raggedness);

    }

}
