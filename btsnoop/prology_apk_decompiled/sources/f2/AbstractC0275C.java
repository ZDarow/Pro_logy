package f2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: f2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275C {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5498a;

    /* renamed from: b, reason: collision with root package name */
    public int f5499b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5500c;

    public AbstractC0275C(int i4) {
        r.e("initialCapacity", i4);
        this.f5498a = new Object[i4];
        this.f5499b = 0;
    }

    public static int e(int i4, int i5) {
        if (i5 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i6 = i4 + (i4 >> 1) + 1;
        if (i6 < i5) {
            i6 = Integer.highestOneBit(i5 - 1) << 1;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    public final void a(Object obj) {
        obj.getClass();
        f(this.f5499b + 1);
        Object[] objArr = this.f5498a;
        int i4 = this.f5499b;
        this.f5499b = i4 + 1;
        objArr[i4] = obj;
    }

    public abstract AbstractC0275C b(Object obj);

    public void c(Object obj) {
        a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List list) {
        if (list != 0) {
            f(list.size() + this.f5499b);
            if (list instanceof AbstractC0276D) {
                this.f5499b = ((AbstractC0276D) list).b(this.f5499b, this.f5498a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void f(int i4) {
        Object[] objArr = this.f5498a;
        if (objArr.length < i4) {
            this.f5498a = Arrays.copyOf(objArr, e(objArr.length, i4));
            this.f5500c = false;
        } else if (this.f5500c) {
            this.f5498a = (Object[]) objArr.clone();
            this.f5500c = false;
        }
    }
}
