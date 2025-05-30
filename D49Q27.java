public class D49Q27 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Corrected from 'num' to 'numbers[i]'
        }
        System.out.println(sum);
    }
}