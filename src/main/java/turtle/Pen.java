package turtle;

/**
 * Pen class that acts as the context in the Strategy pattern.
 * It uses a DrawingStrategy to draw lines on a Matrix.
 */
public class Pen {
    private DrawingStrategy strategy;

    public Pen(DrawingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DrawingStrategy strategy) {
        this.strategy = strategy;
    }

    public void draw(Matrix matrix, double x0, double y0, double x1, double y1) {
        if (strategy != null) {
            strategy.drawLine(matrix, x0, y0, x1, y1);
        }
    }
}
