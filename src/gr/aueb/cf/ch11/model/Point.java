package gr.aueb.cf.ch11.model;

/**
 * The {@link Point} class represents <i>points<i/>
 * a two-dimensional space.It contains {@link Point#x}
 * and {@link Point#y} coordinates.
 *
 * @author greg_
 * @since 0.1
 * @version 2.0
 *
 */
public class Point {
    private int x;
    private int y;

    /**
     * Initialize a new {@link Point}
     * with default values.
     */
    public Point() {
    }

    /**
     * Initiates a newly created point to
     * specific coordinates.
     * @param x     the x-coordinate.
     * @param y     the y-coordinate.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String pointToString() {
        return "(" + x + "," + y + ")";
    }
}
