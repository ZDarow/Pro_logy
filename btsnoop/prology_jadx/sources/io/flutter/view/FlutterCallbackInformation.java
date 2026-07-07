package io.flutter.view;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public final class FlutterCallbackInformation {
    public final java.lang.String callbackClassName;
    public final java.lang.String callbackLibraryPath;
    public final java.lang.String callbackName;

    private FlutterCallbackInformation(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.callbackName = str;
        this.callbackClassName = str2;
        this.callbackLibraryPath = str3;
    }

    public static io.flutter.view.FlutterCallbackInformation lookupCallbackInformation(long j4) {
        return io.flutter.embedding.engine.FlutterJNI.nativeLookupCallbackInformation(j4);
    }
}
