package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class EntryDetails {

    @XmlElement( name = "TxDtls")
    private TransactionDetails transactionDetails;

}
