//------------------------------------------------------
// Lab Assignment 4
// Written by: Muhammad Hammad 2003475
// For SE350 Section 601 – Spring 2025
//------------------------------------------------------

package turtle;

public class Matrix {
    private final int width;
    private final int height;
    private final char[][] grid;

    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new char[height][width];

        // Initialize matrix with empty space
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                grid[y][x] = ' ';
            }
        }
    }

    public void setCell(int x, int y, char c) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            grid[y][x] = c;
        }
    }

    public void print() {
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }
}
