import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int taskCount = sc.nextInt();
        int timeLimit = sc.nextInt();
        int counter = 0;

        for (int i = 0; i < taskCount; i++) {
            int currentTask = sc.nextInt();
            timeLimit -= currentTask;
            if (timeLimit < 0) {
                break;
            } else {
                counter++;
            }
        }

        System.out.println(counter);

    }

}
