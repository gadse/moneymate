package dev.gadse.moneymate.account;

import dev.gadse.moneymate.account.reader.FileAccountReader;
import dev.gadse.moneymate.account.reader.camt052file.CAMT052File;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService {

    @Value("${moneymate.account-file-path}")
    private String accountFilePath;

    private final FileAccountReader reader;

    public List<Account> readAccounts() {
        CAMT052File file = reader.read(accountFilePath);
        Account account = file.getAccount();
        account.addItems(file.getItems());

        return List.of(account);
    }


}
