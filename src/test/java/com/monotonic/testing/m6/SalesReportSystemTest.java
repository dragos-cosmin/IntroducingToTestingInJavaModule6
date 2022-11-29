package com.monotonic.testing.m6;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;


public class SalesReportSystemTest {
    @Test
    public void shouldPrintStoreReportForSampleData(){

        ApplicationRunner runner=new ApplicationRunner();
        String report=runner.run("src/main/resources/example-sales.csv");

        assertThat(report,containsString("- London          -    235 -"));

    }
}
