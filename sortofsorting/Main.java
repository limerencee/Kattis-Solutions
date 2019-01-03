import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        while (count != 0) { //loop for each test case

            ArrayList<String> names = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                names.add(sc.nextLine());
            }

            Collections.sort(names, (x, y) -> {
                if (x.charAt(0) < y.charAt(0)) {
                    return -1;
                } else if (x.charAt(0) > y.charAt(0)) {
                    return 1;
                } else {
                    if (x.charAt(1) < y.charAt(1)) {
                        return -1;
                    } else if (x.charAt(1) > y.charAt(1)) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });

            for (String name : names) {
                System.out.println(name);
            }
            System.out.println();
            count = Integer.parseInt(sc.nextLine());
        }

    }

}
