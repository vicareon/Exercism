import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64){
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }

    }

    BigInteger grainsOnBoard() {
        BigInteger sumGrains = BigInteger.valueOf(0);
        for(int i = 0; i <= 64; i++){
            sumGrains.add(sumGrains + i * 2) += (i * 2);
        }
        return (BigInteger) sumGrains;
    }

}