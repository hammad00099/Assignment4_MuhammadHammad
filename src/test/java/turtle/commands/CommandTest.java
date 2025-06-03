package turtle.commands;

import org.junit.jupiter.api.Test;
import turtle.*;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    void testMoveCommand() {
        Matrix matrix = new Matrix(10, 10);
        Turtle turtle = new Turtle(matrix, new Pen(new BresenhamStrategy()));
        Command cmd = new MoveCommand(turtle, 3);
        cmd.execute();
        assertNotEquals(0.0, turtle.getX());
    }

    @Test
    void testTraceCommandDraws() {
        Matrix matrix = new Matrix(10, 10);
        Turtle turtle = new Turtle(matrix, new Pen(new BresenhamStrategy()));
        Command cmd = new TraceCommand(turtle, 5);
        cmd.execute();
        assertTrue(turtle.isPenDown());
    }

    @Test
    void testTurnCommandAngle() {
        Matrix matrix = new Matrix(10, 10);
        Turtle turtle = new Turtle(matrix, new Pen(new BresenhamStrategy()));
        Command cmd = new TurnCommand(turtle, 45);
        cmd.execute();
        assertEquals(45.0, turtle.getAngle());
    }
}