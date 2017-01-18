package Module7;

import java.util.Comparator;

/**
 * Created by aleks_000 on 18.01.2017.
 */
public class PriceComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}