package e.felix_its.subjectexapandalelist;

import java.util.ArrayList;

public class Continent {

    private String name;
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();

    public Continent(String name, ArrayList<Subject> subjectList) {
        super();
        this.name = name;
        this.subjectList = subjectList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }
    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    };

}
