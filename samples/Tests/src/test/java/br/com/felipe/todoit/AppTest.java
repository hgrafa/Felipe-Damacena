package br.com.felipe.todoit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void GivenTwoNumbersWhenCallSumThenShouldReturnTheSum() {
        // given when then
        // arrange act assert

        // arrange / given
        double a = 2, b = 3;
        double expectedResult = 5;

        // when / act
        double result = App.sum(a, b);

        // then / assert
        assertEquals(result, expectedResult);
    }

    @Test
    public void ShouldReturnTheAverageScoreForTwoGivenScores() {
        double score1 = 7.0, score2 = 9.0;
        double expectedAverageScore = 8.0;

        double averageScore = App.calcularMediaEntreDuasNotas(score1, score2);

        assertEquals(averageScore, expectedAverageScore);
        assertTrue(averageScore >= 0);
    }

    @ParameterizedTest
    @CsvSource({
            "Hello, Hi",
            "Hi, Hello"
    })
    public void ShouldReturnHelloWhenSayHi(String welcomeMessage, String expectedMessage) {

        String messageRecieved = App.comprimentar(welcomeMessage);

        assertEquals(messageRecieved, expectedMessage);
    }



}
