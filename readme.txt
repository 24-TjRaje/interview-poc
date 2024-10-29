Explain actuator in springboot

1. Spring boot actuator is a concept which enables features like application health, beans, request monitoring, metrics info etc. which makes our spring boot application production ready without implementing this requests seperately/

2. To enable actuator, add the below dependency in the pom.xml

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

3. By default, the context path for actuator endpoint is '/actuator' and only the '/health' endpoint is enabled by default

4. Important application properties for actuator

> management.endpoints.web.base-path = /your_value : Changes the base path for your actuator endpoints. default base path is /actuator

> management.endpoints.web.exposure.include = * : Enables all the default actuator endpoints. There are total 14 default actuator endpoints. we can also specify specific names seperated by commas in values

> management.endpoints.web.exposure.exclude=shutdown : Disables specific default actuator endpoints.

> management.endpoint.{default_endpoint}.enabled=true : Enable/disable a specific endpoint

> management.endpoint.env.show-values=ALWAYS/NEVER : Shows masked data of the env endpoint

> management.info.env.enabled=true : Show custom data in the info endpoint

5. Default actuator endpoints:

> /health : Tells whether the application is UP(Running)/DOWN(not running).

> /beans : Tells us all the beans in our application bean factory with their details

> /conditions : Tells us details about conditions regarding the auto-configuration

> /configprops : Tells us details of all @ConfigurationProperties beans.

> /env : Tells us details related to environment variables of the application and the system environment variables on which the application is hosted on

> /heapdump : Return heapdump of JVM used by the application

> /loggers : Displays log levels of our application

> /scheduledtasks : Display details regarding scheduled tasks in our application

> /threaddump : Display details related to threads of underlying JVM

> the base-path : return list of all the actuator endpoints exposed by the application

> /mappings : returns the details of all the endpoints exposed by the running application

> /metrics : returns a list of metric values for which the data can be queried

> /metrics/your_metric_value : returns data related to the metric_value present in the metrics array.

> /shutdown : a post endpoint with no body which shuts down the application

6. Creating custom actuator endpoints

> Create class and annotate it with @Component and @Endpoint.

- @Component : Used to register beans for the class that will be managed by spring

	1. value = used to provide name to the bean. default will be name of the class in camelCase
	2. scope = used to provide bean scope. Default is singleton

- @Endpoint	: Used to mark a class that can have a custom actuator feature as endpoint

    1. id = name of your custom actuator endpoint

> Custom actuator only support @ReadOperation(Get operation), @WriteOperation(Post operation) and @DeleteOperation( Delete Operation). Create public methods and annotate them with the type of HTTP endpoint you want to expose as actuator.

- @ReadOperation : makes the actuator endpoint accessible as a http get method

- @WriteOperation : makes the actuator endpoint accessible as a http post method

- @DeleteOperation : makes the actuator endpoint accessible as a http delete method

> Run the application and access you custom endpoints on base-path/id. If not available, enable the custom endpoint explicitly.

7. Import the actuator-postman-collection.json in your postman to test the developed APIS.