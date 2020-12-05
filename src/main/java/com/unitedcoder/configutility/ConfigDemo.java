package com.unitedcoder.configutility;

public class ConfigDemo {
    public static void main(String[] args) {
        String configFile="config.txt";
        ApplicationConfig.readConfigProperties(configFile,"produrl");
        ApplicationConfig.readConfigProperties(configFile,"qaurl");
        ApplicationConfig.readConfigProperties(configFile,"username");
        ApplicationConfig.readConfigProperties(configFile,"password");
        ApplicationConfig.readConfigProperties(configFile,"timeout");
        ApplicationConfig.readConfigProperties(configFile,"login");




    }
}
