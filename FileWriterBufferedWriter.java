import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

        String homeDir = System.getProperty("user.home");
        String caminho = homeDir + "/Developer/Estudos2.0/Java/Arquivos/on.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) { // o segundo parametro indica que
                                                                                      // eu não quero recriar o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
