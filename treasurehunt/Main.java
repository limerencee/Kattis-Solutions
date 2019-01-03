import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine(); //flush out current line
        char[][] map = new char[r + 1][c + 1];

        //Initialize map
        for (int i = 0; i < r; i++) {
            char[] lineInput = sc.nextLine().toCharArray();
            for (int j = 0; j < c; j++) {
                map[i+1][j+1] = lineInput[j];
            }
        }

        //Prepare game
        int moves = 0;
        int maxMoves = r * c;
        int currentR = 1;
        int currentC = 1;

        while (currentR > 0 && currentR <= r && currentC > 0 && currentC <= c) {

            //Retrieve current tile and check if out of bound
            char player = map[currentR][currentC];
            if (moves > maxMoves) {
                System.out.println("Lost");
                return;
            }

            //Evaluate current tile
            if (player == 'T') {
                System.out.println(moves);
                return;
            } else if (player == 'N') {
                currentR--;
            } else if (player == 'S') {
                currentR++;
            } else if (player == 'W') {
                currentC--;
            } else if (player == 'E') {
                currentC++;
            }

            //Increment move count
            moves++;

        }

        //Out of playing field
        System.out.println("Out");

    }

}
