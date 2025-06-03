package turtle.commands;

import turtle.Turtle;

public class LetterECommand extends CompositeCommand {
    public LetterECommand(Turtle turtle) {
        addCommand(new TraceCommand(turtle, 5));          // Top bar
        addCommand(new TurnCommand(turtle, -90));
        addCommand(new TraceCommand(turtle, 2.5));        // Middle
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, 3));
        addCommand(new MoveCommand(turtle, -3));
        addCommand(new TurnCommand(turtle, -90));
        addCommand(new TraceCommand(turtle, 2.5));        // Bottom
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, 5));
    }
}