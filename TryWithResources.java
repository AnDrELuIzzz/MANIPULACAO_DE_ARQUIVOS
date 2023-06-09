import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * TryWithResources
 */
public class TryWithResources {

    public static void main(String[] args) {
        String homeDir = System.getProperty("user.home");
        String caminho = homeDir + "/Developer/Estudos2.0/Java/Arquivos/on.txt";

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