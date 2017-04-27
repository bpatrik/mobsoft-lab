package hu.bme.aut.mobsoft.mobsoftlab.model;

import com.google.gson.annotations.SerializedName;
import com.orm.dsl.Table;


@Table
public class Todo {
    private Long id = null;

    @SerializedName("name")
    private String name;


    public Todo() {
    }

    public Todo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
