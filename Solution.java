
class Solution {
  public int[][] rotate(int[][] matrix) {
    int[][] newMatrix = new int[matrix.length][matrix.length];
    int endPoint = matrix.length - 1 ;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        newMatrix[j][endPoint] = matrix[i][j];
      }
      endPoint--;
    }
    return newMatrix;
  }
}
