package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class s extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final B f6398a;

    /* renamed from: b, reason: collision with root package name */
    public B f6399b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6400c;

    public s(Context context, B b4, Context context2) {
        super(context);
        this.f6398a = b4;
        this.f6400c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i4 = 0; i4 < stackTrace.length && i4 < 11; i4++) {
            if (stackTrace[i4].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i4].getMethodName().equals("<init>")) {
                return this.f6400c.getSystemService(str);
            }
        }
        if (this.f6399b == null) {
            this.f6399b = this.f6398a;
        }
        return this.f6399b;
    }
}
