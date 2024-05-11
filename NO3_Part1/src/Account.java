public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id,String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }
}
