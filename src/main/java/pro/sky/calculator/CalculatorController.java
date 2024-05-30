package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping
    public String
}
