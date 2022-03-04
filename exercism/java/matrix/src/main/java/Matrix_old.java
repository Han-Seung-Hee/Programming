class Matrix_old {

    private int[][] rows;
    private int[][] cols;

    Matrix_old(String matrixAsString) {
        this.rows = parseLines(matrixAsString);
        this.cols = transRowsToCols(rows);
    }

    int[] getRow(int rowNumber) {
        return rows[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        return cols[columnNumber-1];
    }

    // 행 변환
    private int[][] parseLines(String in){
        // String in 은 1 2 3 \n10 20 과 같은 형태로 나누어진다.
        String[] StrArr = in.split("\n");
        int rowSize = StrArr.length;
        int colSize = StrArr[0].split(" ").length;
        int[][] rows = new int[rowSize][colSize];
        for(int i = 0; i< StrArr.length ; i++ ){
            String[] colArr = StrArr[i].split(" ");
            for(int j = 0 ; j < colArr.length ; j ++){
                rows[i][j] = Integer.parseInt(colArr[j]); 
            }
        }
        return rows;
    }
    
    
    //parseLines 함수로 얻은 rows 들을 통해 Col로 변환 시킨다.
    private int[][] transRowsToCols(int[][] rows){
        int rowSize = rows.length;
        int colSize = rows[0].length;
        int[][] cols = new int[colSize][rowSize];
        
        for(int i = 0 ; i < rows[0].length ; i++){
            for(int j = 0 ; j < rows.length ; j++){
                cols[i][j] = rows[j][i];
            }
        }
        return cols;
    }
}
