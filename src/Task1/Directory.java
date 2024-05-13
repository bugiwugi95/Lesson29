package Task1;

public class Directory {
    String path;
    String name;
    String content;

    void printInfoFile() {
        System.out.println("Путь к файлу: " + path);
        System.out.println("Имя файла: " + name);
        System.out.println("Содержание файла: " + content);
    }
}
