# RatelModule

```bash 
# 数字签名
keytool  -genkeypair -alias key0 -keyalg RSA -validity 400 -keystore demo.jks
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
// example:
sh template.sh -p com.payne.myapplication -m crack-myapplication
```