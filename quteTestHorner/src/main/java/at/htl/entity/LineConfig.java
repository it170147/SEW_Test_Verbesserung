package at.htl.entity;

import javax.persistence.*;

public class LineConfig {



    private Long id;

    @Column(name = "CSS_CLASS")
    private String cssClass;

    @Column(name = "X1_POS")
    private int x1pos;

    @Column(name = "Y1_POS")
    private int y1pos;

    @Column(name = "X2_POS")
    private int x2pos;

    @Column(name = "Y2_POS")
    private int y2pos;

    private String stroke;

    @Column(name = "STROKE_WIDTH")
    private int strokeWidth;

    @Column(name = "STROKE_DASHARRAY")
    private int strokeDasharray;

    @Column(name = "STROKE_DASHOFFSET")
    private int strokeDashoffset;

    public LineConfig(String cssClass, int x1pos, int y1pos, int x2pos, int y2pos, String stroke, int strokeWidth, int strokeDasharray, int strokeDashoffset) {
        this.cssClass = cssClass;
        this.x1pos = x1pos;
        this.y1pos = y1pos;
        this.x2pos = x2pos;
        this.y2pos = y2pos;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
        this.strokeDasharray = strokeDasharray;
        this.strokeDashoffset = strokeDashoffset;
    }

    public LineConfig() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getX1pos() {
        return x1pos;
    }

    public void setX1pos(int x1pos) {
        this.x1pos = x1pos;
    }

    public int getY1pos() {
        return y1pos;
    }

    public void setY1pos(int y1pos) {
        this.y1pos = y1pos;
    }

    public int getX2pos() {
        return x2pos;
    }

    public void setX2pos(int x2pos) {
        this.x2pos = x2pos;
    }

    public int getY2pos() {
        return y2pos;
    }

    public void setY2pos(int y2pos) {
        this.y2pos = y2pos;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getStrokeDasharray() {
        return strokeDasharray;
    }

    public void setStrokeDasharray(int strokeDasharray) {
        this.strokeDasharray = strokeDasharray;
    }

    public int getStrokeDashoffset() {
        return strokeDashoffset;
    }

    public void setStrokeDashoffset(int strokeDashoffset) {
        this.strokeDashoffset = strokeDashoffset;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }
}
