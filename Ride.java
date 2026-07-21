public class Ride {
    private String rideId;
    private Driver driver;
    private Rider rider;
    private String pickupLocation;
    private String dropoffLocation;
    private double fare;
    private boolean completed;
    
    public Ride(String rideId, Driver driver, Rider rider, 
                String pickupLocation, String dropoffLocation, double fare) {
        this.rideId = rideId;
        this.driver = driver;
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.fare = fare;
        this.completed = false;
    }
    
    public String getRideId() {
        return rideId;
    }
    
    public Driver getDriver() {
        return driver;
    }
    
    public Rider getRider() {
        return rider;
    }
    
    public String getPickupLocation() {
        return pickupLocation;
    }
    
    public String getDropoffLocation() {
        return dropoffLocation;
    }
    
    public double getFare() {
        return fare;
    }
    
    public boolean isCompleted() {
        return completed;
    }
    
    public void setRideId(String rideId) {
        this.rideId = rideId;
    }
    
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    public void setRider(Rider rider) {
        this.rider = rider;
    }
    
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
    
    public void setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }
    
    public void setFare(double fare) {
        this.fare = fare;
    }
    
    public void completeRide() {
        this.completed = true;
    }
    
    public void display() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Pickup: " + pickupLocation + " -> Dropoff: " + dropoffLocation);
        System.out.println("Fare: $" + fare);
        System.out.println("Status: " + (completed ? "Completed" : "Active"));
        System.out.println("Driver: " + driver.getName());
        System.out.println("Rider: " + rider.getName());
    }
    
    public void displayRideDetails() {
        display();
    }
}