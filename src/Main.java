public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75; // Вес в кг.
        double height = 1.74; // Рост в метрах
        double index = service.calculate(weight, height);
        System.out.println("Индекс массы тела = " + index);
    }
}

