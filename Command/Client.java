package Command;

public class Client {
    public static void main(String[] args) {

        RemoteController remoteController = new RemoteController();
        Light light = new Light();
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);

        Tv tv = new Tv();
        TurnOnTVCommand turnOnTVCommand = new TurnOnTVCommand(tv);
        TurnOffTVCommand turnOffTVCommand = new TurnOffTVCommand(tv);

        remoteController.addCommand(0,turnOnLightCommand,turnOffLightCommand);
        remoteController.addCommand(1,turnOnTVCommand,turnOffTVCommand);
        remoteController.OnButtonPressed(0);
        remoteController.OnButtonPressed(1);

        remoteController.OffButtonPressed(0);
        remoteController.OffButtonPressed(1);



    }
}
