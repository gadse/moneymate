package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Creditor {

    @XmlElement( name = "Nm")
    private String name;
}
