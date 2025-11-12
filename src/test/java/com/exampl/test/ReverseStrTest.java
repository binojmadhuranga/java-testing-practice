package com.exampl.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReverseStrTest {

    ReverseStr reverse = new ReverseStr();

    @Test
    void testReverse(){assertEquals("jonib",reverse.reverse("binoj"),"binoj should jonib");}

}
