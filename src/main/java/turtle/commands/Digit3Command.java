package turtle.commands;

import turtle.Turtle;

public class Digit3Command extends CompositeCommand {
    public Digit3Command(Turtle turtle) {
        addCommand(new TraceCommand(turtle, 5));           // Top
        addCommand(new TurnCommand(turtle, -90));
        addCommand(new MoveCommand(turtle, 2.5));
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, -4));          // Middle
        addCommand(new TurnCommand(turtle, -90));
        addCommand(new MoveCommand(turtle, 2.5));
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, 5));           // Bottom
    }
}