package B1;

import B2.AbstractC0007h;
import B2.C;
import B2.D;
import B2.F;
import B2.H;
import B2.L;
import B2.r;
import B2.x;
import I.C0044m;
import K2.k;
import L.j;
import L2.l;
import L2.m;
import L2.o;
import L2.q;
import L2.v;
import W.p;
import Y.h;
import a.AbstractC0110a;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.t;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.common.api.Status;
import d2.C0241d;
import d2.C0246i;
import d2.InterfaceC0238a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
import r.C0498c;
import r.i;

/* loaded from: classes.dex */
public final class d implements o, F, L2.c, L2.d, InterfaceC0238a, Y.g {

    /* renamed from: o, reason: collision with root package name */
    public static d f93o;

    /* renamed from: p, reason: collision with root package name */
    public static H f94p;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f95l;

    /* renamed from: m, reason: collision with root package name */
    public Object f96m;

    /* renamed from: n, reason: collision with root package name */
    public Object f97n;

    public /* synthetic */ d(int i4, Object obj) {
        this.f95l = i4;
        this.f96m = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0071. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(B1.d r11, org.json.JSONArray r12) {
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
            int[] r5 = L.j.c(r5)
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
            int r3 = L.j.b(r9)
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
            java.lang.String r12 = B2.AbstractC0007h.l(r12, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: B1.d.c(B1.d, org.json.JSONArray):int");
    }

    public static ArrayList d(d dVar, JSONArray jSONArray) {
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (K2.f fVar : K2.f.values()) {
                if (fVar.f967l.equals(string)) {
                    int ordinal = fVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(K2.f.f964m);
                    } else if (ordinal == 1) {
                        arrayList.add(K2.f.f965n);
                    }
                }
            }
            throw new NoSuchFieldException(AbstractC0007h.l("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int g(d dVar, String str) {
        String str2;
        dVar.getClass();
        for (int i4 : j.c(4)) {
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
                int b4 = j.b(i4);
                if (b4 == 0) {
                    return 1;
                }
                if (b4 != 1) {
                    return b4 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(AbstractC0007h.l("No such SystemUiMode: ", str));
    }

    public static K2.e h(d dVar, JSONObject jSONObject) {
        dVar.getClass();
        return new K2.e(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? AbstractC0007h.b(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? AbstractC0007h.b(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap j(String str, int i4, int i5, int i6, int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        AbstractC0007h.p(i4, hashMap, "selectionBase", i5, "selectionExtent");
        AbstractC0007h.p(i6, hashMap, "composingBase", i7, "composingExtent");
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
    @Override // L2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(L2.n r19, K2.k r20) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.d.I(L2.n, K2.k):void");
    }

    @Override // L2.d
    public void R(ByteBuffer byteBuffer, D2.g gVar) {
        switch (this.f95l) {
            case 17:
                C0044m c0044m = (C0044m) this.f97n;
                try {
                    ((L2.b) this.f96m).e(((m) c0044m.f849n).a(byteBuffer), new d(16, this, gVar));
                    return;
                } catch (RuntimeException e4) {
                    Log.e("BasicMessageChannel#" + ((String) c0044m.f848m), "Failed to handle message", e4);
                    gVar.a(null);
                    return;
                }
            default:
                C0044m c0044m2 = (C0044m) this.f97n;
                try {
                    ((o) this.f96m).I(((q) c0044m2.f849n).c(byteBuffer), new k(1, this, gVar));
                    return;
                } catch (RuntimeException e5) {
                    Log.e("MethodChannel#" + ((String) c0044m2.f848m), "Failed to handle method call", e5);
                    gVar.a(((q) c0044m2.f849n).e(e5.getMessage(), Log.getStackTraceString(e5)));
                    return;
                }
        }
    }

    @Override // Y.g
    public h a() {
        return new Y.m((Context) this.f96m, ((T0.e) this.f97n).a());
    }

    @Override // B2.F
    public void b(KeyEvent keyEvent, D d4) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            d4.c(false);
            return;
        }
        Character a4 = ((C) this.f97n).a(keyEvent.getUnicodeChar());
        boolean z4 = action != 0;
        x xVar = new x(0, d4);
        K2.b bVar = (K2.b) this.f96m;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z4 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a4.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        bVar.f950a.q(hashMap, new x(6, xVar));
    }

    @Override // L2.c
    public void e(Object obj) {
        switch (this.f95l) {
            case 14:
                t tVar = (t) this.f97n;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) tVar.f3734m;
                K2.m mVar = (K2.m) this.f96m;
                concurrentLinkedQueue.remove(mVar);
                if (((ConcurrentLinkedQueue) tVar.f3734m).isEmpty()) {
                    return;
                }
                Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(mVar.f1004a));
                return;
            default:
                ((D2.g) this.f96m).a(((m) ((C0044m) ((d) this.f97n).f97n).f849n).b(obj));
                return;
        }
    }

    @Override // d2.InterfaceC0238a
    public void f(C0246i c0246i) {
        ((Map) ((d) this.f97n).f97n).remove((C0241d) this.f96m);
    }

    public void i(Object obj, String str) {
        ((ArrayList) this.f96m).add(str + "=" + String.valueOf(obj));
    }

    public byte[] k(J0.a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f96m;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f97n;
        try {
            dataOutputStream.writeBytes(aVar.f891l);
            dataOutputStream.writeByte(0);
            String str = aVar.f892m;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f893n);
            dataOutputStream.writeLong(aVar.f894o);
            dataOutputStream.write(aVar.f895p);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public void l(String str, a aVar) {
        Locale locale = (Locale) this.f97n;
        Context context = (Context) this.f96m;
        Geocoder geocoder = locale != null ? new Geocoder(context, locale) : new Geocoder(context);
        if (Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocationName(str, 5, new c(aVar, 0));
            return;
        }
        try {
            aVar.onGeocode(geocoder.getFromLocationName(str, 5));
        } catch (IOException e4) {
            aVar.onError(e4.getMessage());
        }
    }

    public MotionEvent m(L l4) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j4;
        while (true) {
            priorityQueue = (PriorityQueue) this.f97n;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f96m;
            j4 = l4.f129a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j4) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j4) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j4);
        longSparseArray.remove(j4);
        return motionEvent;
    }

    public void n(F1.b bVar, boolean z4) {
        PendingIntent pendingIntent;
        F1.a aVar = bVar.f578d;
        String str = aVar.f573b;
        String str2 = aVar.f574c;
        Context context = (Context) this.f96m;
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            Context context2 = (Context) this.f96m;
            context2.getResources().getIdentifier("ic_launcher.png", "mipmap", context2.getPackageName());
        }
        C0498c c0498c = (C0498c) this.f97n;
        String str3 = bVar.f575a;
        c0498c.getClass();
        c0498c.f7963e = C0498c.b(str3);
        c0498c.s.icon = identifier;
        c0498c.f7964f = C0498c.b(bVar.f576b);
        Context context3 = (Context) this.f96m;
        Intent launchIntentForPackage = context3.getPackageManager().getLaunchIntentForPackage(context3.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            pendingIntent = PendingIntent.getActivity(context3, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        c0498c.f7965g = pendingIntent;
        c0498c.c(2, bVar.f581g);
        this.f97n = c0498c;
        Integer num = bVar.f582h;
        if (num != null) {
            c0498c.f7973o = num.intValue();
            this.f97n = c0498c;
        }
        if (z4) {
            Context context4 = (Context) this.f96m;
            r.j jVar = new r.j(context4);
            Notification a4 = ((C0498c) this.f97n).a();
            Bundle bundle = a4.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                jVar.f7997a.notify(null, 75415, a4);
                return;
            }
            r.f fVar = new r.f(context4.getPackageName(), 75415, a4);
            synchronized (r.j.f7995e) {
                try {
                    if (r.j.f7996f == null) {
                        r.j.f7996f = new i(context4.getApplicationContext());
                    }
                    r.j.f7996f.f7989m.obtainMessage(0, fVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            jVar.f7997a.cancel(null, 75415);
        }
    }

    public void o(boolean z4, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f96m)) {
            hashMap = new HashMap((Map) this.f96m);
        }
        synchronized (((Map) this.f97n)) {
            hashMap2 = new HashMap((Map) this.f97n);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0241d) entry2.getKey()).b(new M1.d(status));
            }
        }
    }

    public String toString() {
        switch (this.f95l) {
            case 25:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f97n.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f96m;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append((String) arrayList.get(i4));
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

    public /* synthetic */ d(int i4, Object obj, Object obj2) {
        this.f95l = i4;
        this.f97n = obj;
        this.f96m = obj2;
    }

    public /* synthetic */ d(int i4, boolean z4) {
        this.f95l = i4;
    }

    public d(p pVar, N1.h hVar, int i4) {
        this.f95l = 22;
        this.f97n = pVar;
        this.f96m = hVar;
    }

    public /* synthetic */ d(Object obj) {
        this.f95l = 25;
        this.f97n = obj;
        this.f96m = new ArrayList();
    }

    public d(String str, AbstractC0110a abstractC0110a, F1.g gVar) {
        this.f95l = 19;
        this.f97n = str;
        this.f96m = abstractC0110a;
    }

    public d(N2.a aVar, r rVar) {
        this.f95l = 24;
        this.f96m = aVar;
        this.f97n = rVar;
        rVar.f185m = new K2.o(5, this);
    }

    public d(Context context, L1.g gVar, H1.b bVar, F1.g gVar2) {
        this.f95l = 5;
        this.f96m = context;
        this.f97n = bVar;
    }

    public d(K2.b bVar) {
        this.f95l = 2;
        this.f97n = new C();
        this.f96m = bVar;
    }

    public d(r rVar) {
        this.f95l = 8;
        this.f97n = rVar;
        this.f96m = new HashMap();
    }

    public d(Context context, F1.b bVar) {
        this.f95l = 4;
        this.f96m = context;
        C0498c c0498c = new C0498c(context, "geolocator_channel_01");
        c0498c.f7967i = 1;
        this.f97n = c0498c;
        n(bVar, false);
    }

    public d(int i4) {
        this.f95l = i4;
        switch (i4) {
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f96m = byteArrayOutputStream;
                this.f97n = new DataOutputStream(byteArrayOutputStream);
                return;
            case 21:
                this.f96m = Collections.synchronizedMap(new WeakHashMap());
                this.f97n = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 26:
                L1.d dVar = L1.d.f1065c;
                this.f96m = new SparseIntArray();
                this.f97n = dVar;
                return;
            default:
                this.f96m = new LongSparseArray();
                this.f97n = new PriorityQueue();
                return;
        }
    }

    public d(D2.b bVar, int i4) {
        this.f95l = i4;
        switch (i4) {
            case 10:
                r rVar = new r(19, this);
                C0044m c0044m = new C0044m(bVar, "flutter/platform", l.f1093a, null);
                this.f96m = c0044m;
                c0044m.s(rVar);
                return;
            case 11:
                r rVar2 = new r(21, this);
                C0044m c0044m2 = new C0044m(bVar, "flutter/platform_views_2", v.f1099a, null);
                this.f96m = c0044m2;
                c0044m2.s(rVar2);
                return;
            case 12:
                r rVar3 = new r(20, this);
                C0044m c0044m3 = new C0044m(bVar, "flutter/platform_views", v.f1099a, null);
                this.f96m = c0044m3;
                c0044m3.s(rVar3);
                return;
            case 13:
            case 14:
            default:
                r rVar4 = new r(16, this);
                C0044m c0044m4 = new C0044m(bVar, "flutter/localization", l.f1093a, null);
                this.f96m = c0044m4;
                c0044m4.s(rVar4);
                return;
            case 15:
                K2.o oVar = new K2.o(0, this);
                C0044m c0044m5 = new C0044m(bVar, "flutter/textinput", l.f1093a, null);
                this.f96m = c0044m5;
                c0044m5.s(oVar);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, new T0.e(1));
        this.f95l = 29;
    }

    public d(D2.b bVar, PackageManager packageManager) {
        this.f95l = 13;
        r rVar = new r(22, this);
        this.f96m = packageManager;
        new C0044m(bVar, "flutter/processtext", v.f1099a, null).s(rVar);
    }

    public d(Context context, T0.e eVar) {
        this.f95l = 29;
        this.f96m = context.getApplicationContext();
        this.f97n = eVar;
    }

    public d(String str, Bundle bundle) {
        this.f95l = 27;
        this.f96m = str;
        this.f97n = bundle;
    }
}
