package G1;

import B2.AbstractActivityC0003d;
import D1.f;
import E1.b;
import L.j;
import L2.s;
import a.AbstractC0110a;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: o, reason: collision with root package name */
    public static a f681o;

    /* renamed from: l, reason: collision with root package name */
    public AbstractActivityC0003d f682l;

    /* renamed from: m, reason: collision with root package name */
    public f f683m;

    /* renamed from: n, reason: collision with root package name */
    public f f684n;

    public static int a(Context context) {
        Iterator it = b(context).iterator();
        while (it.hasNext()) {
            if (AbstractC0462a.o(context, (String) it.next()) == 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    return 4;
                }
                return (AbstractC0110a.F(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && AbstractC0462a.o(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) ? 4 : 3;
            }
        }
        return 1;
    }

    public static ArrayList b(Context context) {
        boolean F3 = AbstractC0110a.F(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean F4 = AbstractC0110a.F(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!F3 && !F4) {
            throw new Exception();
        }
        ArrayList arrayList = new ArrayList();
        if (F3) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (F4) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    public static boolean d(Context context) {
        int a4 = a(context);
        return a4 == 3 || a4 == 4;
    }

    @Override // L2.s
    public final boolean c(int i4, String[] strArr, int[] iArr) {
        int indexOf;
        int i5 = 0;
        if (i4 != 109) {
            return false;
        }
        AbstractActivityC0003d abstractActivityC0003d = this.f682l;
        if (abstractActivityC0003d == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            f fVar = this.f683m;
            if (fVar != null) {
                fVar.c(1);
            }
            return false;
        }
        int i6 = 4;
        try {
            ArrayList b4 = b(abstractActivityC0003d);
            if (iArr.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            Iterator it = b4.iterator();
            char c4 = 65535;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                int indexOf2 = Arrays.asList(strArr).indexOf(str);
                if (indexOf2 >= 0) {
                    z4 = true;
                }
                if (iArr[indexOf2] == 0) {
                    c4 = 0;
                }
                if (AbstractC0462a.O(this.f682l, str)) {
                    z5 = true;
                }
            }
            if (!z4) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (c4 != 0) {
                i6 = !z5 ? 2 : 1;
            } else if (Build.VERSION.SDK_INT >= 29 && ((indexOf = Arrays.asList(strArr).indexOf("android.permission.ACCESS_BACKGROUND_LOCATION")) < 0 || iArr[indexOf] != 0)) {
                i6 = 3;
            }
            f fVar2 = this.f684n;
            if (fVar2 != null) {
                int b5 = j.b(i6);
                if (b5 != 0) {
                    if (b5 == 1) {
                        i5 = 1;
                    } else if (b5 == 2) {
                        i5 = 2;
                    } else {
                        if (b5 != 3) {
                            throw new IndexOutOfBoundsException();
                        }
                        i5 = 3;
                    }
                }
                fVar2.f457b.b(Integer.valueOf(i5));
            }
            return true;
        } catch (b unused) {
            f fVar3 = this.f683m;
            if (fVar3 != null) {
                fVar3.c(4);
            }
            return false;
        }
    }

    public final void e(AbstractActivityC0003d abstractActivityC0003d, f fVar, f fVar2) {
        if (abstractActivityC0003d == null) {
            fVar2.c(1);
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        ArrayList b4 = b(abstractActivityC0003d);
        if (i4 >= 29 && AbstractC0110a.F(abstractActivityC0003d, "android.permission.ACCESS_BACKGROUND_LOCATION") && a(abstractActivityC0003d) == 3) {
            b4.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f683m = fVar2;
        this.f684n = fVar;
        this.f682l = abstractActivityC0003d;
        AbstractC0462a.L(abstractActivityC0003d, (String[]) b4.toArray(new String[0]), 109);
    }
}
