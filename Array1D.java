package Arrays;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[]a=new int[10];
        a[0]=10;
        a[3]=25;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }

    }

}
