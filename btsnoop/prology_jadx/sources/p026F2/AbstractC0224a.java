package p026F2;

/* renamed from: F2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0224a {

    /* renamed from: a */
    public static final java.lang.String f638a = p026F2.C0229f.class.getName().concat(".aot-shared-library-name");

    /* renamed from: b */
    public static final java.lang.String f639b = p026F2.C0229f.class.getName().concat(".vm-snapshot-data");

    /* renamed from: c */
    public static final java.lang.String f640c = p026F2.C0229f.class.getName().concat(".isolate-snapshot-data");

    /* renamed from: d */
    public static final java.lang.String f641d = p026F2.C0229f.class.getName().concat(".flutter-assets-dir");

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p026F2.C0225b m609a(android.content.Context r10) {
        /*
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L99
            java.lang.String r1 = r10.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L99
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L99
            F2.b r7 = new F2.b
            android.os.Bundle r1 = r0.metaData
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r2
            goto L1e
        L17:
            java.lang.String r3 = p026F2.AbstractC0224a.f638a
            java.lang.String r1 = r1.getString(r3, r2)
            r3 = r1
        L1e:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L23
            goto L28
        L23:
            java.lang.String r4 = p026F2.AbstractC0224a.f639b
            r1.getString(r4, r2)
        L28:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L2d
            goto L32
        L2d:
            java.lang.String r4 = p026F2.AbstractC0224a.f640c
            r1.getString(r4, r2)
        L32:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L38
            r4 = r2
            goto L3f
        L38:
            java.lang.String r4 = p026F2.AbstractC0224a.f641d
            java.lang.String r1 = r1.getString(r4, r2)
            r4 = r1
        L3f:
            android.os.Bundle r1 = r0.metaData
            r5 = 1
            if (r1 != 0) goto L46
        L44:
            r10 = r2
            goto L81
        L46:
            java.lang.String r6 = "io.flutter.network-policy"
            r8 = 0
            int r1 = r1.getInt(r6, r8)
            if (r1 > 0) goto L50
            goto L44
        L50:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            android.content.res.Resources r10 = r10.getResources()     // Catch: java.lang.Throwable -> L44
            android.content.res.XmlResourceParser r10 = r10.getXml(r1)     // Catch: java.lang.Throwable -> L44
            r10.next()     // Catch: java.lang.Throwable -> L44
            int r1 = r10.getEventType()     // Catch: java.lang.Throwable -> L44
        L64:
            if (r1 == r5) goto L7d
            r9 = 2
            if (r1 != r9) goto L78
            java.lang.String r1 = r10.getName()     // Catch: java.lang.Throwable -> L44
            java.lang.String r9 = "domain-config"
            boolean r1 = r1.equals(r9)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L78
            m610b(r10, r6, r8)     // Catch: java.lang.Throwable -> L44
        L78:
            int r1 = r10.next()     // Catch: java.lang.Throwable -> L44
            goto L64
        L7d:
            java.lang.String r10 = r6.toString()
        L81:
            java.lang.String r6 = r0.nativeLibraryDir
            android.os.Bundle r0 = r0.metaData
            if (r0 != 0) goto L89
            r0 = r5
            goto L8f
        L89:
            java.lang.String r1 = "io.flutter.automatically-register-plugins"
            boolean r0 = r0.getBoolean(r1, r5)
        L8f:
            r1 = r7
            r2 = r3
            r3 = r4
            r4 = r10
            r5 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L99:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p026F2.AbstractC0224a.m609a(android.content.Context):F2.b");
    }

    /* renamed from: b */
    public static void m610b(android.content.res.XmlResourceParser xmlResourceParser, org.json.JSONArray jSONArray, boolean z4) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z4);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new java.lang.IllegalStateException("Expected text");
                    }
                    java.lang.String trim = xmlResourceParser.getText().trim();
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new java.lang.IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m610b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    java.lang.String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
