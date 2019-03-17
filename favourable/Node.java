class Node {

    int[] sections;
    long count;

    public Node(int[] sections) {
        this.sections = sections;
        this.count = -1; //-1 indicates that this Node is a intersection Node
    }

    public Node(String conclusion) {
        this.sections = null;
        this.count = conclusion.charAt(0) == 'f' ? 1 : 0; //0 indicates catastrophic ending, 1 for favourable
    }

    public int[] getSections() {
        return this.sections;
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(long count) {
        this.count = count;
    }

}
