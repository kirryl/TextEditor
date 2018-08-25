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
    
    public TxtFileUnit() throws IOException{
    Path path = Paths.get("src/textprocessor/testTxt.txt");
    BufferedReader r = Files.newBufferedReader(path, StandardCharsets.UTF_8); 
    r.lines().forEach(System.out::println);
    }
}
