#### CREATING A DATA CONTAINER TO USE AS JENKINS_HOME DIRECTORY and MOUNTING THIS DIRECTORY TO HOST MACHINE /data/jenkins DIRECTORY ####
 sudo docker build -it jenkins:data .
 
 sudo docker run -v /data/jenkins:/data/jenkins -d -it jenkins:data

sudo docker run --name JENKINS_HOME -v /data/jenkins:/data/jenkins/.jenkins -d -it jenkins:data

-v  -> to copy files from host to docker container
docker cp container-id:directory ./directory  --> to copy files from container to host



#### FOR BUILDING JAVA CONTAINER ####

sudo docker build -t cypress/centos:java jenkins .

sudo docker run -d -it cypress/centos:java jenkins


#### FOR BUILDING TOMCAT CONTAINER ####

sudo docker build -t master1:jenkins .

sudo docker run -d --name master1-jenkins -p 9090:8080 -p 9009:8009 -i -t master1:jenkins

sudo docker run -d --name master2-jenkins -p 9091:8080 -p 9010:8009 -i -t master1:jenkins

sudo docker exec container-id ps -eaf|grep tomcat

