

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("mentés");

        byte a = 30;
        short b = a;  //szélesítés
        int c = b;
        long d = c;
        byte e = (byte) b; // kényszerítés
        System.out.println(e);

        byte f = (byte) 1257; // kényszerítés
        System.out.println(f); 


        //valós számok:
        double g = 35.7d;   // d,D -> double
        System.out.println(g);
        System.out.printf("%.1f\n" , g);
        float h = 35.7f; // f,F -> float
        float h2 = 35.7F;
        //System.out.println(h);
        System.out.printf("Burgonya: %.1f kg\n", 3. * 2);
        System.out.printf("%10s %8.1f kg Ár: %.1f ETC\n", "Burgonya", 3.,  4.0);
        System.out.printf("%10s %8.1f kg Ár: %.1f ETC\n", "Paprika", 32.,  2.56);
        System.out.printf("%10s %8.1f kg Ár: %.1f ETC\n", "Répa", 300.45,  3.1);

        System.out.printf("%,30.2f\n", 1234567812345.12345678);  //jelzők,szélesség,pontosság

    }
}
