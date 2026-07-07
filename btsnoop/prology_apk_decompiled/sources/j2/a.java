package j2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public static final a f6921l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a[] f6922m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j2.a] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f6921l = r02;
        f6922m = new a[]{r02};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6922m.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
