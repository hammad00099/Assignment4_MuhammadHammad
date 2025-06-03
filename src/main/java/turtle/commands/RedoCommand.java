package turtle.commands;

import java.util.Stack;

public class RedoCommand implements Command {
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public RedoCommand(Stack<Command> undoStack, Stack<Command> redoStack) {
        this.undoStack = undoStack;
        this.redoStack = redoStack;
    }

    @Override
    public void execute() {
        if (!redoStack.isEmpty()) {
            Command cmd = redoStack.pop();
            cmd.execute();
            undoStack.push(cmd);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    @Override
    public void undo() {}
}