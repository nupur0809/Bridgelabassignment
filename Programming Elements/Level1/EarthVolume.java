public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; // radius of Earth in km
        double kmToMiles = 0.621371; // conversion factor

        // Calculate volume in km³
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles and calculate volume in mi³
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Output
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 +
            " and cubic miles is " + volumeMiles3
        );
    }
}
