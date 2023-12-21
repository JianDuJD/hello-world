package tree;

import java.util.TreeMap;
import java.util.TreeSet;

public class BinaryTree<E> extends AbstractTree<E>{

    private int[] val = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


    public void print(int i){
        int index = 0;
        for (int i1 = 1; i1 < i+1; i1++) {
            int i2 = tierNodeNum(i1);
            for (int i3 = 0; i3 < i2; i3++) {
                System.out.print(val[index]+",");
                index++;
            }
            System.out.println("");
        }
    }

    public int tierNodeNum(int i){
        if (i == 1){
            return 1;
        }
        int num = i-1;
        int a = 1;
        for (int i1 = 0; i1 < num; i1++) {
            a = a*2;
        }
        return a;
    }
}
