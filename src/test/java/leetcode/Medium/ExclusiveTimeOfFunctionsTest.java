package leetcode.Medium;

import org.junit.Test;

import java.util.Arrays;

public class ExclusiveTimeOfFunctionsTest {
    @Test
    public void exclusiveTime() throws Exception {

        System.out.println(Arrays.toString(new ExclusiveTimeOfFunctions().exclusiveTime(1,
                Arrays.asList(
                        "0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"
                ))));

        System.out.println(Arrays.toString(new ExclusiveTimeOfFunctions().exclusiveTime(1,
                Arrays.asList(
                        "0:start:0", "0:start:1", "0:start:2", "0:end:3", "0:end:4", "0:end:5"
        ))));

    }

}