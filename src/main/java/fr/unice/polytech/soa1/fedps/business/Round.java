package fr.unice.polytech.soa1.fedps.business;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlType
@XmlRootElement(name = "round")
public class Round {
    private List<RoundStep> parcelToDeliver;

    public Round() {
    }

    public Round(List<RoundStep> parcelToDeliver) {
        this.parcelToDeliver = parcelToDeliver;
    }

    @XmlElementWrapper(name = "round")
    @XmlElement(name = "step", required = true)
    public List<RoundStep> getParcelToDeliver() {
        return parcelToDeliver;
    }

    public void setParcelToDeliver(List<RoundStep> parcelToDeliver) {
        this.parcelToDeliver = parcelToDeliver;
    }
}
