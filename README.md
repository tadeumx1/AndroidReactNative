# AndroidReactNative

This is a simple application that integrate an Android Native Code project to React Native, with this integration you can have a existing Android App and make some screens using React Native, enjoying all the advantages of this amazing framework to make apps that is available in this [repository](https://github.com/facebook/react-native).

In this application the versions used are

React Native 0.60.4

Build Tools Gradle 3.4.0

Android 4.1 API 16 or higher

And in this project because of React Native version is being used the AndroidX to the Android libraries

### Installation

This application needs [Node.js](https://nodejs.org/) installed together with [NPM](https://www.npmjs.com/get-npm) so you will be able to install [react-native-cli](https://www.npmjs.com/package/react-native-cli) and afther this you can execute the commands below

In addition, it will be necessary for you to have all the necessary environment for running native Android

If you need help setting up your environment just follow the [instructions](https://docs.rocketseat.dev/ambiente-react-native/introducao) of this tutorial

First use the `` git clone`` after this

```
$ cd AndroidReactNative

$ npm install i 

// Or you can use Yarn

$ yarn install

// Command to start React Native Start Packager

$ react-native start

// Command to run the application

// To run the application on emulator you can use the green play button of Android Studio
// or you can build the apk using

$ ./gradlew assembleDebug

```