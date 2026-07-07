package f2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public static final O f5522l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ O[] f5523m;

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.O, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f5522l = r02;
        f5523m = new O[]{r02};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f5523m.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
