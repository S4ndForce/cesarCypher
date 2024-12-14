
import java.util.Scanner;

public class Main{
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("Press e to encrypt a message and d to decrypt a message");
        
        String huff = scan.nextLine();

        if (huff.equals("e")){
            Encrypter userCode;
            System.out.println("Please enter the message you want to encrypt:");
            String message = scan.nextLine();
            System.out.println("Please enter a  shift number:");
            int shiftNum = scan.nextInt();
            userCode = new Encrypter(message, shiftNum);
            System.out.println(userCode.encrypterMethod());


        }
        if (huff.equals("d")){
            Decrypter userCode;
            System.out.println("Please enter the message you want to decrypt:");
            String message = scan.nextLine();
            System.out.println("Please enter a shift number:");
            int shiftNum = scan.nextInt();
            userCode = new Decrypter(message, shiftNum);
            System.out.println(userCode.decrypterMethod());


        }
        
        
        
        scan.close();
        

        

    }
    
}