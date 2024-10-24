public class ShortestPath {
    public static float ShortestPath(String path) {
        int x=0, y=0;
        
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);

            //North
            if(dir == 'N') {
                y++;
            } 
            //South
            else if (dir == 'S') {
                y--;
            } 
            //West
            else if (dir == 'W') {
                x--;
            } 
            //East
            else {
                x++;
            }
        }
        //Shortest Path
        int X2 = x*x;
        int Y2 = y*y;
        float ShortestPath = (float) Math.sqrt(X2 + Y2);
        return ShortestPath;
    }
    public static void main(String [] args) {
        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));
    }
    
}
