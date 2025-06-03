package turtle.commands;

/**
 * Command interface for all turtle commands.
 */
public interface Command {
    void execute();
    void undo();
}
