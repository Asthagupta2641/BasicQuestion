import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int a[]= {1,1,1,2,2,3,3,3};
        int b[]= {3,3,3,4};
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        List<Integer> list=new ArrayList<>();
        while(i<m && j<n){
            // for duplicate value at array a
            while(i>0 && i<m && a[i]==a[i-1]){
                i++;
            }
            // for duplicate value at array b
            while(j>0 && j<n && b[j]==b[j-1]){
                j++;
            }

            //for add extra element in list
            if(i>=m)
            {
                list.add(b[j]);
                j++;
                continue;

            }
            if(j>=n)
            {
                list.add(a[i]);
                i++;
                continue;

            }
            //for comparision between elements of array a and b
            if(a[i]<b[j]){
                list.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                list.add(b[j]);
                j++;
            }
            else{
                list.add(a[i]);
                j++;
                i++;
            }

        }
        System.out.println(list+" ");

        }


        }


