package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;


@Controller
public class CarController {

    @Autowired
    private CarService carList;


    @GetMapping(value = "/cars" )
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false ) Integer count) {

        List<Car> list = carList.createCar();

        if (count != null) {
            model.addAttribute("carList", carList.carCount(list,count));
            return "cars";
        } else {
            model.addAttribute("carList", list);
            return "cars";
        }
    }

}
