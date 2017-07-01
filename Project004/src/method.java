public class method {
    public static void main(String args[]) {
        double ans = inchesToCent(1, 1);
        System.out.println(ans);
        inchesToCent(157);
    }

    // Calculates how many cm in the given number of feet and/or inches.
    public static double inchesToCent(double ft, double inch) {
        if (ft >= 0 && (inch >= 0 && inch <= 12)) {
            double totalCm = (inch + (ft * 12))*2.54;
            //System.out.println("There are " + totalCm + " centimeters in " + ft + " feet and " + inch + " inches.");
            return totalCm;
        }
        System.out.println("Invalid feet and/or inches.");
        return -1;
    }

    // Returns # of feet in the given inches.

    // There're better / shorter way of finding the number of feet in given inches, but I wanted
    // to do it using the first inchesToCent method that takes a foot and an inch parameter and
    // spits out a value in centimeters. Otherwise, this method is just one line of code (inch/12).
    public static double inchesToCent(double inch) {
        if (inch >= 0) {
            double ft = Math.floor(inch/12);
            double in = inch%12;
            double totalFt = (inchesToCent(ft, in))/30.48;
            System.out.println("There are " + totalFt + " feet in " + inch + " inches.");
            return totalFt;
        }
        System.out.println("Invalid feet and/or inches.");
        return -1;
    }
}