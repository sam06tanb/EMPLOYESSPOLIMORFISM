package entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double ValuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        ValuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return ValuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        ValuePerHour = valuePerHour;
    }

    public double payment() {
        return hours * ValuePerHour;
    }
}
