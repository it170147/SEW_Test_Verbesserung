package at.htl.boundary;

import at.htl.control.CircleRepository;
import at.htl.entity.Circle;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/circle")
public class CircleResource {
    @Inject
    CircleRepository circleRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Circle> list(){
        return circleRepository.listAll();
    }

}
