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

    // Tukar bab berdasarkan posisi (1-based)
    public void tukarBab(AtributBuku buku, int pos1, int pos2) {
        if (buku == null || buku.babHead == null || buku.babHead.next == null) return;
        if (pos1 == pos2) return;

        TambahBab node1 = null;
        TambahBab node2 = null;
        TambahBab temp = buku.babHead;
        int idx = 1;
        while (temp != null) {
            if (idx == pos1) node1 = temp;
            if (idx == pos2) node2 = temp;
            temp = temp.next;
            idx++;
        }

        if (node1 == null || node2 == null) {
            System.out.println("Posisi bab tidak valid: " + pos1 + ", " + pos2);
            return;
        }

        String swap = node1.namaBab;
        node1.namaBab = node2.namaBab;
        node2.namaBab = swap;
    }

    // Backward-compatible: tukar bab pertama & terakhir
    public void tukarBab(AtributBuku buku) {
        if (buku == null || buku.babHead == null || buku.babHead.next == null) return;
        // hitung jumlah bab
        int count = 0;
        TambahBab t = buku.babHead;
        while (t != null) { count++; t = t.next; }
        if (count < 2) return;
        tukarBab(buku, 1, count);
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
