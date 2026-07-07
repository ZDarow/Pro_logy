package r;

import android.app.Notification;
import android.graphics.Insets;

/* loaded from: classes.dex */
public abstract class d {
    public static Insets a(int i4, int i5, int i6, int i7) {
        return Insets.of(i4, i5, i6, i7);
    }

    public static void b(Notification.Builder builder, boolean z4) {
        builder.setAllowSystemGeneratedContextualActions(z4);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
