package javaapplication9;

/**
 *
 * @author Komang Agus Anjas Putra
 * NIM: 2201010760
 * Tanggal: 5/19/2024
 */
public class Matakuliah {
    private String kode;
    private String nama;

    public Matakuliah() {}

    public Matakuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
