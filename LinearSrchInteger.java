public class LinearSrchInteger {
    public static void main(String[] args) {
        int []a={1,5,6,7,3};
        int item=7;
        for(int i=0;i<a.length;i++){
            if(a[i]==item)
            {
                System.out.println("item is present "+i+" index position ");
            }
        }
    }
}
