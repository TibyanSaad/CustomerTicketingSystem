import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class CustomerTicketingSystem1 {
    static ArrayList<Ticket> customerTicket = new ArrayList<>();

    public static void main(String[] args) {
        Scanner customerInput = new Scanner(System.in);
        boolean mainMenuOn = true;
        int option = 0;
        while (option != 3) {
            option = mainMenu(customerInput);
        }
        System.out.println("Exiting the application. Goodbye!");
    }

    public static int mainMenu(Scanner customerInput) {
        System.out.println("########### Main Menu ###########\n Select an option.\n 1.Customer Operations\n 2.Admin Operations\n 3.Exit ");
        int option = Integer.parseInt(customerInput.nextLine());
        if (option == 1) {
            customerPage(customerInput);
        } else if (option == 2) {
            adminPage(customerInput);
        }
        else if (option == 3){
               System.exit(0);
        }else {
            System.out.println("Select a valid option.");
        }
        return 0;
    }

    public static void customerPage(Scanner customerInput) {
        System.out.println("1.Create Ticket");
        System.out.println("2.Back to Main Menu");
        String customerOption = customerInput.nextLine();
        if (customerOption.equals("1")) {
            System.out.println("1.Ticket number");
            System.out.println("2.Type your feedback");
            System.out.println("3.Priority (HIGH, MEDIUM, LOW)");
            System.out.println("#################################");

            System.out.print("1.");
            int ticketNo = customerInput.nextInt();
            customerInput.nextLine();
            System.out.print("2.");
            String feedback = customerInput.nextLine();
            System.out.print("3.");
            String priority = customerInput.nextLine();
            customerTicket.add(new Ticket(ticketNo, feedback, priority));
            System.out.println("Ticket created successfully");
        } else if (customerOption.equals("2")) {
            mainMenu(customerInput);
        } else System.out.println("Invalid option.");
    }

    public static void adminPage(Scanner customerInput) {
        boolean wrongPin = true;
        int tries = 0;
        System.out.println(" Enter admin password: ");
        while (wrongPin && tries < 3) {
            int adminPIN = Integer.parseInt(customerInput.nextLine());
            if (adminPIN != 1234) {
                System.out.printf("Wrong password, attempt number %d.\n", tries + 1);
                tries++;
                if (tries < 3) {
                    System.out.println("Try again");
                }
            } else {
                wrongPin = false;
                System.out.println("PIN is correct.\n Welcome to the dashboard! \n 1.View tickets.\n 2.Update ticket.\n 3.Back to Main Menu");
                int adminOption = Integer.parseInt(customerInput.nextLine());
                if (adminOption == 1) {
                    boolean found = false;
                    System.out.println("Ticket number to be viewed: ");
                    int ticketID = Integer.parseInt(customerInput.nextLine());

                    for (Ticket adminTicketId : customerTicket) {
                        if (adminTicketId.getTicketNo() == ticketID)
                        {
                            System.out.println("Ticket Number: " + adminTicketId.getTicketNo());
                            System.out.println("Description: " + adminTicketId.getfeedback());
                            System.out.println("Priority: " + adminTicketId.getPriority());
                        }
                    }
                    if (!found) {
                        System.out.println("Ticket does not exist");
                    }
                } else if (adminOption == 2) {
                    System.out.println("Type the ticket number of the ticket to be updated: ");
                    /* fix */
                } else if (adminOption == 3) {
                    mainMenu(customerInput);
                }
            }
        }
    }

}