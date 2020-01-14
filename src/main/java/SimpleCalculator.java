public class SimpleCalculator {
    static int multiple = 1;
    static int Sum = 0;

    static int add(int x, int y)
    {
       return x + y;
    }
    static int add(int...a)
    {

        for (int i = 0; i<a.length; i++){
            Sum = Sum + a[i]; }
        return Sum;
    }
    static int multiplication(int x, int y){
       return x * y;
    }
    static int multiplication(int... a)
    {

        for (int i = 0; i<a.length; i++)
        {

            multiple = multiple * a[i];
        }
        return multiple;
    }
}