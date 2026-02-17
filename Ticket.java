public class Ticket {
    int ticketNo;
    String feedback;
    String priority;

    public Ticket(int ticketNo,String feedback, String priority){
        this.ticketNo= ticketNo;
        this.feedback=feedback;
        this.priority=priority;
    }
    public int getTicketNo(){
        return ticketNo;
    }
    public String getfeedback(){
        return feedback;
    }
    public String getPriority(){
        return priority;
    }
}
