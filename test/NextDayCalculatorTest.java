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
    @DisplayName("case2 31/1/2018")
    void tesDay31Month1Year2018() {
        int dayTest=31;
        int monthTest=1;
        int yearTest=2018;
        String expected="1/2/2018";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("case3 30/4/2018")
    void tesDay30Month4Year2018() {
        int dayTest=30;
        int monthTest=4;
        int yearTest=2018;
        String expected="1/5/2018";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("case4 28/2/2018")
    void tesDay28Month2Year2018() {
        int dayTest=28;
        int monthTest=2;
        int yearTest=2018;
        String expected="1/3/2018";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("case5 29/2/2020")
    void tesDay29Month2Year2020() {
        int dayTest=29;
        int monthTest=2;
        int yearTest=2020;
        String expected="1/3/2020";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("case5 31/12/2018")
    void tesDay31Month12Year2018() {
        int dayTest=31;
        int monthTest=12;
        int yearTest=2018;
        String expected="31/12/2018";
        String result=NextDayCalculator.nextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
}