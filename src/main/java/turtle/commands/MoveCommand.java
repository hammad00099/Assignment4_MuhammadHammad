package turtle.commands;

import turtle.Turtle;

public class MoveCommand implements Command {
    private final Turtle turtle;
    private final double distance;
    private double prevX, prevY;

    public MoveCommand(Turtle turtle, double distance) {
        this.turtle = turtle;
        this.distance = distance;
    }

    @Override
    public void execute() {
        prevX = turtle.getX();
        prevY = turtle.getY();
        turtle.penUp();
        turtle.move(distance);
    }

    @Override
    public void undo() {
        turtle.penUp();
        turtle.move(-distance);
    }
}
