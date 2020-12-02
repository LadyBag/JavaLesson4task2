public class Main {
    public static void main (String[] args ) {
        BmiService service = new BmiService();
        float kg = 103;
        float m = 1.9f;
        float mt = service.calculate(kg , m);

        System.out.println(mt);

    }
}
