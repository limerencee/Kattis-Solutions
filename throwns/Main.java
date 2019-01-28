import java.util.Stack;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> previousCommands = new Stack<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ballHolder = 0;

        for (int i = 0; i < K; i++) {
            String input = sc.next();
            int moves = 0;

            if (input.equals("undo")) {
                int undoCount = sc.nextInt();
                while (undoCount-- > 0) {
                    moves = previousCommands.pop();
                    ballHolder = Math.floorMod(ballHolder + moves, N);
                }
            } else {
                moves = Integer.parseInt(input);
                ballHolder = Math.floorMod(ballHolder + moves, N);
                previousCommands.push(Math.negateExact(moves));
            }
        }

        System.out.println(ballHolder);
    }

}
