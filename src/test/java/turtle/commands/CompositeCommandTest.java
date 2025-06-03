package turtle.commands;

import org.junit.jupiter.api.Test;
import turtle.*;

import static org.junit.jupiter.api.Assertions.*;

class CompositeCommandTest {
    @Test
    void testRectangleCommand() {
        Matrix matrix = new Matrix(20, 20);
        Turtle turtle = new Turtle(matrix, new Pen(new BresenhamStrategy()));
        Command rect = new RectangleCommand(turtle, 5, 3);
        rect.execute();
        assertDoesNotThrow(matrix::print);
    }
}