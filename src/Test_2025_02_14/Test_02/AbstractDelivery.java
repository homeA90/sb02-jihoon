package src.Test_2025_02_14.Test_02;

public abstract class AbstractDelivery implements Delivery {
    protected String trackingNumber;
    protected String carrier;

    public AbstractDelivery(String trackingNumber, String carrier) {
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
    }
}
