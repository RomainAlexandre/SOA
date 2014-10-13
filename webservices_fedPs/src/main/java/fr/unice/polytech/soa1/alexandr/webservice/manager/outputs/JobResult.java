package fr.unice.polytech.soa1.alexandr.webservice.manager.outputs;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({CustomerResult.class, ListOfOrder.class,
        NbParcelByStatus.class})
public abstract class JobResult {
}
