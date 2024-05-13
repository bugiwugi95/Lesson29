package Task3;

public class Main {

    public static void main(String[] args) {
        MainCharacter mainCharacter = new MainCharacter();
        mainCharacter.name = "Наруто Удзума́ки";
        mainCharacter.age = "17";
        mainCharacter.history = "Мальчик долгие годы не знал, кто его родители; " +
                "знавшие правду взрослые жители деревни избегали и презирали его из-за заключённого внутри демона. " +
                "Из-за издевательств в детстве у Наруто появилась мечта самоутвердиться, став главой своей деревни ниндзя — хокагэ.";
        mainCharacter.role = "Главный герой";
        mainCharacter.printCharacter();
        System.out.println();
        FriendMainCharacter friendMainCharacter = new FriendMainCharacter();
        friendMainCharacter.name = "Саскэ Утиха";
        friendMainCharacter.age = "17";
        friendMainCharacter.history = "После произошедших событий Саскэ, которому по его просьбе Тоби пересадил глаза Итати, " +
                "овладел вечным мангэкё сяринганом[7], с его помощью Саскэ уничтожает оригинал белого Дзэцу, " +
                "а затем отправляется на поле боя. По пути он сталкивается с отрядом клонов белого Дзэцу. " +
                "Поймав одного из них в гэндзюцу, Саскэ узнаёт, что сейчас идёт война, а затем уничтожает весь отряд с помощью своих новых глаз. Саскэ сразу догадывается, " +
                "что Тоби начал войну из-за того, что ему нужен Наруто. Саскэ клянётся убить Наруто и идёт дальше, " +
                "но по пути сталкивается с Итати, который объясняет ему причину, по которой он не стал убивать Саскэ в ту ночь, " +
                "когда он убил почти всех Утих. Позже вместе с братом он находит Кабуто и начинает с ним сражение. " +
                "После победы над Кабуто Итати отменяет Эдо Тэнсей и, прощаясь с Саскэ, возвращается в загробный мир. " +
                "После этого Саскэ находят Суйгэцу и Дзюго и те передают ему свиток, найденный Суйгэцу в одном из убежищ Оротимару. " +
                "С помощью проклятой печати Анко, Саскэ воскрешает Оротимару чтобы тот помог обрести истиную силу Утих. " +
                "После победы над Кагуей Саскэ вызвал Наруто на бой, однако, увидев неправильность своих действий, сдался и ушел путешествовать по миру.";
        friendMainCharacter.role = "Лучший друг " + mainCharacter.name;
        friendMainCharacter.printCharacter();
        System.out.println();
        Villain villain  = new Villain();
        villain.name = "Ооцуцуки Кагуя";
        villain.age = "Неизвестен";
        villain.history = "Тысячелетие назад Кагуя и Ишики были отправлены выращивать Божественное Дерево на планете Земля и собирать его Плоды с Чакрой, " +
                "которыми она должна была обеспечивать основную семью своего клана из другого мира. Согласно Амадо Сандзу, " +
                "Кагуя был членом клана низкого ранга, избранным в жертву Десятихвостому," +
                " который должен был способствовать развитию Божественного Древа." +
                "Вместо этого Кагуя сама возжелала плод чакры, при этом предав Ишшики и оставив его умирать.";
        villain.role = "АНТАГОНИ́СТ/Злодей";
        villain.printCharacter();


    }
}
