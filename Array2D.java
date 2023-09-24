import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        int[][] numbers= new int[rows][column];
        //input rows
        for(int i=0;i<rows;i++){
            //input column
            for(int j=0;j<column;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
