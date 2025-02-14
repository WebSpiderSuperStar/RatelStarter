RatelModule
===

## build Ratel model

build the model to install

### Certificate signing

```bash 
# 数字签名
keytool -genkeypair -alias key0 -keyalg RSA -validity 400 -keystore demo.jks
# 密钥升级
keytool -importkeystore -srckeystore demo.jks -destkeystore demo.jks -deststoretype pkcs12

```

> passwd:123456

### Build and pack

```shell
gradle clean app:assembleRelease
```

### install

```bash 
adb install -t app/build/outputs/apk/release/app-release.apk
```

## temple

```bash
git clone https://github.com/virjarRatel/ratel-module-template.git
# example:
sh template.sh -p com.payne.myapplication -m crack-myapplication
```