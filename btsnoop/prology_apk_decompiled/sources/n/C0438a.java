package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438a implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public int f7336l;

    /* renamed from: m, reason: collision with root package name */
    public int f7337m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7338n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7339o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f7340p;

    public C0438a(int i4) {
        this.f7336l = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7337m < this.f7336l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e4;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f7337m;
        switch (this.f7339o) {
            case 0:
                e4 = ((C0442e) this.f7340p).e(i4);
                break;
            case 1:
                e4 = ((C0442e) this.f7340p).h(i4);
                break;
            default:
                e4 = ((C0443f) this.f7340p).f7351m[i4];
                break;
        }
        this.f7337m++;
        this.f7338n = true;
        return e4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7338n) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i4 = this.f7337m - 1;
        this.f7337m = i4;
        switch (this.f7339o) {
            case 0:
                ((C0442e) this.f7340p).f(i4);
                break;
            case 1:
                ((C0442e) this.f7340p).f(i4);
                break;
            default:
                ((C0443f) this.f7340p).a(i4);
                break;
        }
        this.f7336l--;
        this.f7338n = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0438a(C0443f c0443f) {
        this(c0443f.f7352n);
        this.f7339o = 2;
        this.f7340p = c0443f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0438a(C0442e c0442e, int i4) {
        this(c0442e.f7367n);
        this.f7339o = i4;
        switch (i4) {
            case 1:
                this.f7340p = c0442e;
                this(c0442e.f7367n);
                return;
            default:
                this.f7340p = c0442e;
                return;
        }
    }
}
