package S0;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import j.C0364t;
import j.RunnableC0363s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f1900a;

    /* renamed from: b, reason: collision with root package name */
    public int f1901b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1902c = new long[10];

    /* renamed from: d, reason: collision with root package name */
    public Object f1903d = new Object[10];

    public synchronized void a(long j4, Object obj) {
        if (this.f1901b > 0) {
            if (j4 <= ((long[]) this.f1902c)[((this.f1900a + r0) - 1) % ((Object[]) this.f1903d).length]) {
                c();
            }
        }
        d();
        int i4 = this.f1900a;
        int i5 = this.f1901b;
        Object[] objArr = (Object[]) this.f1903d;
        int length = (i4 + i5) % objArr.length;
        ((long[]) this.f1902c)[length] = j4;
        objArr[length] = obj;
        this.f1901b = i5 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new F2.c(11, this));
    }

    public synchronized void c() {
        this.f1900a = 0;
        this.f1901b = 0;
        Arrays.fill((Object[]) this.f1903d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.f1903d).length;
        if (this.f1901b < length) {
            return;
        }
        int i4 = length * 2;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        int i5 = this.f1900a;
        int i6 = length - i5;
        System.arraycopy((long[]) this.f1902c, i5, jArr, 0, i6);
        System.arraycopy((Object[]) this.f1903d, this.f1900a, objArr, 0, i6);
        int i7 = this.f1900a;
        if (i7 > 0) {
            System.arraycopy((long[]) this.f1902c, 0, jArr, i6, i7);
            System.arraycopy((Object[]) this.f1903d, 0, objArr, i6, this.f1900a);
        }
        this.f1902c = jArr;
        this.f1903d = objArr;
        this.f1900a = 0;
    }

    public void e(Typeface typeface) {
        int i4;
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f1900a) != -1) {
            typeface = Typeface.create(typeface, i4, (this.f1901b & 2) != 0);
        }
        C0364t c0364t = (C0364t) this.f1903d;
        if (c0364t.f6765m) {
            c0364t.f6764l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f1902c).get();
            if (textView != null) {
                Field field = C.x.f330a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0363s(textView, typeface, c0364t.f6762j));
                } else {
                    textView.setTypeface(typeface, c0364t.f6762j);
                }
            }
        }
    }

    public synchronized Object f() {
        return this.f1901b == 0 ? null : h();
    }

    public synchronized Object g(long j4) {
        Object obj;
        obj = null;
        while (this.f1901b > 0 && j4 - ((long[]) this.f1902c)[this.f1900a] >= 0) {
            obj = h();
        }
        return obj;
    }

    public Object h() {
        W.a.j(this.f1901b > 0);
        Object[] objArr = (Object[]) this.f1903d;
        int i4 = this.f1900a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f1900a = (i4 + 1) % objArr.length;
        this.f1901b--;
        return obj;
    }

    public synchronized int i() {
        return this.f1901b;
    }
}
