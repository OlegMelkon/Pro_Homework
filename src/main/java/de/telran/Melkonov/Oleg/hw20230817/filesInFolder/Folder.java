package de.telran.Melkonov.Oleg.hw20230817.filesInFolder;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder implements Iterable<File>{
    protected List<File> files;
    private String folderName;
    private String folderOwner;

    public Folder(String folderName, String folderOwner) {
        this.folderName = folderName;
        this.folderOwner = folderOwner;
        this.files = new ArrayList<>();
    }

    public int size(){
        return files.size();
    }

    public void addFile(String fileName, String fileExtension, String text){
        this.files.add(new File(fileName, fileExtension, text));
    }

    public List<File> getFiles(){
        return files;
    }

    public Iterator<File> iterator(){
        return files.iterator();
    }
}
