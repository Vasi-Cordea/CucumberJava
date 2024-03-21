Project content, how it works
get source cod link: https://github.com/Vasi-Cordea/CucumberJava.git

Create a new feature like LoginDemo.feature by writing all steps in Cucumber with Given, And, When, Then
right click on [page and click: Run feature...
get the code structure from the console (or copy all steps from feature file (ex:   Given Browser is  then opened )
create a new  directory StepsDefinitions
paste all steps in the directory StepsDefinitions
change step structure as per: @Given("Browser is  then opened")  
import io.cucumber.java.en.Given;
create a function for each step as per example: public void browser_is_then_opened() {} , name does not have to match the step
crreat a new directory pages, 
creat class page with all the methods used on the page
instantiate methods in the Step definitions page (POM)
creat a test runner, from where the execution and reports will be configured
in runner class , right click and run
cheack report in target/Cucumber/HtmlReports
open report in Chrome, firefox

![reportCucumber](https://github.com/Vasi-Cordea/CucumberJava/assets/150058199/fe661222-5281-4fdc-ae32-e3ec0dcf3fac)
