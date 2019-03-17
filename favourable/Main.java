import java.util.HashMap;
import java.util.Scanner;

class Main {

    HashMap<Integer, Node> list;

    void run() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int testCase = 0; testCase < T; testCase++) {
            list = new HashMap<>();
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                Node newNode;
                int section = sc.nextInt();
                if (!sc.hasNextInt()) newNode = new Node(sc.next()); //initialize conclusion Node
                else newNode = new Node(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()}); //initialize intersection Node
                list.put(section, newNode); //either way, add this new Node into the HashMap.
            }
            System.out.println(examine(1));
        }
    }


	/**
    * if currentNode has count >= 0, return that value as it either means that it has been traversed before or it is a conclusion.
    *
	* Otherwise, currentNode has count < 0, which means that it is an intersection.
	* Recursively call this method with the 3 sections and sum all the 3 return values. Set currentNode to be that sum (memoize) before
	* returning this sum.
	* @param section - The section to lookup the Node for in the list.
	* @return - long value of the number of favourable endings for the input section's Node.
	*/
    long examine(int section) {
        Node currentNode = list.get(section);
        if (currentNode.getCount() >= 0) {
            return currentNode.getCount();
        } else {
            int[] sections = currentNode.getSections();
            long temp = 0;
            for (int i = 0; i < 3; i++) {
                temp += examine(sections[i]);
            }
            currentNode.setCount(temp); //memoize for future reference to this Node.
            return temp;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

}
