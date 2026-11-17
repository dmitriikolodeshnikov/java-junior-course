package week_07.day_49_bank_file_storage.src;

public class InsufficientFundsException extends BankException{
    public InsufficientFundsException(String accountNumber) {
        super("Недостаточно средств на счете " + accountNumber);
    }
}
