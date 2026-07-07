package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0167t implements Cloneable {

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0169v f4146l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0169v f4147m;

    public AbstractC0167t(AbstractC0169v abstractC0169v) {
        this.f4146l = abstractC0169v;
        if (abstractC0169v.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4147m = abstractC0169v.k();
    }

    public final AbstractC0169v a() {
        AbstractC0169v b4 = b();
        b4.getClass();
        if (AbstractC0169v.h(b4, true)) {
            return b4;
        }
        throw new b0();
    }

    public final AbstractC0169v b() {
        if (!this.f4147m.i()) {
            return this.f4147m;
        }
        AbstractC0169v abstractC0169v = this.f4147m;
        abstractC0169v.getClass();
        S s = S.f4034c;
        s.getClass();
        s.a(abstractC0169v.getClass()).h(abstractC0169v);
        abstractC0169v.j();
        return this.f4147m;
    }

    public final void c() {
        if (this.f4147m.i()) {
            return;
        }
        AbstractC0169v k4 = this.f4146l.k();
        AbstractC0169v abstractC0169v = this.f4147m;
        S s = S.f4034c;
        s.getClass();
        s.a(k4.getClass()).b(k4, abstractC0169v);
        this.f4147m = k4;
    }

    public final Object clone() {
        AbstractC0167t abstractC0167t = (AbstractC0167t) this.f4146l.e(5);
        abstractC0167t.f4147m = b();
        return abstractC0167t;
    }
}
