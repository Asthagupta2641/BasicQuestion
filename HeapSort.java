public class HeapSort {
    public static void main(String[] args) {
        int[]a={22,13,17,11,10,14,12};
        HeapSort hs=new HeapSort();
        hs.sort(a);
        hs.printArray(a);
    }
    public void sort(int[]a)
    {
        int n=a.length;//7
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(a,n,i);
        }
        //swap the elements and heapify again
        for(int i=n-1;i>=0;i--)
        {
           int temp=a[0];
           a[0]=a[i];
           a[i]=temp;
           heapify(a,i,0);
        }
    }
    public void heapify(int[]a,int n,int i)
    {
        int largest=i;//for parent note index position(largest=2,first the value of i is 2,then ,then 0)
        int li=2*i+1;//for left child node  index position(as li=2*i+1 andd i=2)
        int ri=2*i+2;//for right child node  index position(as ri=2*i+2 and i=2)
         // n=length ==7
        if(li<n && a[li]>a[largest])
        {
            largest =li;
        }
        if(ri<n && a[ri]>a[largest])
        {
            largest=ri;
        }
        if(largest!=i)
        {
          int temp=a[i];
          a[i]=a[largest];
          a[largest]=temp;
          heapify(a,n,largest);
        }
    }
    void printArray(int[]a){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
