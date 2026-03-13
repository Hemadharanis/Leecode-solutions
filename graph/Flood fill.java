class Solution {
    int o;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        o=image[sr][sc];
        if(o==color)
        return image;
        flood(image,sr,sc,color);
        return image;
    }
    void flood(int[][]img,int sr,int sc,int c){
        if((sr<0||sr>=img.length)||(sc<0||sc>=img[0].length))return;
        if(img[sr][sc]!=o){
            return;
        }
        img[sr][sc]=c;
        flood(img,sr+1,sc,c);
        flood(img,sr-1,sc,c);
        flood(img,sr,sc+1,c);
        flood(img,sr,sc-1,c);

    }
}
