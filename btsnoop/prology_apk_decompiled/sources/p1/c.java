package p1;

import B2.AbstractC0007h;
import android.os.Parcel;
import android.util.SparseIntArray;
import n.C0442e;
import n.j;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7648d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f7649e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7650f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7651g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7652h;

    /* renamed from: i, reason: collision with root package name */
    public int f7653i;

    /* renamed from: j, reason: collision with root package name */
    public int f7654j;

    /* renamed from: k, reason: collision with root package name */
    public int f7655k;

    /* JADX WARN: Type inference failed for: r5v0, types: [n.e, n.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n.e, n.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [n.e, n.j] */
    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(0), new j(0), new j(0));
    }

    @Override // p1.b
    public final c a() {
        Parcel parcel = this.f7649e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f7654j;
        if (i4 == this.f7650f) {
            i4 = this.f7651g;
        }
        return new c(parcel, dataPosition, i4, AbstractC0007h.m(new StringBuilder(), this.f7652h, "  "), this.f7645a, this.f7646b, this.f7647c);
    }

    @Override // p1.b
    public final boolean e(int i4) {
        while (this.f7654j < this.f7651g) {
            int i5 = this.f7655k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            int i6 = this.f7654j;
            Parcel parcel = this.f7649e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f7655k = parcel.readInt();
            this.f7654j += readInt;
        }
        return this.f7655k == i4;
    }

    @Override // p1.b
    public final void i(int i4) {
        int i5 = this.f7653i;
        SparseIntArray sparseIntArray = this.f7648d;
        Parcel parcel = this.f7649e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.f7653i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public c(Parcel parcel, int i4, int i5, String str, C0442e c0442e, C0442e c0442e2, C0442e c0442e3) {
        super(c0442e, c0442e2, c0442e3);
        this.f7648d = new SparseIntArray();
        this.f7653i = -1;
        this.f7655k = -1;
        this.f7649e = parcel;
        this.f7650f = i4;
        this.f7651g = i5;
        this.f7654j = i4;
        this.f7652h = str;
    }
}
