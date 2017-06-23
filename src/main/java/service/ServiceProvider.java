package service;

/**
 * Created by bobby on 6/24/2017.
 */
public class ServiceProvider {
    private static CarServiceImpl carService = new CarServiceImpl();
    public static CarServiceImpl getCarService() {
        return carService;
    }
}
