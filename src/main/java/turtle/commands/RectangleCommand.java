package turtle.commands;

import turtle.Turtle;

public class RectangleCommand extends CompositeCommand {
    public RectangleCommand(Turtle turtle, double width, double height) {
        addCommand(new TraceCommand(turtle, width));
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, height));
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, width));
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, height));
        addCommand(new TurnCommand(turtle, 90));
    }
}