import java.util.ArrayList;
import java.util.Scanner;


public class CustomerTicketingSystem {
    public static void main(String[] args){

        Scanner customerInput = new Scanner(System.in);
        ArrayList<String> customerFeedback = new ArrayList<>();
        boolean menuOn = true;

        while (menuOn){
            System.out.println("########### Main Menu ###########\n Select an option.\n 1.Feedback\n 2.Dashboard\n 3.Exit ");
            int option = Integer.parseInt(customerInput.nextLine());

            if (option == 1){
                System.out.println("Ticket number: ");
                customerFeedback.add(customerInput.nextLine());
                System.out.println("Type your feedback: ");
                customerFeedback.add(customerInput.nextLine());
                System.out.println("Priority: ");
                customerFeedback.add(customerInput.nextLine());
                System.out.println("Ticket created successfully");
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
                        System.out.println("PIN is correct.\n Welcome to the dashboard! \n 1.View tickets.\n 2.Update ticket");
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
