package pro.sky.homework211.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework211.service.ServiceMath;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final ServiceMath serviceMath;

    public CalculatorController(ServiceMath serviceMath) {
        this.serviceMath = serviceMath;
    }

    @GetMapping()
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showPlus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + serviceMath.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String showMinus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + serviceMath.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + serviceMath.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + serviceMath.divide(num1, num2);
    }
}
