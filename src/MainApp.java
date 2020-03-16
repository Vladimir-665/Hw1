
public class MainApp {
    public static void main(String[] args){
    }
    public static void types(String[] args){
        byte valByte = 126;
        short valShort = 32766;
        int valInt = 10000;
        long valLong = 40000000L;
        float valFloat = 1.1f;
        double valDouble = 264.264;
        char valChar = ')';
        boolean valBoolean = true;
    }
    public static int calculate(int a, int b, int c, int d){
        return a *(b + (c / d));
    }
    public static boolean task10and20(int x1, int x2){
        if(x1 + x2 >= 10 || x1 + x2 <= 20){
            return true;
        } else {
            return false;
        }
        }
     public static void isPositiveOrNegative(int x){
        if(x < 0){
            System.out.println("x отрицателено");
        } if(x >= 0){
            System.out.println("x положительно");
        }
     }
    public static boolean isNegative(int x){
        if(x < 0){
            return true;
        }
            return false;
    }
    public static void welcoming(String name){
        System.out.println("Привет, " + name);
    }
    public static void isLeapOrNot(int x){
        if( x % 4 == 0 && x % 400 == 0 ){
        } else if(x % 4 == 0 && x % 100 > 0 ){
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
}
