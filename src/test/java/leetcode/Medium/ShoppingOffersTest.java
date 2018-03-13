package leetcode.Medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ShoppingOffersTest {
    @Test
    public void shoppingOffers() throws Exception {

        assertEquals(14, new ShoppingOffers().shoppingOffers(
                Arrays.asList(2, 5),
                new ArrayList<>(Arrays.asList(
                        Arrays.asList(3, 0, 5),
                        Arrays.asList(1, 2, 10)
                )),
                Arrays.asList(3, 2)
        ));

        assertEquals(11, new ShoppingOffers().shoppingOffers(
                Arrays.asList(2, 3, 4),
                new ArrayList<>(Arrays.asList(
                        Arrays.asList(1, 1, 0, 4),
                        Arrays.asList(2, 2, 1, 9)
                )),
                Arrays.asList(1, 2, 1)
        ));

    }

}