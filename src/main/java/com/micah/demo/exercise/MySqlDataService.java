package com.micah.demo.exercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mysql")
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] { 21, 32, 36, 98, 10 };
    }
}
