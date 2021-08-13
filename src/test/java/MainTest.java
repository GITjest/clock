import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNoParameters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Main.main(new String[0]));

        assertEquals(exception.getMessage(), "Where is the time?");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenParameterDoesNotHaveMinute() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Main.main(new String[]{"12:"}));

        assertEquals(exception.getMessage(), "Incorrect time format");
    }

}