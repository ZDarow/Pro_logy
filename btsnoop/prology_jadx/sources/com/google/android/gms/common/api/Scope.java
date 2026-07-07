package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class Scope extends p062P1.AbstractC0527a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new p024F.C0206i(21);

    /* renamed from: l */
    public final int f4908l;

    /* renamed from: m */
    public final java.lang.String f4909m;

    public Scope(java.lang.String str, int i4) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f4908l = i4;
        this.f4909m = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.Scope)) {
            return false;
        }
        return this.f4909m.equals(((com.google.android.gms.common.api.Scope) obj).f4909m);
    }

    public final int hashCode() {
        return this.f4909m.hashCode();
    }

    public final java.lang.String toString() {
        return this.f4909m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f4908l);
        p176p1.AbstractC1949a.m3917T(parcel, 2, this.f4909m);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
