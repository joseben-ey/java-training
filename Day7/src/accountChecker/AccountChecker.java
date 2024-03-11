package accountChecker;

import java.util.Arrays;

class AccountNotFoundException extends Exception {
	
    public AccountNotFoundException() {
        super("Account not found.");
    }

    public AccountNotFoundException(String message) {
        super(message);
    }
}

public class AccountChecker {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount(1001);
        accounts[1] = new BankAccount(2002);
        accounts[2] = new BankAccount(3003);
        accounts[3] = new BankAccount(4004);
        accounts[4] = new BankAccount(5005);

        int accountToCheck = 3003;

        try {
            boolean isValid = isValidAccount(accounts, accountToCheck);
            System.out.println("Account " + accountToCheck + " is valid: " + isValid);
        } catch (AccountNotFoundException e) {
            System.out.println("Account " + accountToCheck + " not found.");
        }
    }

    public static boolean isValidAccount(BankAccount[] accounts, int accno) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccno() == accno) {
                return true;
            }
        }
        throw new AccountNotFoundException(); 
}
}