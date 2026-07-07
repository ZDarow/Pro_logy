package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes.dex */
public final class C1103f extends androidx.datastore.preferences.protobuf.C1105g {

    /* renamed from: p */
    public final int f4223p;

    /* renamed from: q */
    public final int f4224q;

    public C1103f(byte[] bArr, int i4, int i5) {
        super(bArr);
        androidx.datastore.preferences.protobuf.C1105g.m2508b(i4, i4 + i5, bArr.length);
        this.f4223p = i4;
        this.f4224q = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.C1105g
    /* renamed from: a */
    public final byte mo2496a(int i4) {
        int i5 = this.f4224q;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.f4229m[this.f4223p + i4];
        }
        if (i4 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(p009B2.AbstractC0051h.m152k("Index < 0: ", i4));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i5, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C1105g
    /* renamed from: d */
    public final void mo2497d(byte[] bArr, int i4) {
        java.lang.System.arraycopy(this.f4229m, this.f4223p, bArr, 0, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.C1105g
    /* renamed from: e */
    public final int mo2498e() {
        return this.f4223p;
    }

    @Override // androidx.datastore.preferences.protobuf.C1105g
    /* renamed from: f */
    public final byte mo2499f(int i4) {
        return this.f4229m[this.f4223p + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.C1105g
    public final int size() {
        return this.f4224q;
    }
}
