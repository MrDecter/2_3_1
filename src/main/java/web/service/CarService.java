package web.service;


import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> carCount(List<Car> list, int count);

    List<Car> createCar();
}
