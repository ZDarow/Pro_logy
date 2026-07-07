package l;

import java.util.Iterator;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399d extends AbstractC0400e implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public C0398c f7114l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7115m = true;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0401f f7116n;

    public C0399d(C0401f c0401f) {
        this.f7116n = c0401f;
    }

    @Override // l.AbstractC0400e
    public final void a(C0398c c0398c) {
        C0398c c0398c2 = this.f7114l;
        if (c0398c == c0398c2) {
            C0398c c0398c3 = c0398c2.f7113o;
            this.f7114l = c0398c3;
            this.f7115m = c0398c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7115m) {
            return this.f7116n.f7117l != null;
        }
        C0398c c0398c = this.f7114l;
        return (c0398c == null || c0398c.f7112n == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7115m) {
            this.f7115m = false;
            this.f7114l = this.f7116n.f7117l;
        } else {
            C0398c c0398c = this.f7114l;
            this.f7114l = c0398c != null ? c0398c.f7112n : null;
        }
        return this.f7114l;
    }
}
