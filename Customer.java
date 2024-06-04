

class Customer{
    String firstname;
    String lastname;
    int phone_number;
    long ID_no;

    Customer(String firstname,String lastname,int phone_number,long ID_no){
        this.firstname= firstname;
        this.lastname=lastname;
        this.phone_number=phone_number;
        this.ID_no=ID_no;
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
    


        






}