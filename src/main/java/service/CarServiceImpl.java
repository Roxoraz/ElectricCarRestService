package service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobby on 6/24/2017.
 */
public class CarServiceImpl {
    private List<Car> cars = new ArrayList<Car>();

    public void setcars(List<Car> cars) {
        this.cars = cars;
    }

    public CarServiceImpl() {

    }

    public Car getCar(int autoid){
        for (Car car : cars) {
            if (car.getAutoId() == autoid) {
                return car;
            }
        } return null;
    }

    public List<Car> getCars(){return cars;}

    public Car addCar(Car car) {
        int newAutoId = 0;
        try {
            newAutoId = cars.get(cars.size() - 1).getAutoId() + 1;
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            newAutoId = 1;
        }finally {
            car.setAutoId(newAutoId);
        }
        if (cars.add(car)) {
            return car;
        } else {
            return null;
        }
    }

    public boolean deleteCar(int autoid) {

        if(cars.remove(getCar(autoid))){
            return true;
        }else {
            return false;
        }
    }

}
