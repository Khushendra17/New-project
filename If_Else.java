import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number =obj.nextInt();
   
        if (number%2==0){
            System.out.println("number is even:"+number);
        }
        else {
            System.out.println("number is Odd:"+number);
        }
        obj.close();
    }
}
