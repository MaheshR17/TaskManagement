package io.bootify.my_app.model;

import jakarta.validation.constraints.Size;


public class TaskDTO {

    private Long id;

    @Size(max = 255)
    private String description;

    private Boolean done;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(final Boolean done) {
        this.done = done;
    }

}
