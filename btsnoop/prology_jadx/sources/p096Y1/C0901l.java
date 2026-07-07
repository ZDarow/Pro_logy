package p096Y1;

/* renamed from: Y1.l */
/* loaded from: classes.dex */
public final class C0901l extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p096Y1.C0901l> CREATOR = new p057O0.C0488g(20);

    /* renamed from: l */
    public final com.google.android.gms.location.LocationRequest f3215l;

    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0901l(com.google.android.gms.location.LocationRequest r33, java.util.ArrayList r34, boolean r35, boolean r36, boolean r37, boolean r38, long r39) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p096Y1.C0901l.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p096Y1.C0901l) {
            return p058O1.AbstractC0515s.m1019f(this.f3215l, ((p096Y1.C0901l) obj).f3215l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3215l.hashCode();
    }

    public final java.lang.String toString() {
        return this.f3215l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3916S(parcel, 1, this.f3215l, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
