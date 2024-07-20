class Distance {
    private int feet;
    private int inches;

    // Constructor to initialize feet and inches
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two Distance objects
    public Distance addDistance(Distance d) {
        int totalFeet = this.feet + d.feet;
        int totalInches = this.inches + d.inches;

        // If total inches exceed 12, adjust feet and inches
        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches %= 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    // Method to subtract two Distance objects
    public Distance subtractDistance(Distance d) {
        int totalFeet = this.feet - d.feet;
        int totalInches = this.inches - d.inches;

        // If total inches become negative, borrow from feet
        if (totalInches < 0) {
            totalFeet--;
            totalInches += 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    // Method to display the distance
    public void displayDistance() {
        System.out.println("Feet: " + feet + " Inches: " + inches);
    }
}

public class MyDistance {
    public static void main(String[] args) {
        // Create Distance objects
        Distance distance1 = new Distance(5, 8);
        Distance distance2 = new Distance(3, 10);

        // Add distances
        Distance sum = distance1.addDistance(distance2);
        System.out.println("Sum:");
        sum.displayDistance();

        // Subtract distances
        Distance difference = distance1.subtractDistance(distance2);
        System.out.println("Difference:");
        difference.displayDistance();
    }
}


