package edu.sau.sausensor.client.domain;


public class Sensor {

    private Mts400ResultsL nodeid;

    private Area area;

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Area getArea() {
        return this.area;
    }

    public void setNodeid(Mts400ResultsL nodeid) {
        this.nodeid = nodeid;
    }

    public Mts400ResultsL getNodeid() {
        return this.nodeid;
    }
}
