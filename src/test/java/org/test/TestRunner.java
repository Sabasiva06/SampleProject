package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "org.step" })

public class TestRunner {
	public static void main(String[] args) {
		System.out.println("my workk");
		System.out.println("dknkdvndskkvns");

	}

}
