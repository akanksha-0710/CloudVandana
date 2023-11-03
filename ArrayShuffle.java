import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int j = rand.nextInt(array.length);  //where j=random index to swap
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

