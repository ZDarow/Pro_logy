package l;

import java.util.Iterator;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397b extends AbstractC0400e implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public C0398c f7107l;

    /* renamed from: m, reason: collision with root package name */
    public C0398c f7108m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f7109n;

    public C0397b(C0398c c0398c, C0398c c0398c2, int i4) {
        this.f7109n = i4;
        this.f7107l = c0398c2;
        this.f7108m = c0398c;
    }

    @Override // l.AbstractC0400e
    public final void a(C0398c c0398c) {
        C0398c c0398c2;
        C0398c c0398c3 = null;
        if (this.f7107l == c0398c && c0398c == this.f7108m) {
            this.f7108m = null;
            this.f7107l = null;
        }
        C0398c c0398c4 = this.f7107l;
        if (c0398c4 == c0398c) {
            switch (this.f7109n) {
                case 0:
                    c0398c2 = c0398c4.f7113o;
                    break;
                default:
                    c0398c2 = c0398c4.f7112n;
                    break;
            }
            this.f7107l = c0398c2;
        }
        C0398c c0398c5 = this.f7108m;
        if (c0398c5 == c0398c) {
            C0398c c0398c6 = this.f7107l;
            if (c0398c5 != c0398c6 && c0398c6 != null) {
                c0398c3 = b(c0398c5);
            }
            this.f7108m = c0398c3;
        }
    }

    public final C0398c b(C0398c c0398c) {
        switch (this.f7109n) {
            case 0:
                return c0398c.f7112n;
            default:
                return c0398c.f7113o;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7108m != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0398c c0398c = this.f7108m;
        C0398c c0398c2 = this.f7107l;
        this.f7108m = (c0398c == c0398c2 || c0398c2 == null) ? null : b(c0398c);
        return c0398c;
    }
}
