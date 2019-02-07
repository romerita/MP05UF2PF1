package ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashTableTest {

    @Test
    void put() {
        HashTable ht = new HashTable();

        ht.put("1","Pepe");
        ht.put("2","Pinocho");
        ht.put("3","Gepeto");
        ht.put("1","Peter Pan");
        Assertions.assertEquals("\n bucket[0] = [1, Peter Pan]" +
                                         "\n" + " bucket[1] = [2, Pinocho]" +
                                         "\n bucket[2] = [3, Gepeto]",ht.toString());
    }

    @Test
    void get() {
        HashTable ht = new HashTable();

        ht.put("1","Pepe");
        ht.put("2","Pinocho");
        ht.put("3","Gepeto");
        ht.put("1","Peter Pan");

        ht.get("1");
        ht.get("2");
        ht.get("3");
        ht.get("1");
        Assertions.assertEquals("\n bucket[0] = [1, Peter Pan]" +
                "\n" + " bucket[1] = [2, Pinocho]" +
                "\n bucket[2] = [3, Gepeto]",ht.toString());
    }

    @Test
    void drop() {
        HashTable ht = new HashTable();

        for(int i=0; i<30; i++) {
            final String key = String.valueOf(i);
            ht.put(key, key);
        }

        ht.drop("4");

        Assertions.assertEquals("\n bucket[0] = [11, 11] -> [22, 22]" +
                "\n bucket[1] = [1, 1] -> [12, 12] -> [23, 23]" +
                "\n bucket[2] = [2, 2] -> [13, 13] -> [24, 24]" +
                "\n bucket[3] = [3, 3] -> [14, 14] -> [25, 25]" +
                "\n bucket[4] = [4, 4] -> [15, 15] -> [26, 26]" +
                "\n bucket[5] = [5, 5] -> [16, 16] -> [27, 27]" +
                "\n bucket[6] = [6, 6] -> [17, 17] -> [28, 28]" +
                "\n bucket[7] = [7, 7] -> [18, 18] -> [29, 29]" +
                "\n bucket[8] = [8, 8] -> [19, 19]" +
                "\n bucket[9] = [9, 9]" +
                "\n bucket[10] = [20, 20]" +
                "\n bucket[11] = [10, 10] -> [21, 21]", ht.toString());
    }

    @Test
    void size() {
        HashTable ht = new HashTable();

        ht.put("1","Pinocho");
        ht.put("2","Gepeto");
        ht.put("3","Pepito Grillo");

        System.out.println(ht.size());
    }

    @Test
    void realSize() {
        HashTable ht = new HashTable();

        System.out.println(ht.realSize());

    }
}
