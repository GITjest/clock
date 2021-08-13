import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenHourIsNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Clock.angle(-1, 0));

        assertEquals(exception.getMessage(), "Incorrect time format");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenMinuteIsNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Clock.angle(0, -1));

        assertEquals(exception.getMessage(), "Incorrect time format");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenHourIsGreaterThan23() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Clock.angle(24, 0));

        assertEquals(exception.getMessage(), "Incorrect time format");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenMinuteIsGreaterThan59() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Clock.angle(0, 60));

        assertEquals(exception.getMessage(), "Incorrect time format");
    }

    @Test
    public void shouldReturnAngleWhenParametersIsCorrect() {
        assertAll(
                () -> assertEquals(Clock.angle(12, 34), 187),
                () -> assertEquals(Clock.angle(6,0), 180),
                () -> assertEquals(Clock.angle(11, 59), 5.5),
                () -> assertEquals(Clock.angle(6, 59), 144.5),
                () -> assertEquals(Clock.angle(18, 34), 7),
                () -> assertEquals(Clock.angle(0, 30), 165),
                () -> assertEquals(Clock.angle(0, 0), 0)
        );
    }
}