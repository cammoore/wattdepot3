/**
 * 
 */
package org.wattdepot.repository;

import java.util.Date;
import java.util.GregorianCalendar;

import org.wattdepot.datamodel.EnergyMeasurement;
import org.wattdepot.datamodel.Location;
import org.wattdepot.datamodel.Meter;
import org.wattdepot.datamodel.MeterModel;
import org.wattdepot.datamodel.Property;

/**
 * @author Cam Moore
 * 
 */
public class TestUtils {
  /** Location for testing. */
  public static Location loc = new Location(new Double(21.294642), new Double(-157.812727),
      new Double(30), "Hale Aloha Ilima residence hall 6th floor");
  /** MeterModel for testing. */
  public static MeterModel mm = new MeterModel("protocol", "type", "1.0");
  /** Meter for testing. */
  public static Meter meter = new Meter("uri", loc, mm);
  /** Date in the middle of two measurements. */
  public static Date mid = new GregorianCalendar(113, 8, 27, 13, 24, 38).getTime();
  /** Date 1.5 seconds before the mid Date. */
  public static Date bDate = new Date(mid.getTime() - 1500);
  /** Value for first measurement 100. */
  public static Double oneHundred = new Double(100);
  /** EnergyMeasuremnt before mid. */
  public static EnergyMeasurement bEnergyMeas = new EnergyMeasurement(bDate, oneHundred, meter, false);
  /** Property for the before measurement. */
  public static Property bProp = new Property("time", "before");
  /** Date 1.5 seconds after mid Date. */
  public static Date aDate = new Date(mid.getTime() + 1500);
  /** Value for second measurement 200. */
  public static Double twoHundred = new Double(200);
  /** EnergyMeasurment after mid. */
  public static final EnergyMeasurement aEnergyMeas = new EnergyMeasurement(aDate, twoHundred, meter,
      false);
  /** Error value to check doubles to. */
  public static final Double error = new Double(0.0001);

}
