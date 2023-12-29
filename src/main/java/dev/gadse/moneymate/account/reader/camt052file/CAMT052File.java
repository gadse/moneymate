package dev.gadse.moneymate.account.reader.camt052file;

import dev.gadse.moneymate.account.Account;
import dev.gadse.moneymate.account.BIC;
import dev.gadse.moneymate.account.IBAN;
import dev.gadse.moneymate.account.Item;
import dev.gadse.moneymate.account.Person;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;

@XmlRootElement( name = "Document" )
@Getter
/**
 * Implemented with support of the official documentation:
 * https://www.ebics.de/securedl/sdl-eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2OTkzNTYyMjEsImV4cCI6MTY5OTQ0NjIyMSwidXNlciI6MCwiZ3JvdXBzIjpbMCwtMV0sImZpbGUiOiJmaWxlYWRtaW5cL3Vuc2VjdXJlZFwvYW5sYWdlM1wvYW5sYWdlM19zcGVjXC9BbmxhZ2VfM19EYXRlbmZvcm1hdGVfMy43LnBkZiIsInBhZ2UiOjEwM30.E9DCvfiC28uxt4Q8xP5bI7FOEro7irAJaGFMRZBDC0U/Anlage_3_Datenformate_3.7.pdf
 */
@Slf4j
public class CAMT052File {
    @XmlElement( name = "BkToCstmrAcctRpt" )
    private BankToCustomerAccountReceipt content;

    @XmlElement( name = "uri" )
    private String uri;

    public Account getAccount() {
        return new Account(
                "foo",
                new Person("owner"),
                new IBAN(content.getReceipt().getAccount().getAccountId().getIban()),
                new BIC("FRSDDEF1")
        );
    }

    public List<Item> getItems() {
        var items = new LinkedList<Item>();

        for (Entry entry : content.getReceipt().getEntries()) {
            items.add(entry.toItem());
        }

        return items;
    }
}

