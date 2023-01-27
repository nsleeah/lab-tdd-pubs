import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {


    Server server;


    @BeforeEach
    public void setUp() {

        server = new Server();
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void testGuestOver18() {
        Guest underAgeGuest = new Guest("Adam", 16, 75, 65, false, '£');
        Guest legalAgeGuest = new Guest("Joe", 20, 45, 70, false, '£');
        assertThat(server.canServeGuest(underAgeGuest)).isFalse();
        assertThat(server.canServeGuest(legalAgeGuest)).isTrue();
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void testGuestEnoughMoney() {
        Guest underAgeGuest = new Guest("Adam", 16, 7, 65, false, '£');
        Guest legalAgeGuest = new Guest("Joe", 20, 60, 70, false, '£');
        assertThat(server.canServeGuest(underAgeGuest)).isFalse();
        assertThat(server.canServeGuest(legalAgeGuest)).isTrue();
    }
}
