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
        Path fileName = Path.of("./test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), parser);
    }

    @Test
    public void testMarkdown1() throws IOException{
        Path fileName = Path.of("./test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), parser);
    }

    @Test
    public void testMarkdown2() throws IOException{
        Path fileName = Path.of("./test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html", ""), parser);
    }

    @Test
    public void testMarkdown3() throws IOException{
        Path fileName = Path.of("./test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html", "blank.com"), parser);
    }

    @Test
    public void testFiles2() throws IOException {
        Path fileName = Path.of("./testfiles/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }

    @Test
    public void testFiles3() throws IOException {
        Path fileName = Path.of("./testfiles/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFiles4() throws IOException {
        Path fileName = Path.of("./testfiles/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFiles5() throws IOException {
        Path fileName = Path.of("./testfiles/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFiles6() throws IOException {
        Path fileName = Path.of("./testfiles/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFiles7() throws IOException {
        Path fileName = Path.of("./testfiles/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFiles8() throws IOException {
        Path fileName = Path.of("./testfiles/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("a link on the first line"), links);
    }

    @Test
    public void testFiles9() throws IOException {
        Path fileName = Path.of("./testfiles/test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }
    
    @Test
    public void testSnip1() throws IOException {
        Path fileName = Path.of("./snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), links);
    }

    @Test
    public void testSnip2() throws IOException {
        Path fileName = Path.of("./snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void testSnip3() throws IOException {
        Path fileName = Path.of("./snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }
}