package rest;

import service.ServiceProvider;
import service.Car;
import service.CarServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by bobby on 22-6-2017.
 */

@Path("/cars")
public class CarRestService {

    @GET
    @Path("/{Id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Car getCar(@PathParam("Id") int AutoId) {
        CarServiceImpl carServiceImpl = ServiceProvider.getCarService();
        return carServiceImpl.getCar(AutoId);
    }

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Car> getAllCars() {
        CarServiceImpl carServiceImpl = ServiceProvider.getCarService();
        return carServiceImpl.getCars();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Car addCar(Car car) {
        CarServiceImpl carServiceImpl = ServiceProvider.getCarService();
        return carServiceImpl.addCar(car);
    }

    @DELETE
    @Path("/{Id}")
    public Response deleteCar(@PathParam("Id") int AutoId) {
        CarServiceImpl carServiceImpl = ServiceProvider.getCarService();
        if (carServiceImpl.deleteCar(AutoId)) {
            return Response.status(204).entity("Car deleted from list.").build();
        } else {
            return Response.status(404).entity("Car could not be deleted.").build();
        }
    }
}

