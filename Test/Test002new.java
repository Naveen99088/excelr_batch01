import java.util.*;
public class Test002new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your reply: ");
        String reply = sc.nextLine();
        while(true){
            if(reply.equals("yes")){
                System.out.println("Happpy sankranthi...");
            }
            System.out.println("Enter your reply: ");
            reply = sc.nextLine();
            break;
        }
        
    }
    
}
