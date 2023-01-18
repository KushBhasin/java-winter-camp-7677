import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice == 0) {

            System.out.println(" Enter Choice ");
            System.out.println(" 1. Insert " + " 2. Search " + " 3. Delete " + " 4. Display " + " 5. Exit " );
            int temp = sc.nextInt();


            switch (temp) {

                case 1:

                    System.out.println(" Enter String ");
                    String temp2 = sc.next();
                    arr.add(temp2);
                    System.out.println(" Successfully inserted ");
                    break;

                case 2:
                    if (arr.size() < 0)
                        System.out.println(" List is empty ");
                    else {
                        String temp3 = sc.next();
                            System.out.println(" String exists: " + arr.contains(temp3));
                    }
                    break;


                case 3:
                    if (arr.size() < 0)
                        System.out.println(" List is empty ");
                    else {
                        String temp4 = sc.next();
                        arr.remove(temp4);
                        System.out.println(" Successfully removed string -> " + temp4);

                    }
                    break;


                case 4:
                    System.out.println("Elements are : ");
                    for (String element : arr)
                        System.out.print( element + " ");
                    break;


                case 5:
                    choice = 1;
                    break;


            }
            System.out.println();
        }
    }
}