package com.ct.threelayer.api;

import com.ct.adapters.GeoAdapter;
import com.ct.adapters.HttpGeoAdapter;
import com.ct.threelayer.data.TieredListUserRepository;
import com.ct.threelayer.service.TieredUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HttpUserApiTest {

    private HttpUserApi sut;

    @Test
    public void saveHappyPathWithMock() {
        var testZip = 32818;

        HttpGeoAdapter geoAdapterMock = Mockito.mock(HttpGeoAdapter.class);
        Mockito.when(geoAdapterMock.findCityByZipCode(testZip))
                .thenReturn("Orlando");

        sut = new HttpUserApi(new TieredUserService(
                geoAdapterMock,
                new TieredListUserRepository())
        );
        var name = "joe";
        var result = sut.createUser(
                CreateUserRequest.builder()
                        .name(name)
                        .zipCode(testZip)
                        .password("sdas")
                .build());
        Assertions.assertEquals(name, result.getName());
        Assertions.assertEquals("Orlando", result.getCity());
    }

    @Test
    public void saveHappyPathWithOverride() {
        var testZip = 32818;

        sut = new HttpUserApi(new TieredUserService(
                new TestGeoAdapter(),
                new TieredListUserRepository())
        );
        var name = "joe";
        var result = sut.createUser(
                CreateUserRequest.builder()
                        .name(name)
                        .zipCode(testZip)
                        .password("sdas")
                        .build());
        Assertions.assertEquals(name, result.getName());
        Assertions.assertEquals("Orlando", result.getCity());
    }

    public static class TestGeoAdapter implements GeoAdapter {

        @Override
        public String findCityByZipCode(int zipCode) {
            if (zipCode == 32818) {
                return "Orlando";
            }

            return null;
        }
    }

}