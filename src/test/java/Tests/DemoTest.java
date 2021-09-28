package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utility.AllureReport;


    public class DemoTest  extends BaseTest {


        @BeforeMethod
        public void setupx() {
            System.out.println("Before Test");
        }

        @Test
        public void demoTest1() {
            System.out.println("Running Test");
        }

        @Test
        public void demoTest2() {
            System.out.println("Running Test");
        }

        @AfterMethod
        public void close() {
            System.out.println("After Test");
        }


    }


