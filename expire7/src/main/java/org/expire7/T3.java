package org.expire7;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class T3 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        String path = Paths.get(T3.class.getClassLoader().getResource("").toURI()).toString();
        String inputFilePath = path + "t3.in.txt";
        String outputFilePath = path + "t3.out.txt";
        // 读入文件不存在
//        initFile(path + "notFound.in.txt");
        // 读入文件存在
        initFile(inputFilePath);
        if (!Files.exists(Paths.get(inputFilePath))) {
            throw new FileNotFoundException("读入文件不存在");
        }
        if(Files.exists(Paths.get(outputFilePath))) {
            System.out.println("写出文件已存在，是否覆盖(Y/N)");
            Scanner scanner = new Scanner(System.in);
            if (!"Y".equals(scanner.next())) {
                return;
            }
        }
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        long lines = reader.lines().count();
        reader.close();
        reader = new BufferedReader(new FileReader(inputFilePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        for (int index = 1; reader.ready(); index++) {
            String lineText = ("%" + String.valueOf(lines).length() + "d ").formatted(index) + reader.readLine();
            writer.write(lineText + "\n");
            System.out.println(lineText);
        }
        reader.close();
        writer.close();
    }

    static void initFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.write("""
            12313
            123
            123
            123
            123
            123
            1
            4
            1223rj23r
            q3wr
            a
            32r
            3ar
            1r
                        
            ar
            r
            132
            r123
            r
            123r21
            """);
        writer.close();
    }

}
