//------------------------------------------------------
// Lab Assignment 4
// Written by: Muhammad Hammad 2003475
// For SES350 601 – Spring 2025
//------------------------------------------------------

package turtle;

import turtle.commands.*;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Turtle Graphics Editor!");

        Matrix matrix = new Matrix(60, 20);
        Pen pen = new Pen(new BresenhamStrategy());
        Turtle turtle = new Turtle(matrix, pen);

        Stack<Command> undoStack = new Stack<>();
        Stack<Command> redoStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ");
            String cmd = parts[0].toLowerCase();

            try {
                Command command = null;
                switch (cmd) {
                    case "move":
                        command = new MoveCommand(turtle, Double.parseDouble(parts[1]));
                        break;
                    case "trace":
                        command = new TraceCommand(turtle, Double.parseDouble(parts[1]));
                        break;
                    case "turn":
                        command = new TurnCommand(turtle, Double.parseDouble(parts[1]));
                        break;
                    case "show":
                        command = new ShowCommand(matrix);
                        break;
                    case "undo":
                        new UndoCommand(undoStack, redoStack).execute();
                        continue;
                    case "redo":
                        new RedoCommand(undoStack, redoStack).execute();
                        continue;
                    case "rectangle":
                        command = new RectangleCommand(turtle, 10, 5);
                        break;
                    case "se350":
                        command = new TextSE350Command(turtle);
                        break;
                    case "quit":
                        new QuitCommand().execute();
                        return;
                    default:
                        System.out.println("Unknown command.");
                        continue;
                }

                if (command != null) {
                    command.execute();
                    if (!(command instanceof ShowCommand || command instanceof QuitCommand)) {
                        undoStack.push(command);
                        redoStack.clear();
                    }
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
