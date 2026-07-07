package p024F;

/* renamed from: F.f */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0203f implements android.view.View.OnTouchListener {

    /* renamed from: r */
    public static final int f556r = android.view.ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final p024F.C0198a f557a;

    /* renamed from: b */
    public final android.view.animation.AccelerateInterpolator f558b;

    /* renamed from: c */
    public final android.widget.ListView f559c;

    /* renamed from: d */
    public p024F.RunnableC0199b f560d;

    /* renamed from: e */
    public final float[] f561e;

    /* renamed from: f */
    public final float[] f562f;

    /* renamed from: g */
    public final int f563g;

    /* renamed from: h */
    public final int f564h;

    /* renamed from: i */
    public final float[] f565i;

    /* renamed from: j */
    public final float[] f566j;

    /* renamed from: k */
    public final float[] f567k;

    /* renamed from: l */
    public boolean f568l;

    /* renamed from: m */
    public boolean f569m;

    /* renamed from: n */
    public boolean f570n;

    /* renamed from: o */
    public boolean f571o;

    /* renamed from: p */
    public boolean f572p;

    /* renamed from: q */
    public final p145j.AbstractC1625D f573q;

    /* JADX WARN: Type inference failed for: r1v0, types: [F.a, java.lang.Object] */
    public ViewOnTouchListenerC0203f(p145j.AbstractC1625D abstractC1625D) {
        ?? obj = new java.lang.Object();
        obj.f548e = Long.MIN_VALUE;
        obj.f550g = -1L;
        obj.f549f = 0L;
        this.f557a = obj;
        this.f558b = new android.view.animation.AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f561e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f562f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f565i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f566j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f567k = fArr5;
        this.f559c = abstractC1625D;
        float f4 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f4) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f4 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f563g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f564h = f556r;
        obj.f544a = 500;
        obj.f545b = 500;
        this.f573q = abstractC1625D;
    }

    /* renamed from: b */
    public static float m565b(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m566a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f561e
            r0 = r0[r4]
            float[] r1 = r3.f562f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m565b(r0, r2, r1)
            float r1 = r3.m567c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m567c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f558b
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
            float r5 = m565b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f565i
            r0 = r0[r4]
            float[] r1 = r3.f566j
            r1 = r1[r4]
            float[] r2 = r3.f567k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = m565b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m565b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p024F.ViewOnTouchListenerC0203f.m566a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float m567c(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f563g;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f5);
                }
                if (this.f571o && i4 == 1) {
                    return 1.0f;
                }
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m568d() {
        int i4 = 0;
        if (this.f569m) {
            this.f571o = false;
            return;
        }
        p024F.C0198a c0198a = this.f557a;
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (currentAnimationTimeMillis - c0198a.f548e);
        int i6 = c0198a.f545b;
        if (i5 > i6) {
            i4 = i6;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        c0198a.f552i = i4;
        c0198a.f551h = c0198a.m560a(currentAnimationTimeMillis);
        c0198a.f550g = currentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m569e() {
        p145j.AbstractC1625D abstractC1625D;
        int count;
        p024F.C0198a c0198a = this.f557a;
        float f4 = c0198a.f547d;
        int abs = (int) (f4 / java.lang.Math.abs(f4));
        java.lang.Math.abs(c0198a.f546c);
        if (abs == 0 || (count = (abstractC1625D = this.f573q).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC1625D.getChildCount();
        int firstVisiblePosition = abstractC1625D.getFirstVisiblePosition();
        int i4 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i4 >= count && abstractC1625D.getChildAt(childCount - 1).getBottom() <= abstractC1625D.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && abstractC1625D.getChildAt(0).getTop() >= 0) {
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
            boolean r0 = r7.f572p
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
            r7.m568d()
            goto L7b
        L1a:
            r7.f570n = r2
            r7.f568l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f559c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m566a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m566a(r2, r9, r8, r3)
            F.a r9 = r7.f557a
            r9.f546c = r0
            r9.f547d = r8
            boolean r8 = r7.f571o
            if (r8 != 0) goto L7b
            boolean r8 = r7.m569e()
            if (r8 == 0) goto L7b
            F.b r8 = r7.f560d
            if (r8 != 0) goto L5f
            F.b r8 = new F.b
            r8.<init>(r1, r7)
            r7.f560d = r8
        L5f:
            r7.f571o = r2
            r7.f569m = r2
            boolean r8 = r7.f568l
            if (r8 != 0) goto L74
            int r8 = r7.f564h
            if (r8 <= 0) goto L74
            F.b r9 = r7.f560d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = p011C.AbstractC0132x.f336a
            r4.postOnAnimationDelayed(r9, r5)
            goto L79
        L74:
            F.b r8 = r7.f560d
            r8.run()
        L79:
            r7.f568l = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p024F.ViewOnTouchListenerC0203f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
