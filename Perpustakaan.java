public class Perpustakaan {
    public RakNode rakHead;

    // Tambah rak
    public void tambahRak(String namaRak) {
        RakNode newRak = new RakNode(namaRak);
        if (rakHead == null) {
            rakHead = newRak;
        } else {
            RakNode temp = rakHead;
            while (temp.next != null) temp = temp.next;
            temp.next = newRak;
        }
    }

    // Tambah kategori
    public void tambahKategori(RakNode rak, String namaKategori) {
        KategoriBuku newKat = new KategoriBuku(namaKategori);
        if (rak.kategoriHead == null) {
            rak.kategoriHead = newKat;
        } else {
            KategoriBuku temp = rak.kategoriHead;
            while (temp.next != null) temp = temp.next;
            temp.next = newKat;
            newKat.prev = temp;
        }
    }

    // Tambah buku
    public void tambahBuku(KategoriBuku kategori, String judul, String penulis) {
        AtributBuku newBuku = new AtributBuku(judul, penulis);
        if (kategori.bukuHead == null) {
            kategori.bukuHead = newBuku;
        } else {
            AtributBuku temp = kategori.bukuHead;
            while (temp.next != kategori.bukuHead) temp = temp.next;
            temp.next = newBuku;
            newBuku.next = kategori.bukuHead;
        }
    }

    // Tambah bab 
    public void tambahBab(AtributBuku buku, String namaBab) {
        TambahBab newBab = new TambahBab(namaBab);
        if (buku.babHead == null) {
            buku.babHead = newBab;
        } else {
            TambahBab temp = buku.babHead;
            while (temp.next != null) temp = temp.next;
            temp.next = newBab;
            newBab.prev = temp;
        }
    }

    // Tukar bab pertama & terakhir
    public void tukarBab(AtributBuku buku) {
        if (buku.babHead == null || buku.babHead.next == null) return;
        TambahBab first = buku.babHead;
        TambahBab last = buku.babHead;
        while (last.next != null) last = last.next;
        String temp = first.namaBab;
        first.namaBab = last.namaBab;
        last.namaBab = temp;
    }

    public void cetak() {
        RakNode rak = rakHead;
        while (rak != null) {
            System.out.println("Rak: " + rak.namaRak);

            KategoriBuku kat = rak.kategoriHead;
            while (kat != null) {
                System.out.println("  Kategori: " + kat.namaKategori);

                if (kat.bukuHead != null) {
                    AtributBuku buku = kat.bukuHead;
                    do {
                        System.out.println("  - " + buku.judul + " | " + buku.penulis);

                        TambahBab bab = buku.babHead;
                        int nomorBab = 1;
                        while (bab != null) {
                            System.out.println("    * Bab " + nomorBab + ": " + bab.namaBab);
                            bab = bab.next;
                            nomorBab++;
                        }
                        buku = buku.next;
                    } while (buku != kat.bukuHead);
                }
                kat = kat.next;
            }
            rak = rak.next;
        }
    }
}
