# VossWebAutomation

## Project Type
Java Maven Project
## Design Pattern
 Modularised Page Object Model
 
 ## Testing Framework
 TestNG
## Reports

 Extent Reports 

## Driver
## Web Drivers

- macOS ChromeDriver
- macOS firefox
- Windows firefox
- Windows Chromedriver---default
 - NB To run the test on Windows with firefox. Go to the DataProviderObject class in the Utils package and replace the  "chrome" with "firefox" in the array object.
 - NB To run the test on macOS. Go to the DataProviderObject class in the Utils package and replace the  "chrome" with "macchrome" in the array object.
 - NB To run the test on macOS with firefox. Go to the DataProviderObject class in the Utils package and replace the  "chrome" with "MacFirefox" in the array object.


## TESTS
 #### Web Tests 
- Coverage 100% - LoginTest
- Coverage 100% - FillOutFormsTest
- Coverage 100% - PurchaseBasicPackageTest
## RUN Test
##### How to run WEB Tests
###### LoginTest 
  - Open Web Module, Navigate to the Test package within the Java folder.
  - Right Click on the LoginTest class and select RUN LoginTest.
  - NB Disable the captcha or else the test will fail after the sign in button is clicked.
  - NB To view the screenshot in the report, copy the absolute path of the report and paste it in the browser url bar and click hit Enter.

###### FillOutFormsTest 
  - Open Web Module, Navigate to the Test package within the Java folder.
  - Right Click on the FillOutFormsTest class and select RUN FillOutFormsTest.
###### PurchaseBasicPackageTest
  - Open Web Module, Navigate to the Test package within the Java folder.
  - Right Click on the PurchaseBasicPackageTest class and select RUN PurchaseBasicPackageTest.
##### Reports
  - Open Web Module, Navigate to ExtentReports folder.
  - Open the htExtentReportResultsml.html report with chrome browser.

