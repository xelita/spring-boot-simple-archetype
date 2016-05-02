# spring-boot-simple-archetype
Maven archetype to create a simple Spring Boot application composed of a simply Spring Rest Controller.

## Usage

### Installing the archetype
To play with the Spring Boot archetype, first you need to install it.

``` bash
$ mvn clean install
```

### Generating your project
Then, to generate your project you need to rely to your local archetypes catalog.

``` bash
$ mvn archetype:generate -DarchetypeCatalog=local
```

At this time, you are able to parametrize your application accordingly by giving its groupId, artifactId, main package, ...
Once everything is done your application is generated in a folder with the artifactId name.

### Launching the generated application
To launch the application, go into the freshly generated folder, then type:

``` bash
$ cd <generated_folder> && mvn mvn spring-boot:run
```

or

``` bash
$ cd <generated_folder> &&mvn clean package && java -jar target/<your_generated_jar>.jar
```
