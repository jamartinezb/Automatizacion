package DefinicionPasos;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Formulario {

    WebDriver driver;

    @Dado("que la pagina este habilitada")
    public void que_la_pagina_este_habilitada() {
        //Inicio del navegador
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://utest.com/");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }
    @Cuando("registre la informacion")
    public void registre_la_informacion() {
        //Join
        driver.findElement(By.className("unauthenticated-nav-bar__sign-up")).click();
        //Personal
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.id("firstName")).sendKeys("Jhon Alexander");
        driver.findElement(By.id("lastName")).sendKeys("Martinez Becerra");
        driver.findElement(By.id("email")).sendKeys("jhonmartinez@gmail.com");
        driver.findElement(By.id("birthMonth")).sendKeys("September");
        driver.findElement(By.id("birthDay")).sendKeys("10");
        driver.findElement(By.id("birthYear")).sendKeys("1993");

        //Next
        driver.findElement(By.className("row")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a")).click();

        //Address
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        //Address-City
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/input")).sendKeys("Ibagué");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/input")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        //Address-Zip or Postal Code
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input")).clear();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input")).sendKeys("730003");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        //Address-Country
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]")).sendKeys("Colombia");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul/li/div[3]/span")).click();
        WebDriverWait wait1PC = new WebDriverWait(driver,3);
        //Next
        driver.findElement(By.className("row")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a")).click();

        //Devices
        //Computer
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]")).sendKeys("Windows");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

        //Computer-Version
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]")).sendKeys("Windows 10");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        //WebDriverWait wait1PC = new WebDriverWait(driver,4);
        //driver.findElement(By.className("ui-select-choices-row-inner")).click();

        //Computer-Version-Language
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]")).sendKeys("Spanish");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

        //Mobile
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]")).sendKeys("LG");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[3]/span")).click();

        //Mobile-Model
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]")).sendKeys("X3");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[3]/span")).click();

        //Mobile-Operating System
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]")).sendKeys("Android");
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span")).click();
        //Next
        driver.findElement(By.className("container-fluid")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a")).click();

        //Complete
        //Create your uTest password
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.id("password")).sendKeys("aNr4cKFqcQ68c2@");
        //Confirm password
        driver.findElement(By.id("confirmPassword")).sendKeys("aNr4cKFqcQ68c2@");
        //check list
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]")).click();
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]")).click();

        //Next
        driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a")).click();
    }

    @Entonces("se muestra registro correcto")
    public void se_muestra_registro_correcto() {

        //Mostrar en consola info despues del login.
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        System.out.printf(driver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1")).getText());
        driver.close();
    }
}
