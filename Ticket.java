import java.util.Scanner;
public class Ticket {
    Customer[] customerArr;
    int Count;

    
    
    
    
    public void fillArray(int numofTickets){
        Scanner sc=new Scanner(System.in);
        customerArr=new Customer[numofTickets];

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
            customerArr[i]=new Customer(firstname, lastname, phone_number, ID_no);
            


        }

    
        



    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Ticket ticket= new Ticket();
        System.out.println("Please enter the number of tickets you wanna book: ");
        int no_tickets=sc.nextInt();
        ticket.fillArray(no_tickets); 
        System.out.println(ticket.Count);
            
    }


    
}
