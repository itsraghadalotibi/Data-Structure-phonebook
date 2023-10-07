
public class Event {
    
     private String tital;
     private String location;
     private String date_time;
    private DoubleLinkedList<Contact> name;

    public Event(){
        tital="";
        location="";
        date_time="";
        name=new DoubleLinkedList<Contact>;
    }
    public Event(String tital , String location,String date_time){
        this.tital=tital;
        this.location=location;
        this.date_time=date_time;
        name=new DoubleLinkedList<Contact>();
        
        
    }

    @Override
    public String toString() {
        return "Event{" + "tital=" + tital + ", location=" + location + ", date_time=" + date_time + ", name=" + name + '}';
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

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
    
    
    
} 
    
    
    
    
    
    
    
    
    
    
    
    
