package web.model;


import web.service.CarServiceImpl;

public class Car extends CarServiceImpl {
    private String model;
    private int series;
    private int year;

    public Car(Car car) {

    }

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Машина = " + model + '\'' +
                ", Серия = " + series +
                ", год выпуска = " + year +
                '}';
    }
}

