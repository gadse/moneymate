package dev.gadse.moneymate.account;

import fr.marcwrobel.jbanking.iban.Iban;
public record IBAN (
        String iban
){

    public IBAN {
        if (!Iban.isValid(iban)) {
            throw new IllegalArgumentException("IBAN invalid: " + iban);
        }
    }
}
