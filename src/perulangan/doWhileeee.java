package perulangan;

public class doWhileeee {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "m1" );
        System.out.println("Isi Ketika Penuh :" + penuh + "m1");

        do {
            isiGelas++;
            System.out.println("Sedang Menigisi Gelas..");
            System.out.println("Isi Gelas Sekarang : " + isiGelas + "m1");
        }while (isiGelas != penuh);
        System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "m1");
    }
}
