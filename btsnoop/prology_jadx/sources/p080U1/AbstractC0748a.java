package p080U1;

/* renamed from: U1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0748a {

    /* renamed from: a */
    public static android.content.Context f2602a;

    /* renamed from: b */
    public static java.lang.Boolean f2603b;

    /* renamed from: c */
    public static java.lang.Boolean f2604c;

    /* renamed from: d */
    public static java.lang.Boolean f2605d;

    /* renamed from: e */
    public static java.lang.Boolean f2606e;

    /* renamed from: f */
    public static java.lang.Boolean f2607f;

    /* renamed from: C */
    public static void m1355C(com.google.android.gms.common.api.Status status, java.lang.Object obj, p119d2.C1285d c1285d) {
        if (status.f4910l <= 0) {
            c1285d.m3021a(obj);
        } else {
            c1285d.f5161a.m3026c(status.f4912n != null ? new p050M1.C0420d(status) : new p050M1.C0420d(status));
        }
    }

    /* renamed from: D */
    public static void m1356D(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new android.text.SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    /* renamed from: E */
    public static void m1357E(android.content.res.XmlResourceParser xmlResourceParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    /* renamed from: F */
    public static java.lang.Integer m1358F(java.util.HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[LOOP:0: B:14:0x0054->B:16:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1359G(p083V0.InterfaceC0766d r13, p083V0.C0773k r14, p086W.InterfaceC0783c r15) {
        /*
            long r0 = r14.f2713a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.mo657g(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r13.mo655Q()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r13.mo654B(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            int r2 = r13.mo655Q()
            if (r4 >= r2) goto L52
            java.util.List r7 = r13.mo658w(r0)
            long r2 = r13.mo654B(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L52
            long r8 = r14.f2713a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            V0.a r12 = new V0.a
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.mo655Q()
            if (r3 >= r6) goto L60
            m1387v(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f2714b
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            m1387v(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            V0.a r14 = new V0.a
            java.util.List r7 = r13.mo658w(r0)
            long r8 = r13.mo654B(r4)
            long r2 = r13.mo654B(r4)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p080U1.AbstractC0748a.m1359G(V0.d, V0.k, W.c):void");
    }

    /* renamed from: H */
    public static java.util.HashMap m1360H(android.location.Location location) {
        boolean hasMslAltitude;
        double mslAltitudeMeters;
        boolean hasMslAltitudeAccuracy;
        float mslAltitudeAccuracyMeters;
        if (location == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("latitude", java.lang.Double.valueOf(location.getLatitude()));
        hashMap.put("longitude", java.lang.Double.valueOf(location.getLongitude()));
        hashMap.put("timestamp", java.lang.Long.valueOf(location.getTime()));
        int i4 = android.os.Build.VERSION.SDK_INT;
        hashMap.put("is_mocked", java.lang.Boolean.valueOf(i4 >= 31 ? location.isMock() : location.isFromMockProvider()));
        if (location.hasAltitude()) {
            hashMap.put("altitude", java.lang.Double.valueOf(location.getAltitude()));
        }
        if (location.hasVerticalAccuracy()) {
            hashMap.put("altitude_accuracy", java.lang.Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasAccuracy()) {
            hashMap.put("accuracy", java.lang.Double.valueOf(location.getAccuracy()));
        }
        if (location.hasBearing()) {
            hashMap.put("heading", java.lang.Double.valueOf(location.getBearing()));
        }
        if (location.hasBearingAccuracy()) {
            hashMap.put("heading_accuracy", java.lang.Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (location.hasSpeed()) {
            hashMap.put("speed", java.lang.Double.valueOf(location.getSpeed()));
        }
        if (location.hasSpeedAccuracy()) {
            hashMap.put("speed_accuracy", java.lang.Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.getExtras() != null) {
            if (location.getExtras().containsKey("geolocator_mslAltitude")) {
                hashMap.put("altitude", java.lang.Double.valueOf(location.getExtras().getDouble("geolocator_mslAltitude")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatelliteCount")) {
                hashMap.put("gnss_satellite_count", java.lang.Double.valueOf(location.getExtras().getDouble("geolocator_mslSatelliteCount")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatellitesUsedInFix")) {
                hashMap.put("gnss_satellites_used_in_fix", java.lang.Double.valueOf(location.getExtras().getDouble("geolocator_mslSatellitesUsedInFix")));
            }
            if (i4 >= 34) {
                hasMslAltitude = location.hasMslAltitude();
                if (hasMslAltitude) {
                    mslAltitudeMeters = location.getMslAltitudeMeters();
                    hashMap.put("altitude", java.lang.Double.valueOf(mslAltitudeMeters));
                    hasMslAltitudeAccuracy = location.hasMslAltitudeAccuracy();
                    if (hasMslAltitudeAccuracy) {
                        mslAltitudeAccuracyMeters = location.getMslAltitudeAccuracyMeters();
                        hashMap.put("altitude_accuracy", java.lang.Float.valueOf(mslAltitudeAccuracyMeters));
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: I */
    public static java.lang.String m1361I(java.lang.String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (c4 >= 'A' && c4 <= 'Z') {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    /* renamed from: J */
    public static int m1362J(p009B2.AbstractActivityC0047d abstractActivityC0047d, java.lang.String str, int i4) {
        if (i4 == -1) {
            return m1378l(abstractActivityC0047d, str);
        }
        return 1;
    }

    /* renamed from: K */
    public static long m1363K(long j4, long j5, long j6, int i4) {
        int i5 = p086W.AbstractC0805y.f2801a;
        return j4 + p086W.AbstractC0805y.m1600U(j5 - j6, 1000000L, i4, java.math.RoundingMode.FLOOR);
    }

    /* renamed from: L */
    public static java.lang.String m1364L(java.lang.String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    /* renamed from: M */
    public static java.lang.Object m1365M(java.lang.Object obj) {
        if (obj == null) {
            return org.json.JSONObject.NULL;
        }
        if ((obj instanceof org.json.JSONArray) || (obj instanceof org.json.JSONObject) || obj.equals(org.json.JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof java.util.Collection) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(m1365M(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            int length = java.lang.reflect.Array.getLength(obj);
            for (int i4 = 0; i4 < length; i4++) {
                jSONArray2.put(m1365M(java.lang.reflect.Array.get(obj, i4)));
            }
            return jSONArray2;
        }
        if (obj instanceof java.util.Map) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), m1365M(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    /* renamed from: N */
    public static java.util.ArrayList m1366N(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
        return arrayList;
    }

    /* renamed from: P */
    public static java.lang.String m1367P(java.lang.String str, java.lang.Object... objArr) {
        int length;
        int length2;
        int indexOf;
        java.lang.String sb;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            java.lang.Object obj = objArr[i5];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (java.lang.Exception e4) {
                    java.lang.String name = obj.getClass().getName();
                    java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(name.length() + 1 + java.lang.String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append("@");
                    sb2.append(hexString);
                    java.lang.String sb3 = sb2.toString();
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb3), (java.lang.Throwable) e4);
                    java.lang.String name2 = e4.getClass().getName();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(name2.length() + sb3.length() + 8 + 1);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i5] = sb;
            i5++;
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb5.append((java.lang.CharSequence) str, i6, indexOf);
            sb5.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb5.append((java.lang.CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb5.append(", ");
                sb5.append(objArr[i7]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    /* renamed from: a */
    public static final boolean m1368a(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        p154k3.AbstractC1803h.m3779e(bArr, "a");
        p154k3.AbstractC1803h.m3779e(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static p094Y.C0874l m1369b(p122e0.AbstractC1312m abstractC1312m, java.lang.String str, p122e0.C1309j c1309j, int i4) {
        p094Y.C0873k c0873k = new p094Y.C0873k();
        c0873k.f3127a = p086W.AbstractC0781a.m1436y(str, c1309j.f5260c);
        c0873k.f3130d = c1309j.f5258a;
        c0873k.f3131e = c1309j.f5259b;
        java.lang.String mo3067b = abstractC1312m.mo3067b();
        if (mo3067b == null) {
            mo3067b = p086W.AbstractC0781a.m1436y(((p122e0.C1301b) abstractC1312m.f5266m.get(0)).f5213a, c1309j.f5260c).toString();
        }
        c0873k.f3132f = mo3067b;
        c0873k.f3133g = i4;
        c0873k.f3129c = p129f2.C1425h0.f5764r;
        p086W.AbstractC0781a.m1423l(c0873k.f3127a, "The uri must be set.");
        return new p094Y.C0874l(c0873k.f3127a, c0873k.f3128b, null, c0873k.f3129c, c0873k.f3130d, c0873k.f3131e, c0873k.f3132f, c0873k.f3133g);
    }

    /* renamed from: c */
    public static final java.lang.String m1370c(java.lang.Integer num, int i4, boolean z4) {
        java.lang.String str = z4 ? i4 == 0 ? " COLLATE NOCASE ASC" : " COLLATE NOCASE DESC" : i4 == 0 ? " ASC" : " DESC";
        return (num != null && num.intValue() == 0) ? "name".concat(str) : "name".concat(str);
    }

    /* renamed from: d */
    public static final void m1371d(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    /* renamed from: e */
    public static void m1372e(int i4) {
        if (2 > i4 || i4 >= 37) {
            throw new java.lang.IllegalArgumentException("radix " + i4 + " was not in valid range " + new p169n3.C1923a(2, 36, 1));
        }
    }

    /* renamed from: f */
    public static long m1373f(long j4, long j5) {
        long j6 = j4 + j5;
        if (((j4 ^ j5) < 0) || ((j4 ^ j6) >= 0)) {
            return j6;
        }
        throw new java.lang.ArithmeticException("overflow: checkedAdd(" + j4 + ", " + j5 + ")");
    }

    /* renamed from: g */
    public static int m1374g(p152k1.C1753A c1753a, p021E0.AbstractC0193e abstractC0193e, android.view.View view, android.view.View view2, p152k1.AbstractC1780s abstractC1780s, boolean z4) {
        if (abstractC1780s.m3740p() == 0 || c1753a.m3718a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z4) {
            return java.lang.Math.min(abstractC0193e.mo557j(), abstractC0193e.mo551d(view2) - abstractC0193e.mo552e(view));
        }
        ((p152k1.C1781t) view.getLayoutParams()).getClass();
        throw null;
    }

    /* renamed from: h */
    public static int m1375h(p152k1.C1753A c1753a, p021E0.AbstractC0193e abstractC0193e, android.view.View view, android.view.View view2, p152k1.AbstractC1780s abstractC1780s, boolean z4) {
        if (abstractC1780s.m3740p() == 0 || c1753a.m3718a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return c1753a.m3718a();
        }
        abstractC0193e.mo551d(view2);
        abstractC0193e.mo552e(view);
        ((p152k1.C1781t) view.getLayoutParams()).getClass();
        throw null;
    }

    /* renamed from: i */
    public static android.graphics.Bitmap m1376i(byte[] bArr, int i4) {
        int i5 = 0;
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, i4, null);
        if (decodeByteArray == null) {
            throw p076T.C0666I.m1202a(new java.lang.IllegalStateException(), "Could not decode image data");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            p052N.C0435g c0435g = new p052N.C0435g(byteArrayInputStream);
            byteArrayInputStream.close();
            p052N.C0431c m917c = c0435g.m917c("Orientation");
            int i6 = 1;
            if (m917c != null) {
                try {
                    i6 = m917c.m910e(c0435g.f1264f);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            switch (i6) {
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    i5 = 180;
                    break;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    i5 = 270;
                    break;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i5 = 90;
                    break;
            }
            if (i5 == 0) {
                return decodeByteArray;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postRotate(i5);
            return android.graphics.Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: k */
    public static java.lang.String m1377k(android.content.Context context, java.lang.String str) {
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 31 && m1384s(context, null, str)) {
            return str;
        }
        if (i4 >= 29) {
            if (m1384s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (m1384s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (m1384s(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    /* renamed from: l */
    public static int m1378l(p009B2.AbstractActivityC0047d abstractActivityC0047d, java.lang.String str) {
        if (abstractActivityC0047d == null) {
            return 0;
        }
        boolean z4 = abstractActivityC0047d.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean m3912O = p176p1.AbstractC1949a.m3912O(abstractActivityC0047d, str);
        if (z4) {
            m3912O = !m3912O;
        }
        if (!z4 && m3912O) {
            abstractActivityC0047d.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        return (z4 && m3912O) ? 4 : 0;
    }

    /* renamed from: m */
    public static long m1379m(long j4, long j5, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        long j6 = j4 / j5;
        long j7 = j4 - (j5 * j6);
        if (j7 == 0) {
            return j6;
        }
        int i4 = ((int) ((j4 ^ j5) >> 63)) | 1;
        switch (p138h2.AbstractC1507e.f6221a[roundingMode.ordinal()]) {
            case 1:
                if (j7 == 0) {
                    return j6;
                }
                throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return j6;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                if (i4 >= 0) {
                    return j6;
                }
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                if (i4 <= 0) {
                    return j6;
                }
                break;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                long abs = java.lang.Math.abs(j7);
                long abs2 = abs - (java.lang.Math.abs(j5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP && (roundingMode != java.math.RoundingMode.HALF_EVEN || (1 & j6) == 0)) {
                        return j6;
                    }
                } else if (abs2 <= 0) {
                    return j6;
                }
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return j6 + i4;
    }

    /* renamed from: o */
    public static boolean m1380o(java.lang.String str, java.lang.String str2) {
        char c4;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != str2.charAt(i4) && ((c4 = (char) ((r4 | ' ') - 97)) >= 26 || c4 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static long m1381p(long j4, long j5) {
        p101a.AbstractC0936a.m1802j("a", j4);
        p101a.AbstractC0936a.m1802j("b", j5);
        if (j4 == 0) {
            return j5;
        }
        if (j5 == 0) {
            return j4;
        }
        int numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j4);
        long j6 = j4 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j5);
        long j7 = j5 >> numberOfTrailingZeros2;
        while (j6 != j7) {
            long j8 = j6 - j7;
            long j9 = (j8 >> 63) & j8;
            long j10 = (j8 - j9) - j9;
            j7 += j9;
            j6 = j10 >> java.lang.Long.numberOfTrailingZeros(j10);
        }
        return j6 << java.lang.Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    /* renamed from: q */
    public static final java.lang.Class m1382q(p173o3.InterfaceC1932b interfaceC1932b) {
        p154k3.AbstractC1803h.m3779e(interfaceC1932b, "<this>");
        java.lang.Class mo3773a = ((p154k3.InterfaceC1799d) interfaceC1932b).mo3773a();
        if (!mo3773a.isPrimitive()) {
            return mo3773a;
        }
        java.lang.String name = mo3773a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? mo3773a : java.lang.Double.class;
            case 104431:
                return !name.equals("int") ? mo3773a : java.lang.Integer.class;
            case 3039496:
                return !name.equals("byte") ? mo3773a : java.lang.Byte.class;
            case 3052374:
                return !name.equals("char") ? mo3773a : java.lang.Character.class;
            case 3327612:
                return !name.equals("long") ? mo3773a : java.lang.Long.class;
            case 3625364:
                return !name.equals("void") ? mo3773a : java.lang.Void.class;
            case 64711720:
                return !name.equals("boolean") ? mo3773a : java.lang.Boolean.class;
            case 97526364:
                return !name.equals("float") ? mo3773a : java.lang.Float.class;
            case 109413500:
                return !name.equals("short") ? mo3773a : java.lang.Short.class;
            default:
                return mo3773a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: r */
    public static java.util.ArrayList m1383r(android.content.Context context, int i4) {
        java.lang.String m1377k;
        java.lang.String m1377k2;
        java.lang.String m1377k3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        switch (i4) {
            case 0:
            case 37:
                if (m1384s(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (m1384s(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (m1384s(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                }
                return arrayList;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                if (m1384s(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (m1384s(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (m1384s(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                }
                return arrayList;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                if (i4 != 4 || android.os.Build.VERSION.SDK_INT < 29) {
                    if (m1384s(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (m1384s(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                    }
                } else if (m1384s(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
                return arrayList;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
            case 20:
                return null;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
            case 14:
                if (m1384s(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                return arrayList;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                if (m1384s(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                if (android.os.Build.VERSION.SDK_INT > 29 && m1384s(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (m1384s(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (m1384s(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (m1384s(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (m1384s(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (m1384s(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (m1384s(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                }
                return arrayList;
            case 9:
                if (android.os.Build.VERSION.SDK_INT >= 33 && m1384s(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                return arrayList;
            case 10:
            case 25:
            case 26:
            default:
                return arrayList;
            case 12:
                if (m1384s(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                }
                return arrayList;
            case 13:
                if (m1384s(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (m1384s(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (m1384s(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (m1384s(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (m1384s(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                }
                return arrayList;
            case 15:
                if (m1384s(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i5 = android.os.Build.VERSION.SDK_INT;
                if ((i5 < 29 || (i5 == 29 && p009B2.AbstractC0052i.m184s())) && m1384s(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
                return arrayList;
            case 16:
                if (m1384s(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                }
                return arrayList;
            case 17:
                if (android.os.Build.VERSION.SDK_INT >= 33 && m1384s(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
                return arrayList;
            case 18:
                if (android.os.Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (m1384s(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                return arrayList;
            case 19:
                if (android.os.Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (m1384s(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                }
                return arrayList;
            case 21:
                if (m1384s(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                }
                return arrayList;
            case 22:
                if (android.os.Build.VERSION.SDK_INT >= 30 && m1384s(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
                return arrayList;
            case 23:
                if (m1384s(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
                return arrayList;
            case 24:
                if (m1384s(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
                return arrayList;
            case 27:
                if (m1384s(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                }
                return arrayList;
            case 28:
                if (android.os.Build.VERSION.SDK_INT >= 31 && (m1377k = m1377k(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(m1377k);
                }
                return arrayList;
            case 29:
                if (android.os.Build.VERSION.SDK_INT >= 31 && (m1377k2 = m1377k(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(m1377k2);
                }
                return arrayList;
            case 30:
                if (android.os.Build.VERSION.SDK_INT >= 31 && (m1377k3 = m1377k(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(m1377k3);
                }
                return arrayList;
            case 31:
                if (android.os.Build.VERSION.SDK_INT >= 33 && m1384s(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                }
                return arrayList;
            case 32:
                if (android.os.Build.VERSION.SDK_INT >= 33 && m1384s(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                return arrayList;
            case 33:
                if (android.os.Build.VERSION.SDK_INT >= 33 && m1384s(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                }
                return arrayList;
            case 34:
                if (m1384s(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                }
                return arrayList;
            case 35:
                if (android.os.Build.VERSION.SDK_INT >= 33 && m1384s(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
                return arrayList;
            case 36:
                if (m1384s(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                return arrayList;
        }
    }

    /* renamed from: s */
    public static boolean m1384s(android.content.Context context, java.util.ArrayList arrayList, java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        android.content.pm.PackageManager.PackageInfoFlags of;
        if (arrayList != null) {
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((java.lang.String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (java.lang.Exception e4) {
                android.util.Log.d("permissions_handler", "Unable to check manifest for permission: ", e4);
            }
        }
        if (context == null) {
            android.util.Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.lang.String packageName = context.getPackageName();
            of = android.content.pm.PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 4096);
        }
        if (packageInfo == null) {
            android.util.Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        java.util.Iterator it2 = new java.util.ArrayList(java.util.Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((java.lang.String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m1385t(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (f2604c == null) {
            f2604c = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f2604c.booleanValue();
        if (f2605d == null) {
            f2605d = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f2605d.booleanValue() && android.os.Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: u */
    public static java.lang.String m1386u(java.lang.String str, java.lang.Object... objArr) {
        int indexOf;
        java.lang.String str2;
        int i4 = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            java.lang.Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (java.lang.Exception e4) {
                    java.lang.String str3 = obj.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").log(java.util.logging.Level.WARNING, "Exception during lenientFormat for " + str3, (java.lang.Throwable) e4);
                    str2 = "<" + str3 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((objArr.length * 16) + str.length());
        int i6 = 0;
        while (i4 < objArr.length && (indexOf = str.indexOf("%s", i6)) != -1) {
            sb.append((java.lang.CharSequence) str, i6, indexOf);
            sb.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb.append((java.lang.CharSequence) str, i6, str.length());
        if (i4 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: v */
    public static void m1387v(p083V0.InterfaceC0766d interfaceC0766d, int i4, p086W.InterfaceC0783c interfaceC0783c) {
        long mo654B = interfaceC0766d.mo654B(i4);
        java.util.List mo658w = interfaceC0766d.mo658w(mo654B);
        if (mo658w.isEmpty()) {
            return;
        }
        if (i4 == interfaceC0766d.mo655Q() - 1) {
            throw new java.lang.IllegalStateException();
        }
        long mo654B2 = interfaceC0766d.mo654B(i4 + 1) - interfaceC0766d.mo654B(i4);
        if (mo654B2 > 0) {
            interfaceC0783c.accept(new p083V0.C0763a(mo658w, mo654B, mo654B2));
        }
    }

    /* renamed from: w */
    public static p192t.InterfaceC2158a m1388w(android.content.res.XmlResourceParser xmlResourceParser, android.content.res.Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), p178q.AbstractC1958a.f7949a);
            java.lang.String string = obtainAttributes.getString(0);
            java.lang.String string2 = obtainAttributes.getString(5);
            java.lang.String string3 = obtainAttributes.getString(6);
            java.lang.String string4 = obtainAttributes.getString(2);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(3, 1);
            int integer2 = obtainAttributes.getInteger(4, 500);
            java.lang.String string5 = obtainAttributes.getString(7);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    m1357E(xmlResourceParser);
                }
                java.util.List m1389x = m1389x(resources, resourceId);
                return new p192t.C2161d(new p219z.C2432c(string, string2, string3, m1389x), string4 != null ? new p219z.C2432c(string, string2, string4, m1389x) : null, integer, integer2, string5);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        android.content.res.TypedArray obtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), p178q.AbstractC1958a.f7950b);
                        int i4 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z4 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        java.lang.String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = obtainAttributes2.getInt(i5, 0);
                        int i7 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                        java.lang.String string7 = obtainAttributes2.getString(i7);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m1357E(xmlResourceParser);
                        }
                        arrayList.add(new p192t.C2160c(i4, i6, resourceId2, string7, string6, z4));
                    } else {
                        m1357E(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new p192t.C2159b((p192t.C2160c[]) arrayList.toArray(new p192t.C2160c[0]));
            }
        } else {
            m1357E(xmlResourceParser);
        }
        return null;
    }

    /* renamed from: x */
    public static java.util.List m1389x(android.content.res.Resources resources, int i4) {
        if (i4 == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        java.lang.String[] stringArray = resources.getStringArray(resourceId);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str : stringArray) {
                            arrayList2.add(android.util.Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                java.lang.String[] stringArray2 = resources.getStringArray(i4);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str2 : stringArray2) {
                    arrayList3.add(android.util.Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: y */
    public static p108b1.C1184g m1390y(p108b1.C1184g c1184g, java.lang.String[] strArr, java.util.Map map) {
        int i4 = 0;
        if (c1184g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (p108b1.C1184g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                p108b1.C1184g c1184g2 = new p108b1.C1184g();
                int length = strArr.length;
                while (i4 < length) {
                    c1184g2.m2834a((p108b1.C1184g) map.get(strArr[i4]));
                    i4++;
                }
                return c1184g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c1184g.m2834a((p108b1.C1184g) map.get(strArr[0]));
                return c1184g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i4 < length2) {
                    c1184g.m2834a((p108b1.C1184g) map.get(strArr[i4]));
                    i4++;
                }
            }
        }
        return c1184g;
    }

    /* renamed from: z */
    public static long m1391z(long j4, long j5) {
        int numberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(~j5) + java.lang.Long.numberOfLeadingZeros(j5) + java.lang.Long.numberOfLeadingZeros(~j4) + java.lang.Long.numberOfLeadingZeros(j4);
        if (numberOfLeadingZeros > 65) {
            return j4 * j5;
        }
        long j6 = ((j4 ^ j5) >>> 63) + Long.MAX_VALUE;
        if ((numberOfLeadingZeros < 64) || ((j5 == Long.MIN_VALUE) & (j4 < 0))) {
            return j6;
        }
        long j7 = j4 * j5;
        return (j4 == 0 || j7 / j4 == j5) ? j7 : j6;
    }

    /* renamed from: A */
    public abstract void mo398A(boolean z4);

    /* renamed from: B */
    public abstract void mo399B(boolean z4);

    /* renamed from: O */
    public abstract void mo1392O(byte[] bArr, int i4, int i5);

    /* renamed from: j */
    public abstract java.lang.String mo1393j(byte[] bArr, int i4, int i5);

    /* renamed from: n */
    public abstract int mo1394n(java.lang.String str, byte[] bArr, int i4, int i5);
}
