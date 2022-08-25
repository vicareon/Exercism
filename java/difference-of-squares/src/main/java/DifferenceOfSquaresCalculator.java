class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int squareSum = 0;
        for (int i = 0; i <= input; i++) {
            squareSum += i;
        }
        return (int) Math.pow(squareSum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sumSquare = 0;
        for (int i = 0; i <= input; i++) {
            sumSquare += Math.pow(i, 2);
        }
        return sumSquare;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
