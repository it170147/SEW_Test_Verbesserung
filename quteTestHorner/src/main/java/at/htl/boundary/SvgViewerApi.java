package at.htl.boundary;

import at.htl.control.CircleRepository;
import at.htl.control.LineConfigRepository;
import at.htl.entity.Circle;
import at.htl.entity.LineConfig;
import at.htl.entity.dao.CircleDao;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

@Path("/api/svg")
public class SvgViewerApi {

    @Inject
    CircleRepository circleRepository;

    @Inject
    SvgViewerResource svgViewerResource;




}
