public class MaximumAndMinimumElement {
    public static void main(String[] args) {
        int []a={10,20,35,70,40,60,5};
        int max=10;
        int min=10;
        System.out.print("Original Array:");
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.print(a[i]+",");
           if( a[i]>max)
           {
               max=a[i];
           }

        }
        System.out.println();
        System.out.print("Maximum element:" +max);
        System.out.println();

        //for minimum element
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.print(a[i]+",");
            if( a[i]<min)
            {
                min=a[i];
            }

        }
        System.out.println();
        System.out.print("Minimum element:" +min);
    }
}
