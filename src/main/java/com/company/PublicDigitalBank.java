package com.company;

import java.util.List;
import java.util.UUID;

public class PublicDigitalBank extends DigitalBank{
    public PublicDigitalBank(UUID digitalSignature, String name, String ownerName) {
        super(digitalSignature, name, ownerName);
    }

    public PublicDigitalBank(String name) {
        super(name);
    }

    public PublicDigitalBank(String name, String ownerName) {
        super(name, ownerName);
    }

    @Override
    public List<Account> getAccountList() {
        return this.accountList;
    }
}
