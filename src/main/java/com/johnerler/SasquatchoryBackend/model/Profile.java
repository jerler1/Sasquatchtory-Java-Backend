package com.johnerler.SasquatchoryBackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "Please enter a valid name.")
    private String name;

    @OneToMany(mappedBy = "factoryId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Factory> factories;

    public Profile() {
    }

    public Profile(Integer id, String name, List<Factory> factories) {
        this.id = id;
        this.name = name;
        this.factories = factories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Factory> getFactories() {
        return factories;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(id, profile.id) && Objects.equals(name, profile.name) && Objects.equals(factories, profile.factories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, factories);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", factories=" + factories +
                '}';
    }
}
