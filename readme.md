## Micronaut Features
Micronaut also has several features that make it an excellent framework for developing cloud-native applications.

### compile time dependency injection
Most frameworks use reflection and proxies to perform dependency injection at runtime. Micronaut, however, builds its dependency injection data at compile time. 

Fully supports JSR-330 annotations

### reactive programming
First class support for reactive programming, for both clients and servers.
RxJava and Project Reactor are supported.

### service discovery
- Eureka
- Consul

### distributed tracing
- Zipkin
- Jaeger

### aws lambda support

## Micronaut CLI

### install with SDKMAN
`$ sdk install micronaut 1.2.10`

installs all the binary files we'll need to build, test, and deploy Micronaut applications

### create project
`$ mn create-app <app name> --build maven`

#### add project to existing parent
- add `<parent>` in pom
- add `<modules>` in parent pom
- open pom, right click, maven -> unignore projects

### show commands & features
`$ mn profile-info service`

create beans, controllers, clients etc.

features include consul, eureka, flyway etc.


## Dependency Injection

#### @Inject
works just like @Autowired on fields, methods, constructors, and parameters 

#### @Singleton
By default, all beans are scoped as a **prototype**.
@Singleton creates a singleton bean.

#### @Primary
Deconflict multiple classes implementing the same bean interface

#### @Requires
Like @Conditional, can be used when beans are optional, or to only perform autowiring when certain conditions are met.


## Reactive HTTP
Netty is the underlying server used to handle HTTP requests.

Normally, the requests are handled on the main I/O thread 
pool that is created at startup, making them block.

When a non-blocking data type is returned from a controller 
endpoint, Micronaut uses the Netty event loop thread, making 
the whole request non-blocking.

## HTTP Client
write either **declarative** or **programmatic**