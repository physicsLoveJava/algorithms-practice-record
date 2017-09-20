package leetcode.Medium;

import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class AddAndSearchWordDataStructureDesignTest {

    AddAndSearchWordDataStructureDesign design;

    @Before
    public void setUp() {
        design = new AddAndSearchWordDataStructureDesign();
    }

    @Test
    public void test1() {
        design.addWord("abc");
        design.addWord("bcd");
        design.addWord("cde");
        design.addWord("a");
        assertTrue(design.search("abc"));
        assertTrue(design.search(".bc"));
        assertTrue(design.search("b.."));
        assertTrue(design.search(".c."));
        assertTrue(design.search("..."));
        assertFalse(design.search("...."));
        assertFalse(design.search("..b"));
        assertFalse(design.search("ab"));
        assertFalse(design.search("a."));
    }

    @Test
    public void test2() {
        String reg = ".*a";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher("a");
        assertTrue(matcher.find());
    }

    @Test
    public void test3() {
        design.addWord("a");
        design.addWord("a");
        assertFalse(design.search(".a"));
        assertFalse(design.search("a."));
    }

    /**
     * ["WordDictionary","addWord","addWord","addWord","addWord","addWord","addWord","addWord","addWord","search","search","search","search","search","search","search","search","search","search"]
     * [[],["ran"],["rune"],["runner"],["runs"],["add"],["adds"],["adder"],["addee"],["r.n"],["ru.n.e"],["add"],["add."],["adde."],[".an."],["...s"],["....e."],["......."],["..n.r"]]
     *
     * [null,null,null,null,null,null,null,null,null,true,false,true,true,true,false,true,true,false,false]
     */
    @Test
    public void test4() {
        design.addWord("ran");
        design.addWord("rune");
        design.addWord("runner");
        design.addWord("runs");
        design.addWord("add");
        design.addWord("adds");
        design.addWord("adder");
        design.addWord("addee");

        assertTrue(design.search("r.n"));
        assertFalse(design.search("ru.n.e"));
        assertTrue(design.search("add"));
        assertTrue(design.search("add."));
        assertTrue(design.search("adde."));

        assertFalse(design.search(".an."));
        assertTrue(design.search("...s"));
        assertTrue(design.search("....e."));
        assertFalse(design.search("......."));
        assertFalse(design.search("..n.r"));
    }

}