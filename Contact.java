
public class Contact implements Comparable<Contact>{
 
private String name;
private String phonenumber;
private String emailaddress;
private String address;
private String birthday ;
private String notes;
private LinkedList<Events> events ;

public Contact(){
name="";
phonenumber = "";
emailaddress = "";
address = "" ;
birthday = "";
notes = "";
events = new LinkedList<Events>();

}


    public Contact(String name, String phonenumber, String emailaddress, String adress, String birthday, String notes) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
        this.address = adress;
        this.birthday = birthday;
        this.notes = notes;
        events = new LinkedList<Events>();
        
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", phonenumber=" + phonenumber + ", emailaddress=" + emailaddress + ", address=" + address + ", birthday=" + birthday + ", notes=" + notes + '}';
    }
    
    

    public boolean addEvent(Event newEvent ){
        if (events.empty==true) {
          events.add(newEvent); 
             return true;
        }
    
        if (events.empty==false) {
            
            events.findFirst();
            for (int i = 0; i < events.size; i++) {
                if ((events.retrive().date.compareTo(newEvent.date))==0) {
                  return false; 
                }
                
                
            
        }
             events.add(newEvent) ;
             return true;
    
    }}

        Public boolean removeEvent (String rEvent){
            
            if(events.empty()==true) return false ;
         Event temp = new Event();  
         temp.title=rEvent;
            if (events.search(temp)==true) {
                events.remove(temp);
                return true;
                
            }
            else return false ;
           
        
        
    }
    
    public int compareTo(Contact o) {
         return (this.name.compareTo(o.name));
    }

    
    
    //setters aand getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
    
    
}
