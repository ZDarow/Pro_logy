package p148j2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j2.a */
/* loaded from: classes.dex */
public final class EnumC1724a implements java.util.concurrent.Executor {

    /* renamed from: l */
    public static final p148j2.EnumC1724a f7183l;

    /* renamed from: m */
    public static final /* synthetic */ p148j2.EnumC1724a[] f7184m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j2.a] */
    static {
        ?? r02 = new java.lang.Enum("INSTANCE", 0);
        f7183l = r02;
        f7184m = new p148j2.EnumC1724a[]{r02};
    }

    public static p148j2.EnumC1724a valueOf(java.lang.String str) {
        return (p148j2.EnumC1724a) java.lang.Enum.valueOf(p148j2.EnumC1724a.class, str);
    }

    public static p148j2.EnumC1724a[] values() {
        return (p148j2.EnumC1724a[]) f7184m.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
