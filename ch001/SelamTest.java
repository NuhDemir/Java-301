package ch001;

import java.util.jar.Manifest;

public class SelamTest {
    public static void main(String[] args) {
        Selam obj = new Selam();

        String cevap = obj.selamSoyle("Salih");
        System.out.println(cevap);

        cevap = obj.selamSoyle("Mervan");
        System.out.println(cevap);

        System.out.println("World: " + obj.world);

        cevap = obj.selamSoyle("");
        System.out.println(cevap);
    }
    
}
