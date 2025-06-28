package AirConditioner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class AirConditionerTest {

    @Test
    public void testThatAirConditionerCanBeTurnedOn() {
        AirConditioner airConditioner = new AirConditioner(false, 24, 2, 2);
        airConditioner.powerButton();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void testThatAirConditionerCanBeTurnedOff() {
        AirConditioner airConditioner = new AirConditioner(true, 16, 2, 2);
        airConditioner.powerButton();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void testThatTemperatureCanBeIncreased() {
        AirConditioner airConditioner = new AirConditioner(true, 20, 2, 0);
        airConditioner.increaseTemperature();
        assertEquals(22, airConditioner.getTemperature());
    }

    @Test
    public void testThatTemperatureCanBeDecreased() {
        AirConditioner airConditioner = new AirConditioner(true, 20, 0, 2);
        airConditioner.decreaseTemperature();
        assertEquals(18, airConditioner.getTemperature());
    }


    @Test
    public void testThatTemperatureCannotExceed30Degrees() {
        AirConditioner airConditioner = new AirConditioner(true, 22, 14, 0);
        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testThatTemperatureCannotGoBelow16Degrees() {
        AirConditioner airConditioner = new AirConditioner(true, 18, 0, 4);
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }


    @Test
    public void testThatChecksIfIncreaseTemperatureDoesNothingWhenOff() {
        AirConditioner airConditioner = new AirConditioner(false, 25, 2, 0);
        airConditioner.increaseTemperature();
        assertEquals(25, airConditioner.getTemperature());
    }

    @Test
    public void testThatCheckIfIncreaseTemperatureDoesNothingAtMax() {
        AirConditioner airConditioner = new AirConditioner(true, 30, 2, 0);
        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testThatChecksIfDecreaseTemperatureDoesNothingWhenOff() {
        AirConditioner airConditioner = new AirConditioner(false, 20, 0, 2);
        airConditioner.decreaseTemperature();
        assertEquals(20, airConditioner.getTemperature());
    }

    @Test
    public void testDecreaseTemperatureDoesNothingAtMin() {
        AirConditioner airConditioner = new AirConditioner(true, 16, 0, 2);
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

}