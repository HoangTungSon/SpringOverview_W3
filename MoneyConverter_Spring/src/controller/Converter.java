package controller;

import dataConvert.CurrencyData;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import rate.Currency;
import rate.RateConverted;


@Controller
public class Converter {
    @GetMapping("/convert")
    public ModelAndView convert() {
        return new ModelAndView("convert", "rateConverted", new RateConverted());
    }

    @PostMapping("/rateConverted")
    public ModelAndView rateConverted(@ModelAttribute("rateConverted") RateConverted rate) {
        Currency currency = CurrencyData.checkCurrency(rate);
        if (currency == null) {
            return new ModelAndView("error");
        } else {
            ModelAndView modelAndView = new ModelAndView("currency");
            modelAndView.addObject("currency", currency);
            return modelAndView;
        }
    }
}
