public class Fibonacci {
    public static void main(String[] args) {
int a = 0;
int b = 1;
int fibonacci= 1;

while (fibonacci <100){
    System.out.println(a);
    a = b ;
    b = fibonacci;
    fibonacci = a + b;

}
    }
}