import java.util.Arrays;
import java.util.stream.IntStream;

class Matrix {
    // Stream을 이용한 방법
    private final int[][] rows;
    private final int[][] cols;

    public Matrix(String str){
        final int[][] matrix = parseLines(str);
        this.rows = matrix;
        this.cols = transpos(rows);
    }

    public int getRowsCount() {
        return rows.length;
    }
    public int getColumnsCount() {
        return cols.length;
    }

    public int[] getRow(int i){
        return rows[i-1];
    }

    public int[] getColumn(int i){
        return cols[i-1];
    }

    public static int[][] parseLines(String str){
        return Arrays.stream(str.split("\n"))
                     .map(Matrix::parseLine)
                     .toArray(int[][]::new);
    }

    public static int[] parseLine(String sstr){
        return Arrays.stream(sstr.split(" "))
                     .mapToInt(Integer::parseInt)
                     .toArray();
    }

    public static int[][] transpos(int[][] arr){
        return IntStream.range(0, arr[0].length)
                        .mapToObj(i -> transposeCol(arr,i))
                        .toArray(int[][]::new);
    }

    public static int[] transposeCol(int[][] arr, int i){
        return IntStream.range(0,arr.length)
                        .map(j-> arr[j][i])
                        .toArray();
    }
}
