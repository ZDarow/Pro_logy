package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public final class EnumC1142f {

    /* renamed from: l */
    public static final androidx.lifecycle.EnumC1142f f4302l;

    /* renamed from: m */
    public static final androidx.lifecycle.EnumC1142f f4303m;

    /* renamed from: n */
    public static final androidx.lifecycle.EnumC1142f f4304n;

    /* renamed from: o */
    public static final androidx.lifecycle.EnumC1142f f4305o;

    /* renamed from: p */
    public static final androidx.lifecycle.EnumC1142f f4306p;

    /* renamed from: q */
    public static final /* synthetic */ androidx.lifecycle.EnumC1142f[] f4307q;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    static {
        ?? r02 = new java.lang.Enum("DESTROYED", 0);
        f4302l = r02;
        ?? r12 = new java.lang.Enum("INITIALIZED", 1);
        f4303m = r12;
        ?? r22 = new java.lang.Enum("CREATED", 2);
        f4304n = r22;
        ?? r32 = new java.lang.Enum("STARTED", 3);
        f4305o = r32;
        ?? r4 = new java.lang.Enum("RESUMED", 4);
        f4306p = r4;
        f4307q = new androidx.lifecycle.EnumC1142f[]{r02, r12, r22, r32, r4};
    }

    public static androidx.lifecycle.EnumC1142f valueOf(java.lang.String str) {
        return (androidx.lifecycle.EnumC1142f) java.lang.Enum.valueOf(androidx.lifecycle.EnumC1142f.class, str);
    }

    public static androidx.lifecycle.EnumC1142f[] values() {
        return (androidx.lifecycle.EnumC1142f[]) f4307q.clone();
    }
}
