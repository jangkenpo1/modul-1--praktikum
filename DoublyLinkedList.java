class DoublyLinkedList {
    private Node head = null ;
    private Node tail = null ;

    public DoublyLinkedList(){
        this.head = null ;
        this.tail = null ;
    }

    //add pemain
    public void addPemain(String playerName, String position, String specialAbility, char skillPower, char skillSpeed, char skillStamina, int overallRating) {
        Node newNode = new Node(playerName, position, specialAbility, skillPower, skillSpeed, skillStamina, overallRating);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //hapus pemain
    public void removePemain(int indeks) {
        Node current = head;
        int awal = 0;

        while (awal <= indeks){
            if (awal == indeks){
                if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next; 
                    }
                if (current.next != null) {
                        current.next.prev = current.prev;
                    } else {
                        tail = current.prev; 
                    }
                    return; 
                }
            System.out.println("pemain telah dihapus.");
            awal++;
            current = current.next;
        }
    }

    //lihat pemain
    public void seePemain(){
        Node current = head;
        if (current == null) {
            System.out.println("Tidak ada pemain dalam daftar.");
            return;
        }

        while (current != null) {
            System.out.println("     player Name        : " + current.playerName );
            System.out.println("     position           : " + current.position   );
            System.out.println("     specialAbility     : " + current.specialAbility );
            System.out.println("     skillPower         : " + current.skillPower );
            System.out.println("     skillSpeed         : " + current.skillSpeed );
            System.out.println("     skillStamina       : " + current.skillStamina );
            System.out.println("     overallRating      : " + current.overallRating );
            System.out.println("--------------------------------------------");
            current = current.next;
        }
    }

}
