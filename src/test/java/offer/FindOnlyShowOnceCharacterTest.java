package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindOnlyShowOnceCharacterTest {
    @Test
    public void find() throws Exception {

        assertEquals(null, FindOnlyShowOnceCharacter.find(null));
        assertEquals(null, FindOnlyShowOnceCharacter.find("ababcc"));
        assertEquals(Character.valueOf('b'), FindOnlyShowOnceCharacter.find("aabcceef"));

    }

}