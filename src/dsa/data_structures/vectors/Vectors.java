package dsa.data_structures.vectors;

import java.util.Vector;

public class Vectors {

    /* ArrayList gibi dinamik arraydir.
     * vectorlerin farkı thread safety özelliğidir.
     * thread safety gerekmedikçe ArrayList kullanılır
     * */

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(1, 30);

        vector1.lastElement();
        vector1.firstElement();
        vector1.remove(30);
        vector1.get(3);


        // spesifik kapasiteli vektor yaratma
        Vector<Integer> vector2 = new Vector<>(5);

    }

}
