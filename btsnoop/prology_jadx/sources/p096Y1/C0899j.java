package p096Y1;

/* renamed from: Y1.j */
/* loaded from: classes.dex */
public final class C0899j extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p096Y1.C0899j> CREATOR = new p057O0.C0488g(22);

    /* renamed from: l */
    public final int f3204l;

    /* renamed from: m */
    public final java.lang.String f3205m;

    /* renamed from: n */
    public final java.lang.String f3206n;

    /* renamed from: o */
    public final java.lang.String f3207o;

    /* renamed from: p */
    public final p096Y1.AbstractC0907r f3208p;

    /* renamed from: q */
    public final p096Y1.C0899j f3209q;

    static {
        android.os.Process.myUid();
        android.os.Process.myPid();
    }

    public C0899j(int i4, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList, p096Y1.C0899j c0899j) {
        p154k3.AbstractC1803h.m3779e(str, "packageName");
        if (c0899j != null && c0899j.f3209q != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        this.f3204l = i4;
        this.f3205m = str;
        this.f3206n = str2;
        this.f3207o = str3 == null ? c0899j != null ? c0899j.f3207o : null : str3;
        java.util.AbstractCollection abstractCollection = arrayList;
        if (arrayList == null) {
            java.util.AbstractCollection abstractCollection2 = c0899j != null ? c0899j.f3208p : null;
            abstractCollection = abstractCollection2;
            if (abstractCollection2 == null) {
                p096Y1.C0905p c0905p = p096Y1.AbstractC0907r.f3232m;
                java.util.AbstractCollection abstractCollection3 = p096Y1.C0908s.f3233p;
                p154k3.AbstractC1803h.m3778d(abstractCollection3, "of(...)");
                abstractCollection = abstractCollection3;
            }
        }
        p096Y1.C0905p c0905p2 = p096Y1.AbstractC0907r.f3232m;
        java.lang.Object[] array = abstractCollection.toArray();
        int length = array.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (array[i5] == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i5).length() + 9);
                sb.append("at index ");
                sb.append(i5);
                throw new java.lang.NullPointerException(sb.toString());
            }
        }
        p096Y1.C0908s c0908s = length == 0 ? p096Y1.C0908s.f3233p : new p096Y1.C0908s(length, array);
        p154k3.AbstractC1803h.m3778d(c0908s, "copyOf(...)");
        this.f3208p = c0908s;
        this.f3209q = c0899j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p096Y1.C0899j) {
            p096Y1.C0899j c0899j = (p096Y1.C0899j) obj;
            if (this.f3204l == c0899j.f3204l && p154k3.AbstractC1803h.m3775a(this.f3205m, c0899j.f3205m) && p154k3.AbstractC1803h.m3775a(this.f3206n, c0899j.f3206n) && p154k3.AbstractC1803h.m3775a(this.f3207o, c0899j.f3207o) && p154k3.AbstractC1803h.m3775a(this.f3209q, c0899j.f3209q) && p154k3.AbstractC1803h.m3775a(this.f3208p, c0899j.f3208p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f3204l), this.f3205m, this.f3206n, this.f3207o, this.f3209q});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f3205m;
        int length = str.length() + 18;
        java.lang.String str2 = this.f3206n;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.f3204l);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (p182q3.AbstractC2032i.m4082p0(str2, str)) {
                sb.append((java.lang.CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        java.lang.String str3 = this.f3207o;
        if (str3 != null) {
            sb.append("/");
            sb.append(java.lang.Integer.toHexString(str3.hashCode()));
        }
        java.lang.String sb2 = sb.toString();
        p154k3.AbstractC1803h.m3778d(sb2, "toString(...)");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        p154k3.AbstractC1803h.m3779e(parcel, "dest");
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f3204l);
        p176p1.AbstractC1949a.m3917T(parcel, 3, this.f3205m);
        p176p1.AbstractC1949a.m3917T(parcel, 4, this.f3206n);
        p176p1.AbstractC1949a.m3917T(parcel, 6, this.f3207o);
        p176p1.AbstractC1949a.m3916S(parcel, 7, this.f3209q, i4);
        p176p1.AbstractC1949a.m3919V(parcel, 8, this.f3208p);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
