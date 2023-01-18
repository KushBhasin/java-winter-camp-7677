import java.util.*;

public class arrayRotate{
    public void rotate(int arr[], int n){
        int temp;
        for(int i=n-1;i>=1;i++){
            

        }

    }
    public static void main(String[] args) {
        arrayRotate O =new arrayRotate();
        // int arr[]
        System.out.println("Enter number of elements:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("How much rotation? ");
        int N=sc.nextInt();
        O.rotate(arr,N);
        sc.close();
    }
}