package Q;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f1578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1580c;

    public w(int i4, int i5, String str) {
        this.f1578a = str;
        this.f1579b = i4;
        this.f1580c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        int i4 = this.f1580c;
        String str = this.f1578a;
        int i5 = this.f1579b;
        return (i5 < 0 || wVar.f1579b < 0) ? TextUtils.equals(str, wVar.f1578a) && i4 == wVar.f1580c : TextUtils.equals(str, wVar.f1578a) && i5 == wVar.f1579b && i4 == wVar.f1580c;
    }

    public final int hashCode() {
        return Objects.hash(this.f1578a, Integer.valueOf(this.f1580c));
    }
}
