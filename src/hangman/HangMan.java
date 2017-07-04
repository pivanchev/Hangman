
package hangman;
import java.util.Scanner;
import java.util.ArrayList;




public class HangMan {
    
    public static void guess(String word,int life){
        
        char[] fill = new char[word.length()];
        int i=0;
        
        while(i<word.length()){
            fill[i] = '-';
            if(word.charAt(i)==' '){
                fill[i] = ' ';
            }
            i++;
             
        }
        System.out.print(fill);
        System.out.println(" ------- \n Life remaining = " + life);
    
        Scanner input = new Scanner(System.in);
        
        ArrayList<Character> l = new ArrayList<>();
        
        
        
        
        while(life>0){
            char x = input.next().charAt(0);
            if(l.contains(x)){
                System.out.println("Already entered");
                continue;
            }
            
            l.add(x);
            
            
            if(word.contains(x+"")){
                for(int y=0;y<word.length();y++){ //this loop will check all indexes for the 
                    if(word.charAt(y)==x){        //character and will replace '-' by the caracter
                        fill[y]=x;
                    }
                }
            }else{
                life--; //life decreases if character not found
            }
            if(word.equals(String.valueOf(fill))) {
                System.out.println(fill);
                System.out.println("Correct!");
                break;
            }
                    
                    
            System.out.print(fill);
            System.out.println("Life remaining = " + life + " ; ");
    }       
        if(life==0){
            System.out.println("You lost!");
        }
      
        
}
   
    public static void main(String[] args) {
        
        String word;
        word = "geometry";
        int life = 6; //number of tries
        guess(word,life);
        
        
       
  
      }  
 
    }
           
