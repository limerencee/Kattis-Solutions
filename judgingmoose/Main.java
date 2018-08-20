import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int l, r;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        r = sc.nextInt();

        if (l == 0 && r == 0) {
            System.out.println("Not a moose");
        } else {
            if (l == r) {
                System.out.println("Even " + l*2);
            } else if (l > r) {
                System.out.println("Odd " + l*2);
            } else {
                System.out.println("Odd " + r*2);
            }
        }
    }
}
