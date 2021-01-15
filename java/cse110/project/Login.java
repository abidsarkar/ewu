package CodeForProjectCSE110;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Seller s = new Seller();
        ArrayList<Car> Cars;

        saveFile saveFile = new saveFile();
        Cars = saveFile.read();
        Registration r = new Registration();
        while (true) {
            System.out.println("1.Login\n2.Registration\n3.Exit");
            int option = input.nextInt();
            input.nextLine();
            if (option == 1) {
                while( true) {
                    System.out.println("User Name :");
                    String User = input.nextLine();
                    System.out.println("Password :");
                    String Pass = input.nextLine();
                    if(s.login(User, Pass))break;
                    System.out.println("Wrong user name/ password");
                }
                while (true) {
                    System.out.println("1.Add Car\n2.Update Price\n3.Remove Car\n4.Exit");
                    int option1 = input.nextInt();
                    input.nextLine();
                    if (option1 == 1) {
                        Cars = s.addCar(Cars);
                    } else if (option1 == 2) {
                        Cars = s.updateCar(Cars);
                    } else if (option1 == 3) {
                        Cars = s.removeCar(Cars);
                    } else if (option1 == 4) {
                        saveFile.write(Cars);
                        break;
                    }
                }
            } else if( option == 2) {
                r.Register();
                while (true) {
                    int i;
                    int selectedCar = r.searchCar(Cars) - 1;
                    System.out.println("Want to buy the " + Cars.get(selectedCar).toString());
                    System.out.println("1.Yes\n2.Return");
                    i = input.nextInt();
                    input.nextLine();
                    if (i == 1) {
                        System.out.println(r.b.getFirstName() + " " + r.b.getLastName() + " thanks for buying\n" + Cars.get(selectedCar).getName() + " at " + Cars.get(selectedCar).getPrice() + " BDT");
                        break;
                    }
                }
                }
            else if( option == 3 )break;
        }
    }
}
