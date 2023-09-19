package com.minutes.mokito.mokitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25,result);
    }
}

class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData(){
        return new int[]{25,15,5};
    }
}