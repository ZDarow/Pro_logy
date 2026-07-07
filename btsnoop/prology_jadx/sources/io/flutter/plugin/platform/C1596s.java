package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.s */
/* loaded from: classes.dex */
public final class C1596s extends android.content.ContextWrapper {

    /* renamed from: a */
    public final io.flutter.plugin.platform.WindowManagerC1577B f6637a;

    /* renamed from: b */
    public io.flutter.plugin.platform.WindowManagerC1577B f6638b;

    /* renamed from: c */
    public final android.content.Context f6639c;

    public C1596s(android.content.Context context, io.flutter.plugin.platform.WindowManagerC1577B windowManagerC1577B, android.content.Context context2) {
        super(context);
        this.f6637a = windowManagerC1577B;
        this.f6639c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        for (int i4 = 0; i4 < stackTrace.length && i4 < 11; i4++) {
            if (stackTrace[i4].getClassName().equals(android.app.AlertDialog.class.getCanonicalName()) && stackTrace[i4].getMethodName().equals("<init>")) {
                return this.f6639c.getSystemService(str);
            }
        }
        if (this.f6638b == null) {
            this.f6638b = this.f6637a;
        }
        return this.f6638b;
    }
}
