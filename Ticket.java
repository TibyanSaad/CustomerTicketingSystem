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
    public String getFeedback(){
        return feedback;
    }
    public String getPriority(){
        return priority;
    }
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    public void setFeedback(String feedback) {
        this.feedback=feedback;
    }
    public void setPriority(String priority) {
        this.priority=priority;
    }
}
