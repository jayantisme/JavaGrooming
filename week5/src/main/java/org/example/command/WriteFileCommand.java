package org.example.command;

public class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    public WriteFileCommand(FileSystemReceiver fs){
        fileSystem = fs;
    }

    @Override
    public void executeCommand() {
        fileSystem.writeFile();
    }
}
