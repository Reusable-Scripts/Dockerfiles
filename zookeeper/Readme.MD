<B>commands to build and run docker containers:</B>

Base image: Centos7

#docker build -t centos:zookeeper .

#docker run -p 2181:2181 -p 2888:2888 -p 3888:3888 --name zookeeper1 centos:zookeeper

#docker exec containerid ps -eaf|grep zookeeper

<B>To Know IP address of docker containers:</B>

#docker inspect containerid   (or)

#docker inspect -f '{{.Name}} - {{.NetworkSettings.IPAddress }}' $(docker ps -aq)


