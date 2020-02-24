package CodeWars;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShorterWordTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, ShorterWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShorterWord.findShort("turns out random test cases are easier than writing out basic ones"));
    }


}