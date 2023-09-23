import java.util.Arrays;
import java.util.*;
public class KthMaxAndMinElement {
    public static void main(String[] args) {
        int[] a={1, 2, 6, 4, 5};
        int k=3;
        Arrays.sort(a);
        System.out.println(a[k-1]);
}
}
