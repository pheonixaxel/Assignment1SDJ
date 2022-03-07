import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Thermometer implements PropertyChangeListener
{
  private double temp;
  private final int distance;
  private final double outdoorTemp;
  private int power;

  private PropertyChangeSupport powerChangeSupport = new PropertyChangeSupport(this);

  public Thermometer(double temp, int distance, double outdoorTemp, PropertyChangeSubject subject)
  {
    this.temp = temp;
    this.distance = distance;
    this.outdoorTemp = outdoorTemp;
    subject.addPropertyChangeListener(this);
  }

  public double getTemp()
  {
    return temp;
  }

  public double calcTemp(int s)

  {
    double t = temp;
    int p = power;
    int d = distance;
    double t0 = outdoorTemp;

    double tMax = Math.min(11 * p + 10, 11 * p + 10 + t0);

    tMax = Math.max(Math.max(t, tMax), t0);

    double heaterTerm = 0;

    if (p > 0)

    {

      double den = Math.max((tMax * (20 - 5 * p) * (d + 5)), 0.1);

      heaterTerm = 30 * s * Math.abs(tMax - t) / den;

    }

    double outdoorTerm = (t - t0) * s / 250.0;

    t = Math.min(Math.max(t - outdoorTerm + heaterTerm, t0), tMax);

    return t;
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    power = (int) evt.getNewValue();
  }

}
