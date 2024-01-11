package LevelClassesTest;

import LevelClasses.lvl11;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl11Test {

    lvl11 testlvl = new lvl11();

    @Test
    public void checkRequirementsTest() {
        String inputTest1 = "testar1";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "testar9995I";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);

    }
}
