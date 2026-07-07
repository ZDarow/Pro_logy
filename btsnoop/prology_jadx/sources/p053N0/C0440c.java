package p053N0;

/* renamed from: N0.c */
/* loaded from: classes.dex */
public final class C0440c implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p053N0.C0440c> CREATOR = new p024F.C0206i(24);

    /* renamed from: l */
    public final java.util.ArrayList f1278l;

    public C0440c(java.util.ArrayList arrayList) {
        this.f1278l = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j4 = ((p053N0.C0439b) arrayList.get(0)).f1276m;
            int i4 = 1;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                if (((p053N0.C0439b) arrayList.get(i4)).f1275l < j4) {
                    z4 = true;
                    break;
                } else {
                    j4 = ((p053N0.C0439b) arrayList.get(i4)).f1276m;
                    i4++;
                }
            }
        }
        p086W.AbstractC0781a.m1416e(!z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p053N0.C0440c.class != obj.getClass()) {
            return false;
        }
        return this.f1278l.equals(((p053N0.C0440c) obj).f1278l);
    }

    public final int hashCode() {
        return this.f1278l.hashCode();
    }

    public final java.lang.String toString() {
        return "SlowMotion: segments=" + this.f1278l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeList(this.f1278l);
    }
}
