package com.webapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class CountryController {
    ArrayList<String> countries = new ArrayList<String>();

    @RequestMapping(value = "/getCountryList", produces = "text/plain", method = RequestMethod.GET)
    @ResponseBody
    public String getCountryList() {
        ArrayList<String> resultList = getCountries();
        String result = "";
        for (int i = 0; i < resultList.size(); i++)
            result = result + "\n" + resultList.get(i);
        return result;
    }

    ArrayList<String> getCountries() {
        countries.add("India");
        countries.add("China");
        countries.add("USA");
        return countries;
    }
}
