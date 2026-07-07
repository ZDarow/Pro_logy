package K2;

import B2.AbstractC0007h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: l, reason: collision with root package name */
    public static final d f955l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d[] f956m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, K2.d] */
    static {
        ?? r02 = new Enum("PLAIN_TEXT", 0);
        f955l = r02;
        f956m = new d[]{r02};
    }

    public static d a(String str) {
        for (d dVar : values()) {
            dVar.getClass();
            if ("text/plain".equals(str)) {
                return dVar;
            }
        }
        throw new NoSuchFieldException(AbstractC0007h.l("No such ClipboardContentFormat: ", str));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f956m.clone();
    }
}
