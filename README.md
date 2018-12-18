# MyJava

為了快速開發 Java / Android 程式而生的函式庫

[![](https://jitpack.io/v/chenFlyingkite/MyJava.svg)](https://jitpack.io/#chenFlyingkite/MyJava)

一般的 Java Project 從 IntelliJ 建立時候要選:

File > New Project > Gradle > Select "Java", "Kotlin" -> ArtifactId = 新的專案名稱, GroupID 設定成

com.github.chenFlyingkite


1. **引用 library 使用的 project : 參考 [jitpack][1]**
* 在 build.gradle 加上
```gradle
allprojects {
    repositories {
        maven {
            url "https://jitpack.io" 
        }
    }
}
```

* 在 yourLib/build.gradle 加上
```gradle
dependencies { 
    ...
    //api 'com.github.User:Repo:Tag' // or implementation
    api "com.github.chenFlyingkite:MyJava:1.0.0.0"
}
```
[1]: https://jitpack.io/
