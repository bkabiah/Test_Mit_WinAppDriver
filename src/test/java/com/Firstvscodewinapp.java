package com;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class Firstvscodewinapp {

    public static void main(String[] args) throws InterruptedException, IOException {

        String ServerPath = "C:\\Program Files (x86)\\Windows Application Driver";

        ProcessBuilder builder = new ProcessBuilder(ServerPath).inheritIO();
        Process process = builder.start();

        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability("app", "C:\\Program Files (x86)\\OpenOffice 4\\program ");
        cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

        WindowsDriver<WindowsElement> driver = new WindowsDriver<WindowsElement>(new URL(" http://127.0.0.1:4723/"), cap);

        driver.findElementByAccessibilityId("num7Button ").click();
        driver.findElementByAccessibilityId("plusButton").click();
        driver.findElementByAccessibilityId("num6Button").click();
        driver.findElementByAccessibilityId("equalButton").click();

        Thread.sleep(5000);

        driver.quit();

        process.destroy();

       


    }
        

    
}
