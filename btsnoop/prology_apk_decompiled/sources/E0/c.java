package E0;

import W.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f524b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f525c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f526d;

    public static Serializable l(int i4, r rVar) {
        if (i4 == 0) {
            return Double.valueOf(Double.longBitsToDouble(rVar.o()));
        }
        if (i4 == 1) {
            return Boolean.valueOf(rVar.u() == 1);
        }
        if (i4 == 2) {
            return n(rVar);
        }
        if (i4 != 3) {
            if (i4 == 8) {
                return m(rVar);
            }
            if (i4 != 10) {
                if (i4 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(rVar.o()));
                rVar.H(2);
                return date;
            }
            int y4 = rVar.y();
            ArrayList arrayList = new ArrayList(y4);
            for (int i5 = 0; i5 < y4; i5++) {
                Serializable l4 = l(rVar.u(), rVar);
                if (l4 != null) {
                    arrayList.add(l4);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String n4 = n(rVar);
            int u4 = rVar.u();
            if (u4 == 9) {
                return hashMap;
            }
            Serializable l5 = l(u4, rVar);
            if (l5 != null) {
                hashMap.put(n4, l5);
            }
        }
    }

    public static HashMap m(r rVar) {
        int y4 = rVar.y();
        HashMap hashMap = new HashMap(y4);
        for (int i4 = 0; i4 < y4; i4++) {
            String n4 = n(rVar);
            Serializable l4 = l(rVar.u(), rVar);
            if (l4 != null) {
                hashMap.put(n4, l4);
            }
        }
        return hashMap;
    }

    public static String n(r rVar) {
        int A4 = rVar.A();
        int i4 = rVar.f2695b;
        rVar.H(A4);
        return new String(rVar.f2694a, i4, A4);
    }
}
