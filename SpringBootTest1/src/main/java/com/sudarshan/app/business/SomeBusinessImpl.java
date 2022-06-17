package com.sudarshan.app.business;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sudarshan.app.data.SomeDataService;

public class SomeBusinessImpl {

    private SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}
    
    public Integer calculateSum(Integer[] data) {
        return Stream.of(data).collect(Collectors.summingInt(x->x));
    }

    public int calculateSumUsingDataService() {
		int[] data = someDataService.retrieveAllData();
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}
}
