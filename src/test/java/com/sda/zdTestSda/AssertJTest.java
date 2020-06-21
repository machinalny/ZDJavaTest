package com.sda.zdTestSda;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class AssertJTest {

    @Test
    public void assertJTest(){
        String[] textArray = {"Text", "otherText"};
        assertThat(textArray)
                .hasSize(2)
                .contains("Text", "otherText");
    }

}
