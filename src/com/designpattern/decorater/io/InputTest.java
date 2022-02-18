package com.designpattern.decorater.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(new FileInputStream("D:\\Box\\IDEA\\MyDesignPatterns\\src\\com\\designpattern\\decorater\\io\\text.txt"));
            while ((c=in.read()) >= 0){
                System.out.println((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
