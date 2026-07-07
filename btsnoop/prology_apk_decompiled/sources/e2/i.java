package e2;

import K2.o;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class i implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    public String f5444m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f5445n;

    /* renamed from: o, reason: collision with root package name */
    public final c f5446o;

    /* renamed from: q, reason: collision with root package name */
    public int f5448q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f5449r;

    /* renamed from: l, reason: collision with root package name */
    public int f5443l = 2;

    /* renamed from: p, reason: collision with root package name */
    public int f5447p = 0;

    public i(o oVar, P2.a aVar, CharSequence charSequence) {
        this.f5449r = oVar;
        this.f5446o = (c) aVar.f1501m;
        this.f5448q = aVar.f1500l;
        this.f5445n = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i4 = this.f5443l;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int b4 = L.j.b(i4);
        if (b4 == 0) {
            return true;
        }
        if (b4 == 2) {
            return false;
        }
        this.f5443l = 4;
        int i5 = this.f5447p;
        while (true) {
            int i6 = this.f5447p;
            if (i6 == -1) {
                this.f5443l = 3;
                str = null;
                break;
            }
            b bVar = (b) this.f5449r.f1009m;
            CharSequence charSequence = this.f5445n;
            int length = charSequence.length();
            AbstractC0462a.m(i6, length);
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(i6))) {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                i6 = charSequence.length();
                this.f5447p = -1;
            } else {
                this.f5447p = i6 + 1;
            }
            int i7 = this.f5447p;
            if (i7 == i5) {
                int i8 = i7 + 1;
                this.f5447p = i8;
                if (i8 > charSequence.length()) {
                    this.f5447p = -1;
                }
            } else {
                c cVar = this.f5446o;
                if (i5 < i6) {
                    charSequence.charAt(i5);
                    cVar.getClass();
                }
                if (i6 > i5) {
                    charSequence.charAt(i6 - 1);
                    cVar.getClass();
                }
                int i9 = this.f5448q;
                if (i9 == 1) {
                    i6 = charSequence.length();
                    this.f5447p = -1;
                    if (i6 > i5) {
                        charSequence.charAt(i6 - 1);
                        cVar.getClass();
                    }
                } else {
                    this.f5448q = i9 - 1;
                }
                str = charSequence.subSequence(i5, i6).toString();
            }
        }
        this.f5444m = str;
        if (this.f5443l == 3) {
            return false;
        }
        this.f5443l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5443l = 2;
        String str = this.f5444m;
        this.f5444m = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
