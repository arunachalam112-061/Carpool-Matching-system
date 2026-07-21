public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   🚗 CARPOOL MATCHING SYSTEM 🚗");
        System.out.println("========================================\n");
        
        CarpoolSystem system = new CarpoolSystem();

        // ====== Create Drivers ======
        System.out.println("--- Adding Drivers ---");
        Driver d1 = new Driver("Arun", "Chennai", "Swift", 4);
        Driver d2 = new Driver("Kumar", "Coimbatore", "Innova", 3);
        Driver d3 = new Driver("Priya", "Chennai", "Honda City", 2);

        system.addDriver(d1);
        system.addDriver(d2);
        system.addDriver(d3);

        // ====== Create Riders ======
        System.out.println("\n--- Adding Riders ---");
        Rider r1 = new Rider("Rahul", "Chennai", "Airport");
        Rider r2 = new Rider("Vijay", "Coimbatore", "Railway Station");
        Rider r3 = new Rider("Sneha", "Chennai", "OMR");

        system.addRider(r1);
        system.addRider(r2);
        system.addRider(r3);

        // ====== Display All ======
        System.out.println("\n========================================");
        system.displayAllDrivers();
        system.displayAllRiders();

        // ====== Match Rides ======
        System.out.println("\n========================================");
        System.out.println("--- Matching Rides ---");
        system.matchRide("Arun", "Rahul");
        system.matchRide("Kumar", "Vijay");
        system.matchRide("Priya", "Sneha");

        // ====== Display All Rides ======
        System.out.println("\n========================================");
        system.displayAllRides();

        // ====== Complete a Ride ======
        System.out.println("\n========================================");
        System.out.println("--- Completing Ride ---");
        system.completeRide("RIDE1");

        // ====== Display Rides After Completion ======
        System.out.println("\n========================================");
        system.displayAllRides();

        // ====== Update Location ======
        System.out.println("\n========================================");
        System.out.println("--- Updating Locations ---");
        r1.updateLocation("Airport");
        System.out.println("✅ Rider " + r1.getName() + " location updated to: " + r1.getLocation());
        
        d1.updateLocation("Airport");
        System.out.println("✅ Driver " + d1.getName() + " location updated to: " + d1.getLocation());
        
        // ====== Display Updated Info ======
        System.out.println("\n========================================");
        System.out.println("--- Updated Rider Details ---");
        r1.display();
        
        System.out.println("\n--- Updated Driver Details ---");
        d1.display();

        System.out.println("\n========================================");
        System.out.println("   🎉 PROGRAM EXECUTED SUCCESSFULLY 🎉");
        System.out.println("========================================");
    }
}