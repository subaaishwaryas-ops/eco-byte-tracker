import java.util.Scanner;

public class EcoByteTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("🌱 Welcome to Eco-Byte: Your Digital Carbon Tracker 🌱");
        System.out.println("-----------------------------------------------------");

        // Estimated CO2 emissions
        double CO2_PER_EMAIL = 4.0;          // grams
        double CO2_PER_GB_STREAMING = 36.0;  // grams

        System.out.print("How many emails did you send today? ");
        int emails = input.nextInt();

        System.out.print("How many GB of video did you stream? ");
        double dataUsed = input.nextDouble();

        // Core logic
        double totalEmission = (emails * CO2_PER_EMAIL) +
                               (dataUsed * CO2_PER_GB_STREAMING);

        System.out.println("\n--- 📊 Environmental Impact Report ---");
        System.out.println("Total CO2 Emission: " + totalEmission + " grams");

        // 🌍 BIG WOW FACTOR (Real-world equivalence)
        double carKmEquivalent = totalEmission / 120.0; // approx grams per km
        System.out.println(
            "🚗 This is equivalent to driving approximately "
            + String.format("%.2f", carKmEquivalent)
            + " km in a petrol car."
        );

        // Suggestions
        if (totalEmission > 100) {
            System.out.println("💡 Tip: Reduce streaming quality or download videos to save energy.");
        } else {
            System.out.println("🌟 Great job! Your digital footprint is very low today.");
        }
    }
}