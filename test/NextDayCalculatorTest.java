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
    @org.junit.jupiter.api.Test
    @DisplayName("case 31/1/2018")
    void tesDay31Month1Year2018() {
        int dayTest=31;
        int monthTest=1;
        int yearTest=2018;
        String expected="1/2/2018";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("case 30/4/2018")
    void tesDay30Month4Year2018() {
        int dayTest=3;
        int monthTest=4;
        int yearTest=2018;
        String expected="1/5/2018";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
}