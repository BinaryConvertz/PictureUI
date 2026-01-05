import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class HttpClients {

    public static void GetServerClient(URL url) throws URISyntaxException {


        HttpClient.newHttpClient();
        HttpRequest.newBuilder().uri(
                URI.create(String.valueOf(url.toURI()))
        ).build();

    }
}
