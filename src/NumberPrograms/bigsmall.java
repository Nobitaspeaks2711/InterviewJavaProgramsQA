package NumberPrograms;

public class bigsmall {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                if (end > start) {
                    System.out.print(arr[end] + ", " + arr[start] + ", ");
                } else {
                    System.out.print(arr[end]);  // No comma after the last element
                }
                end--;
                start++;
            }
        }
    }


