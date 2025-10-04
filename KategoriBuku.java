public class KategoriBuku {
    public String namaKategori;
    public KategoriBuku prev, next;
    public AtributBuku bukuHead;

    public KategoriBuku(String namaKategori) {
        this.namaKategori = namaKategori;
        this.prev = null;
        this.next = null;
        this.bukuHead = null;
    }
}
