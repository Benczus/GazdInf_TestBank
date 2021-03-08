import com.company.Account;
import com.company.DigitalBank;
import com.company.PublicDigitalBank;
import com.company.UserAccount;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.UUID;

public class BankTest {

    DigitalBank digitalBank;
    Account account;
    @BeforeTest
    public void setup(){
        digitalBank= new PublicDigitalBank("Dagobert Inc.");
        account= new UserAccount("Kis József", UUID.randomUUID());
    }

    @Test
    public void addUserTest(){
        digitalBank.addNewUser(account);
        Assert.assertEquals(digitalBank.getAccountList().contains(account), true);
    }

    @Test
    public void removeUserTest(){
        digitalBank.addNewUser(account);
        digitalBank.removeUser(account);
        Assert.assertEquals(digitalBank.getAccountList().contains(account), false);
    }



}
