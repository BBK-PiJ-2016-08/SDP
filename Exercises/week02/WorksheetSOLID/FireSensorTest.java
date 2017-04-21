package Week02.WorksheetSOLID;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class FireSensorTest {


    @Before
    public void setUpFireSensor() {

        Random r = new Random();
        float chance = r.nextFloat();

        if (chance <= 0.05f) {

        }


    }

    @Test
    public void testThatIsTriggeredReturnsFalse() {
        FireSensor sensor = new FireSensor();
        boolean isTriggered = sensor.isTriggered();
        assertEquals(false, isTriggered);
    }

    @Test
    public void testThatGetLocationReturnsNull() {
        FireSensor sensor = new FireSensor();
        String location = sensor.getLocation();
        assertEquals(null, location);
    }

    @Test
    public void testThatGetSensorTypeReturnsNull() {
        FireSensor sensor = new FireSensor();
        String sensorType = sensor.getSensorType();
        assertEquals(null, sensorType);
    }

    @Test
    public void testThatGetBatteryPercentageReturnsNegativeOne() {
        FireSensor sensor = new FireSensor();
        double batteryPercentage = sensor.getBatteryPercentage();
        assertEquals(-1.0, batteryPercentage, 0.01);
    }
}
