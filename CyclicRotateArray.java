import java.util.Arrays;

public class CyclicRotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int temp;
        int i = 0, j = arr.length - 1;
        while (i != j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
