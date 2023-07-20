package io.priyotech;

import java.util.List;
import java.util.stream.Collectors;

public class OptionalImpl {

    public static void main(String[] args) {
        List<Integer> integerList= List.of(12,11,23,89,21,73,53,92);
        Integer diamondNumber=integerList.stream().filter(num->num%13==0).findFirst().orElseThrow(() -> new ArithmeticException("No Such Value exist!"));
        System.out.println(diamondNumber);
    }
}
