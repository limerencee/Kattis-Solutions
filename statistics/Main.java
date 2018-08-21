import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = 1, count, temp, current, highest, lowest, range;

        while (sc.hasNextInt()) {
            //Check the number of samples from the first int
            count = sc.nextInt();

            //If only 1 sample, highest and lowest is the same
            if (count == 1) {
                highest = sc.nextInt();
                lowest = highest;
            } else {
                //Read first 2 samples and do a quick sanity check
                highest = sc.nextInt();
                lowest = sc.nextInt();
                if (lowest > highest) {
                    temp = lowest;
                    lowest = highest;
                    highest = temp;
                }

                //Look through the remaining of the samples (-2 because read 2 samples already)
                for (int i = 0; i < count-2; i++) {
                    current = sc.nextInt();
                    if (current > highest) {
                        highest = current;
                    } else if (current < lowest) {
                        lowest = current;
                    }
                }
            }

            //Get the range of highest and lowest
            range = highest - lowest;

            //Print out the output
            System.out.println("Case " + caseNo + ": " + lowest + " " + highest + " " + range);

            caseNo++;

        }
    }
}
