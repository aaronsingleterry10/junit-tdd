import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void isCodeupSameAsCodeUp() {
        String expected = "CodeUp";
        String actual = "Codeup";
        assertNotEquals(expected, actual);
    }

    @Test
    public void areArrayListsTheSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }
}
