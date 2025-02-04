public class Demo061 {
        public static void main(String[] args) {
            int n = 20; 
            long first = 0, second = 1;
    
            System.out.println("Fibonacci Series of " + n + " numbers:");
    
            for (int i = 1; i <= n; i++) {
                System.out.println(first + " ");
                long next = first + second;
                first = second;
                second = next;
            }
        }
    }

