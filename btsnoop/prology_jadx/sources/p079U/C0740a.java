package p079U;

/* renamed from: U.a */
/* loaded from: classes.dex */
public final class C0740a {

    /* renamed from: a */
    public final p129f2.C1415c0 f2548a;

    /* renamed from: b */
    public final java.util.ArrayList f2549b = new java.util.ArrayList();

    /* renamed from: c */
    public java.nio.ByteBuffer[] f2550c = new java.nio.ByteBuffer[0];

    /* renamed from: d */
    public boolean f2551d;

    public C0740a(p129f2.C1415c0 c1415c0) {
        this.f2548a = c1415c0;
        p079U.C0741b c0741b = p079U.C0741b.f2552e;
        this.f2551d = false;
    }

    /* renamed from: a */
    public final p079U.C0741b m1331a(p079U.C0741b c0741b) {
        if (c0741b.equals(p079U.C0741b.f2552e)) {
            throw new p079U.C0742c(c0741b);
        }
        int i4 = 0;
        while (true) {
            p129f2.C1415c0 c1415c0 = this.f2548a;
            if (i4 >= c1415c0.size()) {
                return c0741b;
            }
            p079U.InterfaceC0743d interfaceC0743d = (p079U.InterfaceC0743d) c1415c0.get(i4);
            p079U.C0741b mo1343g = interfaceC0743d.mo1343g(c0741b);
            if (interfaceC0743d.mo1337a()) {
                p086W.AbstractC0781a.m1421j(!mo1343g.equals(p079U.C0741b.f2552e));
                c0741b = mo1343g;
            }
            i4++;
        }
    }

    /* renamed from: b */
    public final void m1332b() {
        java.util.ArrayList arrayList = this.f2549b;
        arrayList.clear();
        this.f2551d = false;
        int i4 = 0;
        while (true) {
            p129f2.C1415c0 c1415c0 = this.f2548a;
            if (i4 >= c1415c0.size()) {
                break;
            }
            p079U.InterfaceC0743d interfaceC0743d = (p079U.InterfaceC0743d) c1415c0.get(i4);
            interfaceC0743d.flush();
            if (interfaceC0743d.mo1337a()) {
                arrayList.add(interfaceC0743d);
            }
            i4++;
        }
        this.f2550c = new java.nio.ByteBuffer[arrayList.size()];
        for (int i5 = 0; i5 <= m1333c(); i5++) {
            this.f2550c[i5] = ((p079U.InterfaceC0743d) arrayList.get(i5)).mo1339c();
        }
    }

    /* renamed from: c */
    public final int m1333c() {
        return this.f2550c.length - 1;
    }

    /* renamed from: d */
    public final boolean m1334d() {
        return this.f2551d && ((p079U.InterfaceC0743d) this.f2549b.get(m1333c())).mo1341e() && !this.f2550c[m1333c()].hasRemaining();
    }

    /* renamed from: e */
    public final boolean m1335e() {
        return !this.f2549b.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p079U.C0740a)) {
            return false;
        }
        p079U.C0740a c0740a = (p079U.C0740a) obj;
        p129f2.C1415c0 c1415c0 = this.f2548a;
        if (c1415c0.size() != c0740a.f2548a.size()) {
            return false;
        }
        for (int i4 = 0; i4 < c1415c0.size(); i4++) {
            if (c1415c0.get(i4) != c0740a.f2548a.get(i4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m1336f(java.nio.ByteBuffer byteBuffer) {
        boolean z4;
        for (boolean z5 = true; z5; z5 = z4) {
            z4 = false;
            int i4 = 0;
            while (i4 <= m1333c()) {
                if (!this.f2550c[i4].hasRemaining()) {
                    java.util.ArrayList arrayList = this.f2549b;
                    p079U.InterfaceC0743d interfaceC0743d = (p079U.InterfaceC0743d) arrayList.get(i4);
                    if (!interfaceC0743d.mo1341e()) {
                        java.nio.ByteBuffer byteBuffer2 = i4 > 0 ? this.f2550c[i4 - 1] : byteBuffer.hasRemaining() ? byteBuffer : p079U.InterfaceC0743d.f2557a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC0743d.mo1342f(byteBuffer2);
                        this.f2550c[i4] = interfaceC0743d.mo1339c();
                        z4 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f2550c[i4].hasRemaining();
                    } else if (!this.f2550c[i4].hasRemaining() && i4 < m1333c()) {
                        ((p079U.InterfaceC0743d) arrayList.get(i4 + 1)).mo1340d();
                    }
                }
                i4++;
            }
        }
    }

    public final int hashCode() {
        return this.f2548a.hashCode();
    }
}
