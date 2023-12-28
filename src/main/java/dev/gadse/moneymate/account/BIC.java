package dev.gadse.moneymate.account;

import fr.marcwrobel.jbanking.bic.Bic;
import org.apache.commons.validator.routines.checkdigit.IBANCheckDigit;

public record BIC (
        String bic
) {

    public BIC {
        if (!Bic.isValid(bic)) {
            throw new IllegalArgumentException("BIC invalid: " + bic);
        }
    }
}
