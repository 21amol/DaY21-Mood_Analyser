package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    MoodAnalyser mood = new MoodAnalyser(null);

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        String actual = mood.analyseMood();
        assertEquals("SAD",actual);
    }
}
