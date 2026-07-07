package p129f2;

/* renamed from: f2.C */
/* loaded from: classes.dex */
public abstract class AbstractC1387C {

    /* renamed from: a */
    public java.lang.Object[] f5692a;

    /* renamed from: b */
    public int f5693b;

    /* renamed from: c */
    public boolean f5694c;

    public AbstractC1387C(int i4) {
        p129f2.AbstractC1444r.m3226e("initialCapacity", i4);
        this.f5692a = new java.lang.Object[i4];
        this.f5693b = 0;
    }

    /* renamed from: e */
    public static int m3144e(int i4, int i5) {
        if (i5 < 0) {
            throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i6 = i4 + (i4 >> 1) + 1;
        if (i6 < i5) {
            i6 = java.lang.Integer.highestOneBit(i5 - 1) << 1;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    /* renamed from: a */
    public final void m3145a(java.lang.Object obj) {
        obj.getClass();
        m3149f(this.f5693b + 1);
        java.lang.Object[] objArr = this.f5692a;
        int i4 = this.f5693b;
        this.f5693b = i4 + 1;
        objArr[i4] = obj;
    }

    /* renamed from: b */
    public abstract p129f2.AbstractC1387C mo3146b(java.lang.Object obj);

    /* renamed from: c */
    public void m3147c(java.lang.Object obj) {
        m3145a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m3148d(java.util.List list) {
        if (list != 0) {
            m3149f(list.size() + this.f5693b);
            if (list instanceof p129f2.AbstractC1388D) {
                this.f5693b = ((p129f2.AbstractC1388D) list).mo3151b(this.f5693b, this.f5692a);
                return;
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            mo3146b(it.next());
        }
    }

    /* renamed from: f */
    public final void m3149f(int i4) {
        java.lang.Object[] objArr = this.f5692a;
        if (objArr.length < i4) {
            this.f5692a = java.util.Arrays.copyOf(objArr, m3144e(objArr.length, i4));
            this.f5694c = false;
        } else if (this.f5694c) {
            this.f5692a = (java.lang.Object[]) objArr.clone();
            this.f5694c = false;
        }
    }
}
