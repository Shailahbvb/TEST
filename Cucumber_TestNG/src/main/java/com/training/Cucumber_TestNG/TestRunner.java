package com.training.Cucumber_TestNG;

import org.junit.runner.Runner;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
 features = "com.training.Cucumber_TestNG"
 ,glue={"stepDefinition"}
 )
public class TestRunner {

}
