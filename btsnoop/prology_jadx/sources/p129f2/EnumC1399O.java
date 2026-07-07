package p129f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f2.O */
/* loaded from: classes.dex */
public final class EnumC1399O implements java.util.Iterator {

    /* renamed from: l */
    public static final p129f2.EnumC1399O f5716l;

    /* renamed from: m */
    public static final /* synthetic */ p129f2.EnumC1399O[] f5717m;

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.O, java.lang.Enum] */
    static {
        ?? r02 = new java.lang.Enum("INSTANCE", 0);
        f5716l = r02;
        f5717m = new p129f2.EnumC1399O[]{r02};
    }

    public static p129f2.EnumC1399O valueOf(java.lang.String str) {
        return (p129f2.EnumC1399O) java.lang.Enum.valueOf(p129f2.EnumC1399O.class, str);
    }

    public static p129f2.EnumC1399O[] values() {
        return (p129f2.EnumC1399O[]) f5717m.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
    }
}
