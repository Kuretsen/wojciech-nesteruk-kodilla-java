package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        //Given
        FileReader fileReader = new FileReader();
        //When & then
        assertDoesNotThrow(() -> fileReader.readFile());
    }
    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        //When & then
        assertThrows(FileReaderException.class, () ->fileReader.readFile(fileName));
    }
    @Test
    void testReadFileWithName() {
        //Given
        FileReader fileReader = new FileReader();
        //When & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
    @Test
    void testProbablyIWillThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.3));
    }

    @Test
    void testIWillThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(4, 1.8));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 1.8));
    }
}
