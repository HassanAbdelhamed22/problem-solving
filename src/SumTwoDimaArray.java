public class SumTwoDimaArray {
    public static void main(String[] args) {
        int[][] twoDimaArray = {{1,2,3}, {4,5,6}};

        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += twoDimaArray[i][j];
            }
        }

        System.out.println(sum);
    }
}
