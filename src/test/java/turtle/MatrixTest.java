package turtle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void testSetAndPrint() {
        Matrix matrix = new Matrix(10, 5);
        matrix.setCell(2, 2, '#');
        assertDoesNotThrow(matrix::print);
    }
}