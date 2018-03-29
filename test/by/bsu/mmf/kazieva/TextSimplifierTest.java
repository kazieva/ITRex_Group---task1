package by.bsu.mmf.kazieva;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextSimplifierTest {

    @Test
    public void simplifyText() throws Exception {
        String str = "cacao and coffee ";
        String result = TextSimplifier.simplifyText(str);
        String expected = "kakao and kofi ";
        assertEquals(expected, result);
    }

    @Test
    public void simplifyText1() throws Exception {
        String str = "success";
        String result = TextSimplifier.simplifyText(str);
        String expected = "sukses";
        assertEquals(expected, result);
    }

    @Test
    public void isSimpleText() throws Exception {
        String str = "cacao and coffee ";
        Boolean result = TextSimplifier.isSimpleText(str);
        assertFalse(result);
    }

    @Test
    public void isSimpleText1() throws Exception {
        String str = "kakao and kofi";
        Boolean result = TextSimplifier.isSimpleText(str);
        assertTrue(result);
    }

    @Test
    public void isSimpleText2() throws Exception {
        String str = "success";
        Boolean result = TextSimplifier.isSimpleText(str);
        assertFalse(result);
    }

    @Test
    public void isSimpleText13() throws Exception {
        String str = "sukses";
        Boolean result = TextSimplifier.isSimpleText(str);
        assertTrue(result);
    }

    @Test
    public void removeLetterC() throws Exception {
        String str = "success";
        String result = TextSimplifier.removeLetterC(str);
        String expected = "suksess";
        assertEquals(expected, result);
    }

    @Test
    public void removeDoubleLetter() throws Exception {
        String str = "ooo";
        String result = TextSimplifier.removeDoubleLetter(str);
        String expected = "uo";
        assertEquals(expected, result);
    }

    @Test
    public void removeDoubleLetter1() throws Exception {
        String str = "oou";
        String result = TextSimplifier.removeDoubleLetter(str);
        String expected = "u";
        assertEquals(expected, result);
    }

    @Test
    public void removeDoubleLetter2() throws Exception {
        String str = "iee";
        String result = TextSimplifier.removeDoubleLetter(str);
        String expected = "i";
        assertEquals(expected, result);
    }

    @Test
    public void removeLetterE() throws Exception {
        String str = "The table e";
        String result = TextSimplifier.removeLetterE(str);
        String expected = "Th tabl e";
        assertEquals(expected, result);
    }

    @Test
    public void removeArticles() throws Exception {
        String str = "The table";
        String result = TextSimplifier.removeArticles(str);
        String expected = "table";
        assertEquals(expected, result);
    }

    @Test
    public void removeArticles1() throws Exception {
        String str = "This is a table. He is a doctor. She is an artist.";
        String result = TextSimplifier.removeArticles(str);
        String expected = "This is table. He is doctor. She is artist.";
        assertEquals(expected, result);
    }

}