package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;

class CodeOrProprietary {
    @XmlElement(name = "Cd")
    private String code;

}
