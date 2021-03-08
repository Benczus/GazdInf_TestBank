package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class DigitalBank implements Bank{
    UUID digitalSignature;
    String name;
    String ownerName;
    List<Account> accountList;

    public DigitalBank(UUID digitalSignature, String name, String ownerName) {
        this.digitalSignature = digitalSignature;
        this.name = name;
        this.ownerName = ownerName;
        this.accountList=new ArrayList<>();
    }

    public DigitalBank(String name) {
        this.name = name;
        this.ownerName="Dagobert";
        this.digitalSignature=UUID.randomUUID();
        this.accountList=new ArrayList<>();
    }

    public DigitalBank(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
        this.digitalSignature= UUID.randomUUID();
        this.accountList=new ArrayList<>();
    }

    public void setDigitalSignature(UUID digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public UUID getDigitalSignature() {
        return digitalSignature;
    }

    public abstract List<Account> getAccountList();

    public void addNewUser(Account account){
        List<Account> accounts= getAccountList();
        accounts.add(account);
    }

    public void removeUser(Account account){
        //TODO
    }

    public void removeUser(String name){
        //TODO
    }


}
