/*2 - Ler o conteúdo de um arquivo e exibir no console:
Crie um programa que leia o conteúdo de um arquivo de texto e exiba seu conteúdo no console.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String caminho = home + "/Developer/Estudos2.0/Java/Arquivos/Exercicios/ex2in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
