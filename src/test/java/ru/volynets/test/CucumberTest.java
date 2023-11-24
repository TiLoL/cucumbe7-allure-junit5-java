package ru.volynets.test;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")
@IncludeEngines("cucumber")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "ru.volynets.test.steps")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@base")
public class CucumberTest {
}
