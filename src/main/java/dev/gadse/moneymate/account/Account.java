package dev.gadse.moneymate.account;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Account {
    private final String name;
    private final Person owner;
    private final IBAN iban;
    private final BIC bic;
}
