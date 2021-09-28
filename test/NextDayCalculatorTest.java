import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("case 1/1/2018")
    void tesDay1Month1Year2018() {
        int dayTest=1;
        int monthTest=1;
        int yearTest=2018;
        String expected="2/1/2018";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
}