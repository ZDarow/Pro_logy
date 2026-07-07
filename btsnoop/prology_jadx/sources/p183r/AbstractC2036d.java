package p183r;

/* renamed from: r.d */
/* loaded from: classes.dex */
public abstract class AbstractC2036d {
    /* renamed from: a */
    public static android.graphics.Insets m4089a(int i4, int i5, int i6, int i7) {
        return android.graphics.Insets.of(i4, i5, i6, i7);
    }

    /* renamed from: b */
    public static void m4090b(android.app.Notification.Builder builder, boolean z4) {
        builder.setAllowSystemGeneratedContextualActions(z4);
    }

    /* renamed from: c */
    public static void m4091c(android.app.Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    /* renamed from: d */
    public static void m4092d(android.app.Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
