

class Customer{
    String firstname;
    String lastname;
    String phone_number;
    String ID_no;

    Customer(String firstname,String lastname,String phone_number,String ID_no){
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
    public void setPhoneNumber(String phone_number){
        this.phone_number=phone_number;
    }

    public void setID(String ID_no){
        this.ID_no=ID_no;

    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public String getPhone_number(){
        return phone_number;
    }

    public String getID_no(){
        return ID_no;
    }

    public void PrintDetails(){
        System.out.println("Firstname: "+firstname+"\n"
                            +"Lastname: "+lastname+"\n"
                            +"Phone number: "+phone_number+"\n"
                            +"Id number: "+ID_no );
    }
    


        






}