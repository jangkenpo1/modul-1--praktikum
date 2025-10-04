public class Main {
    public static void main(String[] args) {
    Perpustakaan perpus = new Perpustakaan();
    System.out.println("==Antartika Library==");

    perpus.tambahRak("Rak Fiksi");
    RakNode rakFiksi = perpus.rakHead;

    // Tambah kategori
    perpus.tambahKategori(rakFiksi, "Novel");
    perpus.tambahKategori(rakFiksi, "Komik");
        
    //kategori Novel
    KategoriBuku novel = rakFiksi.kategoriHead;
        
    // Tambah buku
    perpus.tambahBuku(novel, "Laskar Pelangi", "Andrea Hirata");
    perpus.tambahBuku(novel, "Negeri 5 Menara", "A. Fuadi");

    AtributBuku laskar = novel.bukuHead;
    perpus.tambahBab(laskar, "Awal Cerita");
    perpus.tambahBab(laskar, "Sekolah Muhammadiyah");
    perpus.tambahBab(laskar, "Persahabatan");

    AtributBuku menara = laskar.next; 
    perpus.tambahBab(menara, "Pondok Madani");
    perpus.tambahBab(menara, "Man Jadda Wajada");

    //kategori komik
    KategoriBuku komik = novel.next; 

    // Tambah Buku
    perpus.tambahBuku(komik, "Naruto", "Masashi Kishimoto");
    perpus.tambahBuku(komik, "One Piece", "Eiichiro Oda");

    AtributBuku naruto = komik.bukuHead;
    perpus.tambahBab(naruto, "Ninja Akademi");
    perpus.tambahBab(naruto, "Ninja Chuunin");
    perpus.tambahBab(naruto, "Pertarungan Sannin");

    AtributBuku onePiece = naruto.next; 
    perpus.tambahBab(onePiece, "Pertarungan Dimulai");
    perpus.tambahBab(onePiece, "East Blue");
    perpus.tambahBab(onePiece, "Grand Line");

    perpus.cetak();
    
    System.out.println("\n\n");
    System.out.println("Bab \"Bab 1: Awal Cerita\" ditukar dengan \"Bab 3: Persahabatan\"");
    System.out.println("=== Setelah Swap ===");
    // tukar bab posisi 1 dan 3 pada buku Laskar Pelangi
    perpus.tukarBab(laskar, 1, 3);
    perpus.cetak();

    }
}
