import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        
      String[] frutas1 = new String[] { "abacaxi", "bergamota", "caju" };
       
      List<String> frutas2 = new ArrayList<>();
      frutas2.add("damasco");
      frutas2.add("bergamota");
      frutas2.add("framboesa");
      frutas2.add("laranja");
      frutas2.add("abacaxi");

        for(int i=0; i<=frutas1.length; i++){
            
            if(frutas2.contains(frutas1[i])){
                System.out.println("A fruta " + frutas1[i] + " é repetida");
            }
        }
    
    }
}
