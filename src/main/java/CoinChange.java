import java.util.Map;
import java.util.HashMap;

public class CoinChange {
    public Map<Integer, Integer> make(int amount) throws Exception {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        Map<Integer, Integer> changes = new HashMap<>();

        Integer numOfCoin5 = amount/5;
        Integer numOfCoin2 = (amount-(5*numOfCoin5))/2;
        Integer numOfCoin1 = amount-(5*numOfCoin5) - (2*numOfCoin2);

        changes.put(5, numOfCoin5);
        changes.put(2, numOfCoin2);
        changes.put(1, numOfCoin1);

        return changes;
    }
}
