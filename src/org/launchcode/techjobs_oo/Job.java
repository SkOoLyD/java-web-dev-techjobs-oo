package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;
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
        id= nextId;
        nextId++;
    }

    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public Job(int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.id = id;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    @Override

    public String toString() {

        String[] labels = {"id:", "name:", "employer:", "location:", "positionType:", "core competency:"};
        Field[] fields = Job.class.getDeclaredFields();
        String unavailable = "data not available";
        String message = "\n";
        int index = 0;

        for (Field f : fields) {
            if (f.getName().equals("nextId")) {

            } else {

                try {
                    if (f.get(this) == null) {
                        message = message + labels[index] + unavailable + "\n";
                    } else {
                        message = message + labels[index] + f.get(this) + "\n";
                    }
                    index++;

                } catch (Exception e) {
                    message = message + labels[index] + unavailable + "\n";
                    index++;
                }
            }
        }
        return message;
    }





    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
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
