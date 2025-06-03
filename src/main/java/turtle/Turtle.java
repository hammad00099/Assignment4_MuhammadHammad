package turtle;

/**
 * Turtle class representing a cursor on a 2D plane.
 * It can move, draw using a Pen, and turn.
 */
public class Turtle {
    private double x;
    private double y;
    private double angle; // degrees
    private boolean penDown;
    private final Pen pen;
    private final Matrix matrix;

    public Turtle(Matrix matrix, Pen pen) {
        this.matrix = matrix;
        this.pen = pen;
        this.x = 0.0;
        this.y = 0.0;
        this.angle = 0.0; // facing right
        this.penDown = false;
    }

    public void move(double distance) {
        double rad = Math.toRadians(angle);
        double newX = x + distance * Math.cos(rad);
        double newY = y + distance * Math.sin(rad);

        if (penDown) {
            pen.draw(matrix, x, y, newX, newY);
        }

        x = newX;
        y = newY;
    }

    public void turn(double degrees) {
        angle = (angle + degrees) % 360;
    }

    public void penUp() {
        penDown = false;
    }

    public void penDown() {
        penDown = true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAngle() {
        return angle;
    }

    public boolean isPenDown() {
        return penDown;
    }
}
