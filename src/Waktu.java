/**
 * Kelas Waktu digunakan untuk melakukan konversi waktu dan menyimpan nilai jam, menit, dan detik.
 * Kelas ini juga menyediakan berbagai metode untuk mengatur dan mendapatkan nilai waktu,
 * serta menghitung total detik dari waktu yang diberikan.
 */
public class Waktu {

    // Properti untuk menyimpan waktu
    private int jam;
    private int menit;
    private int detik;

    /**
     * Konstruktor untuk inisialisasi objek Waktu dengan parameter jam, menit, dan detik.
     *
     * @param jm   nilai jam yang akan diset
     * @param mnt  nilai menit yang akan diset
     * @param dtk  nilai detik yang akan diset
     */
    public Waktu(int jm, int mnt, int dtk) {
        this.setJam(jm);
        this.setMenit(mnt);
        this.setDetik(dtk);
    }

    /**
     * Konstruktor untuk inisialisasi objek Waktu dengan parameter detik saja.
     * Detik akan otomatis dikonversi menjadi jam, menit, dan detik.
     *
     * @param dtk nilai detik yang akan dikonversi
     */
    public Waktu(int dtk) {
        this.setJam(dtk / 3600);
        this.setMenit((dtk % 3600) / 60);
        this.setDetik(dtk % 60);
    }

    /**
     * Menampilkan waktu yang telah dikonversi ke dalam format jam, menit, dan detik.
     */
    public void displayTime() {
        System.out.println("Hasil Konversi: " + this.getJam() + " jam, "
                + this.getMenit() + " menit, " + this.getDetik() + " detik");
    }

    /**
     * Menghitung total detik dari nilai jam, menit, dan detik.
     *
     * @return total detik sebagai bilangan integer
     */
    public int Totaldtk() {
        return calculatewaktu() + (this.getMenit() * 60) + this.getDetik();
    }

    /**
     * Metode privat untuk menghitung total detik dari nilai jam.
     *
     * @return jumlah detik dari jam
     */
    private int calculatewaktu() {
        return this.getJam() * 3600;
    }

    /**
     * Mengatur nilai jam.
     *
     * @param jam nilai jam yang akan diset
     */
    public void setJam(int jam) {
        this.jam = jam;
    }

    /**
     * Mengatur nilai menit.
     *
     * @param menit nilai menit yang akan diset
     */
    public void setMenit(int menit) {
        this.menit = menit;
    }

    /**
     * Mengatur nilai detik.
     *
     * @param detik nilai detik yang akan diset
     */
    public void setDetik(int detik) {
        this.detik = detik;
    }

    /**
     * Mendapatkan nilai jam.
     *
     * @return nilai jam sebagai bilangan integer
     */
    public int getJam() {
        return jam;
    }

    /**
     * Mendapatkan nilai menit.
     *
     * @return nilai menit sebagai bilangan integer
     */
    public int getMenit() {
        return menit;
    }

    /**
     * Mendapatkan nilai detik.
     *
     * @return nilai detik sebagai bilangan integer
     */
    public int getDetik() {
        return detik;
    }
}
