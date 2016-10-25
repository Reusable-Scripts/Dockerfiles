FROM centos:base

MAINTAINER Rakesh Dama

RUN yum -y install curl && \
    yum -y install glibc.i686 && \
    curl -L -O -H "Cookie: oraclelicense=accept-securebackup-cookie" -k "https://edelivery.oracle.com/otn-pub/java/jdk/8u20-b26/jdk-8u20-linux-i586.tar.gz" && \
    tar -zxvf jdk-8u20-linux-i586.tar.gz && \
    mv jdk1.8* /opt/java/

WORKDIR /opt/java/

RUN alternatives --install /usr/bin/java jar /usr/java/latest/bin/java 200000 && \
    alternatives --install /usr/bin/javaws javaws /usr/java/latest/bin/javaws 200000 && \
    alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 200000 && \
    yum clean all

ENV JAVA_HOME /opt/java/
ENV JRE_HOME $JAVA_HOME/jre/

ENV PATH $PATH:$JAVA_HOME/bin:$JRE_HOME/bin
