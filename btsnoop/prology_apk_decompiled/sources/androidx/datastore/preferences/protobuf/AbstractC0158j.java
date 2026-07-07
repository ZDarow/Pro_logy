package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0158j {

    /* renamed from: a, reason: collision with root package name */
    public int f4105a;

    /* renamed from: b, reason: collision with root package name */
    public W.l f4106b;

    public abstract void a(int i4);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i4);

    public abstract int e(int i4);

    public abstract boolean f();

    public abstract C0155g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i4);

    public final void y() {
        int u4;
        do {
            u4 = u();
            if (u4 == 0) {
                return;
            }
            int i4 = this.f4105a;
            if (i4 >= 100) {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4105a = i4 + 1;
            this.f4105a--;
        } while (x(u4));
    }
}
