package at.htl.control;

import at.htl.entity.Circle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CircleRepository implements PanacheRepository<Circle> {

}
