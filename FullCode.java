public class FullCode {
    public static void main(String[] args) {
        Parent yanto = new Parent("Yanto", "Laki-laki", 42, "Semarang", "22-02-1982");
        Parent bella = new Parent("Bella", "Perempuan", 40, "Magelang", "28-01-1984");

        Child budi = new Child("Budi", "Laki-laki", 20, "Jakarta", "08-03-2003", yanto, bella);

        System.out.println("\nInformasi Keluarga:");
        System.out.println("Budi adalah anak dari " + budi.getAyah().getNama() + " dan " + budi.getIbu().getNama() + ".");
        System.out.println(budi.getAyah().getNama() + " adalah suami " + budi.getIbu().getNama() + ".");
        System.out.println(budi.getAyah().getNama() + " berusia " + budi.getAyah().getUsia() + " tahun.");
    }
}

interface Person {
    String getNama();
    String getJenisKelamin();
    int getUsia();
    String getTempatLahir();
    String getTanggalLahir();
}

class Parent implements Person {
    private String nama;
    private String jenisKelamin;
    private int usia;
    private String tempatLahir;
    private String tanggalLahir;

    Parent(String nama, String jenisKelamin, int usia, String tempatLahir, String tanggalLahir) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        System.out.println("Parent Constructor");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    @Override
    public int getUsia() {
        return usia;
    }

    @Override
    public String getTempatLahir() {
        return tempatLahir;
    }

    @Override
    public String getTanggalLahir() {
        return tanggalLahir;
    }
}

class Child implements Person {
    private String nama;
    private String jenisKelamin;
    private int usia;
    private String tempatLahir;
    private String tanggalLahir;
    private Parent ayah;
    private Parent ibu;

    Child(String nama, String jenisKelamin, int usia, String tempatLahir, String tanggalLahir, Parent ayah, Parent ibu) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.ayah = ayah;
        this.ibu = ibu;
        System.out.println("Child Constructor");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    @Override
    public int getUsia() {
        return usia;
    }

    @Override
    public String getTempatLahir() {
        return tempatLahir;
    }

    @Override
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public Parent getAyah() {
        return ayah;
    }

    public Parent getIbu() {
        return ibu;
    }
}
