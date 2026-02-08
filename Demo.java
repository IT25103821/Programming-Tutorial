 class EvenOddNumber{
    
   public boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }
}

public class Demo {
    
    public static void main(String[] args) {
        
        // create object
        EvenOddNumber number = new EvenOddNumber();
        
        // few simple numbers to test
        int n1 = 10;
        int n2 = 7;
        int n3 = 0;
        
        // check and print
        System.out.println("Number check:");
        
        if (number.findEvenOrOdd(n1)) {
            System.out.println(n1 + " is even");
        } else {
            System.out.println(n1 + " is odd");
        }
        
        if (number.findEvenOrOdd(n2)) {
            System.out.println(n2 + " is even");
        } else {
            System.out.println(n2 + " is odd");
        }
        
        if (number.findEvenOrOdd(n3)) {
            System.out.println(n3 + " is even");
        } else {
            System.out.println(n3 + " is odd");
        }
    }
}