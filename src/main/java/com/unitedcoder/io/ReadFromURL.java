package com.unitedcoder.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReadFromURL {
    public static void main(String[] args) throws IOException {
        List<String> webSites=new ArrayList<>();
        webSites.add("https://www.google.com");
        webSites.add("https://www.unitedcoder.com");

        for(String website:webSites){
            URL url=new URL(website);
            BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine=in.readLine())!=null){
                System.out.println(inputLine);
            }
            in.close();
        }

    }
}
