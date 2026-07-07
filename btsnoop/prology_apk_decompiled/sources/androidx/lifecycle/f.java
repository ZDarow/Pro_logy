package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: l, reason: collision with root package name */
    public static final f f4153l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f4154m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f4155n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f4156o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f4157p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f[] f4158q;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f4153l = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f4154m = r12;
        ?? r22 = new Enum("CREATED", 2);
        f4155n = r22;
        ?? r32 = new Enum("STARTED", 3);
        f4156o = r32;
        ?? r4 = new Enum("RESUMED", 4);
        f4157p = r4;
        f4158q = new f[]{r02, r12, r22, r32, r4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f4158q.clone();
    }
}
