package org.example.command;

public class FileInvoker {
    Command command;
    public FileInvoker(Command c){
        command= c;
    }

    public void execute(){
        command.executeCommand();
    }
}
