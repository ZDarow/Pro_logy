package p101a;

/* renamed from: a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0936a {

    /* renamed from: a */
    public static java.lang.Boolean f3300a;

    /* renamed from: b */
    public static boolean f3301b;

    /* renamed from: c */
    public static java.lang.ref.WeakReference f3302c;

    /* renamed from: d */
    public static java.lang.ref.WeakReference f3303d;

    /* renamed from: e */
    public static java.lang.ref.WeakReference f3304e;

    /* renamed from: f */
    public static java.lang.ref.WeakReference f3305f;

    /* renamed from: g */
    public static long f3306g;

    /* renamed from: h */
    public static java.lang.reflect.Method f3307h;

    /* renamed from: i */
    public static java.lang.reflect.Method f3308i;

    /* renamed from: j */
    public static java.lang.reflect.Method f3309j;

    /* renamed from: A */
    public static int m1763A(android.content.Context context, int i4, int i5) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId != 0 ? i4 : i5;
    }

    /* renamed from: B */
    public static float m1764B(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return p024F.AbstractC0202e.m563b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: C */
    public static java.lang.String m1765C(android.content.res.TypedArray typedArray, int i4, int i5) {
        java.lang.String string = typedArray.getString(i4);
        return string == null ? typedArray.getString(i5) : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static final p187r3.InterfaceC2130u m1766D(androidx.lifecycle.AbstractC1160x abstractC1160x) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.HashMap hashMap = abstractC1160x.f4340a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = abstractC1160x.f4340a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        p187r3.InterfaceC2130u interfaceC2130u = (p187r3.InterfaceC2130u) obj;
        if (interfaceC2130u != null) {
            return interfaceC2130u;
        }
        p187r3.C2091T c2091t = new p187r3.C2091T(null);
        p218y3.C2421d c2421d = p187r3.AbstractC2074B.f8425a;
        androidx.lifecycle.C1137a c1137a = new androidx.lifecycle.C1137a(m1772J(c2091t, p209w3.AbstractC2353o.f9301a.f8595q));
        synchronized (abstractC1160x.f4340a) {
            try {
                obj2 = abstractC1160x.f4340a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
                if (obj2 == 0) {
                    abstractC1160x.f4340a.put("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", c1137a);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (obj2 != 0) {
            c1137a = obj2;
        }
        if (abstractC1160x.f4341b && (c1137a instanceof java.io.Closeable)) {
            try {
                c1137a.close();
            } catch (java.io.IOException e4) {
                throw new java.lang.RuntimeException(e4);
            }
        }
        return c1137a;
    }

    /* renamed from: E */
    public static void m1767E(java.lang.String str, java.lang.Exception exc) {
        if (exc instanceof java.lang.reflect.InvocationTargetException) {
            java.lang.Throwable cause = exc.getCause();
            if (!(cause instanceof java.lang.RuntimeException)) {
                throw new java.lang.RuntimeException(cause);
            }
            throw ((java.lang.RuntimeException) cause);
        }
        android.util.Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: F */
    public static boolean m1768F(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager.PackageInfoFlags of;
        android.content.pm.PackageInfo packageInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String packageName = context.getPackageName();
            if (android.os.Build.VERSION.SDK_INT < 33) {
                packageInfo = packageManager.getPackageInfo(packageName, 4096);
            } else {
                of = android.content.pm.PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            }
            java.lang.String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (java.lang.String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
        }
        return false;
    }

    /* renamed from: G */
    public static int m1769G(int i4, int i5, int i6, int[] iArr) {
        while (i5 < i6) {
            if (iArr[i5] == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* renamed from: H */
    public static p110b3.InterfaceC1195i m1770H(p110b3.InterfaceC1193g interfaceC1193g, p110b3.InterfaceC1194h interfaceC1194h) {
        p154k3.AbstractC1803h.m3779e(interfaceC1194h, "key");
        return p154k3.AbstractC1803h.m3775a(interfaceC1193g.getKey(), interfaceC1194h) ? p110b3.C1196j.f4623l : interfaceC1193g;
    }

    /* renamed from: I */
    public static float m1771I(android.widget.EdgeEffect edgeEffect, float f4, float f5) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return p024F.AbstractC0202e.m564c(edgeEffect, f4, f5);
        }
        p024F.AbstractC0201d.m561a(edgeEffect, f4, f5);
        return f4;
    }

    /* renamed from: J */
    public static p110b3.InterfaceC1195i m1772J(p110b3.InterfaceC1193g interfaceC1193g, p110b3.InterfaceC1195i interfaceC1195i) {
        p154k3.AbstractC1803h.m3779e(interfaceC1195i, "context");
        return interfaceC1195i == p110b3.C1196j.f4623l ? interfaceC1193g : (p110b3.InterfaceC1195i) interfaceC1195i.mo679k(interfaceC1193g, new p110b3.C1188b(1));
    }

    /* renamed from: K */
    public static boolean m1773K(android.os.Parcel parcel, int i4) {
        m1798f0(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: L */
    public static int m1774L(p086W.C0797q c0797q, int i4, int i5, int i6) {
        p086W.AbstractC0781a.m1416e(java.lang.Math.max(java.lang.Math.max(i4, i5), i6) <= 31);
        int i7 = (1 << i4) - 1;
        int i8 = (1 << i5) - 1;
        p176p1.AbstractC1949a.m3939p(p176p1.AbstractC1949a.m3939p(i7, i8), 1 << i6);
        if (c0797q.m1511b() < i4) {
            return -1;
        }
        int m1518i = c0797q.m1518i(i4);
        if (m1518i != i7) {
            return m1518i;
        }
        if (c0797q.m1511b() < i5) {
            return -1;
        }
        int m1518i2 = c0797q.m1518i(i5);
        int i9 = m1518i + m1518i2;
        if (m1518i2 != i8) {
            return i9;
        }
        if (c0797q.m1511b() < i6) {
            return -1;
        }
        return i9 + c0797q.m1518i(i6);
    }

    /* renamed from: M */
    public static android.os.IBinder m1775M(android.os.Parcel parcel, int i4) {
        int m1778P = m1778P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (m1778P == 0) {
            return null;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m1778P);
        return readStrongBinder;
    }

    /* renamed from: N */
    public static int m1776N(android.os.Parcel parcel, int i4) {
        m1798f0(parcel, i4, 4);
        return parcel.readInt();
    }

    /* renamed from: O */
    public static long m1777O(android.os.Parcel parcel, int i4) {
        m1798f0(parcel, i4, 8);
        return parcel.readLong();
    }

    /* renamed from: P */
    public static int m1778P(android.os.Parcel parcel, int i4) {
        return (i4 & (-65536)) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    /* renamed from: Q */
    public static p047L2.InterfaceC0386p m1779Q() {
        java.lang.ref.WeakReference weakReference = f3305f;
        if (weakReference == null) {
            p154k3.AbstractC1803h.m3783i("result");
            throw null;
        }
        p047L2.InterfaceC0386p interfaceC0386p = (p047L2.InterfaceC0386p) weakReference.get();
        if (interfaceC0386p != null) {
            return interfaceC0386p;
        }
        throw new java.lang.Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    /* renamed from: R */
    public static int m1780R(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    /* renamed from: S */
    public static void m1781S(p086W.C0797q c0797q) {
        c0797q.m1529t(3);
        c0797q.m1529t(8);
        boolean m1517h = c0797q.m1517h();
        boolean m1517h2 = c0797q.m1517h();
        if (m1517h) {
            c0797q.m1529t(5);
        }
        if (m1517h2) {
            c0797q.m1529t(6);
        }
    }

    /* renamed from: T */
    public static void m1782T(p086W.C0797q c0797q) {
        int m1518i;
        int m1518i2 = c0797q.m1518i(2);
        if (m1518i2 == 0) {
            c0797q.m1529t(6);
            return;
        }
        int m1774L = m1774L(c0797q, 5, 8, 16) + 1;
        if (m1518i2 == 1) {
            c0797q.m1529t(m1774L * 7);
            return;
        }
        if (m1518i2 == 2) {
            boolean m1517h = c0797q.m1517h();
            int i4 = m1517h ? 1 : 5;
            int i5 = m1517h ? 7 : 5;
            int i6 = m1517h ? 8 : 6;
            int i7 = 0;
            while (i7 < m1774L) {
                if (c0797q.m1517h()) {
                    c0797q.m1529t(7);
                    m1518i = 0;
                } else {
                    if (c0797q.m1518i(2) == 3 && c0797q.m1518i(i5) * i4 != 0) {
                        c0797q.m1528s();
                    }
                    m1518i = c0797q.m1518i(i6) * i4;
                    if (m1518i != 0 && m1518i != 180) {
                        c0797q.m1528s();
                    }
                    c0797q.m1528s();
                }
                if (m1518i != 0 && m1518i != 180 && c0797q.m1517h()) {
                    i7++;
                }
                i7++;
            }
        }
    }

    /* renamed from: U */
    public static p128f1.C1383e m1783U(int i4, p215y0.C2400l c2400l, p086W.C0798r c0798r) {
        p128f1.C1383e m3139b = p128f1.C1383e.m3139b(c2400l, c0798r);
        while (true) {
            int i5 = m3139b.f5683a;
            if (i5 == i4) {
                return m3139b;
            }
            p009B2.AbstractC0051h.m156o(i5, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j4 = m3139b.f5684b;
            long j5 = 8 + j4;
            if (j4 % 2 != 0) {
                j5 = 9 + j4;
            }
            if (j5 > 2147483647L) {
                throw p076T.C0666I.m1204c("Chunk is too large (~2GB+) to skip; id: " + i5);
            }
            c2400l.mo628e((int) j5);
            m3139b = p128f1.C1383e.m3139b(c2400l, c0798r);
        }
    }

    /* renamed from: V */
    public static void m1784V(android.os.Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + m1778P(parcel, i4));
    }

    /* renamed from: W */
    public static java.util.ArrayList m1785W(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.location.Address address = (android.location.Address) it.next();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String addressLine = address.getAddressLine(0);
            java.lang.String str = null;
            if (addressLine != null && !addressLine.isEmpty()) {
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(addressLine, ",", false);
                if (stringTokenizer.hasMoreTokens()) {
                    str = stringTokenizer.nextToken();
                }
            }
            hashMap.put("name", address.getFeatureName());
            hashMap.put("street", str);
            hashMap.put("isoCountryCode", address.getCountryCode());
            hashMap.put("country", address.getCountryName());
            hashMap.put("thoroughfare", address.getThoroughfare());
            hashMap.put("subThoroughfare", address.getSubThoroughfare());
            hashMap.put("postalCode", address.getPostalCode());
            hashMap.put("administrativeArea", address.getAdminArea());
            hashMap.put("subAdministrativeArea", address.getSubAdminArea());
            hashMap.put("locality", address.getLocality());
            hashMap.put("subLocality", address.getSubLocality());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* renamed from: X */
    public static int[] m1786X(java.util.Collection collection) {
        if (collection instanceof p143i2.C1549b) {
            p143i2.C1549b c1549b = (p143i2.C1549b) collection;
            return java.util.Arrays.copyOfRange(c1549b.f6433l, c1549b.f6434m, c1549b.f6435n);
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            java.lang.Object obj = array[i4];
            obj.getClass();
            iArr[i4] = ((java.lang.Number) obj).intValue();
        }
        return iArr;
    }

    /* renamed from: Y */
    public static boolean m1787Y(android.view.View view, p089W2.InterfaceC0823c interfaceC0823c) {
        if (view == null) {
            return false;
        }
        if (interfaceC0823c.mo287d(view)) {
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                if (m1787Y(viewGroup.getChildAt(i4), interfaceC0823c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Z */
    public static java.lang.String m1788Z(java.lang.String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* renamed from: a */
    public static java.lang.Object m1789a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: a0 */
    public static int m1790a0(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        int m1778P = m1778P(parcel, readInt);
        char c4 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new p037I1.C0307a("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(readInt))), parcel);
        }
        int i4 = m1778P + dataPosition;
        if (i4 < dataPosition || i4 > parcel.dataSize()) {
            throw new p037I1.C0307a(p009B2.AbstractC0051h.m150i(dataPosition, i4, "Size read is invalid start=", " end="), parcel);
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1791b(java.util.List r6, p035I.C0289k r7, p120d3.AbstractC1292b r8) {
        /*
            boolean r0 = r8 instanceof p035I.C0282e
            if (r0 == 0) goto L13
            r0 = r8
            I.e r0 = (p035I.C0282e) r0
            int r1 = r0.f841r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f841r = r1
            goto L18
        L13:
            I.e r0 = new I.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f840q
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f841r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f839p
            java.io.Serializable r7 = r0.f838o
            k3.p r7 = (p154k3.C1811p) r7
            p176p1.AbstractC1949a.m3913P(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f838o
            java.util.List r6 = (java.util.List) r6
            p176p1.AbstractC1949a.m3913P(r8)
            goto L5c
        L42:
            p176p1.AbstractC1949a.m3913P(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            I.g r2 = new I.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f838o = r8
            r0.f841r = r4
            java.lang.Object r6 = r7.m681a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            k3.p r7 = new k3.p
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            j3.l r8 = (p149j3.InterfaceC1737l) r8
            r0.f838o = r7     // Catch: java.lang.Throwable -> L30
            r0.f839p = r6     // Catch: java.lang.Throwable -> L30
            r0.f841r = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.mo661b(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f7374l
            if (r2 != 0) goto L85
            r7.f7374l = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            m1793c(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f7374l
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            Z2.g r1 = p100Z2.C0934g.f3298a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p101a.AbstractC0936a.m1791b(java.util.List, I.k, d3.b):java.lang.Object");
    }

    /* renamed from: b0 */
    public static java.util.ArrayList m1792b0(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
        return arrayList;
    }

    /* renamed from: c */
    public static void m1793c(java.lang.Throwable th, java.lang.Throwable th2) {
        p154k3.AbstractC1803h.m3779e(th, "<this>");
        p154k3.AbstractC1803h.m3779e(th2, "exception");
        if (th != th2) {
            java.lang.Integer num = p130f3.AbstractC1454a.f5829a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            java.lang.reflect.Method method = p125e3.AbstractC1365a.f5644a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* renamed from: c0 */
    public static java.util.ArrayList m1794c0(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        if (th instanceof p075S2.C0649b) {
            p075S2.C0649b c0649b = (p075S2.C0649b) th;
            arrayList.add(c0649b.f2130l);
            arrayList.add(c0649b.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static java.util.List m1795d(int... iArr) {
        return iArr.length == 0 ? java.util.Collections.emptyList() : new p143i2.C1549b(0, iArr.length, iArr);
    }

    /* renamed from: d0 */
    public static java.util.ArrayList m1796d0(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
        return arrayList;
    }

    /* renamed from: e0 */
    public static void m1797e0(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: f0 */
    public static void m1798f0(android.os.Parcel parcel, int i4, int i5) {
        int m1778P = m1778P(parcel, i4);
        if (m1778P == i5) {
            return;
        }
        java.lang.String hexString = java.lang.Integer.toHexString(m1778P);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(m1778P);
        sb.append(" (0x");
        throw new p037I1.C0307a(p009B2.AbstractC0051h.m154m(sb, hexString, ")"), parcel);
    }

    /* renamed from: g */
    public static void m1799g(android.content.Context context, p089W2.InterfaceC0822b interfaceC0822b) {
        android.graphics.Rect rect;
        p011C.C0105O mo354b;
        android.view.WindowMetrics maximumWindowMetrics;
        android.app.Activity m1818z = m1818z(context);
        if (m1818z != null) {
            p198u1.InterfaceC2244l.f8935a.getClass();
            int i4 = p198u1.C2245m.f8936b;
            int i5 = android.os.Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                maximumWindowMetrics = ((android.view.WindowManager) m1818z.getSystemService(android.view.WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                p154k3.AbstractC1803h.m3778d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                java.lang.Object systemService = m1818z.getSystemService("window");
                p154k3.AbstractC1803h.m3777c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
                p154k3.AbstractC1803h.m3778d(defaultDisplay, "display");
                android.graphics.Point point = new android.graphics.Point();
                defaultDisplay.getRealSize(point);
                rect = new android.graphics.Rect(0, 0, point.x, point.y);
            }
            if (i5 < 30) {
                mo354b = (i5 >= 34 ? new p011C.C0093C() : i5 >= 30 ? new p011C.C0092B() : i5 >= 29 ? new p011C.C0091A() : new p011C.C0134z()).mo354b();
                p154k3.AbstractC1803h.m3778d(mo354b, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i5 < 30) {
                    throw new java.lang.Exception("Incompatible SDK version");
                }
                mo354b = p216y1.C2416b.f9505a.m4653a(m1818z);
            }
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            if (i6 > i8) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i6, i8, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i7 > i9) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i7, i9, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            p154k3.AbstractC1803h.m3779e(mo354b, "_windowInsetsCompat");
            ((p013C2.C0138c) interfaceC0822b).f351a.updateDisplayMetrics(0, new android.graphics.Rect(i6, i7, i8, i9).width(), new android.graphics.Rect(i6, i7, i8, i9).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    /* renamed from: h */
    public static p047L2.C0384n m1800h() {
        java.lang.ref.WeakReference weakReference = f3304e;
        if (weakReference == null) {
            p154k3.AbstractC1803h.m3783i("call");
            throw null;
        }
        p047L2.C0384n c0384n = (p047L2.C0384n) weakReference.get();
        if (c0384n != null) {
            return c0384n;
        }
        throw new java.lang.Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    /* renamed from: i */
    public static boolean m1801i(p215y0.C2400l c2400l) {
        p086W.C0798r c0798r = new p086W.C0798r(8);
        int i4 = p128f1.C1383e.m3139b(c2400l, c0798r).f5683a;
        if (i4 != 1380533830 && i4 != 1380333108) {
            return false;
        }
        c2400l.mo634p(c0798r.f2786a, 0, 4, false);
        c0798r.m1537G(0);
        int m1546h = c0798r.m1546h();
        if (m1546h == 1463899717) {
            return true;
        }
        p086W.AbstractC0781a.m1425n("WavHeaderReader", "Unsupported form type: " + m1546h);
        return false;
    }

    /* renamed from: j */
    public static void m1802j(java.lang.String str, long j4) {
        if (j4 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " (" + j4 + ") must be >= 0");
    }

    /* renamed from: k */
    public static final java.lang.String m1803k(java.lang.Integer num, int i4, boolean z4) {
        java.lang.String str = z4 ? i4 == 0 ? " COLLATE NOCASE ASC" : " COLLATE NOCASE DESC" : i4 == 0 ? " ASC" : " DESC";
        return (num != null && num.intValue() == 0) ? "title".concat(str) : (num != null && num.intValue() == 1) ? "artist".concat(str) : (num != null && num.intValue() == 2) ? "album".concat(str) : (num != null && num.intValue() == 3) ? "duration".concat(str) : (num != null && num.intValue() == 4) ? "date_added".concat(str) : (num != null && num.intValue() == 5) ? "_size".concat(str) : (num != null && num.intValue() == 6) ? "_display_name".concat(str) : "title_key".concat(str);
    }

    /* renamed from: l */
    public static int m1804l(long j4) {
        int i4 = (int) j4;
        p176p1.AbstractC1949a.m3934k(((long) i4) == j4, "Out of range: %s", j4);
        return i4;
    }

    /* renamed from: m */
    public static void m1805m(p094Y.InterfaceC0870h interfaceC0870h) {
        if (interfaceC0870h != null) {
            try {
                interfaceC0870h.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: n */
    public static android.content.Context m1806n() {
        java.lang.ref.WeakReference weakReference = f3302c;
        if (weakReference == null) {
            p154k3.AbstractC1803h.m3783i("context");
            throw null;
        }
        android.content.Context context = (android.content.Context) weakReference.get();
        if (context != null) {
            return context;
        }
        throw new java.lang.Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    /* renamed from: o */
    public static final void m1807o(int i4, int i5) {
        if (i4 <= i5) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i5 + ").");
    }

    /* renamed from: p */
    public static android.os.Parcelable m1808p(android.os.Parcel parcel, int i4, android.os.Parcelable.Creator creator) {
        int m1778P = m1778P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (m1778P == 0) {
            return null;
        }
        android.os.Parcelable parcelable = (android.os.Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m1778P);
        return parcelable;
    }

    /* renamed from: q */
    public static java.lang.String m1809q(android.os.Parcel parcel, int i4) {
        int m1778P = m1778P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (m1778P == 0) {
            return null;
        }
        java.lang.String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m1778P);
        return readString;
    }

    /* renamed from: r */
    public static java.lang.Object[] m1810r(android.os.Parcel parcel, int i4, android.os.Parcelable.Creator creator) {
        int m1778P = m1778P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (m1778P == 0) {
            return null;
        }
        java.lang.Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m1778P);
        return createTypedArray;
    }

    /* renamed from: s */
    public static java.util.ArrayList m1811s(android.os.Parcel parcel, int i4, android.os.Parcelable.Creator creator) {
        int m1778P = m1778P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (m1778P == 0) {
            return null;
        }
        java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m1778P);
        return createTypedArrayList;
    }

    /* renamed from: t */
    public static p010B3.C0071b m1812t(java.lang.String str) {
        byte[] bytes = str.getBytes(p182q3.AbstractC2024a.f8253a);
        p154k3.AbstractC1803h.m3778d(bytes, "this as java.lang.String).getBytes(charset)");
        p010B3.C0071b c0071b = new p010B3.C0071b(bytes);
        c0071b.f233n = str;
        return c0071b;
    }

    /* renamed from: u */
    public static void m1813u(android.os.Parcel parcel, int i4) {
        if (parcel.dataPosition() != i4) {
            throw new p037I1.C0307a(p009B2.AbstractC0051h.m152k("Overread allowed size end=", i4), parcel);
        }
    }

    /* renamed from: v */
    public static boolean m1814v(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: w */
    public static java.lang.String m1815w(androidx.datastore.preferences.protobuf.C1105g c1105g) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(c1105g.size());
        for (int i4 = 0; i4 < c1105g.size(); i4++) {
            byte mo2496a = c1105g.mo2496a(i4);
            if (mo2496a == 34) {
                sb.append("\\\"");
            } else if (mo2496a == 39) {
                sb.append("\\'");
            } else if (mo2496a != 92) {
                switch (mo2496a) {
                    case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (mo2496a < 32 || mo2496a > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo2496a >>> 6) & 3) + 48));
                            sb.append((char) (((mo2496a >>> 3) & 7) + 48));
                            sb.append((char) ((mo2496a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) mo2496a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: x */
    public static int m1816x(byte[] bArr) {
        boolean z4 = bArr.length >= 4;
        int length = bArr.length;
        if (!z4) {
            throw new java.lang.IllegalArgumentException(p080U1.AbstractC0748a.m1386u("array too small: %s < %s", java.lang.Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* renamed from: y */
    public static p110b3.InterfaceC1193g m1817y(p110b3.InterfaceC1193g interfaceC1193g, p110b3.InterfaceC1194h interfaceC1194h) {
        p154k3.AbstractC1803h.m3779e(interfaceC1194h, "key");
        if (p154k3.AbstractC1803h.m3775a(interfaceC1193g.getKey(), interfaceC1194h)) {
            return interfaceC1193g;
        }
        return null;
    }

    /* renamed from: z */
    public static android.app.Activity m1818z(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return m1818z(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: e */
    public p050M1.InterfaceC0419c mo1076e(android.content.Context context, android.os.Looper looper, p013C2.C0139d c0139d, java.lang.Object obj, p050M1.InterfaceC0423g interfaceC0423g, p050M1.InterfaceC0424h interfaceC0424h) {
        return mo1077f(context, looper, c0139d, obj, (p054N1.C0460o) interfaceC0423g, (p054N1.C0460o) interfaceC0424h);
    }

    /* renamed from: f */
    public p050M1.InterfaceC0419c mo1077f(android.content.Context context, android.os.Looper looper, p013C2.C0139d c0139d, java.lang.Object obj, p054N1.C0460o c0460o, p054N1.C0460o c0460o2) {
        throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
    }
}
