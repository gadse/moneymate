package dev.gadse.moneymate.account.reader.camt052file;

import javax.xml.bind.annotation.XmlElement;

class TransactionDetails {
    @XmlElement( name = "RltdPties")
    private RelatedParties relatedParties;

    @XmlElement( name = "RltdAgts")
    private RelatedAgents relatedAgents;

    @XmlElement( name = "RmtInf")
    private RemittanceInformation remittanceInformation;
}
