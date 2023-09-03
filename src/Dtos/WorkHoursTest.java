package Dtos;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WorkHoursTest {

    @Test
    void testToString() {
        WorkHours sut = new WorkHours(LocalTime.parse("10:00"), LocalTime.parse("14:00"));
        assertEquals("10:00 - 14:00", sut.toString());
    }
}