# selenium-grid-docker-compose

When you run the test, the suite is configured to start docker compose and then run the test suite
Once finished it also does docker compose down, for all this, we have windows batch file, which will be invoked in @BeforeTest and @AfterTest

1: run your tests from testng.xml file	

2: You can also run tests with maven
   With eclipse Run As "maven test"

3: Selenium Grid ui
    http://localhost:4444/ui
    You will see ui like below, you can see nodes created there
![image](https://github.com/atulchavan10000/selenium-grid-docker-compose/assets/16905901/d12d496f-d0d1-44a2-a080-d61691a862ad)


4: After stopping the docker compose you will see videos recorded on this path on you local machine
./tmp/videos
This folder needs to be created where the docker-compose file is present, currently i added it as part of project.



