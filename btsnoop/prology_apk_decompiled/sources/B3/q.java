package B3;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f260a;

    /* renamed from: b, reason: collision with root package name */
    public int f261b;

    /* renamed from: c, reason: collision with root package name */
    public int f262c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f263d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f264e;

    /* renamed from: f, reason: collision with root package name */
    public q f265f;

    /* renamed from: g, reason: collision with root package name */
    public q f266g;

    public q() {
        this.f260a = new byte[8192];
        this.f264e = true;
        this.f263d = false;
    }

    public final q a() {
        q qVar = this.f265f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f266g;
        k3.h.b(qVar2);
        qVar2.f265f = this.f265f;
        q qVar3 = this.f265f;
        k3.h.b(qVar3);
        qVar3.f266g = this.f266g;
        this.f265f = null;
        this.f266g = null;
        return qVar;
    }

    public final void b(q qVar) {
        k3.h.e(qVar, "segment");
        qVar.f266g = this;
        qVar.f265f = this.f265f;
        q qVar2 = this.f265f;
        k3.h.b(qVar2);
        qVar2.f266g = qVar;
        this.f265f = qVar;
    }

    public final q c() {
        this.f263d = true;
        return new q(this.f260a, this.f261b, this.f262c, true);
    }

    public final void d(q qVar, int i4) {
        k3.h.e(qVar, "sink");
        if (!qVar.f264e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = qVar.f262c;
        int i6 = i5 + i4;
        byte[] bArr = qVar.f260a;
        if (i6 > 8192) {
            if (qVar.f263d) {
                throw new IllegalArgumentException();
            }
            int i7 = qVar.f261b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            a3.c.g0(0, i7, i5, bArr, bArr);
            qVar.f262c -= qVar.f261b;
            qVar.f261b = 0;
        }
        int i8 = qVar.f262c;
        int i9 = this.f261b;
        a3.c.g0(i8, i9, i9 + i4, this.f260a, bArr);
        qVar.f262c += i4;
        this.f261b += i4;
    }

    public q(byte[] bArr, int i4, int i5, boolean z4) {
        k3.h.e(bArr, "data");
        this.f260a = bArr;
        this.f261b = i4;
        this.f262c = i5;
        this.f263d = z4;
        this.f264e = false;
    }
}
