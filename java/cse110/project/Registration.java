package CodeForProjectCSE110;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    Scanner input = new Scanner(System.in);
    Buyer b = new Buyer();

    void Register() {
        System.out.println("First Name :");
        b.setFirstName(input.nextLine());
        System.out.println("Last Name :");
        b.setLastName(input.nextLine());
        System.out.println("Email Address :");
        b.setEmailId(input.nextLine());
        System.out.println("Phone No :");
        b.setPhoneNo(input.nextInt());
    }

    int searchCar(ArrayList<Car> CarList) {
        while (true) {
            int s = searchType();
            int serial = 0;
            if (s == 1){ // Brand search
                for (int j = 0; j < CarList.size(); j++) {
                    System.out.println((1 + j) + "." + CarList.get(j).getBrand() + CarList.get(j).getModel());
                }
                System.out.println("Select Car (0 to return) :");
                serial = input.nextInt();
                input.nextLine();
            } else if (s == 2){// Condition search
                int i;
                do {
                    System.out.println("1.New\n2.Used\n3.Exit");
                    i = input.nextInt();
                    input.nextLine();
                    if (i == 1){
                        for (int j = 0; j < CarList.size(); j++) {
                            if (CarList.get(j).getCondition()){
                                System.out.println((1 + j) + "." + CarList.get(j).toString());
                            }
                        }
                        System.out.println("Select Car (0 to return) :");
                        serial = input.nextInt();
                        input.nextLine();
                    } else if (i == 2){
                        for (int j = 0; j < CarList.size(); j++) {
                            if (!CarList.get(j).getCondition()){
                                System.out.println((1 + j) + "." + CarList.get(j).toString());
                            }
                        }
                        System.out.println("Select Car (0 to return) :");
                        serial = input.nextInt();
                        input.nextLine();
                    }
                } while (i != 3);
            } else if (s == 3){// Price search
                int i;
                do {
                    System.out.println("Price Range\n1. 0 - 5,00,000 bdt\n2. 5,00,000 - 10,00,000 bdt\n3. 10,00,000 - 20,00,000 bdt\n4. 20,00,000 - 50,00,000\n5.Exit");
                    i = input.nextInt();
                    input.nextLine();
                    if (i == 1){
                        for (int j = 0; j < CarList.size(); j++) {
                            if (CarList.get(j).getPrice() < 500000){
                                System.out.println((1 + j) + "." + CarList.get(j).toString());
                            }
                        }
                        System.out.println("Select Car (0 to return) :");
                        serial = input.nextInt();
                        input.nextLine();
                    } else if (i == 2){
                        for (int j = 0; j < CarList.size(); j++) {
                            if (CarList.get(j).getPrice() < 1000000){
                                System.out.println((1 + j) + "." + CarList.get(j).toString());
                            }
                        }
                    } else if (i == 3){
                        for (int j = 0; j < CarList.size(); j++) {
                            if (CarList.get(j).getPrice() < 2000000){
                                System.out.println((1 + j) + "." + CarList.get(j).toString());
                            }
                        }
                        System.out.println("Select Car (0 to return) :");
                        serial = input.nextInt();
                        input.nextLine();
                    } else if (i == 4){
                        for (int j = 0; j < CarList.size(); j++) {
                            if (CarList.get(j).getPrice() < 5000000){
                                System.out.println((1 + j) + "." + CarList.get(j).toString());
                            }
                        }
                        System.out.println("Select Car (0 to return) :");
                        serial = input.nextInt();
                        input.nextLine();
                    }
                } while (i != 5);
            } else if (s == 4){// Year search
                int i;
                do {
                    System.out.println("1.Input year\n2.Exit");
                    i = input.nextInt();
                    input.nextLine();
                    if (i == 1){
                        System.out.println("Year:");
                        int yr = input.nextInt();
                        input.nextLine();
                        for (int j = 0; j < CarList.size(); j++) {
                            if (CarList.get(j).getYear() == yr)
                                System.out.println((1 + j) + "." + CarList.get(j).toString());
                        }
                        System.out.println("Select Car (0 to return) :");
                        serial = input.nextInt();
                        input.nextLine();
                    }
                } while (i != 2);
            }
            if (serial != 0) return serial;
        }
    }

    int searchType() {
        while (true) {
            System.out.println("Search cars by \n1.Brand\n2.Condition\n3.Price Range\n4.Released Year\n5.Exit");
            int s = input.nextInt();
            input.nextLine();
            if (s > 4 || s < 1) continue;
            return s;
        }
    }
}
