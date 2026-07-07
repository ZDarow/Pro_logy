package p210x;

/* renamed from: x.b */
/* loaded from: classes.dex */
public final class C2366b {

    /* renamed from: a */
    public final int f9319a;

    /* renamed from: b */
    public final long f9320b;

    /* renamed from: c */
    public final long f9321c;

    /* renamed from: d */
    public final float f9322d;

    public C2366b(long j4, int i4, long j5, float f4) {
        this.f9320b = j4;
        this.f9319a = i4;
        this.f9321c = j5;
        this.f9322d = f4;
    }

    /* renamed from: a */
    public final android.location.LocationRequest m4575a(java.lang.String str) {
        long j4 = this.f9320b;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return p183r.AbstractC2037e.m4096d(this);
        }
        java.lang.Object obj = null;
        try {
            if (p206w0.AbstractC2308d.f9107d == null) {
                p206w0.AbstractC2308d.f9107d = java.lang.Class.forName("android.location.LocationRequest");
            }
            if (p206w0.AbstractC2308d.f9108e == null) {
                java.lang.reflect.Method declaredMethod = p206w0.AbstractC2308d.f9107d.getDeclaredMethod("createFromDeprecatedProvider", java.lang.String.class, java.lang.Long.TYPE, java.lang.Float.TYPE, java.lang.Boolean.TYPE);
                p206w0.AbstractC2308d.f9108e = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            java.lang.Object invoke = p206w0.AbstractC2308d.f9108e.invoke(null, str, java.lang.Long.valueOf(j4), java.lang.Float.valueOf(this.f9322d), java.lang.Boolean.FALSE);
            if (invoke != null) {
                if (p206w0.AbstractC2308d.f9109f == null) {
                    java.lang.reflect.Method declaredMethod2 = p206w0.AbstractC2308d.f9107d.getDeclaredMethod("setQuality", java.lang.Integer.TYPE);
                    p206w0.AbstractC2308d.f9109f = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                p206w0.AbstractC2308d.f9109f.invoke(invoke, java.lang.Integer.valueOf(this.f9319a));
                if (p206w0.AbstractC2308d.f9110g == null) {
                    java.lang.reflect.Method declaredMethod3 = p206w0.AbstractC2308d.f9107d.getDeclaredMethod("setFastestInterval", java.lang.Long.TYPE);
                    p206w0.AbstractC2308d.f9110g = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                java.lang.reflect.Method method = p206w0.AbstractC2308d.f9110g;
                long j5 = this.f9321c;
                if (j5 != -1) {
                    j4 = j5;
                }
                method.invoke(invoke, java.lang.Long.valueOf(j4));
                obj = invoke;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        return p107b0.AbstractC1174i.m2787d(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p210x.C2366b)) {
            return false;
        }
        p210x.C2366b c2366b = (p210x.C2366b) obj;
        return this.f9319a == c2366b.f9319a && this.f9320b == c2366b.f9320b && this.f9321c == c2366b.f9321c && java.lang.Float.compare(c2366b.f9322d, this.f9322d) == 0;
    }

    public final int hashCode() {
        int i4 = this.f9319a * 31;
        long j4 = this.f9320b;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f9321c;
        return i5 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request[");
        long j4 = this.f9320b;
        if (j4 != Long.MAX_VALUE) {
            sb.append("@");
            p006B.AbstractC0021d.m62b(j4, sb);
            int i4 = this.f9319a;
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
        long j5 = this.f9321c;
        if (j5 != -1 && j5 < j4) {
            sb.append(", minUpdateInterval=");
            p006B.AbstractC0021d.m62b(j5, sb);
        }
        float f4 = this.f9322d;
        if (f4 > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(f4);
        }
        if (0 > j4) {
            sb.append(", maxUpdateDelay=");
            p006B.AbstractC0021d.m62b(0L, sb);
        }
        sb.append(']');
        return sb.toString();
    }
}
