package kyu_8;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}