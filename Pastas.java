
import java.io.File;
import java.util.Scanner;

public class Pastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String homeDir = System.getProperty("user.home");
        String strPath = homeDir + sc.nextLine();
        File path = new File(strPath);

        // Recebe todas os diretorios
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");

        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "/Exercicios").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}
