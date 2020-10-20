import java.util.Scanner;

public class caseTest {
    public static void main(String[] args) {
        /*
        this is a test fo swatch case Statemnet
        how to use a case
        */
        Scanner input = new Scanner(System.in);
        // remamber a case only take int,string,char,byte,sort//
        System.out.println("take a value");
        String value = input.next();
        System.out.println(value);
        switch (value){
            case "Abid":
                System.out.println("this is your name");
                break;//break is for stop the value
            case  "utes":
                System.out.println("this is your hart name");
                break;
            case "mostafizur":
                System.out.println("this is my father name");
                break;
            default:
                System.out.println("not maching");
        }
    }
}
