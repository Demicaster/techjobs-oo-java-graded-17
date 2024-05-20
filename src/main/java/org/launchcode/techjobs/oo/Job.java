package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    public String toString() {
//        String name = this.getName() == null ? "Data not available" : this.getName();
//        String employer = this.getEmployer() == null? "Data not available" : this.getEmployer().toString();
//        String location = this.getLocation() == null ? "Data not available" : this.getLocation().toString();
//        String positionType = this.getPositionType() == null ? "Data not available" : this.getPositionType().toString();
//        String coreCompetency = this.getCoreCompetency() == null ? "Data not available" : this.getCoreCompetency().toString();
//


        String name = "Data not available";
        String employer = "Data not available";
        String location = "Data not available";
        String positionType = "Data not available";
        String coreCompetency = "Data not available";

        if (this.getName() != null && !this.getName().isEmpty()){ name = this.getName().toString();}
        if (this.getEmployer() != null && !this.getEmployer().toString().isEmpty()){employer = this.getEmployer().toString();}
        if (this.getLocation() != null && !this.getLocation().toString().isEmpty()){location = this.getLocation().toString();}
        if (this.getPositionType() != null && !this.getPositionType().toString().isEmpty()){positionType = this.getPositionType().toString();}
        if (this.getCoreCompetency() != null && !this.getCoreCompetency().toString().isEmpty()){coreCompetency = this.getCoreCompetency().toString();}


        String string = System.lineSeparator() +
                        "ID: "  + this.getId()+ "\n" +
                        "Name: " + name + "\n" +
                        "Employer: " + employer+ "\n" +
                        "Location: " + location+ "\n" +
                        "Position Type: " + positionType+ "\n" +
                        "Core Competency: " + coreCompetency+
                        System.lineSeparator();
        return string;
    }

    @Override
    public boolean equals(Object o) {  // Taken again from Employer
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
