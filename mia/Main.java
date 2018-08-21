import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s[] = new int[2];
        int t[] = new int[2];
        int s_total, t_total, winner;

        while (true) {
            s[0] = sc.nextInt();
            s[1] = sc.nextInt();
            t[0] = sc.nextInt();
            t[1] = sc.nextInt();

            if (s[0] == 0 && s[1] == 0 && t[0] == 0 && t[1] == 0) {
                break;
            } else {
                s_total = calculateScore(s);
                t_total = calculateScore(t);
                if (s_total == t_total) {
                    System.out.println("Tie.");
                    continue;
                }

                winner = s_total > t_total ? 1 : 2;
                System.out.println("Player " + winner + " wins.");
            }
        }
    }

    static int calculateScore(int[] rolls) {
        int temp;

        //Move the larger digit to the left
        if (rolls[1] > rolls[0]) {
            temp = rolls[0];
            rolls[0] = rolls[1];
            rolls[1] = temp;
        }

        if (rolls[0]*10 + rolls[1] == 21) //21 = highest score
            return 1000;
        else if (rolls[0] == rolls[1]) //pairs = 2nd highest scores
            return rolls[0]*100;
        else
            return rolls[0]*10 + rolls[1]; //all other numbers
    }
}
