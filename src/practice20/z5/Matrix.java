package practice20.z5;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private final int rows;
    private final int cols;
    private final T[][] data;

    @SuppressWarnings("unchecked")
    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0)
            throw new IllegalArgumentException("Размеры должны быть положительными");
        this.rows = rows;
        this.cols = cols;
        this.data = (T[][]) new Number[rows][cols];
    }

    @SuppressWarnings("unchecked")
    public Matrix(T[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = (T[][]) new Number[rows][cols];
        for (int i = 0; i < rows; i++)
            System.arraycopy(data[i], 0, this.data[i], 0, cols);
    }

    public int getRows() { return rows; }
    public int getCols() { return cols; }

    public T get(int i, int j) { return data[i][j]; }

    public void set(int i, int j, T value) { data[i][j] = value; }

    public Matrix<Double> add(Matrix<T> other) {
        checkSameSize(other);
        Matrix<Double> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.set(i, j, data[i][j].doubleValue() + other.data[i][j].doubleValue());
        return result;
    }

    public Matrix<Double> subtract(Matrix<T> other) {
        checkSameSize(other);
        Matrix<Double> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.set(i, j, data[i][j].doubleValue() - other.data[i][j].doubleValue());
        return result;
    }

    public Matrix<Double> multiply(Matrix<T> other) {
        if (cols != other.rows)
            throw new IllegalArgumentException("Несовместимые размеры для умножения");
        Matrix<Double> result = new Matrix<>(rows, other.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double s = 0;
                for (int k = 0; k < cols; k++)
                    s += data[i][k].doubleValue() * other.data[k][j].doubleValue();
                result.set(i, j, s);
            }
        }
        return result;
    }

    public Matrix<Double> multiply(double scalar) {
        Matrix<Double> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.set(i, j, data[i][j].doubleValue() * scalar);
        return result;
    }

    public Matrix<Double> transpose() {
        Matrix<Double> result = new Matrix<>(cols, rows);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.set(j, i, data[i][j].doubleValue());
        return result;
    }

    private void checkSameSize(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols)
            throw new IllegalArgumentException("Размеры матриц не совпадают");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++)
            sb.append(Arrays.toString(data[i])).append("\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        Matrix<Integer> a = new Matrix<>(new Integer[][]{{1, 2}, {3, 4}});
        Matrix<Integer> b = new Matrix<>(new Integer[][]{{5, 6}, {7, 8}});

        System.out.println("A:\n" + a);
        System.out.println("B:\n" + b);
        System.out.println("A + B:\n" + a.add(b));
        System.out.println("A - B:\n" + a.subtract(b));
        System.out.println("A * B:\n" + a.multiply(b));
        System.out.println("A * 2:\n" + a.multiply(2));
        System.out.println("A^T:\n" + a.transpose());
    }
}
