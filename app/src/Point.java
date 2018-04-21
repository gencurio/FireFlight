import static java.lang.Math.sqrt;
import static java.lang.Math.atan;
class Point
{
    private final double x;
    private final double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        return sqrt((x*x) + (y*y));
    }

    public double getAngle()
    {
        return atan(y/x);
    }

    public Point rotate90()
    {
        return new Point(-y, x);
    }

}