import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        String homeDir = System.getProperty("user.home"); // No Java, o uso do til (~) para representar o diretório home
                                                          // do usuário não funciona diretamente ao criar um objeto File
        String caminho = homeDir + "/Developer/Estudos2.0/Java/Arquivos/on.txt";
        File file = new File(caminho);
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {// idempendete em qual bloco cair, vem para o finally
            if (sc != null) { // tem que verificar se o Scanner foi inicializado, caso o contrário, ao tentar
                              // fechar levaria um null pointer exception
                sc.close();
            }

        }

    }
}