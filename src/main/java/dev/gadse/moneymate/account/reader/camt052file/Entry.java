package dev.gadse.moneymate.account.reader.camt052file;

import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import java.time.LocalDate;

@RequiredArgsConstructor
public class Entry {

    @XmlElement( name = "Amt" )
    private String amount;

    @XmlElement( name = "CdtDbtInd" )
    private String cdtDbtInd;

    @XmlElement( name = "Sts" )
    private String sts;

    @XmlElement( name = "BoogDt")
    private LocalDate bookigDate;

    @XmlElement( name = "ValDt")
    private LocalDate valueDate;

    @XmlElement( name = "AcctSvcrRef")
    private String accountServicerReference;

    @XmlElement( name = "NtryDtls")
    private EntryDetails details;

    @XmlElement( name = "AddtlNtryInf")
    private AdditionalEntryInfo additionalEntryInfo;

}
