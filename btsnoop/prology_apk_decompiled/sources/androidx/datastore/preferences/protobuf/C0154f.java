package androidx.datastore.preferences.protobuf;

import B2.AbstractC0007h;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154f extends C0155g {

    /* renamed from: p, reason: collision with root package name */
    public final int f4075p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4076q;

    public C0154f(byte[] bArr, int i4, int i5) {
        super(bArr);
        C0155g.b(i4, i4 + i5, bArr.length);
        this.f4075p = i4;
        this.f4076q = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.C0155g
    public final byte a(int i4) {
        int i5 = this.f4076q;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.f4081m[this.f4075p + i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0007h.k("Index < 0: ", i4));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0007h.i(i4, i5, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0155g
    public final void d(byte[] bArr, int i4) {
        System.arraycopy(this.f4081m, this.f4075p, bArr, 0, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.C0155g
    public final int e() {
        return this.f4075p;
    }

    @Override // androidx.datastore.preferences.protobuf.C0155g
    public final byte f(int i4) {
        return this.f4081m[this.f4075p + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.C0155g
    public final int size() {
        return this.f4076q;
    }
}
