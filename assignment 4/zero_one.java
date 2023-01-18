public class zero_one {

    void sorting(int arr[],int n){
        int l=0,r=n-1;
        while(l<=r){
        while(arr[l]==0){
            l++;
        }
        while(arr[r]==1){
            r--;
        }
        if(l<r){
            arr[l]=0;
            arr[r]=1;
            l++;
            r--;
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    }
 public static void main(String args[]) {
    zero_one c = new zero_one();
    string_sort s= new string_sort();
    s.sort();
    int arr[]=new int[]{0,1,0,1,0,0,1,1};
    int n=arr.length;
    c.sorting(arr,n);

 }   
}
