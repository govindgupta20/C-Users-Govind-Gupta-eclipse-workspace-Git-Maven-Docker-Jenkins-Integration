created Maven project
added required dependecy 
added some textng cases that can run on docker
created bat file to start/stop the docker container , used docker-dompose file to setup the container
created testng file and execute all the cases
setup testng file configuration in pom.xml

pre-requisiet

java,maven,docker,jenkins should be pre-install on your machine.

Steps to execute -

create maven specif job in jenkins
provide git path and pom.xml path
add mvn clean install command
apply and save the changes
run the build.
