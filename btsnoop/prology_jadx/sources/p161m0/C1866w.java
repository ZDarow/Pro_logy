package p161m0;

/* renamed from: m0.w */
/* loaded from: classes.dex */
public final class C1866w implements p197u0.InterfaceC2224k {

    /* renamed from: l */
    public final java.io.DataInputStream f7585l;

    /* renamed from: m */
    public final p141i0.C1534g f7586m;

    /* renamed from: n */
    public volatile boolean f7587n;

    /* renamed from: o */
    public final /* synthetic */ p161m0.C1868y f7588o;

    /* JADX WARN: Type inference failed for: r1v2, types: [i0.g, java.lang.Object] */
    public C1866w(p161m0.C1868y c1868y, java.io.InputStream inputStream) {
        this.f7588o = c1868y;
        this.f7585l = new java.io.DataInputStream(inputStream);
        ?? obj = new java.lang.Object();
        obj.f6378c = new java.util.ArrayList();
        obj.f6376a = 1;
        this.f7586m = obj;
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        java.lang.String str;
        while (!this.f7587n) {
            byte readByte = this.f7585l.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f7585l.readUnsignedByte();
                int readUnsignedShort = this.f7585l.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f7585l.readFully(bArr, 0, readUnsignedShort);
                p161m0.C1842G c1842g = (p161m0.C1842G) this.f7588o.f7596n.get(java.lang.Integer.valueOf(readUnsignedByte));
                if (c1842g != null && !this.f7588o.f7599q) {
                    c1842g.f7441p.add(bArr);
                }
            } else if (this.f7588o.f7599q) {
                continue;
            } else {
                p094Y.C0886x c0886x = this.f7588o.f7594l;
                p141i0.C1534g c1534g = this.f7586m;
                java.io.DataInputStream dataInputStream = this.f7585l;
                c1534g.getClass();
                p129f2.AbstractC1393I m3401a = c1534g.m3401a(p141i0.C1534g.m3400b(readByte, dataInputStream));
                while (m3401a == null) {
                    if (c1534g.f6376a == 3) {
                        long j4 = c1534g.f6377b;
                        if (j4 <= 0) {
                            throw new java.lang.IllegalStateException("Expects a greater than zero Content-Length.");
                        }
                        int m1804l = p101a.AbstractC0936a.m1804l(j4);
                        p086W.AbstractC0781a.m1421j(m1804l != -1);
                        byte[] bArr2 = new byte[m1804l];
                        dataInputStream.readFully(bArr2, 0, m1804l);
                        p086W.AbstractC0781a.m1421j(c1534g.f6376a == 3);
                        if (m1804l > 0) {
                            int i4 = m1804l - 1;
                            if (bArr2[i4] == 10) {
                                if (m1804l > 1) {
                                    int i5 = m1804l - 2;
                                    if (bArr2[i5] == 13) {
                                        str = new java.lang.String(bArr2, 0, i5, p161m0.C1868y.f7593r);
                                        java.util.ArrayList arrayList = (java.util.ArrayList) c1534g.f6378c;
                                        arrayList.add(str);
                                        m3401a = p129f2.AbstractC1393I.m3162j(arrayList);
                                        ((java.util.ArrayList) c1534g.f6378c).clear();
                                        c1534g.f6376a = 1;
                                        c1534g.f6377b = 0L;
                                    }
                                }
                                str = new java.lang.String(bArr2, 0, i4, p161m0.C1868y.f7593r);
                                java.util.ArrayList arrayList2 = (java.util.ArrayList) c1534g.f6378c;
                                arrayList2.add(str);
                                m3401a = p129f2.AbstractC1393I.m3162j(arrayList2);
                                ((java.util.ArrayList) c1534g.f6378c).clear();
                                c1534g.f6376a = 1;
                                c1534g.f6377b = 0L;
                            }
                        }
                        throw new java.lang.IllegalArgumentException("Message body is empty or does not end with a LF.");
                    }
                    m3401a = c1534g.m3401a(p141i0.C1534g.m3400b(dataInputStream.readByte(), dataInputStream));
                }
                ((android.os.Handler) c0886x.f3175m).post(new p086W.RunnableC0793m(9, c0886x, m3401a));
            }
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
        this.f7587n = true;
    }
}
