public class Server {
    public boolean canServeGuest(Guest guest) {
        //Conditionals
        if (guest.getAge() < 18) { //Guest < 18
            return false;
        }
        if (guest.getMoney() < 5.00) { //Guest must have enough money (each drink should cost £5.00)
            return false;
        }
        if (guest.getSobriety() < 50) {
            return false;// Guest must be sober enough (using an integer scale, 100-50 they are sober enough, under 50 refused!)
        }
        if (guest.getBanned()) {
            return false; //Guest must not be banned from the pub
        }
        if (guest.getCurrency() != '£') {
            return false; //Guest = money in the local currency
        }
        return true;

    }

}
