public class ContohSuper {
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