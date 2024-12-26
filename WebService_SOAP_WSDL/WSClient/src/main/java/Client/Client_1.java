package Client;

import BankServicesProxy.Account;
import BankServicesProxy.BankService;
import BankServicesProxy.BankWS;

import java.util.List;

public class Client_1 {
    public static void main(String[] args) {
        BankService proxy = new BankWS().getBankServicePort();
        System.out.println(proxy.changeEuroToDH(22));
        System.out.println("----------------------");

        Account account = proxy.getAccount(2);
        System.out.println("Account ID : " +account.getId());
        System.out.println("Account Balance : " +account.getBalance());
        System.out.println("Account Creation Date : " +account.getCreationDate());
        System.out.println("----------------------");

        List<Account> accounts = proxy.getAccounts();
        for (Account ac  : accounts ) {
            System.out.println("Account ID : " +ac.getId());
            System.out.println("Account Balance : " +ac.getBalance());
            System.out.println("Account Creation Date : " +ac.getCreationDate());
            System.out.println("----------------------");
        }
        //System.out.println(proxy.getAccount(2));
    }
}
