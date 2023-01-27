public class Guest {

    //Properties
    private String name;
    private int age;
    private double money;
    private int sobriety;
    private boolean banned;
    private char currency;

    public Guest(String name, int age, double money, int sobriety, boolean banned, char currency){
        this.name = name;
        this.age = age;
        this.money = money;
        this.sobriety = sobriety;
        this.banned = banned;
        this.currency = currency;
    }

    //Getters and Setters.
    //Name
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.age = age;
    }

    //Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //Money
    public double getMoney(){
        return money;
    }
    public void setMoney(int age) {
        this.money = money;
    }
    //Sobriety
    public int getSobriety(){
        return sobriety;
    }
    public void setSobriety(int sobriety) {
        this.sobriety = sobriety;
    }
    //Banned
    public boolean getBanned(){
        return banned;
    }
    public void setBanned(boolean sobriety) {
        this.banned = banned;
    }
    //Currency
    public char getCurrency(){
        return currency;
    }
    public void setCurrency(char currency) {
        this.currency = currency;
    }




}
