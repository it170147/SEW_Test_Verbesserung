package at.htl.control;

import at.htl.entity.NodeType;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NodeTypeRepository implements PanacheRepositoryBase<NodeType, String> {
}
