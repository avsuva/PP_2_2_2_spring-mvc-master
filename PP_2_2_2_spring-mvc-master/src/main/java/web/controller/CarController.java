package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImp;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count",required = false) Integer count, ModelMap model) {
        if (count != null) {
            model.addAttribute("cars", carServiceImp.getCars().stream().limit(count).toList());
        } else{
            model.addAttribute("cars",carServiceImp.getCars());
            }
    return "cars";
    }
}
