class Rotate_Image {
    public void rotate(int[][] matrix) {
        int leng =  matrix.length;
        int hello[][] = new int[leng][leng];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                hello[i][j] = matrix[(leng-1)-j][i];
            }
        }
        for(int i=0; i<leng; i++){
            for(int j=0; j<leng; j++){
                matrix[i][j] = hello[i][j];
            }
        }

    }
}