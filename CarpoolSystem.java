import java.util.ArrayList;
import java.util.List;

// MAIN SYSTEM CLASS - Contains all business logic
public class CarpoolSystem {
    // Lists to store data
    private List<Driver> drivers;
    private List<Rider> riders;
    private List<Ride> rides;
    private int rideCounter;
    
    // Constructor - Initialize empty lists
    public CarpoolSystem() {
        this.drivers = new ArrayList<>();
        this.riders = new ArrayList<>();
        this.rides = new ArrayList<>();
        this.rideCounter = 0;
    }
    
    // ====== ADD DRIVER ======
    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("✅ Driver added: " + driver.getName());
    }
    
    // ====== ADD RIDER ======
    public void addRider(Rider rider) {
        riders.add(rider);
        System.out.println("✅ Rider added: " + rider.getName());
    }
    
    // ====== MATCH RIDE ======
    public void matchRide(String driverName, String riderName) {
        Driver matchedDriver = null;
        Rider matchedRider = null;
        
        // Find driver by name
        for (Driver d : drivers) {
            if (d.getName().equalsIgnoreCase(driverName)) {
                matchedDriver = d;
                break;
            }
        }
        
        // Find rider by name
        for (Rider r : riders) {
            if (r.getName().equalsIgnoreCase(riderName)) {
                matchedRider = r;
                break;
            }
        }
        
        // Validation checks
        if (matchedDriver == null) {
            System.out.println("❌ Driver " + driverName + " not found!");
            return;
        }
        
        if (matchedRider == null) {
            System.out.println("❌ Rider " + riderName + " not found!");
            return;
        }
        
        if (matchedDriver.getAvailableSeats() <= 0) {
            System.out.println("❌ Driver " + driverName + " has no available seats!");
            return;
        }
        
        // Create ride
        rideCounter++;
        String rideId = "RIDE" + rideCounter;
        double fare = 15.0 + Math.random() * 10.0;
        
        Ride ride = new Ride(rideId, matchedDriver, matchedRider, 
                            matchedDriver.getLocation(), 
                            matchedRider.getDestination(), 
                            fare);
        rides.add(ride);
        matchedDriver.setAvailableSeats(matchedDriver.getAvailableSeats() - 1);
        
        // Success message
        System.out.println("\n✅=== Ride Matched Successfully! ===");
        System.out.println("Ride ID: " + rideId);
        System.out.println("Driver: " + matchedDriver.getName() + " (" + matchedDriver.getVehicle() + ")");
        System.out.println("Rider: " + matchedRider.getName());
        System.out.println("From: " + matchedDriver.getLocation() + " To: " + matchedRider.getDestination());
        System.out.println("Fare: $" + String.format("%.2f", fare));
        System.out.println("====================================\n");
    }
    
    // ====== REQUEST RIDE ======
    public void requestRide(Rider rider, String pickup, String dropoff) {
        Driver availableDriver = null;
        for (Driver d : drivers) {
            if (d.getAvailableSeats() > 0 && d.getLocation().equalsIgnoreCase(pickup)) {
                availableDriver = d;
                break;
            }
        }
        
        if (availableDriver == null) {
            System.out.println("❌ No driver available at " + pickup);
            return;
        }
        
        rideCounter++;
        String rideId = "RIDE" + rideCounter;
        double fare = 15.0 + Math.random() * 10.0;
        
        Ride ride = new Ride(rideId, availableDriver, rider, pickup, dropoff, fare);
        rides.add(ride);
        availableDriver.setAvailableSeats(availableDriver.getAvailableSeats() - 1);
        
        System.out.println("✅ Ride " + rideId + " created with Driver: " + availableDriver.getName());
    }
    
    // ====== COMPLETE RIDE ======
    public void completeRide(String rideId) {
        for (Ride ride : rides) {
            if (ride.getRideId().equals(rideId) && !ride.isCompleted()) {
                ride.completeRide();
                Driver driver = ride.getDriver();
                driver.setAvailableSeats(driver.getAvailableSeats() + 1);
                System.out.println("✅ Ride " + rideId + " completed successfully!");
                return;
            }
        }
        System.out.println("❌ Ride not found or already completed!");
    }
    
    // ====== DISPLAY ALL DRIVERS ======
    public void displayAllDrivers() {
        System.out.println("\n=== All Drivers ===");
        if (drivers.isEmpty()) {
            System.out.println("No drivers registered.");
            return;
        }
        for (Driver d : drivers) {
            d.display();
        }
    }
    
    // ====== DISPLAY ALL RIDERS ======
    public void displayAllRiders() {
        System.out.println("\n=== All Riders ===");
        if (riders.isEmpty()) {
            System.out.println("No riders registered.");
            return;
        }
        for (Rider r : riders) {
            r.display();
        }
    }
    
    // ====== DISPLAY ALL RIDES ======
    public void displayAllRides() {
        System.out.println("\n=== All Rides ===");
        if (rides.isEmpty()) {
            System.out.println("No rides recorded.");
            return;
        }
        for (Ride r : rides) {
            r.displayRideDetails();
            System.out.println("---");
        }
    }
    
    // ====== GETTERS ======
    public List<Driver> getDrivers() {
        return drivers;
    }
    
    public List<Rider> getRiders() {
        return riders;
    }
    
    public List<Ride> getRides() {
        return rides;
    }

    // ============================================================
    // ✅ MAIN METHOD - ENTRY POINT OF THE PROGRAM
    // ============================================================
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   🚗 CARPOOL MATCHING SYSTEM 🚗");
        System.out.println("========================================\n");
        
        // Create system instance
        CarpoolSystem system = new CarpoolSystem();

        // ====== STEP 1: Create Drivers ======
        System.out.println("--- Adding Drivers ---");
        Driver d1 = new Driver("Arun", "Chennai", "Swift", 4);
        Driver d2 = new Driver("Kumar", "Coimbatore", "Innova", 3);
        Driver d3 = new Driver("Priya", "Chennai", "Honda City", 2);
        Driver d4 = new Driver("Suresh", "Bangalore", "Toyota", 5);

        system.addDriver(d1);
        system.addDriver(d2);
        system.addDriver(d3);
        system.addDriver(d4);

        // ====== STEP 2: Create Riders ======
        System.out.println("\n--- Adding Riders ---");
        Rider r1 = new Rider("Rahul", "Chennai", "Airport");
        Rider r2 = new Rider("Vijay", "Coimbatore", "Railway Station");
        Rider r3 = new Rider("Sneha", "Chennai", "OMR");
        Rider r4 = new Rider("Deepak", "Bangalore", "Electronic City");

        system.addRider(r1);
        system.addRider(r2);
        system.addRider(r3);
        system.addRider(r4);

        // ====== STEP 3: Display All Records ======
        System.out.println("\n========================================");
        system.displayAllDrivers();
        system.displayAllRiders();

        // ====== STEP 4: Match Rides ======
        System.out.println("\n========================================");
        System.out.println("--- Matching Rides ---");
        system.matchRide("Arun", "Rahul");
        system.matchRide("Kumar", "Vijay");
        system.matchRide("Priya", "Sneha");
        system.matchRide("Suresh", "Deepak");

        // ====== STEP 5: Display All Rides ======
        System.out.println("\n========================================");
        system.displayAllRides();

        // ====== STEP 6: Complete a Ride ======
        System.out.println("\n========================================");
        System.out.println("--- Completing Ride ---");
        system.completeRide("RIDE1");

        // ====== STEP 7: Display Rides After Completion ======
        System.out.println("\n========================================");
        system.displayAllRides();

        // ====== STEP 8: Update Locations ======
        System.out.println("\n========================================");
        System.out.println("--- Updating Locations ---");
        r1.updateLocation("Airport");
        System.out.println("✅ Rider " + r1.getName() + " location updated to: " + r1.getLocation());
        
        d1.updateLocation("Airport");
        System.out.println("✅ Driver " + d1.getName() + " location updated to: " + d1.getLocation());

        System.out.println("\n========================================");
        System.out.println("   🎉 PROGRAM EXECUTED SUCCESSFULLY 🎉");
        System.out.println("========================================");
    }
}