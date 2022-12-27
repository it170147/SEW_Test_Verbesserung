package at.htl.entity.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CircleDao(
        @JsonProperty("html_id") String htmlId,
        @JsonProperty("x_pos") int xPos,
        @JsonProperty("y_pos") int yPos
) {}
