package DAY2;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        int x = 5;
        x += 2;
        System.out.println("x after += 2: " + x);
        x -= 1;
        System.out.println("x after -= 1: " + x);
        x *= 2;
        System.out.println("x after *= 2: " + x);
        x /= 3;
        System.out.println("x after /= 3: " + x);

        int count = 5;
        count++;
        System.out.println("After increment: " + count);
        count--;
        System.out.println("After decrement: " + count);

        
        boolean isJavaEasy = true;
        boolean isPracticeDone = false;
        System.out.println("AND: " + (isJavaEasy && isPracticeDone));
        System.out.println("OR: " + (isJavaEasy || isPracticeDone));
        System.out.println("NOT: " + (!isJavaEasy));


        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        int p = 5; 
        int q = 3; 
        System.out.println("Bitwise AND: " + (p & q));
        System.out.println("Bitwise OR: " + (p | q));
        System.out.println("Bitwise XOR: " + (p ^ q));
        System.out.println("Left shift: " + (p << 1));
        System.out.println("Right shift: " + (p >> 1));

        
        int age = 20;
        String result = age >= 18 ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Ternary result: " + result);
    }
}
