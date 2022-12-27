package at.htl.boundary;

import at.htl.control.CircleRepository;
import at.htl.control.FacilityRepository;
import at.htl.control.LineConfigRepository;
import at.htl.control.NodeTypeRepository;
import at.htl.entity.Circle;
import at.htl.entity.Facility;
import at.htl.entity.LineConfig;
import at.htl.entity.NodeType;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("svg")
public class SvgViewerResource {
    @Inject
    CircleRepository circleRepository;
    @Inject
    LineConfigRepository lineConfigRepository;
    @Inject
    FacilityRepository facilityRepository;

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance svgviewerapi(List<Circle> circles, List<LineConfig> lines);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance renderSvg() {
        var circles = circleRepository.listAll();
        var lines = lineConfigRepository.listAll();
        //var facility = facilityRepository.listAll().get(0);
        return Templates.svgviewerapi(circles,lines);

    }

}
