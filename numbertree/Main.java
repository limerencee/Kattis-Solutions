import java.util.Scanner;

class Main {

    static int calculateRoot(int height) {
        if (height == 0) {
            return 1;
        }
        return (int) Math.pow(2, height) + calculateRoot(--height);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int root = calculateRoot(height);

        if (!sc.hasNextLine()) {
            System.out.println(root);
            return;
        }

        String command = sc.nextLine().trim();
        char[] directions = command.toCharArray();
        int weight = 1;
        int output = root;
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == 'L') {
                output -= weight;
                weight *= 2;
            } else if (directions[i] == 'R') {
                output -= weight + 1;
                weight *= 2;
                weight++;
            }
        }

        System.out.println(output);

    }

}
