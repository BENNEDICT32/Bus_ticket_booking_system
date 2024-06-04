import java.util.Scanner;
public class Bus_Ticket {
    Bus_Object[] BusArray;
    int Count=0;

    public void fillArray(int numofTickets){
        Count=+1;
        Scanner sc=new Scanner(System.in);
        BusArray=new Bus_Object[numofTickets];

        for(int i=0;i<=numofTickets-1;i++){
            System.out.println("Please enter the Travellers details: ");
            System.out.println("Please enter your firstname: ");
            String firstname= sc.nextLine();
            System.out.println("Please enter your lastname: ");
            String lastname= sc.nextLine();
            System.out.println("Please enter your phone number: ");
            int phone_number= sc.nextInt();
            sc.nextLine();
            System.out.print("Please enter your your ID no: ");
            long ID_no= sc.nextLong();
            sc.nextLine();
            System.out.print("Please choose the departure: ");
            String departure= sc.nextLine();
            System.out.print("Please enter you destination: ");
            String arrival=sc.nextLine();

            BusArray[i]=new Bus_Object(firstname, lastname, phone_number, ID_no, departure, arrival);
            


        }
        



    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Bus_Ticket ticket= new Bus_Ticket();
        System.out.println("Please enter the number of tickets you wanna book: ");
        int no_tickets=sc.nextInt();
        ticket.fillArray(no_tickets); 
        System.out.println(ticket.Count);
            
    }


    
}
