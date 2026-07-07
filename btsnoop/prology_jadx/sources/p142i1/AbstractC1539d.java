package p142i1;

/* renamed from: i1.d */
/* loaded from: classes.dex */
public abstract class AbstractC1539d {

    /* renamed from: a */
    public static final p046L1.C0363g f6407a = new p046L1.C0363g(20, false);

    /* renamed from: b */
    public static final byte[] f6408b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f6409c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f6410d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f6411e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f6412f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f6413g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f6414h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f6415i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f6416j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m3409a(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m3410b(p166n0.C1889e[] c1889eArr, byte[] bArr) {
        int i4 = 0;
        for (p166n0.C1889e c1889e : c1889eArr) {
            i4 += ((((c1889e.f7696t * 2) + 7) & (-8)) / 8) + (c1889e.f7693q * 2) + m3412d((java.lang.String) c1889e.f7689m, (java.lang.String) c1889e.f7690n, bArr).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16 + c1889e.f7695s;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i4);
        if (java.util.Arrays.equals(bArr, f6412f)) {
            for (p166n0.C1889e c1889e2 : c1889eArr) {
                m3424p(byteArrayOutputStream, c1889e2, m3412d((java.lang.String) c1889e2.f7689m, (java.lang.String) c1889e2.f7690n, bArr));
                m3426r(byteArrayOutputStream, c1889e2);
                int[] iArr = (int[]) c1889e2.f7691o;
                int length = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = iArr[i5];
                    m3429u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                m3425q(byteArrayOutputStream, c1889e2);
            }
        } else {
            for (p166n0.C1889e c1889e3 : c1889eArr) {
                m3424p(byteArrayOutputStream, c1889e3, m3412d((java.lang.String) c1889e3.f7689m, (java.lang.String) c1889e3.f7690n, bArr));
            }
            for (p166n0.C1889e c1889e4 : c1889eArr) {
                m3426r(byteArrayOutputStream, c1889e4);
                int[] iArr2 = (int[]) c1889e4.f7691o;
                int length2 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    int i10 = iArr2[i8];
                    m3429u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                m3425q(byteArrayOutputStream, c1889e4);
            }
        }
        if (byteArrayOutputStream.size() == i4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new java.lang.IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i4);
    }

    /* renamed from: c */
    public static boolean m3411c(java.io.File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (java.io.File file2 : listFiles) {
            z4 = m3411c(file2) && z4;
        }
        return z4;
    }

    /* renamed from: d */
    public static java.lang.String m3412d(java.lang.String str, java.lang.String str2, byte[] bArr) {
        byte[] bArr2 = f6414h;
        boolean equals = java.util.Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f6413g;
        java.lang.String str3 = (equals || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        return p009B2.AbstractC0051h.m154m(sb, (java.util.Arrays.equals(bArr, bArr2) || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    /* renamed from: e */
    public static void m3413e(android.content.pm.PackageInfo packageInfo, java.io.File file) {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m3414f(java.io.InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read < 0) {
                throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("Not enough bytes to read: ", i4));
            }
            i5 += read;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m3415g(java.io.ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += (int) m3421m(byteArrayInputStream, 2);
            iArr[i6] = i5;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m3416h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p142i1.AbstractC1539d.m3416h(java.io.FileInputStream, int, int):byte[]");
    }

    /* renamed from: i */
    public static p166n0.C1889e[] m3417i(java.io.FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, p166n0.C1889e[] c1889eArr) {
        byte[] bArr3 = f6415i;
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            if (!java.util.Arrays.equals(bArr, f6416j)) {
                throw new java.lang.IllegalStateException("Unsupported meta version");
            }
            int m3421m = (int) m3421m(fileInputStream, 2);
            byte[] m3416h = m3416h(fileInputStream, (int) m3421m(fileInputStream, 4), (int) m3421m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new java.lang.IllegalStateException("Content found after the end of file");
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m3416h);
            try {
                p166n0.C1889e[] m3419k = m3419k(byteArrayInputStream, bArr2, m3421m, c1889eArr);
                byteArrayInputStream.close();
                return m3419k;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (java.util.Arrays.equals(f6410d, bArr2)) {
            throw new java.lang.IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            throw new java.lang.IllegalStateException("Unsupported meta version");
        }
        int m3421m2 = (int) m3421m(fileInputStream, 1);
        byte[] m3416h2 = m3416h(fileInputStream, (int) m3421m(fileInputStream, 4), (int) m3421m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(m3416h2);
        try {
            p166n0.C1889e[] m3418j = m3418j(byteArrayInputStream2, m3421m2, c1889eArr);
            byteArrayInputStream2.close();
            return m3418j;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: j */
    public static p166n0.C1889e[] m3418j(java.io.ByteArrayInputStream byteArrayInputStream, int i4, p166n0.C1889e[] c1889eArr) {
        if (byteArrayInputStream.available() == 0) {
            return new p166n0.C1889e[0];
        }
        if (i4 != c1889eArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        java.lang.String[] strArr = new java.lang.String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m3421m = (int) m3421m(byteArrayInputStream, 2);
            iArr[i5] = (int) m3421m(byteArrayInputStream, 2);
            strArr[i5] = new java.lang.String(m3414f(byteArrayInputStream, m3421m), java.nio.charset.StandardCharsets.UTF_8);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            p166n0.C1889e c1889e = c1889eArr[i6];
            if (!((java.lang.String) c1889e.f7690n).equals(strArr[i6])) {
                throw new java.lang.IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            c1889e.f7693q = i7;
            c1889e.f7691o = m3415g(byteArrayInputStream, i7);
        }
        return c1889eArr;
    }

    /* renamed from: k */
    public static p166n0.C1889e[] m3419k(java.io.ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, p166n0.C1889e[] c1889eArr) {
        if (byteArrayInputStream.available() == 0) {
            return new p166n0.C1889e[0];
        }
        if (i4 != c1889eArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            m3421m(byteArrayInputStream, 2);
            java.lang.String str = new java.lang.String(m3414f(byteArrayInputStream, (int) m3421m(byteArrayInputStream, 2)), java.nio.charset.StandardCharsets.UTF_8);
            long m3421m = m3421m(byteArrayInputStream, 4);
            int m3421m2 = (int) m3421m(byteArrayInputStream, 2);
            p166n0.C1889e c1889e = null;
            if (c1889eArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                java.lang.String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i6 = 0;
                while (true) {
                    if (i6 >= c1889eArr.length) {
                        break;
                    }
                    if (((java.lang.String) c1889eArr[i6].f7690n).equals(substring)) {
                        c1889e = c1889eArr[i6];
                        break;
                    }
                    i6++;
                }
            }
            if (c1889e == null) {
                throw new java.lang.IllegalStateException("Missing profile key: ".concat(str));
            }
            c1889e.f7697u = m3421m;
            int[] m3415g = m3415g(byteArrayInputStream, m3421m2);
            if (java.util.Arrays.equals(bArr, f6414h)) {
                c1889e.f7693q = m3421m2;
                c1889e.f7691o = m3415g;
            }
        }
        return c1889eArr;
    }

    /* renamed from: l */
    public static p166n0.C1889e[] m3420l(java.io.FileInputStream fileInputStream, byte[] bArr, java.lang.String str) {
        if (!java.util.Arrays.equals(bArr, f6411e)) {
            throw new java.lang.IllegalStateException("Unsupported version");
        }
        int m3421m = (int) m3421m(fileInputStream, 1);
        byte[] m3416h = m3416h(fileInputStream, (int) m3421m(fileInputStream, 4), (int) m3421m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m3416h);
        try {
            p166n0.C1889e[] m3422n = m3422n(byteArrayInputStream, str, m3421m);
            byteArrayInputStream.close();
            return m3422n;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m3421m(java.io.InputStream inputStream, int i4) {
        byte[] m3414f = m3414f(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += (m3414f[i5] & 255) << (i5 * 8);
        }
        return j4;
    }

    /* renamed from: n */
    public static p166n0.C1889e[] m3422n(java.io.ByteArrayInputStream byteArrayInputStream, java.lang.String str, int i4) {
        java.util.TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new p166n0.C1889e[0];
        }
        p166n0.C1889e[] c1889eArr = new p166n0.C1889e[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m3421m = (int) m3421m(byteArrayInputStream, 2);
            int m3421m2 = (int) m3421m(byteArrayInputStream, 2);
            c1889eArr[i5] = new p166n0.C1889e(str, new java.lang.String(m3414f(byteArrayInputStream, m3421m), java.nio.charset.StandardCharsets.UTF_8), m3421m(byteArrayInputStream, 4), m3421m2, (int) m3421m(byteArrayInputStream, 4), (int) m3421m(byteArrayInputStream, 4), new int[m3421m2], new java.util.TreeMap());
        }
        for (int i6 = 0; i6 < i4; i6++) {
            p166n0.C1889e c1889e = c1889eArr[i6];
            int available = byteArrayInputStream.available() - c1889e.f7695s;
            int i7 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = (java.util.TreeMap) c1889e.f7692p;
                if (available2 <= available) {
                    break;
                }
                i7 += (int) m3421m(byteArrayInputStream, 2);
                treeMap.put(java.lang.Integer.valueOf(i7), 1);
                for (int m3421m3 = (int) m3421m(byteArrayInputStream, 2); m3421m3 > 0; m3421m3--) {
                    m3421m(byteArrayInputStream, 2);
                    int m3421m4 = (int) m3421m(byteArrayInputStream, 1);
                    if (m3421m4 != 6 && m3421m4 != 7) {
                        while (m3421m4 > 0) {
                            m3421m(byteArrayInputStream, 1);
                            for (int m3421m5 = (int) m3421m(byteArrayInputStream, 1); m3421m5 > 0; m3421m5--) {
                                m3421m(byteArrayInputStream, 2);
                            }
                            m3421m4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new java.lang.IllegalStateException("Read too much data during profile line parse");
            }
            c1889e.f7691o = m3415g(byteArrayInputStream, c1889e.f7693q);
            int i8 = c1889e.f7696t;
            java.util.BitSet valueOf = java.util.BitSet.valueOf(m3414f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = valueOf.get(i9) ? 2 : 0;
                if (valueOf.get(i9 + i8)) {
                    i10 |= 4;
                }
                if (i10 != 0) {
                    java.lang.Integer num = (java.lang.Integer) treeMap.get(java.lang.Integer.valueOf(i9));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10 | num.intValue()));
                }
            }
        }
        return c1889eArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m3423o(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, p166n0.C1889e[] c1889eArr) {
        long j4;
        java.util.ArrayList arrayList;
        int length;
        byte[] bArr2 = f6410d;
        int i4 = 0;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f6411e;
            if (java.util.Arrays.equals(bArr, bArr3)) {
                byte[] m3410b = m3410b(c1889eArr, bArr3);
                m3428t(byteArrayOutputStream, c1889eArr.length, 1);
                m3428t(byteArrayOutputStream, m3410b.length, 4);
                byte[] m3409a = m3409a(m3410b);
                m3428t(byteArrayOutputStream, m3409a.length, 4);
                byteArrayOutputStream.write(m3409a);
                return true;
            }
            byte[] bArr4 = f6413g;
            if (java.util.Arrays.equals(bArr, bArr4)) {
                m3428t(byteArrayOutputStream, c1889eArr.length, 1);
                for (p166n0.C1889e c1889e : c1889eArr) {
                    int size = ((java.util.TreeMap) c1889e.f7692p).size() * 4;
                    java.lang.String m3412d = m3412d((java.lang.String) c1889e.f7689m, (java.lang.String) c1889e.f7690n, bArr4);
                    java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                    m3429u(byteArrayOutputStream, m3412d.getBytes(charset).length);
                    m3429u(byteArrayOutputStream, ((int[]) c1889e.f7691o).length);
                    m3428t(byteArrayOutputStream, size, 4);
                    m3428t(byteArrayOutputStream, c1889e.f7694r, 4);
                    byteArrayOutputStream.write(m3412d.getBytes(charset));
                    java.util.Iterator it = ((java.util.TreeMap) c1889e.f7692p).keySet().iterator();
                    while (it.hasNext()) {
                        m3429u(byteArrayOutputStream, ((java.lang.Integer) it.next()).intValue());
                        m3429u(byteArrayOutputStream, 0);
                    }
                    for (int i5 : (int[]) c1889e.f7691o) {
                        m3429u(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f6412f;
            if (java.util.Arrays.equals(bArr, bArr5)) {
                byte[] m3410b2 = m3410b(c1889eArr, bArr5);
                m3428t(byteArrayOutputStream, c1889eArr.length, 1);
                m3428t(byteArrayOutputStream, m3410b2.length, 4);
                byte[] m3409a2 = m3409a(m3410b2);
                m3428t(byteArrayOutputStream, m3409a2.length, 4);
                byteArrayOutputStream.write(m3409a2);
                return true;
            }
            byte[] bArr6 = f6414h;
            if (!java.util.Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m3429u(byteArrayOutputStream, c1889eArr.length);
            for (p166n0.C1889e c1889e2 : c1889eArr) {
                java.lang.String m3412d2 = m3412d((java.lang.String) c1889e2.f7689m, (java.lang.String) c1889e2.f7690n, bArr6);
                java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
                m3429u(byteArrayOutputStream, m3412d2.getBytes(charset2).length);
                java.util.TreeMap treeMap = (java.util.TreeMap) c1889e2.f7692p;
                m3429u(byteArrayOutputStream, treeMap.size());
                m3429u(byteArrayOutputStream, ((int[]) c1889e2.f7691o).length);
                m3428t(byteArrayOutputStream, c1889e2.f7694r, 4);
                byteArrayOutputStream.write(m3412d2.getBytes(charset2));
                java.util.Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m3429u(byteArrayOutputStream, ((java.lang.Integer) it2.next()).intValue());
                }
                for (int i6 : (int[]) c1889e2.f7691o) {
                    m3429u(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(3);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            m3429u(byteArrayOutputStream2, c1889eArr.length);
            int i7 = 2;
            int i8 = 2;
            for (p166n0.C1889e c1889e3 : c1889eArr) {
                m3428t(byteArrayOutputStream2, c1889e3.f7694r, 4);
                m3428t(byteArrayOutputStream2, c1889e3.f7697u, 4);
                m3428t(byteArrayOutputStream2, c1889e3.f7696t, 4);
                java.lang.String m3412d3 = m3412d((java.lang.String) c1889e3.f7689m, (java.lang.String) c1889e3.f7690n, bArr2);
                java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
                int length2 = m3412d3.getBytes(charset3).length;
                m3429u(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(m3412d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new java.lang.IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            p142i1.C1547l c1547l = new p142i1.C1547l(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(c1547l);
            java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < c1889eArr.length) {
                try {
                    p166n0.C1889e c1889e4 = c1889eArr[i9];
                    m3429u(byteArrayOutputStream3, i9);
                    m3429u(byteArrayOutputStream3, c1889e4.f7693q);
                    i10 = i10 + 4 + (c1889e4.f7693q * 2);
                    int[] iArr = (int[]) c1889e4.f7691o;
                    int length3 = iArr.length;
                    int i11 = i4;
                    while (i4 < length3) {
                        int i12 = iArr[i4];
                        m3429u(byteArrayOutputStream3, i12 - i11);
                        i4++;
                        i11 = i12;
                    }
                    i9++;
                    i4 = 0;
                } catch (java.lang.Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new java.lang.IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            p142i1.C1547l c1547l2 = new p142i1.C1547l(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(c1547l2);
            byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < c1889eArr.length) {
                try {
                    p166n0.C1889e c1889e5 = c1889eArr[i13];
                    java.util.Iterator it3 = ((java.util.TreeMap) c1889e5.f7692p).entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((java.lang.Integer) ((java.util.Map.Entry) it3.next()).getValue()).intValue();
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                    try {
                        m3425q(byteArrayOutputStream4, c1889e5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                        try {
                            m3426r(byteArrayOutputStream4, c1889e5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m3429u(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + i7 + byteArray4.length;
                            int i16 = i14 + 6;
                            java.util.ArrayList arrayList4 = arrayList3;
                            m3428t(byteArrayOutputStream3, length4, 4);
                            m3429u(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i16 + length4;
                            i13++;
                            arrayList3 = arrayList4;
                            i7 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            java.util.ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray5.length) {
                throw new java.lang.IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            p142i1.C1547l c1547l3 = new p142i1.C1547l(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(c1547l3);
            long j5 = 4;
            long size2 = j5 + j5 + 4 + (arrayList2.size() * 16);
            m3428t(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                p142i1.C1547l c1547l4 = (p142i1.C1547l) arrayList2.get(i17);
                int i18 = c1547l4.f6427a;
                if (i18 == 1) {
                    j4 = 0;
                } else if (i18 == 2) {
                    j4 = 1;
                } else if (i18 == 3) {
                    j4 = 2;
                } else if (i18 == 4) {
                    j4 = 3;
                } else {
                    if (i18 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                m3428t(byteArrayOutputStream, j4, 4);
                m3428t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c1547l4.f6428b;
                if (c1547l4.f6429c) {
                    long length5 = bArr7.length;
                    byte[] m3409a3 = m3409a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(m3409a3);
                    m3428t(byteArrayOutputStream, m3409a3.length, 4);
                    m3428t(byteArrayOutputStream, length5, 4);
                    length = m3409a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m3428t(byteArrayOutputStream, bArr7.length, 4);
                    m3428t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                arrayList5 = arrayList;
            }
            java.util.ArrayList arrayList6 = arrayList5;
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
            }
            return true;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: p */
    public static void m3424p(java.io.ByteArrayOutputStream byteArrayOutputStream, p166n0.C1889e c1889e, java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        m3429u(byteArrayOutputStream, str.getBytes(charset).length);
        m3429u(byteArrayOutputStream, c1889e.f7693q);
        m3428t(byteArrayOutputStream, c1889e.f7695s, 4);
        m3428t(byteArrayOutputStream, c1889e.f7694r, 4);
        m3428t(byteArrayOutputStream, c1889e.f7696t, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: q */
    public static void m3425q(java.io.ByteArrayOutputStream byteArrayOutputStream, p166n0.C1889e c1889e) {
        byte[] bArr = new byte[(((c1889e.f7696t * 2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : ((java.util.TreeMap) c1889e.f7692p).entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i4 = intValue / 8;
                bArr[i4] = (byte) (bArr[i4] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i5 = intValue + c1889e.f7696t;
                int i6 = i5 / 8;
                bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: r */
    public static void m3426r(java.io.ByteArrayOutputStream byteArrayOutputStream, p166n0.C1889e c1889e) {
        int i4 = 0;
        for (java.util.Map.Entry entry : ((java.util.TreeMap) c1889e.f7692p).entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
                m3429u(byteArrayOutputStream, intValue - i4);
                m3429u(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
    
        if (r5 == null) goto L125;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0166. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c9  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3427s(android.content.Context r19, java.util.concurrent.Executor r20, p142i1.InterfaceC1538c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p142i1.AbstractC1539d.m3427s(android.content.Context, java.util.concurrent.Executor, i1.c, boolean):void");
    }

    /* renamed from: t */
    public static void m3428t(java.io.ByteArrayOutputStream byteArrayOutputStream, long j4, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: u */
    public static void m3429u(java.io.ByteArrayOutputStream byteArrayOutputStream, int i4) {
        m3428t(byteArrayOutputStream, i4, 2);
    }
}
