public class Program {
    public static void main(String[] args) {
        B1();
        B2();
        B3();
    }

    private static void B1() {
        BTree tree = new BTree(2);
        tree.insert(51);
        tree.insert(12);
        tree.insert(45);
        tree.insert(36);
        tree.insert(89);
        tree.insert(82);
        tree.insert(46);
        tree.insert(20);
        tree.insert(28);
        tree.insert(37);
        tree.insert(17);
        tree.insert(32);
        tree.print();
        System.out.println("********************");
    }
    private static void B2() {
        BTree tree = new BTree(3);
        tree.insert(61);
        tree.insert(76);
        tree.insert(78);
        tree.insert(11);
        tree.insert(10);
        tree.insert(68);
        tree.insert(98);
        tree.insert(28);
        tree.insert(93);
        tree.insert(22);
        tree.insert(24);
        tree.insert(48);
        tree.insert(37);
        tree.insert(48);
        tree.insert(95);

        tree.remove(11);
        tree.remove(78);
        tree.remove(76);
        tree.remove(22);
        tree.remove(68);
        tree.print();
        System.out.println("********************");
    }
    private static void B3() {
        BTree tree = new BTree(4);
        tree.insert(24);
        tree.insert(12);
        tree.insert(52);
        tree.insert(80);
        tree.insert(81);
        tree.insert(85);
        tree.insert(96);
        tree.insert(25);
        tree.insert(59);
        tree.insert(51);
        tree.insert(31);
        tree.insert(5);
        tree.remove(24);
        tree.remove(51);
        tree.remove(31);
        tree.insert(77);
        tree.insert(96);
        tree.insert(4);
        tree.remove(96);
        tree.remove(52);
        tree.insert(75);
        tree.insert(51);
        tree.insert(24);
        tree.remove(75);
        tree.remove(59);
        tree.remove(80);
        tree.remove(51);
        tree.remove(4);
        tree.print();
    }
}

