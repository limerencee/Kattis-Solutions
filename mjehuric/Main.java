import java.util.Scanner;

class Main {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        for (int k = 0; k < 4; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(arr[4]);
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }

    }

}
