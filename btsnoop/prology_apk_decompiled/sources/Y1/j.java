package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class j extends P1.a {
    public static final Parcelable.Creator<j> CREATOR = new O0.g(22);

    /* renamed from: l, reason: collision with root package name */
    public final int f3093l;

    /* renamed from: m, reason: collision with root package name */
    public final String f3094m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3095n;

    /* renamed from: o, reason: collision with root package name */
    public final String f3096o;

    /* renamed from: p, reason: collision with root package name */
    public final r f3097p;

    /* renamed from: q, reason: collision with root package name */
    public final j f3098q;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i4, String str, String str2, String str3, ArrayList arrayList, j jVar) {
        k3.h.e(str, "packageName");
        if (jVar != null && jVar.f3098q != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f3093l = i4;
        this.f3094m = str;
        this.f3095n = str2;
        this.f3096o = str3 == null ? jVar != null ? jVar.f3096o : null : str3;
        AbstractCollection abstractCollection = arrayList;
        if (arrayList == null) {
            AbstractCollection abstractCollection2 = jVar != null ? jVar.f3097p : null;
            abstractCollection = abstractCollection2;
            if (abstractCollection2 == null) {
                p pVar = r.f3121m;
                AbstractCollection abstractCollection3 = s.f3122p;
                k3.h.d(abstractCollection3, "of(...)");
                abstractCollection = abstractCollection3;
            }
        }
        p pVar2 = r.f3121m;
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (array[i5] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 9);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
        }
        s sVar = length == 0 ? s.f3122p : new s(length, array);
        k3.h.d(sVar, "copyOf(...)");
        this.f3097p = sVar;
        this.f3098q = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3093l == jVar.f3093l && k3.h.a(this.f3094m, jVar.f3094m) && k3.h.a(this.f3095n, jVar.f3095n) && k3.h.a(this.f3096o, jVar.f3096o) && k3.h.a(this.f3098q, jVar.f3098q) && k3.h.a(this.f3097p, jVar.f3097p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3093l), this.f3094m, this.f3095n, this.f3096o, this.f3098q});
    }

    public final String toString() {
        String str = this.f3094m;
        int length = str.length() + 18;
        String str2 = this.f3095n;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.f3093l);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (q3.i.p0(str2, str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f3096o;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        String sb2 = sb.toString();
        k3.h.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        k3.h.e(parcel, "dest");
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f3093l);
        AbstractC0462a.T(parcel, 3, this.f3094m);
        AbstractC0462a.T(parcel, 4, this.f3095n);
        AbstractC0462a.T(parcel, 6, this.f3096o);
        AbstractC0462a.S(parcel, 7, this.f3098q, i4);
        AbstractC0462a.V(parcel, 8, this.f3097p);
        AbstractC0462a.Y(parcel, X3);
    }
}
