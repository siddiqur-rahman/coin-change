import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoinChangeTest {

    @Test
    public void testChangesOf1() throws Exception {
        CoinChange coinChange = new CoinChange();

        Map<Integer, Integer> changes = coinChange.make(1);

        assertThat(changes.get(1), is(1));
    }

    @Test
    public void testChangesOf9() throws Exception {
        CoinChange coinChange = new CoinChange();

        Map<Integer, Integer> changes = coinChange.make(9);

        assertThat(changes.get(5), is(1));
        assertThat(changes.get(2), is(2));
        assertThat(changes.get(1), is(0));
    }

    @Test
    public void testChangesOf6() throws Exception {
        CoinChange coinChange = new CoinChange();

        Map<Integer, Integer> changes = coinChange.make(6);

        System.out.println(changes);

        assertThat(changes.get(5), is(1));
        assertThat(changes.get(2), is(0));
        assertThat(changes.get(1), is(1));
    }

    @Test
    public void testChangesOf8() throws Exception {
        CoinChange coinChange = new CoinChange();

        Map<Integer, Integer> changes = coinChange.make(8);

        System.out.println(changes);

        assertThat(changes.get(5), is(1));
        assertThat(changes.get(2), is(1));
        assertThat(changes.get(1), is(1));
    }

    @Test
    public void testChangesOf0() throws Exception {
        CoinChange coinChange = new CoinChange();

        Map<Integer, Integer> changes = coinChange.make(0);

        System.out.println(changes);

        assertThat(changes.get(5), is(0));
        assertThat(changes.get(2), is(0));
        assertThat(changes.get(1), is(0));
    }

    @Test
    public void testChangesOfNeg8() {
        CoinChange coinChange = new CoinChange();
        assertThrows(IllegalArgumentException.class, () -> coinChange.make(-8));

    }
}
