public class TuitionCalculator {
    public static void main(String[] args) {
        double initialTuition = 10000; 
        double tuitionIncreaseRate = 0.05; 
        int years = 10; 
        double futureTuition = initialTuition;

        for (int i = 1; i <= years; i++) {
            futureTuition *= (1 + tuitionIncreaseRate);
        }

        double totalCost = futureTuition * 4;

        System.out.printf("Tuition in ten years: $%.2f\n", futureTuition);
        System.out.printf("Total cost of four years' tuition after the tenth year: $%.2f\n", totalCost);
    }
}