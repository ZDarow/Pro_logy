package p008B1;

/* renamed from: B1.d */
/* loaded from: classes.dex */
public final class C0026d implements p047L2.InterfaceC0385o, p009B2.InterfaceC0035F, p047L2.InterfaceC0373c, p047L2.InterfaceC0374d, p119d2.InterfaceC1282a, p094Y.InterfaceC0869g {

    /* renamed from: o */
    public static p008B1.C0026d f96o;

    /* renamed from: p */
    public static p009B2.C0037H f97p;

    /* renamed from: l */
    public final /* synthetic */ int f98l;

    /* renamed from: m */
    public java.lang.Object f99m;

    /* renamed from: n */
    public java.lang.Object f100n;

    public /* synthetic */ C0026d(int i4, java.lang.Object obj) {
        this.f98l = i4;
        this.f99m = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0071. Please report as an issue. */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m98c(p008B1.C0026d r11, org.json.JSONArray r12) {
        /*
            r11.getClass()
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L7:
            int r3 = r12.length()
            r4 = 2
            r5 = 4
            r6 = 1
            if (r0 >= r3) goto L6b
            java.lang.String r3 = r12.getString(r0)
            int[] r5 = p044L.AbstractC0352j.m782c(r5)
            int r7 = r5.length
            r8 = r11
        L1a:
            if (r8 >= r7) goto L5f
            r9 = r5[r8]
            r10 = 1
            if (r9 == r10) goto L35
            r10 = 2
            if (r9 == r10) goto L32
            r10 = 3
            if (r9 == r10) goto L2f
            r10 = 4
            if (r9 != r10) goto L2d
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L37
        L2d:
            r11 = 0
            throw r11
        L2f:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L37
        L32:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L37
        L35:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L37:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L5c
            int r3 = p044L.AbstractC0352j.m781b(r9)
            if (r3 == 0) goto L54
            if (r3 == r6) goto L51
            if (r3 == r4) goto L4e
            r4 = 3
            if (r3 == r4) goto L4b
            goto L56
        L4b:
            r1 = r1 | 8
            goto L56
        L4e:
            r1 = r1 | 2
            goto L56
        L51:
            r1 = r1 | 4
            goto L56
        L54:
            r1 = r1 | 1
        L56:
            if (r2 != 0) goto L59
            r2 = r1
        L59:
            int r0 = r0 + 1
            goto L7
        L5c:
            int r8 = r8 + 1
            goto L1a
        L5f:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.String r12 = "No such DeviceOrientation: "
            java.lang.String r12 = p009B2.AbstractC0051h.m153l(r12, r3)
            r11.<init>(r12)
            throw r11
        L6b:
            if (r1 == 0) goto L8c
            r12 = 8
            r0 = 9
            switch(r1) {
                case 2: goto L8d;
                case 3: goto L84;
                case 4: goto L82;
                case 5: goto L7f;
                case 6: goto L84;
                case 7: goto L84;
                case 8: goto L7d;
                case 9: goto L84;
                case 10: goto L7a;
                case 11: goto L78;
                case 12: goto L84;
                case 13: goto L84;
                case 14: goto L84;
                case 15: goto L75;
                default: goto L74;
            }
        L74:
            goto L8a
        L75:
            r11 = 13
            goto L8d
        L78:
            r11 = r4
            goto L8d
        L7a:
            r11 = 11
            goto L8d
        L7d:
            r11 = r12
            goto L8d
        L7f:
            r11 = 12
            goto L8d
        L82:
            r11 = r0
            goto L8d
        L84:
            if (r2 == r4) goto L8d
            if (r2 == r5) goto L82
            if (r2 == r12) goto L7d
        L8a:
            r11 = r6
            goto L8d
        L8c:
            r11 = -1
        L8d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p008B1.C0026d.m98c(B1.d, org.json.JSONArray):int");
    }

    /* renamed from: d */
    public static java.util.ArrayList m99d(p008B1.C0026d c0026d, org.json.JSONArray jSONArray) {
        c0026d.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            java.lang.String string = jSONArray.getString(i4);
            for (p043K2.EnumC0330f enumC0330f : p043K2.EnumC0330f.values()) {
                if (enumC0330f.f1006l.equals(string)) {
                    int ordinal = enumC0330f.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(p043K2.EnumC0330f.f1003m);
                    } else if (ordinal == 1) {
                        arrayList.add(p043K2.EnumC0330f.f1004n);
                    }
                }
            }
            throw new java.lang.NoSuchFieldException(p009B2.AbstractC0051h.m153l("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static int m100g(p008B1.C0026d c0026d, java.lang.String str) {
        java.lang.String str2;
        c0026d.getClass();
        for (int i4 : p044L.AbstractC0352j.m782c(4)) {
            if (i4 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i4 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i4 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i4 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int m781b = p044L.AbstractC0352j.m781b(i4);
                if (m781b == 0) {
                    return 1;
                }
                if (m781b != 1) {
                    return m781b != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new java.lang.NoSuchFieldException(p009B2.AbstractC0051h.m153l("No such SystemUiMode: ", str));
    }

    /* renamed from: h */
    public static p043K2.C0329e m101h(p008B1.C0026d c0026d, org.json.JSONObject jSONObject) {
        c0026d.getClass();
        return new p043K2.C0329e(!jSONObject.isNull("statusBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? p009B2.AbstractC0051h.m143b(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? java.lang.Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? p009B2.AbstractC0051h.m143b(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : java.lang.Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* renamed from: j */
    public static java.util.HashMap m102j(java.lang.String str, int i4, int i5, int i6, int i7) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("text", str);
        p009B2.AbstractC0051h.m157p(i4, hashMap, "selectionBase", i5, "selectionExtent");
        p009B2.AbstractC0051h.m157p(i6, hashMap, "composingBase", i7, "composingExtent");
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0414, code lost:
    
        if (r6.equals("placemarkFromAddress") == false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo42I(p047L2.C0384n r19, p043K2.C0335k r20) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008B1.C0026d.mo42I(L2.n, K2.k):void");
    }

    @Override // p047L2.InterfaceC0374d
    /* renamed from: R */
    public void mo103R(java.nio.ByteBuffer byteBuffer, p018D2.C0181g c0181g) {
        switch (this.f98l) {
            case 17:
                p035I.C0291m c0291m = (p035I.C0291m) this.f100n;
                try {
                    ((p047L2.InterfaceC0372b) this.f99m).mo270e(((p047L2.InterfaceC0383m) c0291m.f878n).mo831a(byteBuffer), new p008B1.C0026d(16, this, c0181g));
                    return;
                } catch (java.lang.RuntimeException e4) {
                    android.util.Log.e("BasicMessageChannel#" + ((java.lang.String) c0291m.f877m), "Failed to handle message", e4);
                    c0181g.mo289a(null);
                    return;
                }
            default:
                p035I.C0291m c0291m2 = (p035I.C0291m) this.f100n;
                try {
                    ((p047L2.InterfaceC0385o) this.f99m).mo42I(((p047L2.InterfaceC0387q) c0291m2.f878n).mo835c(byteBuffer), new p043K2.C0335k(1, this, c0181g));
                    return;
                } catch (java.lang.RuntimeException e5) {
                    android.util.Log.e("MethodChannel#" + ((java.lang.String) c0291m2.f877m), "Failed to handle method call", e5);
                    c0181g.mo289a(((p047L2.InterfaceC0387q) c0291m2.f878n).mo837e(e5.getMessage(), android.util.Log.getStackTraceString(e5)));
                    return;
                }
        }
    }

    @Override // p094Y.InterfaceC0869g
    /* renamed from: a */
    public p094Y.InterfaceC0870h mo104a() {
        return new p094Y.C0875m((android.content.Context) this.f99m, ((p077T0.C0717e) this.f100n).mo104a());
    }

    @Override // p009B2.InterfaceC0035F
    /* renamed from: b */
    public void mo105b(android.view.KeyEvent keyEvent, p009B2.C0033D c0033d) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            c0033d.m120c(false);
            return;
        }
        java.lang.Character m117a = ((p009B2.C0032C) this.f100n).m117a(keyEvent.getUnicodeChar());
        boolean z4 = action != 0;
        p009B2.C0067x c0067x = new p009B2.C0067x(0, c0033d);
        p043K2.C0326b c0326b = (p043K2.C0326b) this.f99m;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", z4 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", java.lang.Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", java.lang.Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", java.lang.Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", java.lang.Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", m117a.toString());
        hashMap.put("source", java.lang.Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", java.lang.Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", java.lang.Integer.valueOf(keyEvent.getRepeatCount()));
        c0326b.f989a.m700q(hashMap, new p009B2.C0067x(6, c0067x));
    }

    @Override // p047L2.InterfaceC0373c
    /* renamed from: e */
    public void mo106e(java.lang.Object obj) {
        switch (this.f98l) {
            case 14:
                android.support.v4.media.session.C1061t c1061t = (android.support.v4.media.session.C1061t) this.f100n;
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) c1061t.f3861m;
                p043K2.C0337m c0337m = (p043K2.C0337m) this.f99m;
                concurrentLinkedQueue.remove(c0337m);
                if (((java.util.concurrent.ConcurrentLinkedQueue) c1061t.f3861m).isEmpty()) {
                    return;
                }
                android.util.Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + java.lang.String.valueOf(c0337m.f1043a));
                return;
            default:
                ((p018D2.C0181g) this.f99m).mo289a(((p047L2.InterfaceC0383m) ((p035I.C0291m) ((p008B1.C0026d) this.f100n).f100n).f878n).mo832b(obj));
                return;
        }
    }

    @Override // p119d2.InterfaceC1282a
    /* renamed from: f */
    public void mo107f(p119d2.C1290i c1290i) {
        ((java.util.Map) ((p008B1.C0026d) this.f100n).f100n).remove((p119d2.C1285d) this.f99m);
    }

    /* renamed from: i */
    public void m108i(java.lang.Object obj, java.lang.String str) {
        ((java.util.ArrayList) this.f99m).add(str + "=" + java.lang.String.valueOf(obj));
    }

    /* renamed from: k */
    public byte[] m109k(p039J0.C0310a c0310a) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = (java.io.ByteArrayOutputStream) this.f99m;
        byteArrayOutputStream.reset();
        java.io.DataOutputStream dataOutputStream = (java.io.DataOutputStream) this.f100n;
        try {
            dataOutputStream.writeBytes(c0310a.f925l);
            dataOutputStream.writeByte(0);
            java.lang.String str = c0310a.f926m;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c0310a.f927n);
            dataOutputStream.writeLong(c0310a.f928o);
            dataOutputStream.write(c0310a.f929p);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }

    /* renamed from: l */
    public void m110l(java.lang.String str, p008B1.InterfaceC0023a interfaceC0023a) {
        java.util.Locale locale = (java.util.Locale) this.f100n;
        android.content.Context context = (android.content.Context) this.f99m;
        android.location.Geocoder geocoder = locale != null ? new android.location.Geocoder(context, locale) : new android.location.Geocoder(context);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocationName(str, 5, new p008B1.C0025c(interfaceC0023a, 0));
            return;
        }
        try {
            interfaceC0023a.onGeocode(geocoder.getFromLocationName(str, 5));
        } catch (java.io.IOException e4) {
            interfaceC0023a.onError(e4.getMessage());
        }
    }

    /* renamed from: m */
    public android.view.MotionEvent m111m(p009B2.C0041L c0041l) {
        java.util.PriorityQueue priorityQueue;
        android.util.LongSparseArray longSparseArray;
        long j4;
        while (true) {
            priorityQueue = (java.util.PriorityQueue) this.f100n;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (android.util.LongSparseArray) this.f99m;
            j4 = c0041l.f132a;
            if (isEmpty || ((java.lang.Long) priorityQueue.peek()).longValue() >= j4) {
                break;
            }
            longSparseArray.remove(((java.lang.Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((java.lang.Long) priorityQueue.peek()).longValue() == j4) {
            priorityQueue.poll();
        }
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) longSparseArray.get(j4);
        longSparseArray.remove(j4);
        return motionEvent;
    }

    /* renamed from: n */
    public void m112n(p025F1.C0210b c0210b, boolean z4) {
        android.app.PendingIntent pendingIntent;
        p025F1.C0209a c0209a = c0210b.f588d;
        java.lang.String str = c0209a.f583b;
        java.lang.String str2 = c0209a.f584c;
        android.content.Context context = (android.content.Context) this.f99m;
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            android.content.Context context2 = (android.content.Context) this.f99m;
            context2.getResources().getIdentifier("ic_launcher.png", "mipmap", context2.getPackageName());
        }
        p183r.C2035c c2035c = (p183r.C2035c) this.f100n;
        java.lang.String str3 = c0210b.f585a;
        c2035c.getClass();
        c2035c.f8271e = p183r.C2035c.m4084b(str3);
        c2035c.f8285s.icon = identifier;
        c2035c.f8272f = p183r.C2035c.m4084b(c0210b.f586b);
        android.content.Context context3 = (android.content.Context) this.f99m;
        android.content.Intent launchIntentForPackage = context3.getPackageManager().getLaunchIntentForPackage(context3.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            pendingIntent = android.app.PendingIntent.getActivity(context3, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        c2035c.f8273g = pendingIntent;
        c2035c.m4086c(2, c0210b.f591g);
        this.f100n = c2035c;
        java.lang.Integer num = c0210b.f592h;
        if (num != null) {
            c2035c.f8281o = num.intValue();
            this.f100n = c2035c;
        }
        if (z4) {
            android.content.Context context4 = (android.content.Context) this.f99m;
            p183r.C2042j c2042j = new p183r.C2042j(context4);
            android.app.Notification m4085a = ((p183r.C2035c) this.f100n).m4085a();
            android.os.Bundle bundle = m4085a.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                c2042j.f8306a.notify(null, 75415, m4085a);
                return;
            }
            p183r.C2038f c2038f = new p183r.C2038f(context4.getPackageName(), 75415, m4085a);
            synchronized (p183r.C2042j.f8304e) {
                try {
                    if (p183r.C2042j.f8305f == null) {
                        p183r.C2042j.f8305f = new p183r.ServiceConnectionC2041i(context4.getApplicationContext());
                    }
                    p183r.C2042j.f8305f.f8298m.obtainMessage(0, c2038f).sendToTarget();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            c2042j.f8306a.cancel(null, 75415);
        }
    }

    /* renamed from: o */
    public void m113o(boolean z4, com.google.android.gms.common.api.Status status) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        synchronized (((java.util.Map) this.f99m)) {
            hashMap = new java.util.HashMap((java.util.Map) this.f99m);
        }
        synchronized (((java.util.Map) this.f100n)) {
            hashMap2 = new java.util.HashMap((java.util.Map) this.f100n);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((p119d2.C1285d) entry2.getKey()).m3022b(new p050M1.C0420d(status));
            }
        }
    }

    public java.lang.String toString() {
        switch (this.f98l) {
            case 25:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
                sb.append(this.f100n.getClass().getSimpleName());
                sb.append('{');
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f99m;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append((java.lang.String) arrayList.get(i4));
                    if (i4 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0026d(int i4, java.lang.Object obj, java.lang.Object obj2) {
        this.f98l = i4;
        this.f100n = obj;
        this.f99m = obj2;
    }

    public /* synthetic */ C0026d(int i4, boolean z4) {
        this.f98l = i4;
    }

    public C0026d(p086W.C0796p c0796p, p054N1.C0453h c0453h, int i4) {
        this.f98l = 22;
        this.f100n = c0796p;
        this.f99m = c0453h;
    }

    public /* synthetic */ C0026d(java.lang.Object obj) {
        this.f98l = 25;
        this.f100n = obj;
        this.f99m = new java.util.ArrayList();
    }

    public C0026d(java.lang.String str, p101a.AbstractC0936a abstractC0936a, p025F1.C0215g c0215g) {
        this.f98l = 19;
        this.f100n = str;
        this.f99m = abstractC0936a;
    }

    public C0026d(p055N2.InterfaceC0472a interfaceC0472a, p009B2.C0061r c0061r) {
        this.f98l = 24;
        this.f99m = interfaceC0472a;
        this.f100n = c0061r;
        c0061r.f188m = new p043K2.C0339o(5, this);
    }

    public C0026d(android.content.Context context, p046L1.C0363g c0363g, p033H1.C0246b c0246b, p025F1.C0215g c0215g) {
        this.f98l = 5;
        this.f99m = context;
        this.f100n = c0246b;
    }

    public C0026d(p043K2.C0326b c0326b) {
        this.f98l = 2;
        this.f100n = new p009B2.C0032C();
        this.f99m = c0326b;
    }

    public C0026d(p009B2.C0061r c0061r) {
        this.f98l = 8;
        this.f100n = c0061r;
        this.f99m = new java.util.HashMap();
    }

    public C0026d(android.content.Context context, p025F1.C0210b c0210b) {
        this.f98l = 4;
        this.f99m = context;
        p183r.C2035c c2035c = new p183r.C2035c(context, "geolocator_channel_01");
        c2035c.f8275i = 1;
        this.f100n = c2035c;
        m112n(c0210b, false);
    }

    public C0026d(int i4) {
        this.f98l = i4;
        switch (i4) {
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
                this.f99m = byteArrayOutputStream;
                this.f100n = new java.io.DataOutputStream(byteArrayOutputStream);
                return;
            case 21:
                this.f99m = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                this.f100n = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                return;
            case 26:
                p046L1.C0360d c0360d = p046L1.C0360d.f1104c;
                this.f99m = new android.util.SparseIntArray();
                this.f100n = c0360d;
                return;
            default:
                this.f99m = new android.util.LongSparseArray();
                this.f100n = new java.util.PriorityQueue();
                return;
        }
    }

    public C0026d(p018D2.C0176b c0176b, int i4) {
        this.f98l = i4;
        switch (i4) {
            case 10:
                p009B2.C0061r c0061r = new p009B2.C0061r(19, this);
                p035I.C0291m c0291m = new p035I.C0291m(c0176b, "flutter/platform", p047L2.C0382l.f1132a, null);
                this.f99m = c0291m;
                c0291m.m702s(c0061r);
                return;
            case 11:
                p009B2.C0061r c0061r2 = new p009B2.C0061r(21, this);
                p035I.C0291m c0291m2 = new p035I.C0291m(c0176b, "flutter/platform_views_2", p047L2.C0392v.f1138a, null);
                this.f99m = c0291m2;
                c0291m2.m702s(c0061r2);
                return;
            case 12:
                p009B2.C0061r c0061r3 = new p009B2.C0061r(20, this);
                p035I.C0291m c0291m3 = new p035I.C0291m(c0176b, "flutter/platform_views", p047L2.C0392v.f1138a, null);
                this.f99m = c0291m3;
                c0291m3.m702s(c0061r3);
                return;
            case 13:
            case 14:
            default:
                p009B2.C0061r c0061r4 = new p009B2.C0061r(16, this);
                p035I.C0291m c0291m4 = new p035I.C0291m(c0176b, "flutter/localization", p047L2.C0382l.f1132a, null);
                this.f99m = c0291m4;
                c0291m4.m702s(c0061r4);
                return;
            case 15:
                p043K2.C0339o c0339o = new p043K2.C0339o(0, this);
                p035I.C0291m c0291m5 = new p035I.C0291m(c0176b, "flutter/textinput", p047L2.C0382l.f1132a, null);
                this.f99m = c0291m5;
                c0291m5.m702s(c0339o);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0026d(android.content.Context context) {
        this(context, new p077T0.C0717e(1));
        this.f98l = 29;
    }

    public C0026d(p018D2.C0176b c0176b, android.content.pm.PackageManager packageManager) {
        this.f98l = 13;
        p009B2.C0061r c0061r = new p009B2.C0061r(22, this);
        this.f99m = packageManager;
        new p035I.C0291m(c0176b, "flutter/processtext", p047L2.C0392v.f1138a, null).m702s(c0061r);
    }

    public C0026d(android.content.Context context, p077T0.C0717e c0717e) {
        this.f98l = 29;
        this.f99m = context.getApplicationContext();
        this.f100n = c0717e;
    }

    public C0026d(java.lang.String str, android.os.Bundle bundle) {
        this.f98l = 27;
        this.f99m = str;
        this.f100n = bundle;
    }
}
