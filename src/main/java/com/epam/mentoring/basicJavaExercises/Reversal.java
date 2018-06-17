package com.epam.mentoring.basicJavaExercises;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reversal {

    //Write an application that reads the content of a file, reverses it and writes the result into a new file!

    public void writeToFile(String file, String str) {
        try {
            FileUtils.writeStringToFile(new File(file), str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String reverseString(String str) {
        if (str == null){
            str="";
        }
            return new StringBuilder(str).reverse().toString();
    }

    public String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
