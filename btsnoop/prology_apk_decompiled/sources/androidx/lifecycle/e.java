package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final c Companion;
    public static final e ON_ANY;
    public static final e ON_CREATE;
    public static final e ON_DESTROY;
    public static final e ON_PAUSE;
    public static final e ON_RESUME;
    public static final e ON_START;
    public static final e ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.lifecycle.e, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new e[]{r02, r12, r22, r32, r4, r5, r6};
        Companion = new Object();
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final f a() {
        switch (d.f4152a[ordinal()]) {
            case 1:
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return f.f4155n;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return f.f4156o;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return f.f4157p;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return f.f4153l;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
