import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String[] originalList = new String[count];
        for (int i = 0; i < count; i++) {
            originalList[i] = sc.nextLine();
        }

        //Get list in ascending order
        String[] ascList = Arrays.copyOf(originalList, originalList.length);
        Collections.sort(Arrays.asList(ascList), Comparator.naturalOrder());

        //Get list in descending order
        String[] descList = Arrays.copyOf(ascList, ascList.length);
        Collections.reverse(Arrays.asList(descList));

        if (Arrays.equals(originalList, ascList)) {
            System.out.println("INCREASING");
        } else if (Arrays.equals(originalList, descList)) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

    }

}
