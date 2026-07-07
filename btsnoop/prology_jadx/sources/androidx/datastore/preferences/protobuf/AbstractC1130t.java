package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t */
/* loaded from: classes.dex */
public abstract class AbstractC1130t implements java.lang.Cloneable {

    /* renamed from: l */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v f4295l;

    /* renamed from: m */
    public androidx.datastore.preferences.protobuf.AbstractC1132v f4296m;

    public AbstractC1130t(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v) {
        this.f4295l = abstractC1132v;
        if (abstractC1132v.m2639i()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4296m = abstractC1132v.m2641k();
    }

    /* renamed from: a */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v m2630a() {
        androidx.datastore.preferences.protobuf.AbstractC1132v m2631b = m2631b();
        m2631b.getClass();
        if (androidx.datastore.preferences.protobuf.AbstractC1132v.m2635h(m2631b, true)) {
            return m2631b;
        }
        throw new androidx.datastore.preferences.protobuf.C1096b0();
    }

    /* renamed from: b */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v m2631b() {
        if (!this.f4296m.m2639i()) {
            return this.f4296m;
        }
        androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = this.f4296m;
        abstractC1132v.getClass();
        androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
        c1085s.getClass();
        c1085s.m2422a(abstractC1132v.getClass()).mo2407h(abstractC1132v);
        abstractC1132v.m2640j();
        return this.f4296m;
    }

    /* renamed from: c */
    public final void m2632c() {
        if (this.f4296m.m2639i()) {
            return;
        }
        androidx.datastore.preferences.protobuf.AbstractC1132v m2641k = this.f4295l.m2641k();
        androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = this.f4296m;
        androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
        c1085s.getClass();
        c1085s.m2422a(m2641k.getClass()).mo2401b(m2641k, abstractC1132v);
        this.f4296m = m2641k;
    }

    public final java.lang.Object clone() {
        androidx.datastore.preferences.protobuf.AbstractC1130t abstractC1130t = (androidx.datastore.preferences.protobuf.AbstractC1130t) this.f4295l.mo774e(5);
        abstractC1130t.f4296m = m2631b();
        return abstractC1130t;
    }
}
