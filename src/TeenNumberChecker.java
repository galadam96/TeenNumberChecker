public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(131,115,20));
    }

    public static boolean hasTeen(int x, int y, int z){
        boolean result = false;
        if((x >= 13 && x<= 19) ||(y >= 13 && y<= 19) ||(z >= 13 && z<= 19)){
            result = true;
        }

        return result;
    }

    public static boolean isTeen(int x){
        boolean result = false;
        if((x >= 13 && x<= 19)){
            result = true;
        }

        return result;
    }
}
