public class MergeSort {
    public static void conquer(int a[],int start,int mid,int end){
       int merged[]=new int[end-start+1];
       int index1=start;
       int index2=mid+1;
       int x=0;
       while(index1<=mid && index2<=end) {
           if(a[index1]<=a[index2]) {
               merged[x++]=a[index1++];
           } else{
               merged[x++]=a[index2++];
           }
       }
       while(index1<=mid){
           merged[x++]=a[index1++];
       }
       while(index2<=end){
           merged[x++]=a[index2++];
       }
       for(int i=0,j=start;i<merged.length;i++,j++){
           a[j]=merged[i];
       }
    }
    public static void divide(int a[],int start,int end){
       if(start>=end){
           return;
       }
        int mid=start +(end-start)/2;
       divide(a,start,mid);
       divide(a,mid+1,end);
       conquer(a,start,mid,end);

    }
    public static void main(String[] args) {
        int a[]={6,3,9,5,2,8,0};
        int n=a.length;
        divide(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"");
        }
        System.out.println();
    }
}
