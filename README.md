# selenium-grid-docker-compose

1: Run with
   $ docker-compose up
	 
2: Selenium Grid ui
    http://localhost:4444/ui
    You will see ui like below, you can see nodes created there
![image](https://github.com/atulchavan10000/selenium-grid-docker-compose/assets/16905901/d12d496f-d0d1-44a2-a080-d61691a862ad)


3: You can scale the nodes with below command
   $ docker-compose up --scale chrome=3

4: run your tests from testng.xml file

5: After stopping the docker compose you will see videos recorded on this path on you local machine
./tmp/videos
This folder needs to be created where the docker-compose file is present.

6: You can also run tests with maven
   With eclipse Run As "maven test"
