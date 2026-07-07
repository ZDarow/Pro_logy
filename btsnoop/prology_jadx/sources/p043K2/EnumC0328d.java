package p043K2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: K2.d */
/* loaded from: classes.dex */
public final class EnumC0328d {

    /* renamed from: l */
    public static final p043K2.EnumC0328d f994l;

    /* renamed from: m */
    public static final /* synthetic */ p043K2.EnumC0328d[] f995m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, K2.d] */
    static {
        ?? r02 = new java.lang.Enum("PLAIN_TEXT", 0);
        f994l = r02;
        f995m = new p043K2.EnumC0328d[]{r02};
    }

    /* renamed from: a */
    public static p043K2.EnumC0328d m725a(java.lang.String str) {
        for (p043K2.EnumC0328d enumC0328d : values()) {
            enumC0328d.getClass();
            if ("text/plain".equals(str)) {
                return enumC0328d;
            }
        }
        throw new java.lang.NoSuchFieldException(p009B2.AbstractC0051h.m153l("No such ClipboardContentFormat: ", str));
    }

    public static p043K2.EnumC0328d valueOf(java.lang.String str) {
        return (p043K2.EnumC0328d) java.lang.Enum.valueOf(p043K2.EnumC0328d.class, str);
    }

    public static p043K2.EnumC0328d[] values() {
        return (p043K2.EnumC0328d[]) f995m.clone();
    }
}
