import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int deckCount = sc.nextInt();

        for (int i = 0; i < deckCount; i++) {

            int nextCard = sc.nextInt();

            if (stack.size() == 0) { //first card
                stack.push(nextCard);
                continue;
            }

            if ((stack.peek() + nextCard) % 2 == 0) {
                stack.pop();
            } else {
                stack.push(nextCard);
            }
        }

        System.out.println(stack.size());

    }

}
