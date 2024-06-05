public class Bus {
    String Bus_number;
    String route;
    int totalSeats;

    Bus(String Bus_number,String route,int totalSeats){
        this.Bus_number=Bus_number;
        this.route=route;
        this.totalSeats=totalSeats;
    }

    public void setBusNumber(String Bus_number){
        this.Bus_number=Bus_number;

    }
    public void setRoute(String route){
        this.route=route;
    }
    public void setTotalSeat(int totalSeats){
        this.totalSeats=totalSeats;

    }

    public String getBusNumber(){
        return Bus_number;
    }

    public String getRoute(){
        return route;
    }
    public int getTotalSeats(){
        return totalSeats;

    }

   
    


    
}
