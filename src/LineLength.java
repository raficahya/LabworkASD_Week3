public class LineLength {
    public static void main(String[] args) {
        Line line = new Line();

        line.p0 = new Point();
        line.p0.x = 5;
        line.p0.y = 4;

        line.p1 = new Point();
        line.p1.x = 13;
        line.p1.y = 9;

        double d;
        int width = line.p1.x - line.p0.x;
        int height = line.p1.y - line.p0.y;
        d = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
        System.out.println("the length of the line is "+d);
    }
}
