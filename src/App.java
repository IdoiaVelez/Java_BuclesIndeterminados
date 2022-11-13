public class App {
    public static void main(String[] args) throws Exception {

        // While
        int x = 10;
        System.out.println("Countdown");
        while (x > 0) {
            System.out.println(x);
            x--;
        }
        System.out.println("Finish");

        // Do... while
        int y = 0;
        System.out.println("Countdown");
        do {
            System.out.println(y);
            y--;
        } while (y > 0);
        System.out.println("Este estaría mal, revisar <y>");

        int z=1;
        System.out.println("Del 1 al 5");
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);
        System.out.println("Esto sería correcto");

    }
}
