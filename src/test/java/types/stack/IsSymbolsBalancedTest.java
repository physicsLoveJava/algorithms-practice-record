package types.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSymbolsBalancedTest {
    @Test
    public void isBalanced() throws Exception {

        assertTrue(new IsSymbolsBalanced().isBalanced("([{()}])"));
        assertTrue(new IsSymbolsBalanced().isBalanced("([+++{()}---])"));
        assertFalse(new IsSymbolsBalanced().isBalanced("([{())}])"));

    }

}