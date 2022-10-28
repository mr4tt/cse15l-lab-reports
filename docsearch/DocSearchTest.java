import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void URLCheck() throws URISyntaxException, IOException
    {
        Handler h = new Handler("technical/biomed/");
        URI rootPath = new URI("http://localhost/");
        assertEquals(h.handleRequest(rootPath), "There are 837 files to search");
     }
}
