package m0;

import T.C0095p;
import f2.h0;

/* renamed from: m0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430k {

    /* renamed from: a, reason: collision with root package name */
    public final int f7237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7238b;

    /* renamed from: c, reason: collision with root package name */
    public final C0095p f7239c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f7240d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7241e;

    public C0430k(C0095p c0095p, int i4, int i5, h0 h0Var, String str) {
        this.f7237a = i4;
        this.f7238b = i5;
        this.f7239c = c0095p;
        this.f7240d = h0.a(h0Var);
        this.f7241e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0430k.class != obj.getClass()) {
            return false;
        }
        C0430k c0430k = (C0430k) obj;
        if (this.f7237a == c0430k.f7237a && this.f7238b == c0430k.f7238b && this.f7239c.equals(c0430k.f7239c)) {
            h0 h0Var = this.f7240d;
            h0Var.getClass();
            if (f2.r.h(h0Var, c0430k.f7240d) && this.f7241e.equals(c0430k.f7241e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7241e.hashCode() + ((this.f7240d.hashCode() + ((this.f7239c.hashCode() + ((((217 + this.f7237a) * 31) + this.f7238b) * 31)) * 31)) * 31);
    }
}
