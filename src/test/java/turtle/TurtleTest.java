package turtle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    @Test
    void testMoveWithoutDrawing() {
        Matrix matrix = new Matrix(10, 10);
        Pen pen = new Pen(new BresenhamStrategy());
        Turtle turtle = new Turtle(matrix, pen);

        double startX = turtle.getX();
        turtle.penUp();
        turtle.move(5);
        assertNotEquals(startX, turtle.getX());
    }

    @Test
    void testTurn() {
        Matrix matrix = new Matrix(10, 10);
        Pen pen = new Pen(new NaiveStrategy());
        Turtle turtle = new Turtle(matrix, pen);

        turtle.turn(90);
        assertEquals(90, turtle.getAngle());
    }
}