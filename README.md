# Hybrid Apache Cordova App + Native Android App

This project explorer how build Hybrid Apache Cordova App + Native Activity.

## This example follow the apache cordova webview reference: https://cordova.apache.org/docs/en/latest/guide/platforms/android/webview.html

### References

Apache Cordova > https://cordova.apache.org

Android Developers > https://developer.android.com

Cordova-Android > https://github.com/apache/cordova-android

## Prerequesites

1 - Install Node.js and update npm (https://docs.npmjs.com/getting-started/installing-node)

2 - Install apache cordova via npm (https://cordova.apache.org/docs/en/latest/guide/cli/index.html)

3 - Create a simples cordova app following step 2 above.

4 - Download and create a project on Android Studio. (https://developer.android.com/studio/index.html)

5 - Download Cordova-Android code from https://github.com/apache/cordova-android

6 - Go to root directory from steps 5.

7 - After all steps above, please follow the steps here: https://cordova.apache.org/docs/en/latest/guide/platforms/android/webview.html

## Compile

The step 7 above, let you to use CordovaWebView. But, this class is not located on code from step 5.

To fix it, please use:

```xml
<org.apache.cordova.engine.SystemWebView
        android:id="@+id/tutorialView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

## Done!

Now your app will run with the first screen opened on MainActivity. Click on button "Open Cordova Activity" and then CordovaViewTestActivity will open WebView with your Hybrid app.

# PS.:

This app still contain improvements to be done!
Feel free to critic and help on project.
Thank you!
