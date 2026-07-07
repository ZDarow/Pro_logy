package X2;

import B2.AbstractActivityC0003d;
import I.C0044m;
import L2.s;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.t;
import android.util.Log;
import android.util.SparseArray;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public class r implements H2.b, I2.a {

    /* renamed from: l, reason: collision with root package name */
    public C0044m f2970l;

    /* renamed from: n, reason: collision with root package name */
    public BluetoothAdapter f2972n;

    /* renamed from: p, reason: collision with root package name */
    public L2.h f2974p;

    /* renamed from: t, reason: collision with root package name */
    public L2.h f2977t;

    /* renamed from: x, reason: collision with root package name */
    public AbstractActivityC0003d f2980x;

    /* renamed from: y, reason: collision with root package name */
    public L2.f f2981y;

    /* renamed from: z, reason: collision with root package name */
    public Context f2982z;

    /* renamed from: m, reason: collision with root package name */
    public K2.k f2971m = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2976r = false;
    public q s = null;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f2979v = new SparseArray(2);
    public int w = 0;

    /* renamed from: A, reason: collision with root package name */
    public k f2969A = null;

    /* renamed from: o, reason: collision with root package name */
    public final d f2973o = new d(this, 0);

    /* renamed from: q, reason: collision with root package name */
    public final d f2975q = new d(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final d f2978u = new d(this, 2);

    public static void a(r rVar, k kVar) {
        if (AbstractC0462a.o(rVar.f2980x, "android.permission.ACCESS_COARSE_LOCATION") == 0 && AbstractC0462a.o(rVar.f2980x, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            kVar.b(true);
        } else {
            AbstractC0462a.L(rVar.f2980x, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1451);
            rVar.f2969A = kVar;
        }
    }

    public static String c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean i(BluetoothDevice bluetoothDevice) {
        try {
            return ((Boolean) bluetoothDevice.getClass().getMethod("isConnected", null).invoke(bluetoothDevice, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        C0044m c0044m = this.f2970l;
        if (c0044m != null) {
            c0044m.s(null);
        }
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        Log.v("FlutterBluetoothSerial", "Attached to engine");
        L2.f fVar = (L2.f) aVar.f709m;
        this.f2981y = fVar;
        C0044m c0044m = new C0044m(fVar, "flutter_bluetooth_serial/methods");
        this.f2970l = c0044m;
        c0044m.s(new g(this, 2));
        new t(this.f2981y, "flutter_bluetooth_serial/state").B0(new g(this, 0));
        new t(this.f2981y, "flutter_bluetooth_serial/discovery").B0(new g(this, 1));
    }

    @Override // I2.a
    public final void e() {
    }

    @Override // I2.a
    public final void f(C2.d dVar) {
    }

    @Override // I2.a
    public final void g() {
    }

    @Override // I2.a
    public final void h(C2.d dVar) {
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) dVar.f367a;
        this.f2980x = abstractActivityC0003d;
        this.f2972n = ((BluetoothManager) abstractActivityC0003d.getSystemService("bluetooth")).getAdapter();
        dVar.a(new L2.r() { // from class: X2.b
            @Override // L2.r
            public final boolean a(int i4, int i5, Intent intent) {
                r rVar = r.this;
                if (i4 == 1337) {
                    K2.k kVar = rVar.f2971m;
                    if (kVar != null) {
                        kVar.b(Boolean.valueOf(i5 != 0));
                    }
                } else {
                    if (i4 != 2137) {
                        rVar.getClass();
                        return false;
                    }
                    K2.k kVar2 = rVar.f2971m;
                    if (i5 == 0) {
                        i5 = -1;
                    }
                    kVar2.b(Integer.valueOf(i5));
                }
                return true;
            }
        });
        ((HashSet) dVar.f368b).add(new s() { // from class: X2.c
            @Override // L2.s
            public final boolean c(int i4, String[] strArr, int[] iArr) {
                r rVar = r.this;
                if (i4 != 1451) {
                    rVar.getClass();
                    return false;
                }
                rVar.f2969A.b(iArr[0] == 0);
                rVar.f2969A = null;
                return true;
            }
        });
        AbstractActivityC0003d abstractActivityC0003d2 = (AbstractActivityC0003d) dVar.f367a;
        this.f2980x = abstractActivityC0003d2;
        this.f2982z = abstractActivityC0003d2.getApplicationContext();
    }
}
