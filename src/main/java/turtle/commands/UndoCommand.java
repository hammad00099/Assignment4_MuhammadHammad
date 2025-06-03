package turtle.commands;

import java.util.Stack;

public class UndoCommand implements Command {
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public UndoCommand(Stack<Command> undoStack, Stack<Command> redoStack) {
        this.undoStack = undoStack;
        this.redoStack = redoStack;
    }

    @Override
    public void execute() {
        if (!undoStack.isEmpty()) {
            Command cmd = undoStack.pop();
            cmd.undo();
            redoStack.push(cmd);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    @Override
    public void undo() {}
}