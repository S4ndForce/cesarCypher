import java.util.ArrayList;
import java.util.List;

public class Encrypter {
    //boolean doesItEqual  = word.substring(letterAt, letterAt+1).equals(alphabetList.get(i));

    private String word;
    private int shiftNum;
    private static final ArrayList<String> letters = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    private static final ArrayList<String> alphabetList = new ArrayList<String>(letters);
    
    public Encrypter(String word, int shiftNum){
        this.word = word;
        this.shiftNum = shiftNum;

    }
    public String encrypterMethod(){
        String encryptedMessage= "";
        //take index of every letter in word and move it by one index in the alphabetList
        
        
        
        
        for(int j = 0; j< word.length(); j++){
           String currentLetter = word.substring(j, j+1);
            for( int i = 0; i< letters.size(); i++){ 
                if(currentLetter.equals(alphabetList.get(i)))
                {
                    //checks if the amount you are shifting exceeds the end of the list, or in this case Z
                    //if the current letter in the index is going to exceed the list
                    if(i >= (alphabetList.size()-shiftNum) && currentLetter.equals(alphabetList.get(i))){
                        int josh = (i + shiftNum)- alphabetList.size();
                        int absJosh = (int)(Math.abs(josh));
                        encryptedMessage+=alphabetList.get(absJosh);
                    }
                    else{
                    encryptedMessage += alphabetList.get(i+shiftNum);
                    }
                
                }
                if(currentLetter == " "){
                    encryptedMessage +=" ";
                }
        }
        
            
        
    
        
    }
    return "The encrypted message is:" + encryptedMessage;
    
    
    
    }
}
