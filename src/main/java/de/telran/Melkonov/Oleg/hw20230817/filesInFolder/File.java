package de.telran.Melkonov.Oleg.hw20230817.filesInFolder;

import Classes.lecture230817.Sheet;

import java.util.Objects;

public class File {
    private String fileName;
    private String fileExtension;
    private String text;

    public File(String fileName, String fileExtension, String text) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.text = text;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", fileExtension='" + fileExtension + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File file)) return false;
        return getFileName().equals(file.getFileName()) && getFileExtension().equals(file.getFileExtension()) && getText().equals(file.getText());
    }

}
