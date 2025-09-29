package com.micah.demo.exercise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

    private DataService ds;

    @Autowired
    public BusinessCalculationService(@Qualifier("mysql") DataService ds) {
        this.ds = ds;
    }

    public int getMax() {
        return Arrays.stream(ds.retrieveData()).max().orElse(0);
    }

}
