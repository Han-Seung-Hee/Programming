import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Matrix {
    // saddle point 
    // row : 가장 크거나 같은 값
    // col : 가장 작은 값
    // 위 두 사항을 만족하는 임의의 값
    List<List<Integer>> matrix;
    private Set<MatrixCoordinate> res;
    
    
    Matrix(List<List<Integer>> matrix) {
        res = new HashSet<>();
        this.matrix = matrix;

        for(int i = 0 ; i< matrix.size(); i++){
            for(int j = 0 ; j < matrix.get(i).size() ; j++){
                if(isRowMax(i,j) && isColLow(i,j))
                    res.add(new MatrixCoordinate(i+1,j+1));
            }
        }
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return res;
    }

    boolean isRowMax(int i , int j){
        int currVal = matrix.get(i).get(j);
        for(int x = 0 ; x < matrix.get(i).size(); x++){
            if(currVal < matrix.get(i).get(x))
                return false;
        }
        return true;
    }

    boolean isColLow(int i , int j){
        int currVal = matrix.get(i).get(j);
        for(int x = 0 ; x <  matrix.size(); x++){
            if(currVal > matrix.get(x).get(j)) return false;
        }

        return true;
    }
}
