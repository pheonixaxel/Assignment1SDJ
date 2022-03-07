public class TestMain
{
  public static void main(String[] args)
  {
    Heater heater = new Heater();
    Thread thread1 = new Thread(new ThermometerThreadOne(new Thermometer(0,1,-5.,heater)));
    Thread thread2 = new Thread(new ThermometerThreadTwo(new Thermometer(0,7,-5.,heater)));

    heater.setCurrentState(new Power2State());
    try{
      Thread.sleep(3000);
      heater.setCurrentState(new Power1State());
    }
    catch(InterruptedException e){}
    thread1.start();
    thread2.start();
  }
}
