package Aquarim;
import java.util.ArrayList;

// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
// *** Написать аквариум или террариум по аналогии с семинаром.
// (***) - Дополнительное задание, кому показалось мало
public class Main {
    // Синий флоридский рак
    public static void main(String[] args) {
        Aquarim creaturs = new Aquarim();
        creaturs.addCreaturs(new Crustacea("Синий флоридский рак"));
        creaturs.shwoCreatursAll();
       
    }
}
