import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] temp = new int[N];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int output = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) max = arr[i];
            temp[i] = max;
        }

        for (int i = N - 1; i >= 0; i--) {
            if (min > arr[i]) min = arr[i];
            if (min == temp[i]) output++;
        }

        System.out.println(output);
    }

}
