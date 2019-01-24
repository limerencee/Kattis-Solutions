import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int testCases = 0; testCases < 100; testCases++) {

            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[] list1 = new int[n];
            int[] list2 = new int[n];
            int[] originalInput = new int[n];

            for (int i = 0; i < n; i++) {
                list1[i] = sc.nextInt();
                originalInput[i] = list1[i];
            }

            for (int i = 0; i < n; i++) {
                list2[i] = sc.nextInt();
            }

            //Sort both lists to "map" their indices together.
            Arrays.sort(list1);
            Arrays.sort(list2);

            //For each item in original list1, search for the index in
            //sorted list1 and print the same index from list2.
            for (int i = 0; i < n; i++) {
                int index = Arrays.binarySearch(list1, originalInput[i]);
                System.out.println(list2[index]);
            }

            System.out.println();

        }

    }

}
