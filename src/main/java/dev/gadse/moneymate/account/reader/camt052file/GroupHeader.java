package dev.gadse.moneymate.account.reader.camt052file;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@RequiredArgsConstructor
@Getter
class GroupHeader {

    @XmlElement(name = "MsgId")
    private String messageId;

    @XmlElement(name = "CreDtTm")
    private XMLGregorianCalendar creDtTm;

}
