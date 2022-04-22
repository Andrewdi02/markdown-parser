import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testMarkdown() throws IOException{
        Path fileName = Path.of("C:/Users/mario/OneDrive/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), parser);
    }
    @Test
    public void testMarkdown1() throws IOException{
        Path fileName = Path.of("C:/Users/mario/OneDrive/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), parser);
    }
    @Test
    public void testMarkdown2() throws IOException{
        Path fileName = Path.of("C:/Users/mario/OneDrive/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html", ""), parser);
    }
    @Test
    public void testMarkdown3() throws IOException{
        Path fileName = Path.of("C:/Users/mario/OneDrive/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html", "blank.com"), parser);
    }
}