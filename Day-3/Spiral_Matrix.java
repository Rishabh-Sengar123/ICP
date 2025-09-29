class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int length = matrix.length;
        int col = matrix[0].length;

        int top = 0, bottom = length - 1;
        int left = 0, right = col - 1;

        while (top <= bottom && left <= right) {
        
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}