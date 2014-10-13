package fr.unice.polytech.soa1.alexandr.webservice.manager.outputs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(name = "manager_output")
public class ManagerOutput {
    public ManagerOutput() {}

    private List<JobResult> results;

    @XmlElementWrapper(name = "results")
    @XmlElement(name = "item")
    public List<JobResult> getResults() { return results; }
    public void setResults(List<JobResult> results) { this.results = results; }

}
