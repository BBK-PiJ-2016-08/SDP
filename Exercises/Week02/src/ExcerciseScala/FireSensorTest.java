package ExcerciseScala;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import scala.collection.mutable.ListBuffer;

import static org.junit.Assert.assertEquals;

public class FireSensorTest {



    @Test
    public void testNewFireSensor() {

        FireSensor sensor = new FireSensor();

        sensor.getSensorType();
        boolean isTriggered = sensor.isTriggered();
        assertEquals(false, isTriggered);
        assertEquals(80, sensor.getBatteryPercentage(), 0.1);
        assertEquals("Fire", sensor.getSensorType());
        System.out.println("Triggered = " + sensor.isTriggered());
        assertEquals(70, sensor.getBatteryPercentage(), 0.1);

        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());
        System.out.println("Triggered = " + sensor.isTriggered());

    }


    @Test
    public void testThatGetLocationReturnsNull() {
        FireSensor sensor = new FireSensor();
        Object location = sensor.getLocation();
        assertEquals("", location);
    }

    @Test
    public void testThatGetSensorTypeReturnsFire() {
        FireSensor sensor = new FireSensor();
        Object sensorType = sensor.getSensorType();
        assertEquals("Fire", sensorType);
    }

    @Test
    public void testThatGetBatteryPercentageReturns100() {
        FireSensor sensor = new FireSensor();
        double batteryPercentage = sensor.getBatteryPercentage();
        assertEquals(100, batteryPercentage, 0.01);
    }
}