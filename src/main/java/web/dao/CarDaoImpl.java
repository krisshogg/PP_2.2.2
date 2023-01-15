package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Mercedes-Benz GLC-класс", "серый", 3337000));
        carList.add(new Car("Opel Insignia", "красный", 1320000));
        carList.add(new Car("Porsche 911", "синий", 13988000));
        carList.add(new Car("Dacia Logan", "чёрный", 689999));
        carList.add(new Car("Audi TT", "белый", 1660000));
    }


    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
