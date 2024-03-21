Project content, how it works
get source cod link: https://github.com/Vasi-Cordea/CucumberJava.git

1. Create a new feature like LoginDemo.feature by writing all steps in Cucumber with Given, And, When, Then
2. right click on [page and click: Run feature...
3. get the code structure from the console (or copy all steps from feature file (ex:   Given Browser is  then opened )
4. create a new  directory StepsDefinitions
5. paste all steps in the directory StepsDefinitions
6. change step structure as per: @Given("Browser is  then opened")  
7. import io.cucumber.java.en.Given;
8. create a function for each step as per example: public void browser_is_then_opened() {} , name does not have to match the step
9. create a new directory pages, 
10. creat class page with all the methods used on the page
11. instantiate methods from page class in the Step definitions page  (POM)
12. creat a test runner, from where the execution and reports will be configured
in runner class , right click and run
13. cheack report in target/Cucumber/HtmlReports
14. open report in Chrome, firefox

![reportCucumber](https://github.com/Vasi-Cordea/CucumberJava/assets/150058199/fe661222-5281-4fdc-ae32-e3ec0dcf3fac)


made by Vasi-Cordea
