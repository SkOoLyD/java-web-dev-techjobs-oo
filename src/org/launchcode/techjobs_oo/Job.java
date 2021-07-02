package org.launchcode.techjobs_oo;

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

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public Job(Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public String toString() {
        String nameOutput;
        String employerOutput;
        String locationOutput;
        String positionTypeOutput;
        String coreCompetencyOutput;

        if (name.equals("")) {
            nameOutput="Data not available";
        }
        else {
            nameOutput = this.getName();
        }
        if (employer.getValue().equals("")) {
            employerOutput="Data not available";
        }
        else {
            employerOutput = employer.getValue();
        }
        if (location.getValue().equals("")){
            locationOutput="Data not available";
        }
        else {
            locationOutput= location.getValue();
        }
        if(positionType.getValue().equals("")) {
            positionTypeOutput=" Data not available";
        }
        else {
            positionTypeOutput= positionType.getValue();
        }
        if(coreCompetency.getValue().equals("")) {
            coreCompetencyOutput="Data not available";
        }
        else {
            coreCompetencyOutput= coreCompetency.getValue();
        }


        return
                "Id:" + id +"\n"+
                " Name:" + nameOutput + "\n" +
                " Employer:" + employerOutput + "\n" +
                " Location:" + locationOutput + "\n" +
                " positionType:" + positionType + "\n" +
                " coreCompetency:" + coreCompetency + "\n"
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
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
