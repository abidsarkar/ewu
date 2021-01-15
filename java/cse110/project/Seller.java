package CodeForProjectCSE110;

import java.util.ArrayList;
import java.util.Scanner;

public class Seller {
    Scanner input = new Scanner(System.in);

    boolean login(String user ,String pass) {
        return user.equals("Hasan") && pass.equals("123");
    }

    ArrayList<Car> addCar(ArrayList<Car> CarList) {
        Car car = new Car();
        System.out.println("Brand:");
        car.setBrand(input.nextLine());
        System.out.println("Model:");
        car.setModel(input.nextLine());
        System.out.println("Name:");
        car.setName(input.nextLine());
        System.out.println("Year:");
        car.setYear(input.nextInt());
        input.nextLine();
        while (true) {
            System.out.println("Condition:\n1.New\n2.Old");
            int i = input.nextInt();
            input.nextLine();
            if(i == 1){
                car.setCondition(true);
                break;
            } else if(i == 2){
                car.setCondition(false);
                break;
            }
        }
        System.out.println("Price:");
        car.setPrice(input.nextDouble());
        input.nextLine();
        System.out.println("Seat:");
        car.setSeat(input.nextInt());
        input.nextLine();
        CarList.add(car);
        return CarList;
    }

    ArrayList<Car> updateCar(ArrayList<Car> CarList) {
        System.out.println("Car Name:");
        String Name = input.nextLine();
        System.out.println("Car Year:");
        int Year = input.nextInt();
        input.nextLine();
        int c = findCar(Name ,Year ,CarList);
        System.out.println("Old Price:" + CarList.get(c).getPrice());
        System.out.println("New Price:");
        CarList.get(c).setPrice(input.nextDouble());
        input.nextLine();
        return CarList;
    }

    ArrayList<Car> removeCar(ArrayList<Car> CarList) {
        System.out.println("Car Name:");
        String Name = input.nextLine();
        System.out.println("Car Year:");
        int Year = input.nextInt();
        input.nextLine();
        int c = findCar(Name ,Year ,CarList);
        CarList.remove(c);
        return CarList;
    }

    int findCar(String Name ,int Year ,ArrayList<Car> CarList) {
        for (int i = 0; i < CarList.size(); i++) {
            if(CarList.get(i).getName().equals(Name) && CarList.get(i).getYear() == Year){
                return i;
            }
        }
        return -1;
    }

}
