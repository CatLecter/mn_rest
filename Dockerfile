FROM centos:7.9.2009 as base

RUN yum update -y \
    && yum install -y wget \
    && wget https://download.oracle.com/java/20/latest/jdk-20_linux-x64_bin.rpm \
    && rpm -Uvh jdk-20_linux-x64_bin.rpm \
    && rm -f jdk-20_linux-x64_bin.rpm

ENV JAVA_HOME=/usr/lib/jvm/jdk-20-oracle-x64
ENV PATH=$PATH:$JAVA_HOME/bin
ENV CLASSPATH=.:$JAVA_HOME/jre/lib:$JAVA_HOME/lib:$JAVA_HOME/lib/tools.jar

FROM base

EXPOSE 8080

WORKDIR /usr/src/app

COPY target/mn_rest-0.1.jar mn_rest-0.1.jar

CMD java -Xmx512m -jar mn_rest-0.1.jar
