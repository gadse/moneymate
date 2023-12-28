package dev.gadse.moneymate.account;

import javax.money.MonetaryAmount;
import java.time.LocalDate;

public record Item(
        Account from,
        Account to,
        MonetaryAmount amount,
        LocalDate valueDate,
        LocalDate entryDate,
        String info
) {
}
