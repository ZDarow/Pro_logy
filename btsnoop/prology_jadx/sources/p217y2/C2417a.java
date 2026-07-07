package p217y2;

/* renamed from: y2.a */
/* loaded from: classes.dex */
public final class C2417a implements p047L2.InterfaceC0385o, p034H2.InterfaceC0248b {

    /* renamed from: l */
    public android.content.Context f9506l;

    /* renamed from: m */
    public p035I.C0291m f9507m;

    /* renamed from: c */
    public static java.lang.String m4654c(byte[] bArr) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        p154k3.AbstractC1803h.m3776b(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i4 = 0; i4 < length; i4++) {
            byte b4 = digest[i4];
            int i5 = i4 * 2;
            cArr2[i5] = cArr[(b4 & 255) >>> 4];
            cArr2[i5 + 1] = cArr[b4 & 15];
        }
        return new java.lang.String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:8:0x004f, B:11:0x0060, B:13:0x0066, B:16:0x0070, B:19:0x0089, B:21:0x0092, B:22:0x009a, B:24:0x00a3, B:26:0x00aa, B:27:0x00af, B:30:0x0097, B:33:0x004b, B:34:0x00c5), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:8:0x004f, B:11:0x0060, B:13:0x0066, B:16:0x0070, B:19:0x0089, B:21:0x0092, B:22:0x009a, B:24:0x00a3, B:26:0x00aa, B:27:0x00af, B:30:0x0097, B:33:0x004b, B:34:0x00c5), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:8:0x004f, B:11:0x0060, B:13:0x0066, B:16:0x0070, B:19:0x0089, B:21:0x0092, B:22:0x009a, B:24:0x00a3, B:26:0x00aa, B:27:0x00af, B:30:0x0097, B:33:0x004b, B:34:0x00c5), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:8:0x004f, B:11:0x0060, B:13:0x0066, B:16:0x0070, B:19:0x0089, B:21:0x0092, B:22:0x009a, B:24:0x00a3, B:26:0x00aa, B:27:0x00af, B:30:0x0097, B:33:0x004b, B:34:0x00c5), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo42I(p047L2.C0384n r13, p043K2.C0335k r14) {
        /*
            r12 = this;
            java.lang.String r0 = "call"
            p154k3.AbstractC1803h.m3779e(r13, r0)
            java.lang.String r13 = r13.f1133a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r0 = "getAll"
            boolean r13 = p154k3.AbstractC1803h.m3775a(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r13 == 0) goto Lc5
            android.content.Context r13 = r12.f9506l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            p154k3.AbstractC1803h.m3776b(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.Context r0 = r12.f9506l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            p154k3.AbstractC1803h.m3776b(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r1 = 0
            android.content.pm.PackageInfo r0 = r13.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r1 = r12.m4655a(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.Context r2 = r12.f9506l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            p154k3.AbstractC1803h.m3776b(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.Context r3 = r12.f9506l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            p154k3.AbstractC1803h.m3776b(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r5 = 30
            if (r4 < r5) goto L4b
            android.content.pm.InstallSourceInfo r2 = p216y1.AbstractC2415a.m4647a(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r2 = p216y1.AbstractC2415a.m4651e(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto L4f
        L4b:
            java.lang.String r2 = r2.getInstallerPackageName(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        L4f:
            long r5 = r0.firstInstallTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            long r7 = r0.lastUpdateTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.util.HashMap r3 = new java.util.HashMap     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r9 = "appName"
            android.content.pm.ApplicationInfo r10 = r0.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r11 = ""
            if (r10 == 0) goto L6f
            java.lang.CharSequence r13 = r10.loadLabel(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r13 == 0) goto L6f
            java.lang.String r13 = r13.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r13 != 0) goto L70
            goto L6f
        L6d:
            r13 = move-exception
            goto Lc9
        L6f:
            r13 = r11
        L70:
            r3.put(r9, r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "packageName"
            android.content.Context r9 = r12.f9506l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            p154k3.AbstractC1803h.m3776b(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r9 = r9.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "version"
            java.lang.String r9 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r9 != 0) goto L88
            goto L89
        L88:
            r11 = r9
        L89:
            r3.put(r13, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "buildNumber"
            r9 = 28
            if (r4 < r9) goto L97
            long r9 = p186r2.AbstractC2067a.m4127b(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto L9a
        L97:
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            long r9 = (long) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        L9a:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r1 == 0) goto La8
            java.lang.String r13 = "buildSignature"
            r3.put(r13, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        La8:
            if (r2 == 0) goto Laf
            java.lang.String r13 = "installerStore"
            r3.put(r13, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        Laf:
            java.lang.String r13 = "installTime"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "updateTime"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r14.mo742b(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto Ld3
        Lc5:
            r14.mo743c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto Ld3
        Lc9:
            java.lang.String r13 = r13.getMessage()
            r0 = 0
            java.lang.String r1 = "Name not found"
            r14.mo741a(r1, r13, r0)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p217y2.C2417a.mo42I(L2.n, K2.k):void");
    }

    /* renamed from: a */
    public final java.lang.String m4655a(android.content.pm.PackageManager packageManager) {
        android.content.pm.SigningInfo signingInfo;
        boolean hasMultipleSigners;
        android.content.pm.Signature[] signingCertificateHistory;
        android.content.pm.Signature[] apkContentsSigners;
        java.lang.String str = null;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.content.Context context = this.f9506l;
                p154k3.AbstractC1803h.m3776b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    p154k3.AbstractC1803h.m3778d(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((android.content.pm.Signature) p105a3.AbstractC1020c.m2049k0(apkContentsSigners)).toByteArray();
                    p154k3.AbstractC1803h.m3778d(byteArray, "toByteArray(...)");
                    str = m4654c(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    p154k3.AbstractC1803h.m3778d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((android.content.pm.Signature) p105a3.AbstractC1020c.m2049k0(signingCertificateHistory)).toByteArray();
                    p154k3.AbstractC1803h.m3778d(byteArray2, "toByteArray(...)");
                    str = m4654c(byteArray2);
                }
            } else {
                android.content.Context context2 = this.f9506l;
                p154k3.AbstractC1803h.m3776b(context2);
                android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && p105a3.AbstractC1020c.m2049k0(signatureArr) != null) {
                    byte[] byteArray3 = ((android.content.pm.Signature) p105a3.AbstractC1020c.m2049k0(signatureArr)).toByteArray();
                    p154k3.AbstractC1803h.m3778d(byteArray3, "toByteArray(...)");
                    str = m4654c(byteArray3);
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.NoSuchAlgorithmException unused) {
        }
        return str;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        this.f9506l = null;
        p035I.C0291m c0291m = this.f9507m;
        p154k3.AbstractC1803h.m3776b(c0291m);
        c0291m.m702s(null);
        this.f9507m = null;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        this.f9506l = (android.content.Context) c0247a.f719l;
        p035I.C0291m c0291m = new p035I.C0291m((p047L2.InterfaceC0376f) c0247a.f720m, "dev.fluttercommunity.plus/package_info");
        this.f9507m = c0291m;
        c0291m.m702s(this);
    }
}
