package Week02.WorksheetSOLID;

public class FireSensor implements Sensor {

    private boolean triggered = false;
    private String location = "";
    private String sensorType = "";
    private int batteryPercentage = 0;

    public void setTriggered(boolean triggeredAlarm) {

        triggered = triggeredAlarm;
    }

    public void setLocation(String location){

        this.location = location;
    }

    public void setSensorType(String sensorType){

        this.sensorType = sensorType;
    }

    public void setBatteryPercentage(int batteryPercentage){

        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public boolean isTriggered() {
        return triggered;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getSensorType() {
        return sensorType;
    }

    @Override
    public double getBatteryPercentage() {
        return batteryPercentage;
    }
}
