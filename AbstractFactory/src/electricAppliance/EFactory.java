package electricAppliance;

public interface EFactory {
    /*&public interface Television{
        public void play();
    }
    public interface AirConditioner{
        public void changeTemperature();
    }*/
    public Television produceTelevision();
    public AirConditioner produceAirConditioner();

}
