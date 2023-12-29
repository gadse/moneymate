package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
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
