package turtle;

public class NaiveStrategy implements DrawingStrategy {
    @Override
    public void drawLine(Matrix m, double x0, double y0, double x1, double y1) {
        if (x0 == x1) {
            double yMin = Math.min(y0, y1);
            double yMax = Math.max(y0, y1);
            for (int y = (int)yMin; y <= (int)yMax; y++) {
                m.setCell((int)x0, y, '#');
            }
        } else {
            double slope = (y1 - y0) / (x1 - x0);
            double intercept = y0 - slope * x0;
            double xMin = Math.min(x0, x1);
            double xMax = Math.max(x0, x1);
            for (int x = (int)xMin; x <= (int)xMax; x++) {
                double y = slope * x + intercept;
                m.setCell(x, (int)y, '#');
            }
        }
    }
}
