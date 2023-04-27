package org.example.command;

public class MacFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening File in Mac");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File in Mac");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Mac");
    }
}
