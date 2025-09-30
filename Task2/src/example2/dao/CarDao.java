package example2.dao;

import org.springframework.stereotype.Component;

@Component
public class CarDao implements VehicleDao {
    @Override
    public void save() {
        //implement car insertion into DB
    }
}
