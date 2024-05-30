package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);

    }
}
