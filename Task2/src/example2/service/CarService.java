package example2.service;

import example2.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService
{
    @Autowired
    private CarDao carDao;

    public void saveCar()
    {

    }
}
