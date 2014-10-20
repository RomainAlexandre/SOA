package fr.unice.polytech.soa1.fedps.webservice.manager.outputs;

import fr.unice.polytech.soa1.fedps.business.ParcelStatus;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "nb_parcel")
public class NbParcelByStatus extends JobResult {
    private Integer NbParcel;

    private ParcelStatus parcelStatus;

    public NbParcelByStatus() {
    }

    @XmlElement(name = "nb_parcel", required = true)
    public Integer getNbParcel() {
        return NbParcel;
    }

    public void setNbParcel(Integer nbParcel) {
        this.NbParcel = nbParcel;
    }

    @XmlElement(name = "status", required = true)
    public ParcelStatus getParcelStatus() {
        return parcelStatus;
    }

    public void setParcelStatus(ParcelStatus parcelStatus) {
        this.parcelStatus = parcelStatus;
    }

}
