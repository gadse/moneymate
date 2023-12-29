package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@RequiredArgsConstructor
@Getter
class Receipt {

    @XmlElement
    private String id;

    @XmlElement( name = "ElctrncSeqNb")
    private String sequenceNumber;

    @XmlElement( name = "CreDtTm" )
    private XMLGregorianCalendar creDtTm;

    @XmlElement( name = "Bal" )
    private List<Balance> balances;

    @XmlElement( name = "Ntry" )
    private List<Entry> entries;

    @XmlElement( name = "Acct")
    private CAMT052Account account;

}
