package dev.gadse.moneymate.account.reader.camt052file;

import dev.gadse.moneymate.account.Account;
import dev.gadse.moneymate.account.BIC;
import dev.gadse.moneymate.account.Item;
import dev.gadse.moneymate.account.Person;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class BankToCustomerAccountReceipt {

    @XmlElement(name = "GrpHdr")
    private GroupHeader groupHeader;

    @XmlElement(name = "Rpt")
    private Receipt receipt;

}
