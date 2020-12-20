package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*str[i].charAt(0)==str[j].charAt(str[j].length()-1)*/
public class fileWords {
    public static void main(String[] args){
        fileWords file=new fileWords();
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\SomeDir\\notes.txt"))){
            String line;
            line= reader.readLine();
            System.out.println(line);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
