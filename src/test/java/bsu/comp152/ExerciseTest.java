package bsu.comp152;

import org.junit.jupiter.api.Test;

public class ExerciseTest {
    @Test
    void testOnFirstInputs(){
        assert(Exercise.percentage(365, 365) == 100.0);
    }

    @Test
    void testOnSecondInputs(){
        assert(Exercise.percentage(182, 365) == 49.86301369863014);
    }

    @Test
    void testOnThirdInputs(){
        assert(Exercise.percentage(54, 365) == 14.794520547945206);
    }

    @Test
    void testOnFourthInputs(){
        assert(Exercise.percentage(301, 366) == 82.24043715846994);
    }

}
