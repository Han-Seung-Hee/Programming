import java.util.ArrayList;
import java.util.List;

class Triangle {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) throws TriangleException{
        // 삼각형의 결정조건
        // 세 변의 길이를 모두 안다는 가정 하에,
        // 가장 큰 변의 길이는 다른 변의 길이의 합보다 작아야 한다.
        // ex) Triangle(1,1,3) 인 경우에는 삼각형을 만들 수 없다.
        if(!isTriangle(side1,side2,side3)){
            throw new TriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;


    }

    boolean isEquilateral() {
        if(side1 == side2 && side2 == side3){
            return true;
        }else return false;
    }

    boolean isIsosceles() {

        if(side1 == side2){
            return true;
        }else if(side1 == side3){
            return true;
        }else if(side2 == side3){
            return true;
        }else{
            return false;
        }
    }

    boolean isScalene() {
        if(!isEquilateral() && !isIsosceles())
            return true;
        else return false;
    }

    static boolean isTriangle(double size1, double size2, double size3){
        double highest = 0;
        int pos = 0;
        
        if(size1 == size2 && size2 == size3) {
            if(size1==0)
                return false;
            
            return true;
        }
        
        List<Double> list = new ArrayList<>();
        list.add(size1);
        list.add(size2);
        list.add(size3);

 
        for(int i = 0 ; i< list.size() ; i++){
            if(highest < list.get(i)){
                highest = list.get(i);
                pos = i;
            }
        }        
        System.out.println(highest);
        System.out.println(pos);
        double pluseSecAndTur = 0;
        for(int i = 0 ; i< list.size() ; i++){
            if(i != pos){
                pluseSecAndTur += list.get(i);
            }
        }
        System.out.println(pluseSecAndTur);
        if(highest > pluseSecAndTur) return false;
        return true;
    }

    public static void main(String[] args) throws TriangleException {
        System.out.println(Triangle.isTriangle(0.5, 0.4, 0.5));
    }

}
