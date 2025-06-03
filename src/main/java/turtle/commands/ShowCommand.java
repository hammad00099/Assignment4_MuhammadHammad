package turtle.commands;

import turtle.Matrix;

public class ShowCommand implements Command {
    private final Matrix matrix;

    public ShowCommand(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void execute() {
        matrix.print();
    }

    @Override
    public void undo() {
        // No operation for undo
    }
}