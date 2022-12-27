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

    @PUT
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(CircleDao circle) {
        updateNode(circle.xPos(), circle.yPos(), circle.htmlId());
        return Response.ok().build();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response postHtmlForm(
            @FormParam("xPos") int xPos,
            @FormParam("yPos") int yPos,
            @FormParam("htmlIconName") String html
    ) {
        updateNode(xPos, yPos, html);
        // Response.ok(svgViewerResource.renderSvg()).build();
        return Response.seeOther(URI.create("/svg")).build();
    }

    private void updateNode(int xPos, int yPos, String html) {
        var c = circleRepository.find("html_id", html).firstResult();
        c.setxPos(xPos);
        c.setyPos(yPos);
        if (c.getLineConfig()==null){
            var lines = lineConfigRepository.listAll();
            for (LineConfig line:lines
            ) {
                line.setX2pos(xPos);
                line.setY2pos(yPos);
            }
        }
    }
}
