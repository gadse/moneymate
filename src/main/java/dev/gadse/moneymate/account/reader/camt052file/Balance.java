package dev.gadse.moneymate.account.reader.camt052file;

import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@RequiredArgsConstructor
public class Balance {

    @XmlElement(name = "Tp")
    private CodeOrProprietary codeOrProprietary;

    @XmlElement(name = "Amt")
    private String amount;

    @XmlElement(name = "CdtDbtInd")
    private String cdtDbtInd;

    @XmlElement(name = "Dt")
    private String date;

}
