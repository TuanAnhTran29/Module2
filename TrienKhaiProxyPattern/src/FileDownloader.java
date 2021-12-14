import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private URL url;
    private URLConnection urlConnection;
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download() {
        try {
            url= new URL("https://i1-dulich.vnecdn.net/2021/07/16/2-1626444940.jpg?w=0&h=0&q=100&dpr=2&fit=crop&s=GdpJnWaNQO_98jsWySh9cA");
            urlConnection= url.openConnection();
            urlConnection.setRequestProperty("User-Agent",userAgent);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
