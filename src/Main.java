public class Main {
    public static void main(String[] args) {
        int number = 5;
        int result = silnia(number);
        System.out.println("Silnia z: " + number +" = " + result);

    }
    static int silnia(int n){
        if (n < 0)
            throw new IllegalArgumentException("Liczba ujemna nie jest liczbą naturalną");
        if(n == 0 || n == 1) {
            return 1;
        }else {
            return n * silnia(n - 1);
        }
    }
}