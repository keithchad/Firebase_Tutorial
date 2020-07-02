# Firebase_Tutorial

Welcome to my firebase tutorial.

# About

This explains the various components of the Firebase Console.

# Getting Started

Go to firebase.google.com

If you do not have an account create one

Go to  FireBase Console.

Go to Add project.

Enter your project name.

Enable Google Analytics for the Project

Open the new Project

Click the android icon to add your Android Project


Enter your project package i.e

```java
com.chad.firebasetutorial
```

Enter App Nickname(Optional)

Enter Debug Signing Certificate SHA-1(Optional)

Download the google-services.json file and add it to your Android app module root directory

Add the below code to your project-level build.gradle(<project>/build.gradle):
```groovy
buldscript {
  repositories{
     google()
}
dependencies {
classpath 'com.google.gms:google-services:4.3.3' //Add this line
 }
}
```

Then add the below code to  your app-level build.gradle(<project>/<app>-module>/build.gradle):
```groovy
apply plugin: 'com.android.application'

apply plugin: 'com.google.gms.google-services'

...
dependencies {
//add the Firebase SDK for Google Analytics
implementation 'com.google.firebase:firebase-analytics:17.2.2'
}
```
Finally press "Sync now" in the bar that appears in the IDE.

Run your App to verify installation.