package com.google.pages;

import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object Model representing Homepage.
 */
public class BasePage {

	public BasePage(){
		PageFactory.initElements(Driver.get(), this);
	}

		 // Opens homepage
		public void navigateToHomePage() {
			Driver.get().get(ConfigurationReader.get("url"));
			Driver.get().manage().window().maximize();
		}
}
