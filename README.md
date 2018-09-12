# react-native-custom-module
React Native Custom Module Boilerplate

## Usage
 getModuleList() fetches list of native modules. This is only boilerplate implementation to build native module in React Native.
```
import CustomModule from 'react-native-custom-module';

CustomModule.getModuleList((error, list) => { 
  if (error) { 
      //error 
  } else { 
      console.log(list)
      //array list returned [...] 
  }
});

```
## Mostly Automatic Install

1. `npm install react-native-custom-module@https://github.com/httpdeveloper/react-native-custom-module.git --save`
2. `react-native link react-native-custom-module`

## Manual Install

### IOS
1. npm install react-native-custom-module@https://github.com/httpdeveloper/react-native-custom-module.git --save
2. In Xcode, in the project navigator, right click Libraries -> Add Files to [your project's name]
3. add RCTCustomModule.xcodeproj from node_modules of your root project
4. In Xcode, in the project navigator, Select your project. Add libRCTCustomModule.a to your project's -> Build Phases -> Link Binary With Libraries

### Android
1. npm install react-native-custom-module@https://github.com/httpdeveloper/react-native-custom-module.git --save
2. Append the following lines in android/setting.gradle
```...
  include ':react-native-custom-module'
  project(':react-native-custom-module').projectDir = new File(settingsDir, '../node_modules/react-native-custom-module/android')
  ...
...
```
3. Add the following lines in android/app/build.gradle
```
  dependencies {
  ...
     compile project(':react-native-custom-module')
  ...
```
4. Open android/app/src/main/java/['your-package-name']/MainApplication.java
```
    .....
    import com.dineshmaharjan.custommodule.CustomModulePackage;
    public class MainApplication extends Application implements ReactApplication {
      .....
        @Override
        protected List<ReactPackage> getPackages() {
          return Arrays.<ReactPackage>asList(
              new MainReactPackage(),
              ...
              new CustomModulePackage() // Add this package
              ...
          );
        }
        ...
   }
 ```

# Article
[Article](https://medium.com/@httpdeveloper/how-to-build-a-simple-react-native-custom-module-for-ios-and-android-from-scratch-a8efd31446f0) about custom module development in React Native on medium.com

# License
MIT
