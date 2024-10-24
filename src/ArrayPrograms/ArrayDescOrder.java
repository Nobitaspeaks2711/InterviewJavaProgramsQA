package ArrayPrograms;

public class ArrayDescOrder {

        public static void main(String[] args) {
            int[] numbers = {10, -20, 30, -40, 25, -15, 35, 5, -50};

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - 1 - i; j++) {
                    if (numbers[j] < numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                         numbers[j + 1] = temp;
                    }
                }
            }
            System.out.println("Array in descending order:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }


