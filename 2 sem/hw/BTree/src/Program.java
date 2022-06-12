public class Program {
    public static void main(String[] args) {
        B1();
    }

    private static void B1() {
        BTree tree = new BTree(2);
        tree.insert(76);
        tree.insert(92);
        tree.insert(80);
        tree.insert(5);
        tree.insert(25);
        tree.insert(17);
        tree.insert(84);
        tree.insert(65);
        tree.insert(89);
        tree.insert(9);
        tree.insert(85);
        tree.insert(18);
        tree.print();
    }
}