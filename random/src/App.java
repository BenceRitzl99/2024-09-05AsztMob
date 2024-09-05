import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int a = random.nextInt(6) +1; // 0 nem lesz benne és az a szám lesz a max amit beírunk

        //System.out.println(a);

        String s = "1.";
        double i = Double.parseDouble(s);
        System.out.println(i);

        int d = 4;
        if (d ==0) {
            System.out.println("d az 0");
        }
        else if (d == 1) {
            System.out.println("d az 1");
            
        } 
        else if (d == 2){
            System.out.println("d az 2");
        }
        else {
            System.out.println("d az más");
        }


        double[] es = {70.8, 22, 54, 98 ,0};
        for( double egyen : es ) {
            System.out.println(egyen);
        }

        

    }
}
