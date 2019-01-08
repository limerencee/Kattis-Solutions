import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCases; i++) {

            LinkedList<String> list = new LinkedList<>();
            String commandsLine = sc.nextLine();
            int listSize = Integer.parseInt(sc.nextLine());
            String input = sc.nextLine();

            //Initialize the list, split the input by removing the [braces] and by ','
            //Ignore the case where the input is simply []
            if (!input.equals("[]")) {
                String[] inputList = input.substring(1, input.length() - 1).split(",");
                list.addAll(Arrays.asList(inputList));
            }

            //Resolve the commands
            boolean isReversed = false;
            boolean error = false;
            for (int j = 0; j < commandsLine.length(); j++) {
                if (commandsLine.charAt(j) == 'D') {
                    if (list.size() == 0) { //empty list
                        error = true;
                        break;
                    }

                    if (isReversed) {
                        list.removeLast();
                    } else {
                        list.removeFirst();
                    }
                } else if (commandsLine.charAt(j) == 'R') {
                    isReversed = !isReversed;
                }
            }

            if (!error) {
                if (isReversed) {
                    Collections.reverse(list);
                }
                System.out.println(list.toString().replaceAll(" ", ""));
            } else {
                System.out.println("error");
            }

        }

    }

}
