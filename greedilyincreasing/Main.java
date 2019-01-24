import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        int inputSize = sc.nextInt();
        int currentMax = sc.nextInt();
        sequence.add(currentMax);

        for (int i = 0; i < inputSize - 1; i++) {
            int current = sc.nextInt();
            if (current > currentMax) {
                sequence.add(current);
                currentMax = current;
            }
        }

        System.out.println(sequence.size());
        System.out.println(Arrays.toString(sequence.toArray()).replace("[", "").replaceAll(",", "").replace("]", ""));

    }

}
