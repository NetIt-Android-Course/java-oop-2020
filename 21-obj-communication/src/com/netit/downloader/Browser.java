package com.netit.downloader;

public class Browser {

    public void startDownload() {
        final boolean[] isDownloading = {true};
        final String[] result = {""};

        DownloadListener listener = new DownloadListener() {
            @Override
            public void onDownloadCompleted(String picture) {
                isDownloading[0] = false;
                result[0] = picture;
            }
        };

        download(listener);

        while (isDownloading[0]) {
            System.out.print(".");
        }
        System.out.println(result[0]);
    }

    private void download(DownloadListener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                listener.onDownloadCompleted("qka snimka");
            }
        }).start();
    }

    public interface DownloadListener {
        void onDownloadCompleted(String picture);
    }
}
