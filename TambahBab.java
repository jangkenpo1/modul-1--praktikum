public class TambahBab {
    public String namaBab;
    public TambahBab prev, next;

    public TambahBab(String namaBab) {
        this.namaBab = namaBab;
        this.prev = null;
        this.next = null;
    }
}
