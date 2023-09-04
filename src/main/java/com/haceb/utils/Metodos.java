package com.haceb.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Metodos extends PageObject{

    //Metodo para mover el mouse a un elemento
    public void realizarHover(WebElementFacade webElementFacade) {
        withAction().moveToElement(webElementFacade).build().perform();
    }

    public void check(WebDriver driver, WebElementFacade webElement){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", webElement);
    }

    public WebElement seleccionarAleatoriamente(List<WebElement> webElementList){
        int size = webElementList.size()-1;
        int randomItem = (int) Math.round(Math.random() * size);
        return webElementList.get(randomItem);
    }

    public void switchToPage(WebDriver driver, Integer numero){
        String windowHadle = driver.getWindowHandles().toArray()[numero].toString();
        driver.switchTo().window(windowHadle);
    }
}
