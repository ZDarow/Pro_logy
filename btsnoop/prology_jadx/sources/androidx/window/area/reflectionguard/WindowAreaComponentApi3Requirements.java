package androidx.window.area.reflectionguard;

/* loaded from: classes.dex */
public interface WindowAreaComponentApi3Requirements extends androidx.window.area.reflectionguard.WindowAreaComponentApi2Requirements {
    void addRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> consumer);

    void endRearDisplayPresentationSession();

    android.util.DisplayMetrics getRearDisplayMetrics();

    androidx.window.extensions.area.ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> consumer);

    void startRearDisplayPresentationSession(android.app.Activity activity, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);
}
