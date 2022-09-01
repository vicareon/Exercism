class DifferenceOfSquares {
    int num, sum

    DifferenceOfSquares(num) {
        this.num = num
    }

    def squareOfSum() {
        sum = 0
        for(int i = 0; i <= num; i++){
            sum += i
        }
        return (int) Math.pow(sum, 2)
    }

    def sumOfSquares() {
        sum = 0
        for(int i = 0; i <= num; i++){
            sum += Math.pow(i, 2)
        }
        return sum
    }

    def difference() {
        squareOfSum() - sumOfSquares()
    }
}