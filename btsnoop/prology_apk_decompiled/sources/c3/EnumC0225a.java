package c3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0225a {

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0225a f4710l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0225a[] f4711m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c3.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c3.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c3.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f4710l = r02;
        f4711m = new EnumC0225a[]{r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static EnumC0225a valueOf(String str) {
        return (EnumC0225a) Enum.valueOf(EnumC0225a.class, str);
    }

    public static EnumC0225a[] values() {
        return (EnumC0225a[]) f4711m.clone();
    }
}
