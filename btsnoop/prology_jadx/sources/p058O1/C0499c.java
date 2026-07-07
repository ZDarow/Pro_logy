package p058O1;

/* renamed from: O1.c */
/* loaded from: classes.dex */
public final class C0499c extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0499c> CREATOR = new p057O0.C0488g(2);

    /* renamed from: l */
    public final int f1462l;

    /* renamed from: m */
    public final java.lang.String f1463m;

    public C0499c(java.lang.String str, int i4) {
        this.f1462l = i4;
        this.f1463m = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p058O1.C0499c)) {
            return false;
        }
        p058O1.C0499c c0499c = (p058O1.C0499c) obj;
        return c0499c.f1462l == this.f1462l && p058O1.AbstractC0515s.m1019f(c0499c.f1463m, this.f1463m);
    }

    public final int hashCode() {
        return this.f1462l;
    }

    public final java.lang.String toString() {
        return this.f1462l + ":" + this.f1463m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f1462l);
        p176p1.AbstractC1949a.m3917T(parcel, 2, this.f1463m);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
