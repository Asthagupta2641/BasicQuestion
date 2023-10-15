import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int a[]= {1,1,1,2,2,3,3,3};
        int b[]= {3,3,3,4};
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        List<Integer> list=new ArrayList<>();
        while(i<m && j<n){
            //for comparision between elements of array a and b
            if(a[i]==b[j]){
System.out.println(a[i]);
                i++;
                j++;

            }
            else if(a[i]<b[j]){
          i++;
}
else{
j++;        }


        }
      

    }


}



