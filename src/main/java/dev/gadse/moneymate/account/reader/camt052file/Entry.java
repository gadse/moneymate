package dev.gadse.moneymate.account.reader.camt052file;

import dev.gadse.moneymate.account.Account;
import dev.gadse.moneymate.account.IBAN;
import dev.gadse.moneymate.account.Item;
import dev.gadse.moneymate.account.Person;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.javamoney.moneta.Money;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
public class Entry {

    @XmlElement( name = "Amt" )
    private String amount;

    @XmlElement( name = "CdtDbtInd" )
    private String cdtDbtInd;

    @XmlElement( name = "Sts" )
    private String sts;

    @XmlElement( name = "BoogDt")
    private XMLGregorianCalendar bookigDate;

    @XmlElement( name = "ValDt")
    private XMLGregorianCalendar valueDate;

    @XmlElement( name = "AcctSvcrRef")
    private String accountServicerReference;

    @XmlElement( name = "NtryDtls")
    private EntryDetails details;

    @XmlElement( name = "AddtlNtryInf")
    private AdditionalEntryInfo additionalEntryInfo;

    public Item toItem() {
        var from = new Account(
                "fromAcct",
                new Person(details.getTransactionDetails().getRelatedParties().getCreditor().getName()),
                new IBAN(details.getTransactionDetails().getRelatedParties().getCreditorAccount().getAccountId().getIban()),
                null
        );

        var to = new Account(
                "fromAcct",
                new Person(details.getTransactionDetails().getRelatedParties().getDebitor().getName()),
                new IBAN(details.getTransactionDetails().getRelatedParties().getDebitorAccount().getAccountId().getIban()),
                null
        );

        Money monetaryAmount = Money.of(new BigDecimal(amount), "EUR");

        LocalDate convertedValueDate = LocalDate.of(
                valueDate.getYear(),
                valueDate.getMonth(),
                valueDate.getDay()
        );

        LocalDate convertedBookingDate = LocalDate.of(
                bookigDate.getYear(),
                bookigDate.getMonth(),
                bookigDate.getDay()
        );

        return new Item(
                from,
                to,
                monetaryAmount,
                convertedValueDate,
                convertedBookingDate,
                null
        );
    }

}
