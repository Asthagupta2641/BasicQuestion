public class LinearSrchString {
    public static void main(String[] args) {
        String[] a={"Astha","Arpit","Aanchal","Shivam","Aditi"};
//        String item="Aanchal";
        String item="om";
        int temp=0;

        for(int i=0;i<a.length;i++){
            if(a[i].equals(item)){
                System.out.println("item is present at "+i+" position item");
            temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("item not found ");
        }
    }
}
