package Arrays;

import java.util.HashMap;

public class MySecondClass {
    public static void main(String[] args) {
        HashMap<String,String> TelefonNumbers = new HashMap<String,String>();
        TelefonNumbers.put("Ivanov","(909) 166-11-79");
        TelefonNumbers.put("Petrov","(909) 166-11-79");
        TelefonNumbers.put("Andreev","(909) 166-11-80");
        TelefonNumbers.put("Sergeev","(909) 665-44-46");
        TelefonNumbers.put("Evgrafov","(909) 666-30-21");
        TelefonNumbers.put("Arkadiev","(909) 910-59-66");
        TelefonNumbers.put("Kravec","(909) 910-89-66");
        TelefonNumbers.put("Lomba","(909) 939-00-68");
        TelefonNumbers.put("Drujinin","(909) 939-05-66");
        TelefonNumbers.put("Sergeev","(962) 999-17-61");
        if (TelefonNumbers.containsKey("Sergeev")){
            System.out.println("Несколько номеров для этой фамилии!");

        }
    }
}
/**
 * (905) 505-00-76
 * (909) 166-11-79
 * (909) 166-11-80
 * (909) 665-44-46
 * (909) 666-30-21
 * (909) 910-59-66
 * (909) 910-89-66
 * (909) 939-00-68
 * (909) 939-05-66
 * (962) 999-17-61
 *
 */