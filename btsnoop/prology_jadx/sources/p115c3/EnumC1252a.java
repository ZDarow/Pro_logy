package p115c3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c3.a */
/* loaded from: classes.dex */
public final class EnumC1252a {

    /* renamed from: l */
    public static final p115c3.EnumC1252a f4880l;

    /* renamed from: m */
    public static final /* synthetic */ p115c3.EnumC1252a[] f4881m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c3.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c3.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c3.a] */
    static {
        ?? r02 = new java.lang.Enum("COROUTINE_SUSPENDED", 0);
        f4880l = r02;
        f4881m = new p115c3.EnumC1252a[]{r02, new java.lang.Enum("UNDECIDED", 1), new java.lang.Enum("RESUMED", 2)};
    }

    public static p115c3.EnumC1252a valueOf(java.lang.String str) {
        return (p115c3.EnumC1252a) java.lang.Enum.valueOf(p115c3.EnumC1252a.class, str);
    }

    public static p115c3.EnumC1252a[] values() {
        return (p115c3.EnumC1252a[]) f4881m.clone();
    }
}
