package com.minutes.mokito.mokitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataService dataServiceMock = mock(DataService.class);
//        dataServiceMock.retrieveAllData() => new int[]{25, 15, 5};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }
}

