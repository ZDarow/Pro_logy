package F;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import j.D;

/* loaded from: classes.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f546r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f547a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f548b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f549c;

    /* renamed from: d, reason: collision with root package name */
    public b f550d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f551e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f552f;

    /* renamed from: g, reason: collision with root package name */
    public final int f553g;

    /* renamed from: h, reason: collision with root package name */
    public final int f554h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f555i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f556j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f557k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f558l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f559m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f560n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f561o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f562p;

    /* renamed from: q, reason: collision with root package name */
    public final D f563q;

    /* JADX WARN: Type inference failed for: r1v0, types: [F.a, java.lang.Object] */
    public f(D d4) {
        ?? obj = new Object();
        obj.f538e = Long.MIN_VALUE;
        obj.f540g = -1L;
        obj.f539f = 0L;
        this.f547a = obj;
        this.f548b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f551e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f552f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f555i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f556j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f557k = fArr5;
        this.f549c = d4;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f4) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f4 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f553g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f554h = f546r;
        obj.f534a = 500;
        obj.f535b = 500;
        this.f563q = d4;
    }

    public static float b(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f551e
            r0 = r0[r4]
            float[] r1 = r3.f552f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f548b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f555i
            r0 = r0[r4]
            float[] r1 = r3.f556j
            r1 = r1[r4]
            float[] r2 = r3.f557k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.a(int, float, float, float):float");
    }

    public final float c(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f553g;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f5);
                }
                if (this.f561o && i4 == 1) {
                    return 1.0f;
                }
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
        return 0.0f;
    }

    public final void d() {
        int i4 = 0;
        if (this.f559m) {
            this.f561o = false;
            return;
        }
        a aVar = this.f547a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (currentAnimationTimeMillis - aVar.f538e);
        int i6 = aVar.f535b;
        if (i5 > i6) {
            i4 = i6;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        aVar.f542i = i4;
        aVar.f541h = aVar.a(currentAnimationTimeMillis);
        aVar.f540g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        D d4;
        int count;
        a aVar = this.f547a;
        float f4 = aVar.f537d;
        int abs = (int) (f4 / Math.abs(f4));
        Math.abs(aVar.f536c);
        if (abs == 0 || (count = (d4 = this.f563q).getCount()) == 0) {
            return false;
        }
        int childCount = d4.getChildCount();
        int firstVisiblePosition = d4.getFirstVisiblePosition();
        int i4 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i4 >= count && d4.getChildAt(childCount - 1).getBottom() <= d4.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && d4.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f562p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f560n = r2
            r7.f558l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f549c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            F.a r9 = r7.f547a
            r9.f536c = r0
            r9.f537d = r8
            boolean r8 = r7.f561o
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            F.b r8 = r7.f550d
            if (r8 != 0) goto L5f
            F.b r8 = new F.b
            r8.<init>(r1, r7)
            r7.f550d = r8
        L5f:
            r7.f561o = r2
            r7.f559m = r2
            boolean r8 = r7.f558l
            if (r8 != 0) goto L74
            int r8 = r7.f554h
            if (r8 <= 0) goto L74
            F.b r9 = r7.f550d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = C.x.f330a
            r4.postOnAnimationDelayed(r9, r5)
            goto L79
        L74:
            F.b r8 = r7.f550d
            r8.run()
        L79:
            r7.f558l = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
