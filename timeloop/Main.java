import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
