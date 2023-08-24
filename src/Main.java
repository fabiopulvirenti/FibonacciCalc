
public class Main {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci(){
        long firstNumber = 0;
        long secondNumber = 1;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for (int i=0 ; i < 98; i++){
            long sum = firstNumber + secondNumber;
            System.out.println(sum);
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }

}