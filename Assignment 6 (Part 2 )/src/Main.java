
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name:");
        String name = sc.nextLine();

        System.out.print("Enter PRN:");
        int prn = sc.nextInt();

        System.out.print("Enter Marks 1:");
        double mark1 = sc.nextDouble();

        System.out.print("Enter Mark 2:");
        double mark2 = sc.nextDouble();

        System.out.print("Enter Mark 3:");
        double mark3 = sc.nextDouble();

        result result = new result(name, prn, mark1, mark2, mark3);
        result.displayExamDetails();

    }
}