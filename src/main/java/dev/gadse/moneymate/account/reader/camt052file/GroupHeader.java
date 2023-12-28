package dev.gadse.moneymate.account.reader.camt052file;

import javax.xml.bind.annotation.XmlElement;

import java.time.LocalTime;

class GroupHeader {

    @XmlElement(name = "MsgId")
    private String messageId;

    @XmlElement(name = "CreDtTm")
    private LocalTime creDtTm;

}
