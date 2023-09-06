package de.telran.Melkonov.Oleg.hw20230817.filesInFolder;

import java.util.Iterator;

public class FolderTest {
    public static void main(String[] args) {
        Folder folder = new Folder("Poems", "Oleg");
        folder.addFile("Peterhof Holiday_Lermontov_Beginning.","poem", "Кипит веселый Петергоф,\n" +
                "Толпа по улицам пестреет,\n" +
                "Печальный лагерь юнкеров\n" +
                "Приметно тихнет и пустеет.");
        folder.addFile("Peterhof Holiday_Lermontov_Part_2.","poem", "Волшебно озарился сад,\n" +
                "Затейливо, разнообразно;\n" +
                "Толпа валит вперед, назад,\n" +
                "Толкается, зевает праздно.");
        folder.addFile("Peterhof Holiday_Lermontov_Part_3.","poem", "Гурьбу товарищей покинув,\n" +
                "У моста ...... стоял\n" +
                "И, каску на глаза надвинув,\n" +
                "Как юнкер истинный, мечтал\n" +
                "О мягких ......, круглых ......;");
        folder.addFile("Peterhof Holiday_Lermontov_Part_4.","poem", "Вот кто-то легкою рукою\n" +
                "Его плеча коснулся вдруг;\n" +
                "За фалды дернул, тронул каску…\n" +
                "Повеса вздрогнул, изумлен:\n" +
                "Романа чудную завязку\n" +
                "Уж предугадывает он.");
        folder.addFile("Peterhof Holiday_Lermontov_Part_5.","poem", "Вдруг оглянулась, оступилась,\n" +
                "В траве запуталась густой,\n" +
                "И с обнаженною .....\n" +
                "Стремглав на землю повалилась.");
        folder.addFile("Peterhof Holiday_Lermontov_End.","poem", "Блажен, кто под вечер в саду\n" +
                "Красотку добрую находит,\n" +
                "Дружится с ней, интригу сводит —\n" +
                "И ..... платит за .....!»");
        Iterator<File> iterator = folder.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
