package p108b1;

/* renamed from: b1.c */
/* loaded from: classes.dex */
public final class C1180c {

    /* renamed from: a */
    public final java.lang.String f4562a;

    /* renamed from: b */
    public final java.lang.String f4563b;

    /* renamed from: c */
    public final boolean f4564c;

    /* renamed from: d */
    public final long f4565d;

    /* renamed from: e */
    public final long f4566e;

    /* renamed from: f */
    public final p108b1.C1184g f4567f;

    /* renamed from: g */
    public final java.lang.String[] f4568g;

    /* renamed from: h */
    public final java.lang.String f4569h;

    /* renamed from: i */
    public final java.lang.String f4570i;

    /* renamed from: j */
    public final p108b1.C1180c f4571j;

    /* renamed from: k */
    public final java.util.HashMap f4572k;

    /* renamed from: l */
    public final java.util.HashMap f4573l;

    /* renamed from: m */
    public java.util.ArrayList f4574m;

    public C1180c(java.lang.String str, java.lang.String str2, long j4, long j5, p108b1.C1184g c1184g, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, p108b1.C1180c c1180c) {
        this.f4562a = str;
        this.f4563b = str2;
        this.f4570i = str4;
        this.f4567f = c1184g;
        this.f4568g = strArr;
        this.f4564c = str2 != null;
        this.f4565d = j4;
        this.f4566e = j5;
        str3.getClass();
        this.f4569h = str3;
        this.f4571j = c1180c;
        this.f4572k = new java.util.HashMap();
        this.f4573l = new java.util.HashMap();
    }

    /* renamed from: a */
    public static p108b1.C1180c m2815a(java.lang.String str) {
        return new p108b1.C1180c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    public static android.text.SpannableStringBuilder m2816e(java.lang.String str, java.util.TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            p082V.C0756a c0756a = new p082V.C0756a();
            c0756a.f2617a = new android.text.SpannableStringBuilder();
            treeMap.put(str, c0756a);
        }
        java.lang.CharSequence charSequence = ((p082V.C0756a) treeMap.get(str)).f2617a;
        charSequence.getClass();
        return (android.text.SpannableStringBuilder) charSequence;
    }

    /* renamed from: b */
    public final p108b1.C1180c m2817b(int i4) {
        java.util.ArrayList arrayList = this.f4574m;
        if (arrayList != null) {
            return (p108b1.C1180c) arrayList.get(i4);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public final int m2818c() {
        java.util.ArrayList arrayList = this.f4574m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: d */
    public final void m2819d(java.util.TreeSet treeSet, boolean z4) {
        java.lang.String str = this.f4562a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z4 || equals || (equals2 && this.f4570i != null)) {
            long j4 = this.f4565d;
            if (j4 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j4));
            }
            long j5 = this.f4566e;
            if (j5 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j5));
            }
        }
        if (this.f4574m == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f4574m.size(); i4++) {
            ((p108b1.C1180c) this.f4574m.get(i4)).m2819d(treeSet, z4 || equals);
        }
    }

    /* renamed from: f */
    public final boolean m2820f(long j4) {
        long j5 = this.f4565d;
        long j6 = this.f4566e;
        return (j5 == -9223372036854775807L && j6 == -9223372036854775807L) || (j5 <= j4 && j6 == -9223372036854775807L) || ((j5 == -9223372036854775807L && j4 < j6) || (j5 <= j4 && j4 < j6));
    }

    /* renamed from: g */
    public final void m2821g(long j4, java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.String str2;
        java.lang.String str3 = this.f4569h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m2820f(j4) && "div".equals(this.f4562a) && (str2 = this.f4570i) != null) {
            arrayList.add(new android.util.Pair(str, str2));
            return;
        }
        for (int i4 = 0; i4 < m2818c(); i4++) {
            m2817b(i4).m2821g(j4, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2822h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108b1.C1180c.m2822h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    /* renamed from: i */
    public final void m2823i(long j4, boolean z4, java.lang.String str, java.util.TreeMap treeMap) {
        java.util.HashMap hashMap = this.f4572k;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f4573l;
        hashMap2.clear();
        java.lang.String str2 = this.f4562a;
        if ("metadata".equals(str2)) {
            return;
        }
        java.lang.String str3 = this.f4569h;
        java.lang.String str4 = "".equals(str3) ? str : str3;
        if (this.f4564c && z4) {
            android.text.SpannableStringBuilder m2816e = m2816e(str4, treeMap);
            java.lang.String str5 = this.f4563b;
            str5.getClass();
            m2816e.append((java.lang.CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            m2816e(str4, treeMap).append('\n');
            return;
        }
        if (m2820f(j4)) {
            for (java.util.Map.Entry entry : treeMap.entrySet()) {
                java.lang.String str6 = (java.lang.String) entry.getKey();
                java.lang.CharSequence charSequence = ((p082V.C0756a) entry.getValue()).f2617a;
                charSequence.getClass();
                hashMap.put(str6, java.lang.Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i4 = 0; i4 < m2818c(); i4++) {
                m2817b(i4).m2823i(j4, z4 || equals, str4, treeMap);
            }
            if (equals) {
                android.text.SpannableStringBuilder m2816e2 = m2816e(str4, treeMap);
                int length = m2816e2.length() - 1;
                while (length >= 0 && m2816e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && m2816e2.charAt(length) != '\n') {
                    m2816e2.append('\n');
                }
            }
            for (java.util.Map.Entry entry2 : treeMap.entrySet()) {
                java.lang.String str7 = (java.lang.String) entry2.getKey();
                java.lang.CharSequence charSequence2 = ((p082V.C0756a) entry2.getValue()).f2617a;
                charSequence2.getClass();
                hashMap2.put(str7, java.lang.Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
