# kotlintest-spring
A module that allows kotlintest to work together with spring

## How it works
Basically, we wrote our own runner that first starts the Spring Runner and then executes the Kotlin Test runner.

Sadly, the Spring Runner delegates to a JUnit Runner which throws an Exception if there are no JUnit tests in the class.
That's why we added our own test that does nothing (currently called "loading").

In addition to that we enabled autowiring for the kotlin test spec classes by overwriting the beforeAll method and using a
static class to access the AutowireCapableBeanFactory.

## What do I need to do?
Instead of extending the normal *Spec classes you need to extend the Spring*Spec classes.

You also need to add the @EnableKotlinTest annotation to your test context in order for the static utility class to be
picked up.

## Download

Just use https://jitpack.io to download this project and depend on it with Maven or Gradle

```
<repository>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

And then add the dependency:

```
<dependency>
    <groupId>com.acomodeo</groupId>
    <artifactId>kotlintest-spring</artifactId>
    <version>master-SNAPSHOT</version>
    <scope>test</scope>
</dependency>
```

## Versioning

Internally we always use the master branch version of all libraries. This is reflected here. The library will always be backwards compatible.
If you do not want to "auto" update the library, feel free to just depend on a certain commit hash.

## License

For License information see the file LICENSE

