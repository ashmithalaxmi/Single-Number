import java.util.Scanner;

public class SingleNumber {
    static int singleNumber(int[] A, int n){
        int res=0;
        for(int i=0;i<n;i++){
            res=res^A[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] A= new int[n];
        for(int i=0; i<n;i++){
            A[i]= sc.nextInt();
        }
        System.out.println( singleNumber(A, n));
    }
}
