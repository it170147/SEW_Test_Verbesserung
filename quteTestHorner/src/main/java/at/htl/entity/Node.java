package at.htl.entity;

import javax.persistence.*;

@Entity
public class Node {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "HTML_ID")
    private String htmlId;

    @Column(name = "HTML_NAME")
    private String htmlName;

    @ManyToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;

    private String description;

    @ManyToOne
    @JoinColumn(name = "NODE_TYPE_ID")
    private NodeType nodeType;

    @Enumerated(EnumType.STRING)
    @Column(name = "DEVICE_TYPE")
    private DeviceType deviceType;

    @Column(name="HTML_ICON_FILE_NAME")
    private String htmlIconFileName;

    @Column(name="HTML_ICON_NAME")
    private String htmlIconName;

    @ManyToOne
    @JoinColumn(name = "DESTINATION_ID")
    private Node destination;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DESTINATION_LINE_CONFIG_ID")
    private LineConfig lineConfig;


    //region constructors
    public Node(String htmlId,
                String htmlName,
                Facility facility,
                String description,
                NodeType nodeType,
                DeviceType deviceType,
                String htmlIconFileName,
                String htmlIconName,
                Node destination,
                LineConfig lineConfig) {
        this.htmlId = htmlId;
        this.htmlName = htmlName;
        this.facility = facility;
        this.description = description;
        this.nodeType = nodeType;
        this.deviceType = deviceType;
        this.htmlIconFileName = htmlIconFileName;
        this.htmlIconName = htmlIconName;
        this.destination = destination;
        this.lineConfig = lineConfig;
    }

    public Node() {
    }
    //endregion

    //region getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(String htmlId) {
        this.htmlId = htmlId;
    }

    public String getHtmlName() {
        return htmlName;
    }

    public void setHtmlName(String htmlName) {
        this.htmlName = htmlName;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getHtmlIconFileName() {
        return htmlIconFileName;
    }

    public void setHtmlIconFileName(String htmlIconFileName) {
        this.htmlIconFileName = htmlIconFileName;
    }

    public String getHtmlIconName() {
        return htmlIconName;
    }

    public void setHtmlIconName(String htmlIconName) {
        this.htmlIconName = htmlIconName;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public LineConfig getLineConfig() {
        return lineConfig;
    }

    public void setLineConfig(LineConfig lineConfig) {
        this.lineConfig = lineConfig;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("%d: %s", getId(), getHtmlId());
    }
}
