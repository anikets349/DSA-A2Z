public class Switch {
    public static double areaCircle(double rad) {
        return Math.PI * rad * rad;
    }

    public static double areaRectangle(double len, double breadth) {
        return len * breadth;
    }

    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        switch (ch) {
            case 1:
                return areaCircle(a[0]);
            case 2:
                return areaRectangle(a[0], a[1]);
            default:
                return -1;
        }
    }
}