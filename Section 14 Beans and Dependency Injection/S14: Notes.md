## Beans and Dependency Injection
1. A bean is an object that lives inside the Spring Container.
2. As your @SpringBootApplication performs a @ComponentScan, a bean is created from classes marked with @Component.
3. @Controller, @Service and @Repository derive from @Component.
4. @Configuration: marks a class as a source for bean definitions.
5. @Bean: method-level annotation for bean definitions.
6. @Autowired injects the bean where it's needed.

### Defining Beans (Java)
```aidl
@Configuration
public class AppConfig {

    @Bean
    public SomeObject method() {
        return new SomeObject();
    }

}
```
### Defining Beans (XML)
`AppConfig.java`
```aidl
@Configuration
@ImportResource("app-config.xml")
public class AppConfig {

}
```
`app-config.xml`
```aidl
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">

	<bean id="choose a name for the bean" class="path to class"> </bean>

	<bean id="choose a name for the bean" class="path to class"> </bean>
</beans>
```