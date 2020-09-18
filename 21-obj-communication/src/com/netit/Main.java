package com.netit;

import com.netit.downloader.Browser;

public class Main {

    public static void main(String[] args) {
//        TextSigniture signiture = new TextSigniture();
//        signiture.value = 14;
//
//        new SignitureCalculator(signiture.deepCopy());
//
//        System.out.println(signiture.value);

        new Browser().startDownload();
    }
}
