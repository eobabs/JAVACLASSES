package SnacksOOP;

import java.util.ArrayList;
import java.util.List;

public class Customers extends EStoreUsers{

    public Customers(int age, String name, String emailAddress, String phoneNumber, String password, String homeAddress) {
        super(age, name, emailAddress, phoneNumber, password, homeAddress);
        List<BillingInformation> billingInformation = new ArrayList<>();

    }


}
