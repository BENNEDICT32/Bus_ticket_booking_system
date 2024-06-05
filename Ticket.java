import java.util.Scanner;
public class Ticket {
    Customer[] customerArr;
    int ticketnum=0;
    Bus bus=new Bus("B-101","Nelspruit-to-Bellville",67);

    public void Bus_details(){
        System.out.println("Bus number: "+bus.Bus_number+"\n"
                           +"Route: "+bus.route+"\n"
                           +"Number of seats: "+bus.totalSeats+"\n");
    }


    
    
    
    
    public void fillArray(int numofTickets){
        int travellernum=1;
        
        Scanner sc=new Scanner(System.in);
        customerArr=new Customer[numofTickets];
        if (ticketnum<=bus.totalSeats){
            for(int i=0;i<=numofTickets-1;i++){
                System.out.println("Number of seats left: "+(bus.totalSeats-ticketnum));
                System.out.println("Please enter the Travellers details for Traveler no."+travellernum);
                System.out.println("Please enter your firstname: ");
                String firstname= sc.nextLine();
                System.out.println("Please enter your lastname: ");
                String lastname= sc.nextLine();
                System.out.println("Please enter your phone number: ");
                String phone_number= sc.nextLine();
                System.out.println("Please enter your your ID no: ");
                String ID_no= sc.nextLine();
                customerArr[i]=new Customer(firstname, lastname, phone_number, ID_no);
                ticketnum++;
                travellernum++;
            }

        }else{
                System.out.println("There are no more seats left");
        }
    }
    public void printCustomerArr(int numofTickets){
        int count=1;
        for(int i=0;i<=numofTickets-1;i++){
            System.out.println("");
            System.out.println("Tickets number: "+count);
            customerArr[i].PrintDetails();
            count++;

        }
    }
            
        

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Ticket ticket= new Ticket();
        ticket.Bus_details();
        System.out.println("Please enter the number of tickets you wanna book: ");
        int no_tickets=sc.nextInt();
        sc.nextLine();
        ticket.fillArray(no_tickets);
        ticket.printCustomerArr(no_tickets);
        sc.close();
            
    }
}
