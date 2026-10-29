package model;

public class Mahasiswa implements Printable, Comparable<Mahasiswa> {
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public String getPrintDetail() {
        return nim + " - " + nama;
    }

    @Override
    public int compareTo(Mahasiswa other) {
        return Integer.compare(nim, other.nim);
    }

    @Override
    public String toString() {
        return getPrintDetail();
    }
}