package week_07.day_49_bank_file_storage.src;

public class CustomerNotFoundException extends BankException{
    public CustomerNotFoundException(int id) {
        super("Клиент с ID " + id + " не найден");
    }
}
