
# Easy Logger for Java and Kotlin

[![Release](https://jitpack.io/v/stasbar/easy-logger.svg)]
(https://jitpack.io/#stasbar/easy-logger)

## Usage:
### Debug
`Logger.d("Start loading...")`
>🐛[DEBUG][20:08:28] Start loading...

### Error
`Logger.err("User not found")`
>❗[ERROR][20:12:38] User not found

### Info
`Logger.info("Successfuly downloaded item")`
>ℹ[INFO][20:12:38] Successfuly downloaded item

You can also pass TAG argument which is `optional`
for example
`Logger.d("MainActivity", "Hello World !")`
>🐛[DEBUG][20:08:28][MainActivity] Hello World !

## Dependency
### Gradle
**Step 1.** Add it in your root build.gradle at the end of repositories:

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**Step 2.** Add the dependency
```gradle
	dependencies {
	        implementation 'com.github.stasbar:easy-logger:1.2'
	}
```
## Maven
**Step 1.** Add the JitPack repository to your build file
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

**Step 2.** Add the dependency
```xml
	<dependency>
	    <groupId>com.github.stasbar</groupId>
	    <artifactId>easy-logger</artifactId>
	    <version>1.2</version>
	</dependency>

```


