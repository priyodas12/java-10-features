package io.priyotech;

import java.util.List;

public class CopyAPI {
    public static void main(String[] args) {
        List<Integer> integerList= List.of(12,11,23,89,21,73,53,92);

        List<Integer> copyList=List.copyOf(integerList);

        copyList.add(100);//UnsupportedOperationException: immutable content

        System.out.println(copyList);
    }

}
