import java.math.BigDecimal;
import java.math.BigInteger;

class Grains {

    // condition
    // 체스판의 사각형은 64개로 이루어져 있음.
    // 각 사각형 위의 밀알의 개수는 1에서 시작하여 다음 사각형은 그 두배의 양이 된다.
    // 이 때 x번 사각형 위의 밀알의 개수와 체스판 전체의 밀알의 개수의 합을 구하는 함수를 구현하라.

    private BigInteger[] bg= new BigInteger[64];
    private BigInteger sum = BigInteger.ZERO;
    public Grains() {
        for(int i = 0 ; i < 64; i++){
            this.bg[i] = new BigInteger("2").pow(i);
            this.sum = this.sum.add(bg[i]);
        }
    }

    BigInteger grainsOnSquare(final int square) {
        if(square > 64) throw new IllegalArgumentException("square must be between 1 and 64");
        else if(square <= 0) throw new IllegalArgumentException("square must be between 1 and 64");
        return bg[square-1];
    }

    BigInteger grainsOnBoard() {
        return sum;
    }

}
