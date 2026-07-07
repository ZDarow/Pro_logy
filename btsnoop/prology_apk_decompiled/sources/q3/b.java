package q3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public final String f7946l;

    /* renamed from: m, reason: collision with root package name */
    public int f7947m;

    /* renamed from: n, reason: collision with root package name */
    public int f7948n;

    /* renamed from: o, reason: collision with root package name */
    public int f7949o;

    /* renamed from: p, reason: collision with root package name */
    public int f7950p;

    public b(String str) {
        this.f7946l = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i5;
        int i6 = this.f7947m;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f7950p < 0) {
            this.f7947m = 2;
            return false;
        }
        String str = this.f7946l;
        int length = str.length();
        int length2 = str.length();
        for (int i7 = this.f7948n; i7 < length2; i7++) {
            char charAt = str.charAt(i7);
            if (charAt == '\n' || charAt == '\r') {
                i4 = (charAt == '\r' && (i5 = i7 + 1) < str.length() && str.charAt(i5) == '\n') ? 2 : 1;
                length = i7;
                this.f7947m = 1;
                this.f7950p = i4;
                this.f7949o = length;
                return true;
            }
        }
        i4 = -1;
        this.f7947m = 1;
        this.f7950p = i4;
        this.f7949o = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7947m = 0;
        int i4 = this.f7949o;
        int i5 = this.f7948n;
        this.f7948n = this.f7950p + i4;
        return this.f7946l.subSequence(i5, i4).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
