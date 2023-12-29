package dev.gadse.moneymate.account.reader.camt052file;

import dev.gadse.moneymate.account.IBAN;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class CAMT052Account {

    @XmlElement(name = "Id")
    private AccountId accountId;

    /*
        Not modelled:
            - Currency
            - Financial Institution ID
     */
}
