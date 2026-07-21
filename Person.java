public abstract class Person {
    protected String location;
    
    public Person(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void updateLocation(String location) {
        this.location = location;
    }
    
    public abstract void display();
}