
/*1 - Contar o número de linhas em um arquivo:
Desenvolva um programa que leia um arquivo de texto e conte o número total de linhas presentes nele.*/

import java.io.File;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String homeDir = System.getProperty("user.home");
        String path = homeDir + "/Developer/Estudos2.0/Java/Arquivos/Exercicios/Ex1In.txt";
        File file = new File(path);
        int cont = 0;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                cont++;
            }
            System.out.printf("%d\n", cont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
