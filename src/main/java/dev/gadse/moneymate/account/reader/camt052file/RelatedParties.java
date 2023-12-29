package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class RelatedParties {

    @XmlElement( name = "Dbtr" )
    private Debitor debitor;

    @XmlElement( name = "DbtrAcct" )
    private DebitorAccount debitorAccount;

    @XmlElement( name = "Cdtr" )
    private Creditor creditor;

    @XmlElement( name = "CdtrAcct" )
    private CreditorAccount creditorAccount;

}
