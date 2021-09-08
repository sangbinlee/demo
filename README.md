# Getting Started

###     -- is not allowed to connect to this MariaDB server
    create database db_example; -- Creates the new database
    create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
    grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database



# pom.xml 라이브러리 확인


# you can run the application by using 
	./mvnw spring-boot:run. 

# you can build the JAR file with 
	./mvnw clean package 
# and then run the JAR file, as follows: 
	java -jar target/gs-integration-0.1.0.jar
	
	
#	C:\Users\lsv40>curl localhost:80
		Greetings from Spring Boot!
#	C:\Users\lsv40>curl localhost:8080