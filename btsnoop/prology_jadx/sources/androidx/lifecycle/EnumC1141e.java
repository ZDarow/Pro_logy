package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public final class EnumC1141e {
    private static final /* synthetic */ androidx.lifecycle.EnumC1141e[] $VALUES;
    public static final androidx.lifecycle.C1139c Companion;
    public static final androidx.lifecycle.EnumC1141e ON_ANY;
    public static final androidx.lifecycle.EnumC1141e ON_CREATE;
    public static final androidx.lifecycle.EnumC1141e ON_DESTROY;
    public static final androidx.lifecycle.EnumC1141e ON_PAUSE;
    public static final androidx.lifecycle.EnumC1141e ON_RESUME;
    public static final androidx.lifecycle.EnumC1141e ON_START;
    public static final androidx.lifecycle.EnumC1141e ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    static {
        ?? r02 = new java.lang.Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new java.lang.Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new java.lang.Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new java.lang.Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r4 = new java.lang.Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new java.lang.Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new java.lang.Enum("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new androidx.lifecycle.EnumC1141e[]{r02, r12, r22, r32, r4, r5, r6};
        Companion = new java.lang.Object();
    }

    public static androidx.lifecycle.EnumC1141e valueOf(java.lang.String str) {
        return (androidx.lifecycle.EnumC1141e) java.lang.Enum.valueOf(androidx.lifecycle.EnumC1141e.class, str);
    }

    public static androidx.lifecycle.EnumC1141e[] values() {
        return (androidx.lifecycle.EnumC1141e[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final androidx.lifecycle.EnumC1142f m2654a() {
        switch (androidx.lifecycle.AbstractC1140d.f4301a[ordinal()]) {
            case 1:
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return androidx.lifecycle.EnumC1142f.f4304n;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return androidx.lifecycle.EnumC1142f.f4305o;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return androidx.lifecycle.EnumC1142f.f4306p;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return androidx.lifecycle.EnumC1142f.f4302l;
            default:
                throw new java.lang.IllegalArgumentException(this + " has no target state");
        }
    }
}
