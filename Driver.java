public class Driver extends Person {
    private String name;
    private String vehicle;
    private int availableSeats;
    
    public Driver(String name, String location, String vehicle, int availableSeats) {
        super(location);
        this.name = name;
        this.vehicle = vehicle;
        this.availableSeats = availableSeats;
    }
    
    public String getName() {
        return name;
    }
    
    public String getVehicle() {
        return vehicle;
    }
    
    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    
    @Override
    public void display() {
        System.out.println("Driver: " + name + ", Location: " + getLocation() + ", Vehicle: " + vehicle + ", Available Seats: " + availableSeats);
    }
}