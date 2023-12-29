package dev.gadse.moneymate.account;

import dev.gadse.moneymate.account.reader.camt052file.CAMT052File;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@ToString
@RequiredArgsConstructor
@Getter
public class Account {
    private final String name;
    private final Person owner;
    private final IBAN iban;
    private final BIC bic;

    private final List<Item> items = new ArrayList<Item>();

    public void addItems(Iterable<Item> items) {
        for (Item item : items) {
            addItem(item);
        }
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}
