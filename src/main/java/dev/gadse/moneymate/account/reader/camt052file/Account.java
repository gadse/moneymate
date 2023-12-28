package dev.gadse.moneymate.account.reader.camt052file;

import dev.gadse.moneymate.account.IBAN;

import javax.xml.bind.annotation.XmlElement;

class Account {

    @XmlElement(name = "Id")
    private IBAN iban;

    /*
        Not modelled:
            - Currency
            - Financial Institution ID
     */
}
