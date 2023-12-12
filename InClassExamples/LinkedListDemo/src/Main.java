public class Main {
    public static void main(String[] args) {

            demoBST();

    }

    public static void demoBST() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(6);
        bst.insert(8);
        bst.insert(20);
        bst.insert(12);

    }

    public static void demoLinkedList() {
        LinkedList<String> cities = new LinkedList<>();

        cities.insert("Paradise");
        cities.insert("Hyrum");
        cities.insert("Nibley");
        cities.insert("Logan");
        cities.insert("Hyde Park");
        cities.insert("Smithfield");
        cities.insert("Amalga");

        cities.remove("Hyde Park");
        cities.display();
    }
}