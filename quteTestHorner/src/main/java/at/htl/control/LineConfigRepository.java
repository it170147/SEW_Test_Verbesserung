package at.htl.control;

import at.htl.entity.LineConfig;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LineConfigRepository implements PanacheRepository<LineConfig> {

}
