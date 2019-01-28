import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int K = sc.nextInt();
            String[] PQ = sc.next().split("/");
            int P = Integer.parseInt(PQ[0]);
            int Q = Integer.parseInt(PQ[1]);
            int count = 0;
            String path = "";

            //Stop when either P or Q is 1, otherwise prepend to the path
            //to traverse upwards with.
            while (P != 1 || Q != 1) {
                if (P > Q) {
                    P -= Q;
                    path = "R" + path;
                } else {
                    Q -= P;
                    path = "L" + path;
                }
            }

            for (int j = 0; j < path.length(); j++) {
                if (path.charAt(j) == 'R') count = 2 * (count + 1);
                else count = 2 * count + 1;
            }

            System.out.println(K + " " + ++count);
        }
    }

}
