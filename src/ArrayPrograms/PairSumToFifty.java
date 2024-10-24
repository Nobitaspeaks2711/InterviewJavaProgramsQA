package ArrayPrograms;

public class PairSumToFifty {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 37, 25, 15, 35, 5};

        System.out.println("Pairs that add up to 50:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 50) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = 50");
                }
            }
        }
    }
}
