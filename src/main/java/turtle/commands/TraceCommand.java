package turtle.commands;

import turtle.Turtle;

public class TraceCommand implements Command {
    private final Turtle turtle;
    private final double distance;

    public TraceCommand(Turtle turtle, double distance) {
        this.turtle = turtle;
        this.distance = distance;
    }

    @Override
    public void execute() {
        turtle.penDown();
        turtle.move(distance);
    }

    @Override
    public void undo() {
        // This doesn't erase the trace; we'll address this using Memento pattern if necessary.
        // For now, just move back without drawing
        turtle.penUp();
        turtle.move(-distance);
    }
}
