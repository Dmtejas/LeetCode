public class RotateImage {

    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        int start = 0;
        int[][] copiedMatrix = new int[length][length];
        for(int i=0;i<length;i++) {
            for(int j=0;j<length;j++) {
                copiedMatrix[i][j] = matrix[i][j];
            }
        }
        for(int j=0;j<length;j++) {
            int end = length-1;
            for(int i=0;i<length;i++) {
                matrix[start][end] = copiedMatrix[i][j];
                end--;
            }
            start++;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        for(int[] n : matrix) {
            for(int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
