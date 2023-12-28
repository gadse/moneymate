package dev.gadse.moneymate.account.reader.camt052file;

import javax.xml.bind.annotation.XmlElement;
import java.time.LocalTime;
import java.util.List;

class Receipt {

    @XmlElement
    private String id;

    @XmlElement( name = "ElctrncSeqNb")
    private String sequenceNumber;

    @XmlElement( name = "CreDtTm" )
    private LocalTime creDtTm;

    @XmlElement( name = "Bal" )
    private List<Balance> balances;

    @XmlElement( name = "Ntry" )
    private List<Entry> entries;

}
