import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;


public class CustomerTicketingSystem1 {
    public static void main(String[] args){

        Scanner customerInput = new Scanner(System.in);
        ArrayList<String> customerFeedback = new ArrayList<>();
        boolean menuOn = true;

        while (menuOn){
            System.out.println("########### Main Menu ###########\n Select an option.\n 1.Customer Operations\n 2.Admin Operations\n 3.Exit ");
            int option = Integer.parseInt(customerInput.nextLine());

            if (option == 1){
                System.out.println("1.Create Ticket");
                System.out.println("2.Back to Main Menu");
                String customerOption = customerInput.nextLine();
                    if (customerOption.equals("2")){
                        System.out.println("1.Ticket number");
                        System.out.println("2.Type your feedback");
                        System.out.println("3.Priority (HIGH, MEDIUM, LOW)");
                        System.out.println("#################################");
                        System.out.print("1.");
                        customerFeedback.add(customerInput.nextLine());
                        System.out.print("2.");
                        customerFeedback.add(customerInput.nextLine());
                        System.out.print("3.");
                        customerFeedback.add(customerInput.nextLine());
                        System.out.println("Ticket created successfully");
                        }else if (customerOption.equals("1")){
                        exit(0);
                }System.out.println("Invalid option.");
            }

            else if (option == 2) {
                boolean wrongPin = true;
                int tries = 0;
                System.out.println(" Enter admin password: ");
                while(wrongPin && tries < 3){
                    int adminPIN = Integer.parseInt(customerInput.nextLine());
                    if (adminPIN != 1234) {
                        System.out.printf("Wrong password, attempt number %d.\n", tries+1);
                        tries++;
                        if (tries < 3){
                            System.out.println("Try again");
                        }
                    } else {
                        wrongPin = false;
                        System.out.println("PIN is correct.\n Welcome to the dashboard! \n 1.View tickets.\n 2.Update ticket.\n 3.Exit");
                            int adminOption = Integer.parseInt(customerInput.nextLine());
                            if (adminOption == 1){
                                System.out.println("Ticket number to be viewed: ");
                                String ticketID = customerInput.nextLine();
                        for (String feedback : customerFeedback) {
                            if (ticketID.equals(feedback)) {
                                System.out.println("Ticket Number: " + feedback);
                                int adminFeedback = customerFeedback.indexOf(feedback);
                                System.out.println("Description: " + customerFeedback.get(adminFeedback + 1));
                                System.out.println("Priority: " + customerFeedback.get(adminFeedback + 2));
                            }
                            }
                        if (!customerFeedback.contains(ticketID)){
                                    System.out.println("Ticket does not exist");}
                        } else if (adminOption == 2) {
                                System.out.println("Type the ticket number of the ticket to be updated: ");

                            }else if (adminOption == 3){
                                exit(0);
                            }
                    }
                }
            }

            else if(option == 3){
                menuOn = false;
                System.out.println("Exiting the application. Goodbye!");
            } else System.out.println("Select a valid option.");
        }
    }
}
