package com.google.android.gms.common.api;

import F.i;
import P1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new i(21);

    /* renamed from: l, reason: collision with root package name */
    public final int f4735l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4736m;

    public Scope(String str, int i4) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f4735l = i4;
        this.f4736m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4736m.equals(((Scope) obj).f4736m);
    }

    public final int hashCode() {
        return this.f4736m.hashCode();
    }

    public final String toString() {
        return this.f4736m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f4735l);
        AbstractC0462a.T(parcel, 2, this.f4736m);
        AbstractC0462a.Y(parcel, X3);
    }
}
