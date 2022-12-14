package com.monotonic.testing.m6;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class SalesRepositoryTest {

    @Test
    public void shouldLoadSampleData(){
        SalesRepository repository=new SalesRepository("src/main/resources/example-sales.csv");

        List<Sale> sales=repository.loadSales();


        //London, 2, 30
        assertThat(sales,hasItem(allOf(
                hasProperty("store",equalTo("London")),
                hasProperty("number",equalTo(2)),
                hasProperty("pricePerItem",equalTo(30))
        )));



    }
}
