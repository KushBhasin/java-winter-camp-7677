import java.util.*;

public class swap
{
	public static void main(String[] args)
	{
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Kush");
		mylist.add("Bhasin");
		mylist.add("Btech");
		mylist.add("Java");

		System.out.println("Original List : \n" + mylist);

		// Swap items at indexes 1 and 2
		Collections.swap(mylist, 1, 2);

		System.out.println("\nAfter swap(mylist, 1, 2) : \n"
						+ mylist);

		// Swap items at indexes 1 and 3
		Collections.swap(mylist, 3, 1);

		System.out.println("\nAfter swap(mylist, 3, 1) : \n"
						+ mylist);
	}
}
