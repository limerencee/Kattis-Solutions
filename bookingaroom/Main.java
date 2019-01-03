import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalRooms = sc.nextInt();
        int bookedCount = sc.nextInt();
        int[] bookedRooms = new int[bookedCount];

        if (bookedCount == totalRooms) {
            System.out.println("too late");
            return;
        }

        for (int i = 0; i < bookedCount; i++) {
            bookedRooms[i] = sc.nextInt();
        }

        for (int i = 1; i <= totalRooms; i++) {
            boolean free = true;

            //Check if current room is booked already
            for (int j = 0; j < bookedCount; j++) {
                if (bookedRooms[j] == i) {
                    free = false;
                    continue;
                }
            }

            if (free) {
                System.out.println(i);
                break;
            }
        }

    }

}
