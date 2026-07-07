package p029G1;

/* renamed from: G1.a */
/* loaded from: classes.dex */
public final class C0238a implements p047L2.InterfaceC0389s {

    /* renamed from: o */
    public static p029G1.C0238a f691o;

    /* renamed from: l */
    public p009B2.AbstractActivityC0047d f692l;

    /* renamed from: m */
    public p017D1.C0173f f693m;

    /* renamed from: n */
    public p017D1.C0173f f694n;

    /* renamed from: a */
    public static int m645a(android.content.Context context) {
        java.util.Iterator it = m646b(context).iterator();
        while (it.hasNext()) {
            if (p176p1.AbstractC1949a.m3938o(context, (java.lang.String) it.next()) == 0) {
                if (android.os.Build.VERSION.SDK_INT < 29) {
                    return 4;
                }
                return (p101a.AbstractC0936a.m1768F(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && p176p1.AbstractC1949a.m3938o(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) ? 4 : 3;
            }
        }
        return 1;
    }

    /* renamed from: b */
    public static java.util.ArrayList m646b(android.content.Context context) {
        boolean m1768F = p101a.AbstractC0936a.m1768F(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean m1768F2 = p101a.AbstractC0936a.m1768F(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!m1768F && !m1768F2) {
            throw new java.lang.Exception();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m1768F) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (m1768F2) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m647d(android.content.Context context) {
        int m645a = m645a(context);
        return m645a == 3 || m645a == 4;
    }

    @Override // p047L2.InterfaceC0389s
    /* renamed from: c */
    public final boolean mo648c(int i4, java.lang.String[] strArr, int[] iArr) {
        int indexOf;
        int i5 = 0;
        if (i4 != 109) {
            return false;
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f692l;
        if (abstractActivityC0047d == null) {
            android.util.Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            p017D1.C0173f c0173f = this.f693m;
            if (c0173f != null) {
                c0173f.mo530c(1);
            }
            return false;
        }
        int i6 = 4;
        try {
            java.util.ArrayList m646b = m646b(abstractActivityC0047d);
            if (iArr.length == 0) {
                android.util.Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            java.util.Iterator it = m646b.iterator();
            char c4 = 65535;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                int indexOf2 = java.util.Arrays.asList(strArr).indexOf(str);
                if (indexOf2 >= 0) {
                    z4 = true;
                }
                if (iArr[indexOf2] == 0) {
                    c4 = 0;
                }
                if (p176p1.AbstractC1949a.m3912O(this.f692l, str)) {
                    z5 = true;
                }
            }
            if (!z4) {
                android.util.Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (c4 != 0) {
                i6 = !z5 ? 2 : 1;
            } else if (android.os.Build.VERSION.SDK_INT >= 29 && ((indexOf = java.util.Arrays.asList(strArr).indexOf("android.permission.ACCESS_BACKGROUND_LOCATION")) < 0 || iArr[indexOf] != 0)) {
                i6 = 3;
            }
            p017D1.C0173f c0173f2 = this.f694n;
            if (c0173f2 != null) {
                int m781b = p044L.AbstractC0352j.m781b(i6);
                if (m781b != 0) {
                    if (m781b == 1) {
                        i5 = 1;
                    } else if (m781b == 2) {
                        i5 = 2;
                    } else {
                        if (m781b != 3) {
                            throw new java.lang.IndexOutOfBoundsException();
                        }
                        i5 = 3;
                    }
                }
                c0173f2.f466b.mo742b(java.lang.Integer.valueOf(i5));
            }
            return true;
        } catch (p022E1.C0196b unused) {
            p017D1.C0173f c0173f3 = this.f693m;
            if (c0173f3 != null) {
                c0173f3.mo530c(4);
            }
            return false;
        }
    }

    /* renamed from: e */
    public final void m649e(p009B2.AbstractActivityC0047d abstractActivityC0047d, p017D1.C0173f c0173f, p017D1.C0173f c0173f2) {
        if (abstractActivityC0047d == null) {
            c0173f2.mo530c(1);
            return;
        }
        int i4 = android.os.Build.VERSION.SDK_INT;
        java.util.ArrayList m646b = m646b(abstractActivityC0047d);
        if (i4 >= 29 && p101a.AbstractC0936a.m1768F(abstractActivityC0047d, "android.permission.ACCESS_BACKGROUND_LOCATION") && m645a(abstractActivityC0047d) == 3) {
            m646b.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f693m = c0173f2;
        this.f694n = c0173f;
        this.f692l = abstractActivityC0047d;
        p176p1.AbstractC1949a.m3909L(abstractActivityC0047d, (java.lang.String[]) m646b.toArray(new java.lang.String[0]), 109);
    }
}
