/*
  a. Método que retorna quantas ocorrências de um elemento estão na lista
        int nOcorrencias(ArrayList<Integer> l, Integer el)
   d. Método que retorna uma lista de elementos repetidos de l
        ArrayList<Integer> listRepeat(ArrayList< Integer > l)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ocorrencias {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 6, 2, 2, 2, 9, 2, 2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(36, 42, 57));
        System.out.println(nOcorrencias(list, 2));
        System.out.println(listRepeat(list));
        System.out.println(nroRepeat(list));
        System.out.println(intersect(list));

    }

    // Método A
    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer i : l) {
            if (i.equals(el)) {
                count++;
            }
        }
        return count;
    }

    // Metodo C
    public static int nroRepeat(ArrayList<Integer> l) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (Integer i : l) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        
        int count = 0;
        for (int freq : frequencyMap.values()) {
            if (freq > 1) {
                count++;
            }
        }
        
        return count;
    }


    // Método D
    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : l) {
            if (nOcorrencias(l, i) > 1 && !list.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    // Metodo F
    public static ArrayList<Integer> intersect(ArrayList<Integer> l2) {
        ArrayList<Integer> list = new ArrayList<>();
        list.retainAll(l2);

        return list;
}
}