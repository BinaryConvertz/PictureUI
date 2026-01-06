import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpRequest;

public class WebClients {

    public static URI GetServerClient(URL url) throws URISyntaxException {

       HttpRequest req = HttpRequest.newBuilder().uri(
                URI.create(String.valueOf(url.toURI()))
        ).build();



        return req.uri();
    }

}