public class Rider extends Person {
    private String name;
    private String destination;
    
    public Rider(String name, String location, String destination) {
        super(location);
        this.name = name;
        this.destination = destination;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void display() {
        System.out.println("Rider: " + name + ", Location: " + getLocation() + ", Destination: " + destination);
    }
}