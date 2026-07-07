package b1;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4404b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4405c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4406d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4407e;

    /* renamed from: f, reason: collision with root package name */
    public final C0184g f4408f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f4409g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4410h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4411i;

    /* renamed from: j, reason: collision with root package name */
    public final C0180c f4412j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f4413k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f4414l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4415m;

    public C0180c(String str, String str2, long j4, long j5, C0184g c0184g, String[] strArr, String str3, String str4, C0180c c0180c) {
        this.f4403a = str;
        this.f4404b = str2;
        this.f4411i = str4;
        this.f4408f = c0184g;
        this.f4409g = strArr;
        this.f4405c = str2 != null;
        this.f4406d = j4;
        this.f4407e = j5;
        str3.getClass();
        this.f4410h = str3;
        this.f4412j = c0180c;
        this.f4413k = new HashMap();
        this.f4414l = new HashMap();
    }

    public static C0180c a(String str) {
        return new C0180c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            V.a aVar = new V.a();
            aVar.f2529a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((V.a) treeMap.get(str)).f2529a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C0180c b(int i4) {
        ArrayList arrayList = this.f4415m;
        if (arrayList != null) {
            return (C0180c) arrayList.get(i4);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f4415m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z4) {
        String str = this.f4403a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z4 || equals || (equals2 && this.f4411i != null)) {
            long j4 = this.f4406d;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
            long j5 = this.f4407e;
            if (j5 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j5));
            }
        }
        if (this.f4415m == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f4415m.size(); i4++) {
            ((C0180c) this.f4415m.get(i4)).d(treeSet, z4 || equals);
        }
    }

    public final boolean f(long j4) {
        long j5 = this.f4406d;
        long j6 = this.f4407e;
        return (j5 == -9223372036854775807L && j6 == -9223372036854775807L) || (j5 <= j4 && j6 == -9223372036854775807L) || ((j5 == -9223372036854775807L && j4 < j6) || (j5 <= j4 && j4 < j6));
    }

    public final void g(long j4, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f4410h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j4) && "div".equals(this.f4403a) && (str2 = this.f4411i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i4 = 0; i4 < c(); i4++) {
            b(i4).g(j4, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0180c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j4, boolean z4, String str, TreeMap treeMap) {
        HashMap hashMap = this.f4413k;
        hashMap.clear();
        HashMap hashMap2 = this.f4414l;
        hashMap2.clear();
        String str2 = this.f4403a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f4410h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f4405c && z4) {
            SpannableStringBuilder e4 = e(str4, treeMap);
            String str5 = this.f4404b;
            str5.getClass();
            e4.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j4)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((V.a) entry.getValue()).f2529a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i4 = 0; i4 < c(); i4++) {
                b(i4).i(j4, z4 || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e5 = e(str4, treeMap);
                int length = e5.length() - 1;
                while (length >= 0 && e5.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e5.charAt(length) != '\n') {
                    e5.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((V.a) entry2.getValue()).f2529a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
