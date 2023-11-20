package entities;

public class OUTSOURCEDEMPLOYEE extends Employee{

    private Double additionalCharge;

    public OUTSOURCEDEMPLOYEE() {
        super();
    }

    public OUTSOURCEDEMPLOYEE(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
