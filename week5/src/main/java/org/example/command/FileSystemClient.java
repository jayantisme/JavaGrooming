package org.example.command;

public class FileSystemClient {
    public static void main(String[] args) {
        FileSystemReceiver file = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFile = new OpenFileCommand(file);
        FileInvoker fileInvoker = new FileInvoker(openFile);
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(file);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(file);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();
    }
}
