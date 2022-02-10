import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WorkWithFiles {
    String pathToFile;
    List<String> fileToList;

    public WorkWithFiles(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void readAll() {
        Path path = Paths.get(pathToFile);
        try {
            fileToList = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Проблема с чтением файла");
            e.printStackTrace();
        }
    }

    public void writeAll(String pathToResult, List<String> list) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToResult))){
            for(int i = 0; i < list.size(); i++){
                writer.write(list.get(i) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Проблема с записью файла");
            e.printStackTrace();
        }
    }
}
