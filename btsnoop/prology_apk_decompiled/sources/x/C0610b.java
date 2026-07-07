package x;

import B.d;
import android.location.LocationRequest;
import android.os.Build;
import b0.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.e;
import w0.AbstractC0594d;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8960a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8961b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8962c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8963d;

    public C0610b(long j4, int i4, long j5, float f4) {
        this.f8961b = j4;
        this.f8960a = i4;
        this.f8962c = j5;
        this.f8963d = f4;
    }

    public final LocationRequest a(String str) {
        long j4 = this.f8961b;
        if (Build.VERSION.SDK_INT >= 31) {
            return e.d(this);
        }
        Object obj = null;
        try {
            if (AbstractC0594d.f8752d == null) {
                AbstractC0594d.f8752d = Class.forName("android.location.LocationRequest");
            }
            if (AbstractC0594d.f8753e == null) {
                Method declaredMethod = AbstractC0594d.f8752d.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                AbstractC0594d.f8753e = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = AbstractC0594d.f8753e.invoke(null, str, Long.valueOf(j4), Float.valueOf(this.f8963d), Boolean.FALSE);
            if (invoke != null) {
                if (AbstractC0594d.f8754f == null) {
                    Method declaredMethod2 = AbstractC0594d.f8752d.getDeclaredMethod("setQuality", Integer.TYPE);
                    AbstractC0594d.f8754f = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                AbstractC0594d.f8754f.invoke(invoke, Integer.valueOf(this.f8960a));
                if (AbstractC0594d.f8755g == null) {
                    Method declaredMethod3 = AbstractC0594d.f8752d.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    AbstractC0594d.f8755g = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method method = AbstractC0594d.f8755g;
                long j5 = this.f8962c;
                if (j5 != -1) {
                    j4 = j5;
                }
                method.invoke(invoke, Long.valueOf(j4));
                obj = invoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return i.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0610b)) {
            return false;
        }
        C0610b c0610b = (C0610b) obj;
        return this.f8960a == c0610b.f8960a && this.f8961b == c0610b.f8961b && this.f8962c == c0610b.f8962c && Float.compare(c0610b.f8963d, this.f8963d) == 0;
    }

    public final int hashCode() {
        int i4 = this.f8960a * 31;
        long j4 = this.f8961b;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f8962c;
        return i5 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        long j4 = this.f8961b;
        if (j4 != Long.MAX_VALUE) {
            sb.append("@");
            d.b(j4, sb);
            int i4 = this.f8960a;
            if (i4 == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i4 == 102) {
                sb.append(" BALANCED");
            } else if (i4 == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        long j5 = this.f8962c;
        if (j5 != -1 && j5 < j4) {
            sb.append(", minUpdateInterval=");
            d.b(j5, sb);
        }
        float f4 = this.f8963d;
        if (f4 > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(f4);
        }
        if (0 > j4) {
            sb.append(", maxUpdateDelay=");
            d.b(0L, sb);
        }
        sb.append(']');
        return sb.toString();
    }
}
