import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void URLCheck() throws URISyntaxException
    {
        Handler h = new Handler();
        URI rootPath = new URI("http://localhost/");
        assertEquals(rootPath, "test");
    }
}
