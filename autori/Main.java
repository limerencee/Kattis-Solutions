import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("-");
        StringBuilder output = new StringBuilder();

        for (String s : names) {
            output.append(s.charAt(0));
        }

        System.out.println(output.toString());

    }

}
