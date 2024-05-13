package Task1;

public class Main {
    public static void main(String[] args) {
       FileMusic fileMusic = new FileMusic();
       fileMusic.path = "C:\\Windows\\Music";
       fileMusic.name = "Music";
       fileMusic.content = "Файл с музыкой";
       fileMusic.printInfoFile();
       fileMusic.nameTrack = "монетка";
       fileMusic.trackLength = "3 мин";
       fileMusic.format = "mp3";
       fileMusic.printInfoMusic();
       System.out.println();
       FileMove fileMove = new FileMove();
       fileMove.path = "C:\\Windows\\Move";
       fileMove.name = "Move";
       fileMove.content = "Файл с фильмом";
       fileMove.printInfoFile();
       fileMove.nameMove = "Star Wars";
       fileMove.description = "ssssss";
       fileMove.printInfoMove();


    }
}