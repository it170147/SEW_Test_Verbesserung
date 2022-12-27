package at.htl.control;

import at.htl.entity.Node;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NodeRepository implements PanacheRepository<Node> {

}
