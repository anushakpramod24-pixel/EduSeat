package model;

public class Classroom {
    private int rows;
    private int cols;

    public Classroom(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int getCapacity() {
        return rows * cols;
    }
}
