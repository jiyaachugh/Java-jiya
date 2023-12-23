import javax.swing.text.DefaultEditorKit;
import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();
        String department = in.next();

//        switch (EmpID) {
//            case 1:
//                System.out.println("Jiya Chugh");
//                break;
//            case 2:
//                System.out.println("Rahul Rana");
//                break;
//            case 3:
//                System.out.println("Emp number 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("NO department added");
//
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");

        // better and clean way to write
        switch (EmpID) {
            case 1 -> System.out.println("Jiya Chugh");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("NO department added");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
