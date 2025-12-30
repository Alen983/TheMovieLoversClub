import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int num = sc.nextInt();
        System.out.println("Enter no to find");
        int d = sc.nextInt();

        DigitAnalyzer d1 = new DigitAnalyzer();

        d1.countDigit(num, d);

    }
}

class DigitAnalyzer {
    public void countDigit(int num, int d) {
        int n1 = 0, count = 0, read = 0;
        while (num > 0) {
            n1 = num % 10;
            read = n1;
            num = num / 10;
            if (d == read) {
                count++;
            }
            
            //System.out.println(read);
    

        }
        System.out.println(count);
    }
}
