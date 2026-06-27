import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CoinChangeTest {

    @Test
    public void testChangesOf1() {
        CoinChange coinChange = new CoinChange();

        Map<Integer, Integer> changes = coinChange.make(1);

        assertThat(changes.get(1), is(1));
    }

}
