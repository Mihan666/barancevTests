package ru.guzev.mihan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SguareTests {

    @Test
public void testArea(){
        Sguare s = new Sguare(5);
        if (s.area()==25.0){
            System.out.println(" Агонь");
        }
        Assert.assertEquals(s.area(),25.0, "Не канает");

    }
}
