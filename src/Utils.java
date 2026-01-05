import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public interface Utils {

    void ImageSrc(URI url) throws MalformedURLException, URISyntaxException;
}


class UtilsClass implements Utils {

    @Override
    public void ImageSrc(URI url) throws MalformedURLException, URISyntaxException {
        ImageSrc(URI.create(String.valueOf(url)).toURL().toURI());
    }

}