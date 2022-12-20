
// to take Input from the student and related Information
import java.util.Scanner;

public class InfoStudent {

    String studentName;
    String regNum;

    InfoBook borrowedBooks[] = new InfoBook[3];
    public int booksCount = 0;

    Scanner input = new Scanner(System.in);

    public InfoStudent() {

        System.out.println("Enter Student Name:");

        this.studentName = input.nextLine();

        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}
