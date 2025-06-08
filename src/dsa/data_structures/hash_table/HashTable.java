package dsa.data_structures.hash_table;

/* hashtable da hashmap gibi key-value değerler tutar (python: dictionaries)
* ama aralarındaki fark şudur: hashtable'lar thread safety sağlarken
* hashmaps ise senkronize değildir ve threadsafety sağlamaz.
* hashtable'lar null key||value izin vermezken hashmapler 1 null key'e ve
* çoklu null value'ya izin verir.
*
* */

import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {
        Hashtable<Integer,String> hashTable = new Hashtable<>();

        hashTable.put(1, "bir");
        hashTable.put(2, "iki");
        hashTable.put(3, "üç");

        // hashtable yazdir
        System.out.println(hashTable);

        // hashtable eriş
        String spesifikVal = hashTable.get(2); // "iki"

        // check a key
        boolean isKeyExtant = hashTable.containsKey(4); // false

        // check a value
        boolean isValExtant = hashTable.containsValue("dört"); // false

        // size
        hashTable.size();

        // remove keyvalue
        hashTable.remove(1);

        // check if empty
        hashTable.isEmpty();


    }


}
