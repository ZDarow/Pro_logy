package p046L1;

/* renamed from: L1.g */
/* loaded from: classes.dex */
public final class C0363g implements p011C.InterfaceC0120l, p047L2.InterfaceC0385o, p083V0.InterfaceC0772j, p054N1.InterfaceC0455j, p137h1.InterfaceC1501a, p142i1.InterfaceC1538c, p140i.InterfaceC1522n, p146j0.InterfaceC1705i, p161m0.InterfaceC1847d {

    /* renamed from: m */
    public static p046L1.C0363g f1109m;

    /* renamed from: n */
    public static final /* synthetic */ p046L1.C0363g f1110n = new p046L1.C0363g(16, false);

    /* renamed from: o */
    public static p046L1.C0363g f1111o;

    /* renamed from: l */
    public final /* synthetic */ int f1112l;

    public /* synthetic */ C0363g(int i4, java.lang.Object obj) {
        this.f1112l = i4;
    }

    /* renamed from: f */
    public static final boolean m812f(p010B3.C0081l c0081l) {
        p010B3.C0081l c0081l2 = p014C3.C0147d.f397c;
        java.lang.String m334b = c0081l.m334b();
        return !p182q3.AbstractC2032i.m4080n0(m334b.length() - ".class".length(), 0, ".class".length(), m334b, ".class", true);
    }

    /* renamed from: j */
    public static void m813j(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: k */
    public static android.media.MediaCodec m814k(p146j0.C1704h c1704h) {
        p146j0.C1709m c1709m = c1704h.f7087a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("createCodec:");
        java.lang.String str = c1709m.f7093a;
        sb.append(str);
        android.os.Trace.beginSection(sb.toString());
        android.media.MediaCodec createByCodecName = android.media.MediaCodec.createByCodecName(str);
        android.os.Trace.endSection();
        return createByCodecName;
    }

    /* renamed from: p */
    public static p008B1.C0026d m815p(android.content.Context context, java.lang.String[] strArr, java.lang.String str, p035I.C0291m c0291m) {
        java.lang.String[] m817r = m817r(context);
        int length = m817r.length;
        int i4 = 0;
        while (true) {
            java.util.zip.ZipFile zipFile = null;
            if (i4 >= length) {
                return null;
            }
            java.lang.String str2 = m817r[i4];
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= 5) {
                    break;
                }
                try {
                    zipFile = new java.util.zip.ZipFile(new java.io.File(str2), 1);
                    break;
                } catch (java.io.IOException unused) {
                    i5 = i6;
                }
            }
            if (zipFile != null) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 < 5) {
                        for (java.lang.String str3 : strArr) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("lib");
                            char c4 = java.io.File.separatorChar;
                            sb.append(c4);
                            sb.append(str3);
                            sb.append(c4);
                            sb.append(str);
                            java.lang.String sb2 = sb.toString();
                            c0291m.m695k("Looking for %s in APK %s...", sb2, str2);
                            java.util.zip.ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                p008B1.C0026d c0026d = new p008B1.C0026d(6, false);
                                c0026d.f99m = zipFile;
                                c0026d.f100n = entry;
                                return c0026d;
                            }
                        }
                        i7 = i8;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
            i4++;
        }
    }

    /* renamed from: q */
    public static java.lang.String[] m816q(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lib");
        char c4 = java.io.File.separatorChar;
        sb.append(c4);
        sb.append("([^\\");
        sb.append(c4);
        sb.append("]*)");
        sb.append(c4);
        sb.append(str);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(sb.toString());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : m817r(context)) {
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = new java.util.zip.ZipFile(new java.io.File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    java.util.regex.Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (java.io.IOException unused) {
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[hashSet.size()]);
    }

    /* renamed from: r */
    public static java.lang.String[] m817r(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new java.lang.String[]{applicationInfo.sourceDir};
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        java.lang.System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* renamed from: s */
    public static final p046L1.AbstractBinderC0367k m818s(android.content.pm.PackageInfo packageInfo, p046L1.AbstractBinderC0367k... abstractBinderC0367kArr) {
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            p046L1.BinderC0368l binderC0368l = new p046L1.BinderC0368l(packageInfo.signatures[0].toByteArray());
            for (int i4 = 0; i4 < abstractBinderC0367kArr.length; i4++) {
                if (abstractBinderC0367kArr[i4].equals(binderC0368l)) {
                    return abstractBinderC0367kArr[i4];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m819t(android.content.pm.PackageInfo r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L2c
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1c
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L19
            goto L1c
        L19:
            r2 = r4
        L1a:
            r3 = r0
            goto L2e
        L1c:
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo
            if (r2 != 0) goto L22
        L20:
            r2 = r1
            goto L29
        L22:
            int r2 = r2.flags
            r2 = r2 & 129(0x81, float:1.81E-43)
            if (r2 == 0) goto L20
            r2 = r0
        L29:
            r3 = r2
            r2 = r4
            goto L2e
        L2c:
            r2 = 0
            goto L1a
        L2e:
            if (r4 == 0) goto L4c
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L4c
            if (r3 == 0) goto L3d
            L1.k[] r4 = p046L1.AbstractC0369m.f1120a
            L1.k r4 = m818s(r2, r4)
            goto L49
        L3d:
            L1.k[] r4 = p046L1.AbstractC0369m.f1120a
            r4 = r4[r1]
            L1.k[] r4 = new p046L1.AbstractBinderC0367k[]{r4}
            L1.k r4 = m818s(r2, r4)
        L49:
            if (r4 == 0) goto L4c
            return r0
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046L1.C0363g.m819t(android.content.pm.PackageInfo):boolean");
    }

    @Override // p146j0.InterfaceC1705i
    /* renamed from: G */
    public p146j0.InterfaceC1706j mo820G(p146j0.C1704h c1704h) {
        android.media.MediaCodec mediaCodec = null;
        try {
            mediaCodec = m814k(c1704h);
            android.os.Trace.beginSection("configureCodec");
            mediaCodec.configure(c1704h.f7088b, c1704h.f7090d, c1704h.f7091e, 0);
            android.os.Trace.endSection();
            android.os.Trace.beginSection("startCodec");
            mediaCodec.start();
            android.os.Trace.endSection();
            return new android.support.v4.media.session.C1061t(mediaCodec);
        } catch (java.io.IOException | java.lang.RuntimeException e4) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e4;
        }
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        switch (this.f1112l) {
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0335k.mo742b(null);
                return;
            default:
                c0335k.mo742b(null);
                return;
        }
    }

    @Override // p054N1.InterfaceC0455j
    /* renamed from: J */
    public void mo751J(java.lang.Object obj, java.lang.Object obj2) {
        p046L1.C0359c c0359c;
        p119d2.C1285d c1285d = (p119d2.C1285d) obj2;
        p096Y1.C0898i c0898i = (p096Y1.C0898i) obj;
        p104a2.C1003a c1003a = new p104a2.C1003a(Long.MAX_VALUE, 0, false, null);
        p046L1.C0359c[] mo885b = c0898i.mo885b();
        p046L1.C0359c c0359c2 = null;
        if (mo885b != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= mo885b.length) {
                    c0359c = null;
                    break;
                }
                c0359c = mo885b[i4];
                if ("location_updates_with_callback".equals(c0359c.f1100l)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (c0359c != null && c0359c.m804d() >= 1) {
                p096Y1.C0913x c0913x = (p096Y1.C0913x) c0898i.m2935q();
                p096Y1.C0900k c0900k = new p096Y1.C0900k(4, null, new p096Y1.BinderC0894e(1, c1285d), null, null);
                android.os.Parcel m1657K = c0913x.m1657K();
                p096Y1.AbstractC0892c.m1735b(m1657K, c1003a);
                p096Y1.AbstractC0892c.m1735b(m1657K, c0900k);
                c0913x.m1658V(m1657K, 90);
                return;
            }
        }
        p046L1.C0359c[] mo885b2 = c0898i.mo885b();
        if (mo885b2 != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= mo885b2.length) {
                    break;
                }
                p046L1.C0359c c0359c3 = mo885b2[i5];
                if ("get_last_location_with_request".equals(c0359c3.f1100l)) {
                    c0359c2 = c0359c3;
                    break;
                }
                i5++;
            }
            if (c0359c2 != null && c0359c2.m804d() >= 1) {
                p096Y1.C0913x c0913x2 = (p096Y1.C0913x) c0898i.m2935q();
                p096Y1.BinderC0894e binderC0894e = new p096Y1.BinderC0894e(1, c1285d);
                android.os.Parcel m1657K2 = c0913x2.m1657K();
                p096Y1.AbstractC0892c.m1735b(m1657K2, c1003a);
                m1657K2.writeStrongBinder(binderC0894e);
                c0913x2.m1658V(m1657K2, 82);
                return;
            }
        }
        p096Y1.C0913x c0913x3 = (p096Y1.C0913x) c0898i.m2935q();
        android.os.Parcel m1657K3 = c0913x3.m1657K();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                c0913x3.f2908d.transact(7, m1657K3, obtain, 0);
                obtain.readException();
                m1657K3.recycle();
                android.location.Location location = (android.location.Location) p096Y1.AbstractC0892c.m1734a(obtain, android.location.Location.CREATOR);
                obtain.recycle();
                c1285d.m3021a(location);
            } catch (java.lang.RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } catch (java.lang.Throwable th) {
            m1657K3.recycle();
            throw th;
        }
    }

    @Override // p140i.InterfaceC1522n
    /* renamed from: a */
    public void mo821a(p140i.MenuC1517i menuC1517i, boolean z4) {
    }

    @Override // p011C.InterfaceC0120l
    /* renamed from: b */
    public void mo433b(int i4, int i5, int i6, boolean z4) {
    }

    @Override // p011C.InterfaceC0120l
    /* renamed from: c */
    public void mo434c(int i4, int i5, int i6, int i7) {
    }

    @Override // p083V0.InterfaceC0772j
    /* renamed from: d */
    public p083V0.InterfaceC0774l mo591d(p076T.C0702p c0702p) {
        java.lang.String str = c0702p.f2408m;
        if (str != null) {
            java.util.List list = c0702p.f2411p;
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c4 = 7;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    return new p091X0.C0838h(list);
                case 1:
                    return new p035I.C0291m(6);
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    return new p118d1.C1272a(0);
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    return new p094Y.C0886x(9, (byte) 0);
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    return new p113c1.C1245a(list);
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    return new p099Z0.C0924a(list);
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return new p103a1.C1002a();
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return new p108b1.C1182e();
            }
        }
        throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m153l("Unsupported MIME type: ", str));
    }

    @Override // p083V0.InterfaceC0772j
    /* renamed from: e */
    public int mo592e(p076T.C0702p c0702p) {
        java.lang.String str = c0702p.f2408m;
        if (str != null) {
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c4 = 7;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    return 2;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    return 1;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    return 2;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return 1;
            }
        }
        throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m153l("Unsupported MIME type: ", str));
    }

    @Override // p137h1.InterfaceC1501a
    /* renamed from: g */
    public java.lang.CharSequence mo593g(androidx.preference.Preference preference) {
        androidx.preference.EditTextPreference editTextPreference = (androidx.preference.EditTextPreference) preference;
        editTextPreference.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            return editTextPreference.f4378l.getString(com.prology.R.string.not_set);
        }
        return null;
    }

    @Override // p140i.InterfaceC1522n
    /* renamed from: h */
    public boolean mo822h(p140i.MenuC1517i menuC1517i) {
        return false;
    }

    @Override // p142i1.InterfaceC1538c
    /* renamed from: i */
    public void mo595i(int i4, java.io.Serializable serializable) {
    }

    @Override // p161m0.InterfaceC1847d
    /* renamed from: l */
    public p161m0.InterfaceC1848e mo597l(int i4) {
        p161m0.C1843H c1843h = new p161m0.C1843H();
        p161m0.C1843H c1843h2 = new p161m0.C1843H();
        try {
            c1843h.f7445l.mo1686b(p176p1.AbstractC1949a.m3945x(0));
            int mo3806m = c1843h.mo3806m();
            boolean z4 = mo3806m % 2 == 0;
            c1843h2.f7445l.mo1686b(p176p1.AbstractC1949a.m3945x(z4 ? mo3806m + 1 : mo3806m - 1));
            if (z4) {
                c1843h.f7446m = c1843h2;
                return c1843h;
            }
            c1843h2.f7446m = c1843h;
            return c1843h2;
        } catch (java.io.IOException e4) {
            p101a.AbstractC0936a.m1805m(c1843h);
            p101a.AbstractC0936a.m1805m(c1843h2);
            throw e4;
        }
    }

    @Override // p142i1.InterfaceC1538c
    /* renamed from: m */
    public void mo598m() {
    }

    /* renamed from: n */
    public java.lang.String m823n(java.util.List list) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (java.io.IOException e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }

    @Override // p083V0.InterfaceC0772j
    /* renamed from: o */
    public boolean mo600o(p076T.C0702p c0702p) {
        java.lang.String str = c0702p.f2408m;
        return java.util.Objects.equals(str, "text/x-ssa") || java.util.Objects.equals(str, "text/vtt") || java.util.Objects.equals(str, "application/x-mp4-vtt") || java.util.Objects.equals(str, "application/x-subrip") || java.util.Objects.equals(str, "application/x-quicktime-tx3g") || java.util.Objects.equals(str, "application/pgs") || java.util.Objects.equals(str, "application/dvbsubs") || java.util.Objects.equals(str, "application/ttml+xml");
    }

    public /* synthetic */ C0363g(int i4, boolean z4) {
        this.f1112l = i4;
    }

    public C0363g(android.content.Context context) {
        this.f1112l = 17;
        context.getApplicationContext();
    }

    public C0363g(int i4) {
        this.f1112l = i4;
        switch (i4) {
            case 26:
                new p165n.C1883j(0);
                new p165n.C1880g();
                return;
            default:
                new java.util.concurrent.CopyOnWriteArrayList();
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0363g(android.support.v4.media.session.C1061t c1061t) {
        this(10);
        this.f1112l = 10;
    }
}
