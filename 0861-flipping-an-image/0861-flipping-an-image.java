class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        // int flippedImg[][] = new int[n][n];
        for(int i=0;i<n;i++){
            int a=0;
            int b=n-1;
            while(a<b){
                int temp = image[i][a];
                image[i][a] = (image[i][b]==0)?1:0;
                image[i][b] = (temp==0)?1:0;
                a++;
                b--;
            }
            if(n%2==1){
                image[i][n/2] = (image[i][n/2]==0)?1:0;
            }
        }
        return image;
    }
}