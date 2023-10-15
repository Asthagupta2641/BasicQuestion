import java.util.Scanner;

//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
//O(N)
public class Array0_1_2{
            public static void swap(int[] a,int i,int j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        public static void Array(int[]a){
            int mid=0;
            int low=0;
            int high=a.length-1;
            while(mid<=high){
                if(a[mid]==0)
                {
                    swap(a,mid,low);
                    low++;
                    mid++;
                }

                else if(a[mid]==1)
                {
                    mid++;
                }
                else
                {
                    swap(a,mid,high);
                    high--;
                }
            }
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a[]=new int[]{0,1,2,0,1,2};
        int n=6;

        System.out.println("Original Array:");
        Array(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }
}
