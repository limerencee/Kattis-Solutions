import java.util.Scanner;

class Main {

    static int sumDigits(int x) {
        return x == 0 ? 0 : x % 10 + sumDigits(x / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        for (int i = l; i <= d; i++) {
            if (sumDigits(i) == x) {
                System.out.println(i);
                break;
            }
        }

        for (int i = d; i >= l; i--) {
            if (sumDigits(i) == x) {
                System.out.println(i);
                break;
            }
        }

    }

}
