public class Demo044 {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
