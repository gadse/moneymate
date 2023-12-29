package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class TransactionDetails {
    @XmlElement( name = "RltdPties")
    private RelatedParties relatedParties;

    @XmlElement( name = "RltdAgts")
    private RelatedAgents relatedAgents;

    @XmlElement( name = "RmtInf")
    private RemittanceInformation remittanceInformation;
}
