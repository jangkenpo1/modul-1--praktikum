public class Main {
    public static void main(String[] args) {
        DoublyLinkedList Pemain = new DoublyLinkedList();

        Pemain.addPemain("Lionel Messi", "Forward", "ALL Role", 'A', 'A', 'A', 10 );
        Pemain.addPemain("Xavi Hernandez", "Midfielder", "Passing", 'B', 'B', 'A', 9 );
        Pemain.addPemain("Andres Iniesta", "Midfielder", "ALL Role", 'B', 'B', 'A', 9 );
        
        Pemain.seePemain();
        Pemain.removePemain(1);
    }
}