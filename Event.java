

public class Event {
    
     private String tital;
     private String location;
     private String date;
     private String time;
     private String ContactName;
    public DoubleLinkedList<Contact> ContactsInEvent;
   // public LinkedList<Event>events;
    
    public Event(String tital , String location,String date_time){
        this.tital=tital;
        this.location=location;
        this.date=date;
        this.time=time;
        ContactInEvent=new DoubleLinkedList<Contact>();
       // events=new LinkedList<Contact>();
        
    }

    @Override
    public String toString() {
        return "Event{" + "tital=" + tital + ", location=" + location + ", date=" + date + ", time=" + time + ", ContactName=" + ContactName + '}';
    }

    
    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    public DoubleLinkedList<contact> getContactsInEvent() {
        return ContactsInEvent;
    }

    
    
    
} 
    
    
    
    
    
    
    
    
    
    
    
