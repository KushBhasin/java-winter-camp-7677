import java.util.*;
public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //adding
        // arr.add(10);
        // arr.add(100);
        // arr.add(200);
        //displaying
        // System.out.println(arr.get(2));
        //Iterating
        // for(Integer val: arr){
        //     System.out.println(val);
        // }
        //Using for loop
        for(int i=0;i<1e7;i++)
            arr.add(i);
        //Time difference
        long start = System.currentTimeMillis();
        for(int i=0;i<arr.size();i++){
            int a= arr.get(i);
        }
        long end= System.currentTimeMillis();
        System.out.println(start);
        System.out.println(end);
        System.out.println( "Difference is: " + (end-start) + "ms");

        }
}