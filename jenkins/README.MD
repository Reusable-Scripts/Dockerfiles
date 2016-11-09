#### FOR BUILDING JAVA CONTAINER ####

sudo docker build -t cypress/centos:java jenkins .
sudo docker run -d -it cypress/centos:java jenkins


#### FOR BUILDING TOMCAT CONTAINER ####

sudo docker build -t master1:jenkins .

sudo docker run -d -p 9090:8080 -p 9009:8009 -i -t master1:jenkins

sudo docker exec container-id ps -eaf|grep tomcat

