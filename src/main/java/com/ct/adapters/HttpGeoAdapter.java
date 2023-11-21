package com.ct.adapters;

public class HttpGeoAdapter implements GeoAdapter {

    private String apiKey;

    private String httpBaseUrl;

    private Object httpClient;


    public String findCityByZipCode(int zipCode) {
        //makes a GET HTTP request out to a 3rd party geo service that allows us to find
        // a city name from a given zip code
        // returns the city name
        // var json = httpClient.get(httpBaseUrl, apikey).execute();
        System.out.println("calling geo service");
        return "";
    }

}
