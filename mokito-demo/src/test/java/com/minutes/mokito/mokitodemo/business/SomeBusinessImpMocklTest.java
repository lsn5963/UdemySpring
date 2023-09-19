package com.minutes.mokito.mokitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private SomeBusinessImpl businessImpl;
    @Test
    void findTheGreatestFromAllData_basicScenario(){
//        dataServiceMock.retrieveAllData() => new int[]{25, 15, 5};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }
}

