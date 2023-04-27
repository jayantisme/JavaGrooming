package org.example.command;

public class CloseFileCommand implements Command{

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs){
        fileSystem = fs;
    }

    @Override
    public void executeCommand() {
        fileSystem.closeFile();
    }
}
