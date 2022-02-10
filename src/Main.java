import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        WorkWithFiles workWithFiles = new WorkWithFiles("D:\\SkillFactory\\Итоговые работы\\Module 14\\src\\Tesla.txt");
        workWithFiles.readAll();
        Stream<String> stream = workWithFiles.fileToList.stream();
        List listFinal = stream
                .filter(s -> s.length() != 0)   //убираем пустые строки
                .collect(Collectors.toList()); //сохраняем итог в новый List
        workWithFiles.writeAll("D:\\SkillFactory\\Итоговые работы\\Module 14\\src\\Tesla_fix.txt", listFinal);
    }
}
