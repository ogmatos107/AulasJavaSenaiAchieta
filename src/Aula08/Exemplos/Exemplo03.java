package Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo03 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\Documents\\AulasJavaSenaiAchieta\\src\\arquivo.txt", true);

            fileWriter.write("\npedro\nmarcos\njoao\nluisa\nmatheus");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
