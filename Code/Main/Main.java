package Main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import KAMP.Camp;
import KAMPPLAATS.CampSite;
import PERSOON.Address;
import PERSOON.Member;
import PERSOON.Staff;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        List<Staff> staffList = new ArrayList<>();
        List<Member> memberList = new ArrayList<>();
        List<CampSite> campSites = new ArrayList<>();
        List<Camp> campList = new ArrayList<>(); 
       
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

                LocalDate DoB;
                while(true) {
                    System.out.print("date of birth (yyyy-mm-dd): ");
                   try{ 
                        DoB = LocalDate.parse(scanner.nextLine());
                        break;
                   } catch (Exception e) {
                   System.out.println("Invalid date format!");
                   }
                }

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
                staffList.add(staff);
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
                
                System.out.println("Add facilities (Max 3): ");
                for(int i = 0; i < 3; i++) {
                    System.out.print("Facility: ");
                    String facility2 = scanner.nextLine();
                    if(facility2 == null || facility2.isEmpty()) {
                        System.out.println("You have to enter a facility!");
                        continue;
                    } 
                    campSite.addFacility(facility2);
                }
                    campSites.add(campSite);
                    System.out.println("New camp site registrated");
                    System.out.println(campSite);

                    break;
                case 3:
                System.out.print("Firstname: ");
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
                memberList.add(member3);
                System.out.println("New Member created");
                System.out.println(member3);
                    break;
                case 4: 
                if(campSites.isEmpty()) {
                    System.out.println("No camp sites available, create a camp site first");
                    break;
                }
                System.out.print("Title: ");
                String title4 = scanner.nextLine();

                LocalDate from4; //Om buiten de while beschikbaar te zijn
                while(true) {
                    try{
                        System.out.print("Starting date (yyyy-mm-dd): ");
                        from4 = LocalDate.parse(scanner.nextLine());
                        break;
                    } catch (Exception e) {
                    System.out.println("Invalid date format!");
                    }
                }
                LocalDate to4; //Om buiten de while beschikbaar te zijn
                while(true) {
                   try{ 
                      System.out.print("Ending date (yyyy-mm-dd): ");
                      to4 = LocalDate.parse(scanner.nextLine());
                      if(to4.isBefore(from4)) {                            
                        System.out.println("End date can't be before the start date!");
                      }else break;
                   } catch (Exception e) {
                   System.out.println("Invalid date format!");
                   }
                }
                if (campSites.isEmpty()) {
                   System.out.println("No camp site available. Make a new camp site first.");
                   break;
                }
                     System.out.println("Available camp sites:");
                for (int i = 0; i < campSites.size(); i++) {
                     System.out.println((i + 1) + ". " + campSites.get(i));
                }
                System.out.print("Choose camp site (number): ");
                int campSiteChoice = Integer.parseInt(scanner.nextLine());
    
                if (campSiteChoice < 1 || campSiteChoice > campSites.size()) {
                    System.out.println("Invalid choice!");
                    break;
                }
                 CampSite selectedCampSite = campSites.get(campSiteChoice - 1);

                Camp camp4 = new Camp(title4, selectedCampSite, to4, from4);
                campList.add(camp4);
                System.out.println(camp4);
                    break;
                case 5:
                if (campList.isEmpty()) {
                   System.out.println("No camps available. Create a camp first.");
                    break;
                }
                if (staffList.isEmpty()) {
                   System.out.println("No staff available. Create staff first.");
                   break;
                }

                   System.out.println("Available camps:");
                   for (int i = 0; i < campList.size(); i++) {
                   System.out.println((i + 1) + ". " + campList.get(i).getTitle());
                }
                   System.out.print("Choose a camp (number): ");
                   int campIndex = Integer.parseInt(scanner.nextLine()) - 1;

                   if (campIndex < 0 || campIndex >= campList.size()) {
                   System.out.println("Invalid camp choice.");
                   break;
                }

                   Camp selectedCampForStaff = campList.get(campIndex);

                   System.out.println("Available staff:");
                for (int i = 0; i < staffList.size(); i++) {
                     System.out.println((i + 1) + ". " + staffList.get(i));
                }

                   System.out.print("Choose staff member (number): ");
                   int staffIndex = Integer.parseInt(scanner.nextLine()) - 1;

                if (staffIndex < 0 || staffIndex >= staffList.size()) {
                   System.out.println("Invalid staff choice.");
                   break;
                }

                    Staff selectedStaff = staffList.get(staffIndex);
                    selectedCampForStaff.addStaff(selectedStaff);

                    System.out.println("Staff member assigned to camp.");
                    break;
                case 6: 
                if(campList.isEmpty()) {
                    System.out.println("No camps available, create a camp first.");
                    break;
                }
                if(memberList.isEmpty()) {
                    System.out.print("No members available, create a member first");
                    break;
                }
                    System.out.println("Available camps:");
                for (int i = 0; i < campList.size(); i++) {
                    System.out.println((i + 1) + ". " + campList.get(i).getTitle());
                }
                    System.out.print("Choose a camp (number): ");
                    int campIndex6 = Integer.parseInt(scanner.nextLine()) - 1;
                    
                if (campIndex6 < 0 || campIndex6 >= campList.size()) {
                    System.out.println("Invalid camp choice.");
                    break;
                }
                    Camp selectedCampForMember = campList.get(campIndex6);

                    System.out.println("Available members: ");
                for(int i = 0; i < memberList.size(); i++) {
                        System.out.println((i + 1) + "." + memberList.get(i));
                    }
                    System.out.print("Choose a member: ");
                    int memberIndex6 = Integer.parseInt(scanner.nextLine());

                    if(memberIndex6 < 1 || memberIndex6 > memberList.size()) {
                        System.out.println("Invalid member choice.");
                    }
                    Member selectedMember = memberList.get(memberIndex6 - 1);
                    selectedCampForMember.addMember(selectedMember);
                    System.out.println("New member registrated for a camp");
                    break;
                case 7: 
                if(campList.isEmpty()) {
                    System.out.println("No camps available, create a camp first.");
                    break;
                }
                System.out.println("Available camps:");
                for (int i = 0; i < campList.size(); i++) {
                    System.out.println((i + 1) + ". " + campList.get(i).getTitle());
                } 
                    System.out.print("Choose a camp of which you want to save informations: ");
                    System.out.print("Choose a camp (number): ");
                    int campIndex7 = Integer.parseInt(scanner.nextLine()) - 1;

                if (campIndex7 < 0 || campIndex7 >= campList.size()) {
                    System.out.println("Invalid camp choice.");
                }
                    Camp selectedCampToSave = campList.get(campIndex7);
                try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("KampInfo_" + selectedCampToSave + ".dat"))) {
                     output.writeObject(selectedCampToSave);
                     System.out.println("File successfully exported to " + "KampInfo_" + selectedCampToSave + ".dat");
                } catch (IOException e) {
                    e.printStackTrace(); // Dit geeft meer details als het toch misloopt
                }
                
                    System.out.println("File succesfully exported");
                    break;
                case 8: 
                    running = false;
                    System.out.println("Thank you for using Camp Management System.");
                    break;
                default: 
                    System.out.println("Invalid selection. Please try again.");
                   
            }


        }
    scanner.close();
    }

}
