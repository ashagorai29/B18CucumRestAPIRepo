package com.basic.getRequestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun=true,
		features ={"src/test/resources/com/basic/getRequestFF/"},
		glue={"com/basic/getRequestSD/"}

)
public class RunGetRequestTest {

}
