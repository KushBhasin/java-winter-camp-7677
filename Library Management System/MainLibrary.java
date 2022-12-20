
//Main program to run library management
import java.util.Scanner;

public class MainLibrary {

    // Main driver method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "**************************Welcome to the Universal Library!********************");
        System.out.println(
                "				 Choose From The Following Options:			 ");
        System.out.println(
                "**********************************************************************");

        OperBooks ob = new OperBooks();
        OperStudents obStudent = new OperStudents();

        int choice;
        int searchChoice;

        // Menu
        do {

            ob.dispMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    InfoBook b = new InfoBook();
                    ob.addBook(b);
                    break;

                case 2:
                    ob.upgradeBookQty();
                    break;

                case 3:

                    System.out.println(
                            " press 1 to Search with Book Serial No.");
                    System.out.println(
                            " Press 2 to Search with Book's Author Name.");
                    searchChoice = input.nextInt();

                    // Nested switch
                    switch (searchChoice) {

                        case 1:
                            ob.searchBySno();
                            break;

                        case 2:
                            ob.searchByAuthorName();
                    }
                    break;

                case 4:
                    ob.showAllBooks();
                    break;

                case 5:
                    InfoStudent s = new InfoStudent();
                    obStudent.addStudent(s);
                    break;

                case 6:
                    obStudent.showAllStudents();
                    break;

                case 7:
                    obStudent.checkOutBook(ob);
                    break;

                case 8:
                    obStudent.checkInBook(ob);
                    break;

                default:

                    System.out.println("Program Exit");
            }

        }

        while (choice != 0);
        input.close();
    }
}
