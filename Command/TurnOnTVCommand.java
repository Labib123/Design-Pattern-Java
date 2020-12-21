package Command;

public class TurnOnTVCommand implements Command{
    private  Tv tv;

    public TurnOnTVCommand(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        this.tv.turnOn();

    }

    @Override
    public void undo() {
        this.tv.turnOff();
    }
}
