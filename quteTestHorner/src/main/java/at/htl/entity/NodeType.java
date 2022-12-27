package at.htl.entity;

import javax.persistence.*;


@Table(name = "NODE_TYPE")
@Entity
public class NodeType {

    @Id
    @Column(name = "DESC_ENG")
    private String descEng;
    @Column(name = "DESC_GER")
    private String descGer;

    public NodeType() {
    }

    public NodeType(String descEng, String descGer) {
        this.descEng = descEng;
        this.descGer = descGer;
    }

    public String getDescEng() {
        return descEng;
    }

    public void setDescEng(String name) {
        this.descEng = name;
    }

    public String getDescGer() {
        return descGer;
    }

    public void setDescGer(String desc) {
        this.descGer = desc;
    }

    @Override
    public String toString() {
        return String.format("%s", descEng);
    }
}
