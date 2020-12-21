package Command;

import java.nio.Buffer;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private final int SLOTS = 5;

    public RemoteController(){
        onCommands= new Command[4];
        offCommands= new Command[4];
    }
    public void addCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void OnButtonPressed(int slot){
        onCommands[slot].execute();
    }
    public void OffButtonPressed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public  String toString(){
        StringBuffer buffer = new StringBuffer();
        for(int i =0; i < SLOTS; i++) {
            buffer.append(String.format("[Slot %d] %s \t %s%n", i, onCommands[i].getClass().getSimpleName(), offCommands[i].getClass().getSimpleName()));
        }
        return buffer.toString();
    }

}
