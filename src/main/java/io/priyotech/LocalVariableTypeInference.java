package io.priyotech;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class LocalVariableTypeInference {

    /**var cannot be user in Object fields and method parameter*/
    static Path path=Path.of("src/main/resources/Bytcode.txt");

    public static void readFile(){
        try(var scanner=new Scanner(new File(path.toUri()))) {
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        int i=20;
        i+=10;

        var j=10;
        j+=20;

        System.out.println(i==j);

        var footballClubs= List.of("MohunBaganFC","BengaluruFC","SC East Bengal");

        for(var club: footballClubs){
            //System.out.println(club.getClass()); //class java.lang.String
            System.out.println(club);
        }

        readFile();
    }
}
