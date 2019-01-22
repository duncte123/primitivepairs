[version]: https://api.bintray.com/packages/duncte123/maven/primitivepairs/images/download.svg
[download]: https://bintray.com/duncte123/maven/primitivepairs/_latestVersion
[travisBadge]: https://travis-ci.org/duncte123/primitivepairs.svg?branch=master
[travisLink]: https://travis-ci.org/duncte123/primitivepairs
[javaDocs]: https://jitpack.io/com/github/duncte123/primitivepairs/-SNAPSHOT/javadoc/

# Primitive Pairs for java [![Build Status][travisBadge]][travisLink]
A simple and lightweight library for storing primitives in pairs

## Adding to your project
The current latest version is: [ ![version][] ][download]

#### With gradle

```GRADLE
repositories {
    jcenter()
}

dependencies {
    implementation group: 'me.duncte123', name: 'primitivepairs', version: '[VERSION]'
}
```

#### With maven

```XML
<repository>
    <id>jcenter</id>
    <name>jcenter-bintray</name>
    <url>http://jcenter.bintray.com</url>
</repository>

<dependency>
  <groupId>me.duncte123</groupId>
  <artifactId>primitivepairs</artifactId>
  <version>[VERSION]</version>
  <type>pom</type>
</dependency>
```

Make sure to replace `[VERSION]` with the version listed above.

### Sample Usage

```java
LongBooleanPair pair = new LongBooleanPair(25L, false);

pair.setRight(true);

System.out.println(pair.getLeft());
System.out.println(pair.getRight());
```

For more info have a look at the [Javadocs][javaDocs]
