package turtle.commands;

public class QuitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exiting Turtle Graphics Editor. Goodbye!");
        System.exit(0);
    }

    @Override
    public void undo() {
        // No operation for undo
    }
}