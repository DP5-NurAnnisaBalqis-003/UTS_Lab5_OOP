public class Account {
    private String id;
    private String name;
    private int balance;

    //    Konstruktor dengan saldo deafult yaitu 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    //    Konstruktor dengan saldo tertentu
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //    Getter methodes
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public void transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }
        @Override
        public String toString() {
            return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
        }
}
