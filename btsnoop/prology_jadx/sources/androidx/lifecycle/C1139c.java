package androidx.lifecycle;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C1139c {
    /* renamed from: a */
    public static androidx.lifecycle.EnumC1141e m2653a(androidx.lifecycle.EnumC1142f enumC1142f) {
        p154k3.AbstractC1803h.m3779e(enumC1142f, "state");
        int ordinal = enumC1142f.ordinal();
        if (ordinal == 1) {
            return androidx.lifecycle.EnumC1141e.ON_CREATE;
        }
        if (ordinal == 2) {
            return androidx.lifecycle.EnumC1141e.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return androidx.lifecycle.EnumC1141e.ON_RESUME;
    }
}
