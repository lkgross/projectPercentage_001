package bsu.comp152;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {

    /*
     * Build a series of tests and check that each set of inputs results in the desired output.
     *
     * Think about all the different tests you can write to thoroughly test your code.
     *
     * Name tests very descriptively, so that you can easily see the significance of each test that passes and fails.
     *
     * Use failing tests to improve your code.
     *
     * Catch problems and correct them before users encounter them.
     *
     * Run the tests when you add more code and revise your code to make sure your changes don't "break" program's existing behavior. (Ensure passing tests continue to pass as you expand your code.)
     *
     * When you write unit test that "pass", you become confident that your code will work correctly as more colleagues and customers begin to use your programs.
     *
     */
    @Test
    void testOnFirstInputs(){
        assert(Exercise.percentage(365, 365) == 100.0);
    }

    @Test
    void testOnSecondInputs() {
        assert (Exercise.percentage(182, 365) == 49.86301369863014);
    }

    @Test
    void testOnThirdInputs() {
        assertEquals(Exercise.percentage(54, 365), 14.794520547945206, 10e-6);
    }

    @Test
    void testOnFourthInputs() {
        assert (Exercise.percentage(301, 366) == 82.24043715846994);
    }

}
