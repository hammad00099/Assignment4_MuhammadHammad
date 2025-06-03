package turtle.commands;

import turtle.Turtle;

public class LetterSCommand extends CompositeCommand {
    public LetterSCommand(Turtle turtle) {
        addCommand(new RectangleCommand(turtle, 5, 1));
        addCommand(new TurnCommand(turtle, -90));
        addCommand(new MoveCommand(turtle, 1));
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new TraceCommand(turtle, 5));
        addCommand(new TurnCommand(turtle, 90));
        addCommand(new MoveCommand(turtle, 1));
        addCommand(new TurnCommand(turtle, -90));
        addCommand(new RectangleCommand(turtle, 5, 1));
    }
}