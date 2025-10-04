public class RakNode {
    public String namaRak;
    public RakNode next;
    public KategoriBuku kategoriHead;

    public RakNode(String namaRak) {
        this.namaRak = namaRak;
        this.next = null;
        this.kategoriHead = null;
    }
}
