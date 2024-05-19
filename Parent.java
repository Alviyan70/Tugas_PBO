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