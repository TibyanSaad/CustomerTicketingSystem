# Dynamic Customer Ticketing System (Java)

## Overview
This project is a **console-based ticketing system** written in Java.  
It allows customers to create tickets with feedback and priority, while administrators can view and update tickets after logging in with a PIN. The system uses an `ArrayList` to store tickets dynamically, making it more flexible than fixed-size arrays.

## Features
### Customer Operations
- Create new tickets with:
  - Ticket number
  - Feedback description
  - Priority (HIGH, MEDIUM, LOW)
- Return to the main menu

### Admin Operations
- Login with PIN (`1234`)
- View tickets by ticket number
- Update ticket details (number, description, priority)
- Return to the main menu
- Allows up to **3 login attempts** before blocking access

### Ticket Class
- Stores ticket details: number, feedback, and priority
- Provides getter and setter methods for updating ticket information

## File Structure
- `DynamicCustomerTicketingSystem.java` → Main program logic with menus
- `Ticket.java` → Ticket object model
