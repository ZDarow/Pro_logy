package androidx.window.area.reflectionguard;

/* loaded from: classes.dex */
public interface WindowAreaComponentApi2Requirements {
    void addRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void endRearDisplaySession();

    void removeRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void startRearDisplaySession(android.app.Activity activity, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);
}
