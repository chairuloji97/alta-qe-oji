public class ArrayMean {
    private static float Mean(float[] numbers){
        float sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        float[] numbers = {1, 2, 3, 4};
        System.out.println(Mean(numbers));
    }
}
