package at.htl.boundary;

import at.htl.control.CircleRepository;
import at.htl.control.FacilityRepository;
import at.htl.entity.Circle;
import at.htl.entity.Facility;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/facility")
public class FacilityResource {
    @Inject
    FacilityRepository facilityRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Facility> list(){
        return facilityRepository.listAll();
    }

}