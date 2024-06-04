

class Bus_Object{
    String firstname;
    String lastname;
    int phone_number;
    long ID_no;
    String departure;
    String arrival;

    Bus_Object(String firstname,String lastname,int phone_number,long ID_no,String departure,String arrival){
        this.firstname= firstname;
        this.lastname=lastname;
        this.phone_number=phone_number;
        this.ID_no=ID_no;
        this.departure=departure;
        this.arrival= arrival;

    }

    public void setFirstName(String firstname){
        this.firstname=firstname;
    }
    public void setLastName(String lastname){
        this.lastname=lastname;

    }
    public void setPhoneNumber(int phone_number){
        this.phone_number=phone_number;
    }

    public void setID(long ID_no){
        this.ID_no=ID_no;

    }

    public void setDeparture(String departure){
        this.departure=departure;

    }

    public void setArrival(String arrival){
        this.arrival=arrival;

    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public int getPhone_number(){
        return phone_number;
    }

    public long getID_no(){
        return ID_no;
    }

    public String getDeparture(){
        return departure;
    }

    public String getArrival(){
        return arrival;
    }
    


        






}