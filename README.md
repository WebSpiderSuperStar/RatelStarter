# Ratel Starter

```bash 
# 数字签名
keytool  -genkeypair -alias key0 -keyalg RSA -validity 400 -keystore demo.jks
```

## release 配置

```
android {
    compileSdk 32

    defaultConfig {
        applicationId "com.payne.ratelstarter"
        minSdk 21
        targetSdk 32
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        release {
            storeFile file('../demo.jks')
            storePassword '123456'
            keyAlias 'key0'
            keyPassword '123456'
        }
    }


    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'

            signingConfig signingConfigs.release
        }
    }

    packagingOptions {
        exclude 'META-INF/INDEX.LIST'
        exclude 'META-INF/io.netty.versions.properties'

    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
```

## release

```bash
gradle clean
gradle app:assembleRelease
```

## install

```bash 
adb install -t app/build/outputs/apk/release/app-release.apk
```

## temple

```bash
git clone https://github.com/virjarRatel/ratel-module-template.git
```

```bash
./template.sh -h                                               
param: -h
usage: create-helper
 -a,--apk <arg>            path to apk
 -f,--force                force overwrite
 -h,--help                 show help message
 -m,--moduleName <arg>     the name of output project !!!
 -p,--package <arg>        in many case, we need crack a certain apk
 -t,--template-dir <arg>   a project for template

example: ./template.sh -p com.payne.myapplication -m crack-myapplication
```