package Main;

import java.time.LocalDate;
import java.util.Scanner;

import KAMPPLAATS.CampSite;
import PERSOON.Address;
import PERSOON.Member;
import PERSOON.Staff;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            Header.appMenuHeader();
            System.out.println("1. Create new staff");
            System.out.println("2. Register new camp site");
            System.out.println("3. Create new member");
            System.out.println("4. Create new camp session");
            System.out.println("5. Assign staff to camp session");
            System.out.println("6. Member registration for camp");
            System.out.println("7. Export camp data");
            System.out.println("8. Exit application");
            System.out.print("Present a choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                System.out.print("Firstname: ");
                String firstName = scanner.nextLine();
                
                System.out.print("Lastname: ");
                String lastName = scanner.nextLine();

                System.out.print("date of birth (yyyy-mm-dd): ");
                LocalDate DoB = LocalDate.parse(scanner.nextLine());

                System.out.print("Street: ");
                String street = scanner.nextLine();

                System.out.print("House number: ");
                int houseNumber = Integer.parseInt(scanner.nextLine());

                System.out.print("Zipcode: ");
                int zipCode = Integer.parseInt(scanner.nextLine());

                System.out.print("City: ");
                String city = scanner.nextLine();

                Address address = new Address(street, houseNumber, zipCode, city);

                System.out.print("Function (Leader, Cook, Cleaner): ");
                String function = scanner.nextLine();

                Staff staff = new Staff(firstName, lastName, DoB, address, function);
                System.out.println("New staff created");
                System.out.println(staff);
                    break;
                case 2: 
                System.out.print("Street: ");
                String street2 = scanner.nextLine();
                
                System.out.print("House number: ");
                int houseNumber2 = Integer.parseInt(scanner.nextLine());

                System.out.print("Zipcode: ");
                int zipCode2 = Integer.parseInt(scanner.nextLine());

                System.out.print("City: ");
                String city2 = scanner.nextLine();


                System.out.print("Capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());

                Address address2 = new Address(street2, houseNumber2, zipCode2, city2);
                CampSite campSite = new CampSite(address2, capacity);

                System.out.println("New camp site registrated");
                System.out.println(campSite);

                    break;
                case 3:
                System.out.print("Firstnamr: ");
                String firstName3 = scanner.nextLine();

                System.out.print("Lastname: ");
                String lastName3 = scanner.nextLine();

                System.out.print("Date of birth (yyyy-mm-dd): ");
                LocalDate DoB3 = LocalDate.parse(scanner.nextLine());

                System.out.print("Street: ");
                String street3 = scanner.nextLine();

                System.out.print("House number: ");
                int houseNumber3 = Integer.parseInt(scanner.nextLine());

                System.out.print("Zipcode: ");
                int zipCode3 = Integer.parseInt(scanner.nextLine());

                System.out.print("City: ");
                String city3 = scanner.nextLine();

                Address address3 = new Address(street3, houseNumber3, zipCode3, city3);
                Member member3 = new Member(firstName3, lastName3, DoB3, address3);

                System.out.println("New Member created");
                System.out.println(member3);
                    break;
                case 4: 
                
                    break;
                case 5: 
                    break;
                case 6: 
                    break;
                case 7: 
                    break;
                case 8: 
                    running = false;
                    System.out.println("Thank you for using Camp Management System.");
                    break;
                default: 
                    System.out.println("Invalid selection. Please try againe.");
                   
            }


        }
    scanner.close();
    }

}
