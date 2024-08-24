import java.util.HashMap;

public class Translator {
    private HashMap<Integer, String> numericAlpha;

    public Translator(String[] alphabetic, int[] numeric){
        numericAlpha = new HashMap<>();
        for (int i  = 0; i < numeric.length; i++){
            numericAlpha.put(numeric[i],alphabetic[i]);
        }
    }
  public String translate (Integer number){
        return numericAlpha.get(number);
  }

}
