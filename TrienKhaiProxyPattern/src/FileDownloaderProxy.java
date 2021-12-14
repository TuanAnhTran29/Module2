public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;
    @Override
    public void download() {
        fileDownloader= new FileDownloader("Mozilla/5.0 (Windows; U; Windows NT 6.0; da; rv:1.9.0.18) Gecko/2010020220 Firefox/3.0.18");
        fileDownloader.download();
    }
}
