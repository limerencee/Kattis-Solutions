import java.util.Scanner;

class Main {

    static long mergeSort(long[] inputArr, int low, int high) {
        long count = 0;
        if (low < high) { //Base case low >= high (0 or 1 element)
            int mid = (low + high) / 2;
            //Inversion count will be sum of inversions in left-part, right-part
            //and number of inversions in merging
            count = mergeSort(inputArr, low, mid);
            count += mergeSort(inputArr, mid + 1, high);
            count += merge(inputArr, low, mid, high);
        }
        return count;
    }

    static long merge(long[] inputArr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        long[] outputArr = new long[high - low + 1];
        int index = 0;
        long count = 0;

        while (left <= mid && right <= high) { //prevent left or right out of bounds
            if (inputArr[left] <= inputArr[right]) {
                outputArr[index++] = inputArr[left++];
            } else {
                outputArr[index++] = inputArr[right++];
                //inversion count increment since right > left
                //since left side is all sorted, all of inputArr[(mid + 1 - left)] will
                //be greater than inputArr[right]
                count += (mid + 1 - left);
            }
        }

        //leftover from left
        while (left <= mid) {
            outputArr[index++] = inputArr[left++];
        }

        //leftover from right
        while (right <= high) {
            outputArr[index++] = inputArr[right++];
        }

        //Copying over to original array
        for (int i = 0; i < index; i++) {
            inputArr[low + i] = outputArr[i];
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] students = new long[N];

        for (int i = 0; i < N; i++) {
            students[i] = sc.nextLong();
        }

        System.out.println(mergeSort(students, 0, N-1));

    }

}
