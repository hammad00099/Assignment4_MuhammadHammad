package turtle.commands;

import turtle.Turtle;

public class TextSE350Command extends CompositeCommand {
    public TextSE350Command(Turtle turtle) {
        // Letter S
        addCommand(new LetterSCommand(turtle));
        addCommand(new MoveCommand(turtle, 8));

        // Letter E
        addCommand(new LetterECommand(turtle));
        addCommand(new MoveCommand(turtle, 8));

        // Digit 3
        addCommand(new Digit3Command(turtle));
        addCommand(new MoveCommand(turtle, 8));

        // Digit 5 (same as S)
        addCommand(new LetterSCommand(turtle));
        addCommand(new MoveCommand(turtle, 8));

        // Digit 0 (rectangle)
        addCommand(new RectangleCommand(turtle, 5, 5));
    }
}