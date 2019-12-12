public class SimpleCalculator {
    static int multiple = 1;
    static int TotalSum = 0;

    static int add(int x, int y){
        return x + y;
    }
    static int add(int...a){
        for (int i = 0; i<a.length; i++){
            TotalSum = TotalSum + a[i]; }
        return TotalSum; }
    static int multiplication(int x, int y){
        return x * y;
    }
    static int multiplication(int... a){
        for (int i = 0; i<a.length; i++){
            multiple = multiple * a[i]; }
        return multiple; }}