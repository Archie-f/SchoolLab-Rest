package com.cydeo.client;

import com.cydeo.dto.country.CountryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://restcountries.com", name = "COUNTRY-CLIENT")
public interface CountryApiClient {

    @GetMapping("/v3.1/name/{name}")
    List<CountryResponse> getCountry(@PathVariable("name") String country);
}
