public class Main {
    public static void main (String [] args) {
        BmiService service = new BmiService();
        double weight = 73;
        double height = 1.75;

        double bmi = service.calculate(weight,height);

        System.out.println();
        System.out.println("Индекс массы тела:");
        System.out.println();
        System.out.println(bmi);

      }
}
