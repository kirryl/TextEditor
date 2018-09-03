/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textprocessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Kirryl
 */
public class TxtFileUnit {
    
    private final BufferedReader reader;
    
    
    public TxtFileUnit(String filePath) throws IOException{
    Path path = Paths.get(filePath);
    reader = Files.newBufferedReader(path, StandardCharsets.UTF_8); 
    //reader.lines().forEach(System.out::println);
    }
    
    public BufferedReader getFileReader() {
    return reader;
    }

    public String[] getFileStringArray() throws IOException {
        String[] stringArray = new String[(int)reader.lines().count()];
        String line;
        int i = 0;
        while((line = reader.readLine()) != null){
            stringArray[i] = line;
            i++;
        }
        return stringArray;
    }
}


