class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // sigma (0->i) k , 
        int n = input;
        return (int)Math.pow((n*(n+1)/2),2);
    }

    int computeSumOfSquaresTo(int input) {
        int n = input;
        return (n*(n+1)*(2*n+1)/6);
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) -  computeSumOfSquaresTo(input);
    }

    /**
     *     public static int computeSquareOfSumTo(int n) {
        return (int) Math.pow(IntStream.rangeClosed(1, n).sum(), 2);
    }
    public static int computeSumOfSquaresTo(int n) {
        return IntStream.rangeClosed(1, n).map(i -> i*i).sum();
    }
    public static int betweenSquareOfSumAndSumOfSquaresTo(int n) {
        return Math.abs(computeSquareOfSumTo(n) - computeSumOfSquaresTo(n));
    }
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
    */
}
