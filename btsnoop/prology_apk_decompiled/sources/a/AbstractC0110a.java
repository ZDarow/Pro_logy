package a;

import B2.AbstractC0007h;
import C.A;
import C.C;
import C.O;
import C.z;
import F.e;
import L.k;
import L2.n;
import L2.p;
import M1.g;
import T.I;
import W.q;
import W.r;
import W2.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Address;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.C0155g;
import androidx.lifecycle.x;
import b3.C0188b;
import b3.C0196j;
import b3.InterfaceC0193g;
import b3.InterfaceC0194h;
import b3.InterfaceC0195i;
import f1.C0271e;
import i2.b;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import k3.h;
import p1.AbstractC0462a;
import r3.B;
import r3.InterfaceC0533u;
import r3.T;
import u1.m;
import w3.o;
import y0.l;
import y1.C0626b;
import y3.d;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0110a {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f3188a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3189b;

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f3190c;

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f3191d;

    /* renamed from: e, reason: collision with root package name */
    public static WeakReference f3192e;

    /* renamed from: f, reason: collision with root package name */
    public static WeakReference f3193f;

    /* renamed from: g, reason: collision with root package name */
    public static long f3194g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f3195h;

    /* renamed from: i, reason: collision with root package name */
    public static Method f3196i;

    /* renamed from: j, reason: collision with root package name */
    public static Method f3197j;

    public static int A(Context context, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId != 0 ? i4 : i5;
    }

    public static float B(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static String C(TypedArray typedArray, int i4, int i5) {
        String string = typedArray.getString(i4);
        return string == null ? typedArray.getString(i5) : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0533u D(x xVar) {
        Object obj;
        Object obj2;
        HashMap hashMap = xVar.f4190a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = xVar.f4190a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        InterfaceC0533u interfaceC0533u = (InterfaceC0533u) obj;
        if (interfaceC0533u != null) {
            return interfaceC0533u;
        }
        T t4 = new T(null);
        d dVar = B.f8110a;
        androidx.lifecycle.a aVar = new androidx.lifecycle.a(J(t4, o.f8942a.f8274q));
        synchronized (xVar.f4190a) {
            try {
                obj2 = xVar.f4190a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
                if (obj2 == 0) {
                    xVar.f4190a.put("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != 0) {
            aVar = obj2;
        }
        if (xVar.f4191b && (aVar instanceof Closeable)) {
            try {
                aVar.close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
        return aVar;
    }

    public static void E(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean F(Context context, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT < 33) {
                packageInfo = packageManager.getPackageInfo(packageName, 4096);
            } else {
                of = PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            }
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return false;
    }

    public static int G(int i4, int i5, int i6, int[] iArr) {
        while (i5 < i6) {
            if (iArr[i5] == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static InterfaceC0195i H(InterfaceC0193g interfaceC0193g, InterfaceC0194h interfaceC0194h) {
        h.e(interfaceC0194h, "key");
        return h.a(interfaceC0193g.getKey(), interfaceC0194h) ? C0196j.f4462l : interfaceC0193g;
    }

    public static float I(EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f4, f5);
        }
        F.d.a(edgeEffect, f4, f5);
        return f4;
    }

    public static InterfaceC0195i J(InterfaceC0193g interfaceC0193g, InterfaceC0195i interfaceC0195i) {
        h.e(interfaceC0195i, "context");
        return interfaceC0195i == C0196j.f4462l ? interfaceC0193g : (InterfaceC0195i) interfaceC0195i.k(interfaceC0193g, new C0188b(1));
    }

    public static boolean K(Parcel parcel, int i4) {
        f0(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    public static int L(q qVar, int i4, int i5, int i6) {
        W.a.e(Math.max(Math.max(i4, i5), i6) <= 31);
        int i7 = (1 << i4) - 1;
        int i8 = (1 << i5) - 1;
        AbstractC0462a.p(AbstractC0462a.p(i7, i8), 1 << i6);
        if (qVar.b() < i4) {
            return -1;
        }
        int i9 = qVar.i(i4);
        if (i9 != i7) {
            return i9;
        }
        if (qVar.b() < i5) {
            return -1;
        }
        int i10 = qVar.i(i5);
        int i11 = i9 + i10;
        if (i10 != i8) {
            return i11;
        }
        if (qVar.b() < i6) {
            return -1;
        }
        return i11 + qVar.i(i6);
    }

    public static IBinder M(Parcel parcel, int i4) {
        int P3 = P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + P3);
        return readStrongBinder;
    }

    public static int N(Parcel parcel, int i4) {
        f0(parcel, i4, 4);
        return parcel.readInt();
    }

    public static long O(Parcel parcel, int i4) {
        f0(parcel, i4, 8);
        return parcel.readLong();
    }

    public static int P(Parcel parcel, int i4) {
        return (i4 & (-65536)) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    public static p Q() {
        WeakReference weakReference = f3193f;
        if (weakReference == null) {
            h.i("result");
            throw null;
        }
        p pVar = (p) weakReference.get();
        if (pVar != null) {
            return pVar;
        }
        throw new Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    public static int R(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public static void S(q qVar) {
        qVar.t(3);
        qVar.t(8);
        boolean h4 = qVar.h();
        boolean h5 = qVar.h();
        if (h4) {
            qVar.t(5);
        }
        if (h5) {
            qVar.t(6);
        }
    }

    public static void T(q qVar) {
        int i4;
        int i5 = qVar.i(2);
        if (i5 == 0) {
            qVar.t(6);
            return;
        }
        int L3 = L(qVar, 5, 8, 16) + 1;
        if (i5 == 1) {
            qVar.t(L3 * 7);
            return;
        }
        if (i5 == 2) {
            boolean h4 = qVar.h();
            int i6 = h4 ? 1 : 5;
            int i7 = h4 ? 7 : 5;
            int i8 = h4 ? 8 : 6;
            int i9 = 0;
            while (i9 < L3) {
                if (qVar.h()) {
                    qVar.t(7);
                    i4 = 0;
                } else {
                    if (qVar.i(2) == 3 && qVar.i(i7) * i6 != 0) {
                        qVar.s();
                    }
                    i4 = qVar.i(i8) * i6;
                    if (i4 != 0 && i4 != 180) {
                        qVar.s();
                    }
                    qVar.s();
                }
                if (i4 != 0 && i4 != 180 && qVar.h()) {
                    i9++;
                }
                i9++;
            }
        }
    }

    public static C0271e U(int i4, l lVar, r rVar) {
        C0271e b4 = C0271e.b(lVar, rVar);
        while (true) {
            int i5 = b4.f5489a;
            if (i5 == i4) {
                return b4;
            }
            AbstractC0007h.o(i5, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j4 = b4.f5490b;
            long j5 = 8 + j4;
            if (j4 % 2 != 0) {
                j5 = 9 + j4;
            }
            if (j5 > 2147483647L) {
                throw I.c("Chunk is too large (~2GB+) to skip; id: " + i5);
            }
            lVar.e((int) j5);
            b4 = C0271e.b(lVar, rVar);
        }
    }

    public static void V(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + P(parcel, i4));
    }

    public static ArrayList W(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Address address = (Address) it.next();
            HashMap hashMap = new HashMap();
            String addressLine = address.getAddressLine(0);
            String str = null;
            if (addressLine != null && !addressLine.isEmpty()) {
                StringTokenizer stringTokenizer = new StringTokenizer(addressLine, ",", false);
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

    public static int[] X(Collection collection) {
        if (collection instanceof b) {
            b bVar = (b) collection;
            return Arrays.copyOfRange(bVar.f6203l, bVar.f6204m, bVar.f6205n);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            iArr[i4] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static boolean Y(View view, c cVar) {
        if (view == null) {
            return false;
        }
        if (cVar.d(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                if (Y(viewGroup.getChildAt(i4), cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String Z(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static int a0(Parcel parcel) {
        int readInt = parcel.readInt();
        int P3 = P(parcel, readInt);
        char c4 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new I1.a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i4 = P3 + dataPosition;
        if (i4 < dataPosition || i4 > parcel.dataSize()) {
            throw new I1.a(AbstractC0007h.i(dataPosition, i4, "Size read is invalid start=", " end="), parcel);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r6, I.C0042k r7, d3.b r8) {
        /*
            boolean r0 = r8 instanceof I.C0036e
            if (r0 == 0) goto L13
            r0 = r8
            I.e r0 = (I.C0036e) r0
            int r1 = r0.f816r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f816r = r1
            goto L18
        L13:
            I.e r0 = new I.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f815q
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f816r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f814p
            java.io.Serializable r7 = r0.f813o
            k3.p r7 = (k3.p) r7
            p1.AbstractC0462a.P(r8)     // Catch: java.lang.Throwable -> L30
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
            java.io.Serializable r6 = r0.f813o
            java.util.List r6 = (java.util.List) r6
            p1.AbstractC0462a.P(r8)
            goto L5c
        L42:
            p1.AbstractC0462a.P(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            I.g r2 = new I.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f813o = r8
            r0.f816r = r4
            java.lang.Object r6 = r7.a(r2, r0)
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
            j3.l r8 = (j3.l) r8
            r0.f813o = r7     // Catch: java.lang.Throwable -> L30
            r0.f814p = r6     // Catch: java.lang.Throwable -> L30
            r0.f816r = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f7104l
            if (r2 != 0) goto L85
            r7.f7104l = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            c(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f7104l
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            Z2.g r1 = Z2.g.f3186a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0110a.b(java.util.List, I.k, d3.b):java.lang.Object");
    }

    public static ArrayList b0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void c(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = f3.a.f5633a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = e3.a.f5450a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static ArrayList c0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof S2.b) {
            S2.b bVar = (S2.b) th;
            arrayList.add(bVar.f2054l);
            arrayList.add(bVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static List d(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new b(0, iArr.length, iArr);
    }

    public static ArrayList d0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void e0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void f0(Parcel parcel, int i4, int i5) {
        int P3 = P(parcel, i4);
        if (P3 == i5) {
            return;
        }
        String hexString = Integer.toHexString(P3);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(P3);
        sb.append(" (0x");
        throw new I1.a(AbstractC0007h.m(sb, hexString, ")"), parcel);
    }

    public static void g(Context context, W2.b bVar) {
        Rect rect;
        O b4;
        WindowMetrics maximumWindowMetrics;
        Activity z4 = z(context);
        if (z4 != null) {
            u1.l.f8591a.getClass();
            int i4 = m.f8592b;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                maximumWindowMetrics = ((WindowManager) z4.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = z4.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i5 < 30) {
                b4 = (i5 >= 34 ? new C() : i5 >= 30 ? new C.B() : i5 >= 29 ? new A() : new z()).b();
                h.d(b4, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i5 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b4 = C0626b.f9143a.a(z4);
            }
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            if (i6 > i8) {
                throw new IllegalArgumentException(AbstractC0007h.i(i6, i8, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i7 > i9) {
                throw new IllegalArgumentException(AbstractC0007h.i(i7, i9, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            h.e(b4, "_windowInsetsCompat");
            ((C2.c) bVar).f345a.updateDisplayMetrics(0, new Rect(i6, i7, i8, i9).width(), new Rect(i6, i7, i8, i9).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static n h() {
        WeakReference weakReference = f3192e;
        if (weakReference == null) {
            h.i("call");
            throw null;
        }
        n nVar = (n) weakReference.get();
        if (nVar != null) {
            return nVar;
        }
        throw new Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    public static boolean i(l lVar) {
        r rVar = new r(8);
        int i4 = C0271e.b(lVar, rVar).f5489a;
        if (i4 != 1380533830 && i4 != 1380333108) {
            return false;
        }
        lVar.p(rVar.f2694a, 0, 4, false);
        rVar.G(0);
        int h4 = rVar.h();
        if (h4 == 1463899717) {
            return true;
        }
        W.a.n("WavHeaderReader", "Unsupported form type: " + h4);
        return false;
    }

    public static void j(String str, long j4) {
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j4 + ") must be >= 0");
    }

    public static final String k(Integer num, int i4, boolean z4) {
        String str = z4 ? i4 == 0 ? " COLLATE NOCASE ASC" : " COLLATE NOCASE DESC" : i4 == 0 ? " ASC" : " DESC";
        return (num != null && num.intValue() == 0) ? "title".concat(str) : (num != null && num.intValue() == 1) ? "artist".concat(str) : (num != null && num.intValue() == 2) ? "album".concat(str) : (num != null && num.intValue() == 3) ? "duration".concat(str) : (num != null && num.intValue() == 4) ? "date_added".concat(str) : (num != null && num.intValue() == 5) ? "_size".concat(str) : (num != null && num.intValue() == 6) ? "_display_name".concat(str) : "title_key".concat(str);
    }

    public static int l(long j4) {
        int i4 = (int) j4;
        AbstractC0462a.k(((long) i4) == j4, "Out of range: %s", j4);
        return i4;
    }

    public static void m(Y.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Context n() {
        WeakReference weakReference = f3190c;
        if (weakReference == null) {
            h.i("context");
            throw null;
        }
        Context context = (Context) weakReference.get();
        if (context != null) {
            return context;
        }
        throw new Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    public static final void o(int i4, int i5) {
        if (i4 <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i5 + ").");
    }

    public static Parcelable p(Parcel parcel, int i4, Parcelable.Creator creator) {
        int P3 = P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + P3);
        return parcelable;
    }

    public static String q(Parcel parcel, int i4) {
        int P3 = P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + P3);
        return readString;
    }

    public static Object[] r(Parcel parcel, int i4, Parcelable.Creator creator) {
        int P3 = P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + P3);
        return createTypedArray;
    }

    public static ArrayList s(Parcel parcel, int i4, Parcelable.Creator creator) {
        int P3 = P(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + P3);
        return createTypedArrayList;
    }

    public static B3.b t(String str) {
        byte[] bytes = str.getBytes(q3.a.f7945a);
        h.d(bytes, "this as java.lang.String).getBytes(charset)");
        B3.b bVar = new B3.b(bytes);
        bVar.f228n = str;
        return bVar;
    }

    public static void u(Parcel parcel, int i4) {
        if (parcel.dataPosition() != i4) {
            throw new I1.a(AbstractC0007h.k("Overread allowed size end=", i4), parcel);
        }
    }

    public static boolean v(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String w(C0155g c0155g) {
        StringBuilder sb = new StringBuilder(c0155g.size());
        for (int i4 = 0; i4 < c0155g.size(); i4++) {
            byte a4 = c0155g.a(i4);
            if (a4 == 34) {
                sb.append("\\\"");
            } else if (a4 == 39) {
                sb.append("\\'");
            } else if (a4 != 92) {
                switch (a4) {
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
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
                        if (a4 < 32 || a4 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a4 >>> 6) & 3) + 48));
                            sb.append((char) (((a4 >>> 3) & 7) + 48));
                            sb.append((char) ((a4 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a4);
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

    public static int x(byte[] bArr) {
        boolean z4 = bArr.length >= 4;
        int length = bArr.length;
        if (!z4) {
            throw new IllegalArgumentException(U1.a.u("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static InterfaceC0193g y(InterfaceC0193g interfaceC0193g, InterfaceC0194h interfaceC0194h) {
        h.e(interfaceC0194h, "key");
        if (h.a(interfaceC0193g.getKey(), interfaceC0194h)) {
            return interfaceC0193g;
        }
        return null;
    }

    public static Activity z(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return z(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public M1.c e(Context context, Looper looper, C2.d dVar, Object obj, g gVar, M1.h hVar) {
        return f(context, looper, dVar, obj, (N1.o) gVar, (N1.o) hVar);
    }

    public M1.c f(Context context, Looper looper, C2.d dVar, Object obj, N1.o oVar, N1.o oVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
