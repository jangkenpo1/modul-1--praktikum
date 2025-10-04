public class AtributBuku {
    public String judul;
    public String penulis;
    public AtributBuku next;
    public TambahBab babHead;

    public AtributBuku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.next = this; 
        this.babHead = null;
    }
}
