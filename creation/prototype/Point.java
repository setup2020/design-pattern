/**
 * Point
 */
public class Point {

    protected int x;
    protected int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point point){
    
        int a=point.x-x;
        int b=point.y-y;

        return Math.sqrt((a*a)+(b*b));
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    

}