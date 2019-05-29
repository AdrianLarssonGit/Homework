
public class Smileys {

    public static void main(String[] args) {
      //printWithSmileys("\\:D/");
    //printWithSmileys("Mickeale");

   printWithSmileys("1111111111"); ///Ten
 
        printWithSmileys("55555");
    }
    
    private static void printWithSmileys(String characterString){
        //The smiles stack as 
        /* 1 - 2 4 smiles
        *  3 - 4 5 smiles
        *   5 - 6 smiles
        * e.g. 4 smiles first two, then 2 extra per new odd number
*/
        String baseSmile = ":):):):)";
       
        //Print top
        System.out.print(baseSmile);
        if(characterString.length() == 1 || characterString.length() == 2){
            
        }
        else{
            if(characterString.length() % 2 == 0){
                
                for(int k = characterString.length() / 2 - 1; k > 0; k--){
                    System.out.print(":)");
                }
            }
            else{
                for(int k = characterString.length() / 2; k > 0; k--){
                    System.out.print(":)");
                }
            }
        }
        
        //Print middle
        System.out.println("");
        if(characterString.length() % 2 == 0){
            System.out.print(":) " + characterString + " :)");
        }
        else{
            System.out.print(":) " + characterString + "  :)");
        }
        
        //Print bottom
        System.out.println("");
         System.out.print(baseSmile);
        if(characterString.length() == 1 || characterString.length() == 2){
            
        }
        else{
            if(characterString.length() % 2 == 0){
                //odd in charge
                for(int k = characterString.length() / 2 - 1; k > 0; k--){
                    System.out.print(":)");
                }
            }
            else{
                for(int k = characterString.length() / 2; k > 0; k--){
                    System.out.print(":)");
                }
            }
        }
        System.out.println("");
    }
           
        }
       
        
    


