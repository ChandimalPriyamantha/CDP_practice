public class Main {

    public static void main(String[] args) {
      RemoteControle remoteControle = new RemoteControle();
      Light light = new Light();

      Command lightOn = new LightOnCommand(light);
      Command lightOff = new LightOfCommand(light);

      remoteControle.setCommand(lightOn);
      remoteControle.pressButton();

      remoteControle.setCommand(lightOff);
      remoteControle.pressButton();
    }
}
