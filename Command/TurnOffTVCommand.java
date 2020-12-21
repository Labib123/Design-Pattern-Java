package Command;

public class TurnOffTVCommand implements Command{
    private  Tv tv;

    public TurnOffTVCommand(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        this.tv.turnOff();

    }

    @Override
    public void undo() {
        this.tv.turnOn();
    }
}
