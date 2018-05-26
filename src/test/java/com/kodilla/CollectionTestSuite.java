package com.kodilla;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Test
   public void testOddNumbersExterminatorEmptyList (){
        //given
        OddNumbersExterminator underTest = new OddNumbersExterminator();

        //when
        List<Integer> result=underTest.exterminate(new ArrayList<>());

        //then
        Assert.assertEquals(result.size(),0);
   }

    @Test
   public void testOddNumbersExterminatorNormalList (){
        //given
        OddNumbersExterminator underTest = new OddNumbersExterminator();
        List<Integer> testData=new ArrayList<>();
        testData.add(3);
        testData.add(2);
        testData.add(7);
        testData.add(9);

        //when
        List<Integer> result=underTest.exterminate(testData);

        //then
        Assert.assertEquals(result.size(),1);
        Assert.assertEquals(result.get(0),Integer.valueOf(2));

   }
}
