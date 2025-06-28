package AirConditioner;

public class AirConditioner {
    private boolean isOn;
    private int temperature;
    private int temperatureIncrement;
    private int temperatureDecrement;

    private static final int MAX_TEMPERATURE = 30;
    private static final int MIN_TEMPERATURE = 16;

    public AirConditioner(boolean isOn, int temperature, int temperatureIncrement, int temperatureDecrement) {
        this.isOn = isOn;
        this.temperature = temperature;
        this.temperatureIncrement = temperatureIncrement;
        this.temperatureDecrement = temperatureDecrement;
    }

    public void powerButton() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseTemperature() {
        if (isOn && temperature < MAX_TEMPERATURE) {
            temperature = Math.min(temperature + temperatureIncrement, MAX_TEMPERATURE);
        }
    }

    public void decreaseTemperature() {
        if (isOn && temperature > MIN_TEMPERATURE) {
            temperature = Math.max(temperature - temperatureDecrement, MIN_TEMPERATURE);
        }
    }

    public int getTemperature() {
        return temperature;
    }
}

