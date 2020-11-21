package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "org.step" })

public class TestRunner {
public static void main(String[] args) {
	System.out.println("hii ");
	System.out.println("first day work");
	System.out.println("work is going to completed");
}
}
