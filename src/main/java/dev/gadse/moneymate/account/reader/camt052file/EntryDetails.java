package dev.gadse.moneymate.account.reader.camt052file;


import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@RequiredArgsConstructor
class EntryDetails {

    @XmlElement( name = "TxDtls")
    private TransactionDetails transactionDetails;

}
