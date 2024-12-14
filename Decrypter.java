import java.util.ArrayList;
import java.util.List;

public class Decrypter {
    //boolean doesItEqual  = word.substring(letterAt, letterAt+1).equals(alphabetList.get(i));

    private String word;
    private int shiftDownNum;
    private static final ArrayList<String> letters = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    private static final ArrayList<String> alphabetList = new ArrayList<String>(letters);
    
    public Decrypter(String word, int shiftNum){
        this.word = word;
        this.shiftDownNum = shiftNum;

    }
    public String decrypterMethod(){
        String decryptedMessage= "";
        //take index of every letter in word and move it by one index in the alphabetList
        
        
        
        
        for(int j = 0; j< word.length(); j++){
           String currentLetter = word.substring(j, j+1);
            for( int i = 0; i< letters.size(); i++){ 
                if(currentLetter.equals(alphabetList.get(i)))
                {
  
                    if(i < shiftDownNum && currentLetter.equals(alphabetList.get(i))){
                        int mosh = (i - shiftDownNum) + alphabetList.size();
                        int absMosh = (int)(Math.abs(mosh));
                        decryptedMessage+=alphabetList.get(absMosh);
                    }
                    else{
                    decryptedMessage += alphabetList.get(i-shiftDownNum);
                    }
                
                }
                if(currentLetter == " "){
                    decryptedMessage +=" ";
                }
        }
        
            
        
    
        
    }
    return "The decrypted message is:" + decryptedMessage;
    
    
    
    }
}
