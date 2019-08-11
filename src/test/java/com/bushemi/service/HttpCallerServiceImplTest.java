package com.bushemi.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class HttpCallerServiceImplTest {

    private HttpCallerServiceImpl callerService = new HttpCallerServiceImpl();

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    public void test(String url, int responseCode) throws ExecutionException, InterruptedException {
        //When
        CompletableFuture<TouchResponse> completableFuture =
                callerService.callForUrl(url);

        //Then
        TouchResponse touchResponse = completableFuture.get();
        int resultCode = touchResponse.getCode();
        assertEquals(responseCode, resultCode);
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of("google.com", 200),
                Arguments.of("http://google.com", 200),
                Arguments.of("https://github.com", 200),
                Arguments.of("https://gitlab.com", 200),
                Arguments.of("http://google.com/admin", 404),
                Arguments.of("https://habr.com/ru/", 200),
                Arguments.of("https://www.darpa.mil/", 200),
                Arguments.of("https://petition.president.gov.ua/", 200),
                Arguments.of("http://government.ru/en/", 200),
                Arguments.of("http://zakupki.gov.ru", 200),
                Arguments.of("https://ze2019.com/", 200),
                Arguments.of("https://telegram.org/", 200),
                Arguments.of("grpc.io/", 200),
                Arguments.of("https://www.oracle.com/index.html", 200),
                Arguments.of("https://myrotvorets.center/", 200),
                Arguments.of("https://www.baeldung.com", 200),
                Arguments.of("https://www.udemy.com/", 403),
                Arguments.of("https://www.coursera.org/", 200),
                Arguments.of("https://www.epam.com", 200),
                Arguments.of("https://loopme.com/", 200),
                Arguments.of("http://www.mit.edu/", 200),
                Arguments.of("https://www.fox.com/fringe/", 200),
                Arguments.of("https://www.rottentomatoes.com", 200)
                );
    }

    @Test
    public void callForNullUrlShouldReturnNPE() {
        assertThrows(NullPointerException.class, () -> callerService.callForUrl(null));
    }

    @Test
    public void callForEmptyUrlShouldReturnIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> callerService.callForUrl(""));
    }

    @Test
    public void callForOnlySpacesUrlShouldReturnIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> callerService.callForUrl("   "));
    }
}
