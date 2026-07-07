package p024F;

/* renamed from: F.b */
/* loaded from: classes.dex */
public final class RunnableC0199b implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f553l;

    /* renamed from: m */
    public final java.lang.Object f554m;

    public /* synthetic */ RunnableC0199b(int i4, java.lang.Object obj) {
        this.f553l = i4;
        this.f554m = obj;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, u0.l] */
    @Override // java.lang.Runnable
    public final void run() {
        p145j.C1663i c1663i;
        ?? r8 = this.f554m;
        switch (this.f553l) {
            case 0:
                p024F.ViewOnTouchListenerC0203f viewOnTouchListenerC0203f = (p024F.ViewOnTouchListenerC0203f) r8;
                if (viewOnTouchListenerC0203f.f571o) {
                    boolean z4 = viewOnTouchListenerC0203f.f569m;
                    p024F.C0198a c0198a = viewOnTouchListenerC0203f.f557a;
                    if (z4) {
                        viewOnTouchListenerC0203f.f569m = false;
                        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                        c0198a.f548e = currentAnimationTimeMillis;
                        c0198a.f550g = -1L;
                        c0198a.f549f = currentAnimationTimeMillis;
                        c0198a.f551h = 0.5f;
                    }
                    if ((c0198a.f550g > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > c0198a.f550g + c0198a.f552i) || !viewOnTouchListenerC0203f.m569e()) {
                        viewOnTouchListenerC0203f.f571o = false;
                        return;
                    }
                    boolean z5 = viewOnTouchListenerC0203f.f570n;
                    android.widget.ListView listView = viewOnTouchListenerC0203f.f559c;
                    if (z5) {
                        viewOnTouchListenerC0203f.f570n = false;
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0198a.f549f == 0) {
                        throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                    float m560a = c0198a.m560a(currentAnimationTimeMillis2);
                    long j4 = currentAnimationTimeMillis2 - c0198a.f549f;
                    c0198a.f549f = currentAnimationTimeMillis2;
                    viewOnTouchListenerC0203f.f573q.scrollListBy((int) (((float) j4) * ((m560a * 4.0f) + ((-4.0f) * m560a * m560a)) * c0198a.f547d));
                    java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                ((p054N1.C0460o) r8).m964e();
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p050M1.InterfaceC0419c interfaceC0419c = ((p054N1.C0460o) ((p043K2.C0339o) r8).f1048m).f1334d;
                interfaceC0419c.mo892i(interfaceC0419c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                ((p054N1.BinderC0442A) r8).f1288j.m979c(new p046L1.C0357a(4));
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                throw null;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                ((android.support.v4.media.session.C1061t) r8).getClass();
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                p064Q.C0534f c0534f = (p064Q.C0534f) r8;
                c0534f.f1574g.f1626p.remove(((android.os.Messenger) c0534f.f1571d.f1048m).getBinder());
                return;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                p145j.AbstractC1625D abstractC1625D = (p145j.AbstractC1625D) r8;
                abstractC1625D.f6816x = null;
                abstractC1625D.drawableStateChanged();
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                androidx.appcompat.widget.ActionMenuView actionMenuView = ((androidx.appcompat.widget.Toolbar) r8).f4065l;
                if (actionMenuView == null || (c1663i = actionMenuView.f3942D) == null) {
                    return;
                }
                c1663i.m3605k();
                return;
            case 9:
                p152k1.C1767f c1767f = (p152k1.C1767f) r8;
                int i4 = c1767f.f7265v;
                android.animation.ValueAnimator valueAnimator = c1767f.f7264u;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                c1767f.f7265v = 3;
                valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 10:
                p152k1.AbstractC1778q abstractC1778q = ((androidx.recyclerview.widget.RecyclerView) r8).f4417O;
                if (abstractC1778q != null) {
                    p152k1.C1763b c1763b = (p152k1.C1763b) abstractC1778q;
                    java.util.ArrayList arrayList = c1763b.f7228e;
                    boolean isEmpty = arrayList.isEmpty();
                    java.util.ArrayList arrayList2 = c1763b.f7230g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    java.util.ArrayList arrayList3 = c1763b.f7231h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    java.util.ArrayList arrayList4 = c1763b.f7229f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new java.lang.ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.addAll(arrayList2);
                        java.util.ArrayList arrayList6 = c1763b.f7233j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            p009B2.AbstractC0051h.m159r(arrayList5.get(0));
                            throw null;
                        }
                        java.util.Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            p009B2.AbstractC0051h.m159r(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.addAll(arrayList3);
                        java.util.ArrayList arrayList8 = c1763b.f7234k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            p009B2.AbstractC0051h.m159r(arrayList7.get(0));
                            throw null;
                        }
                        java.util.Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            p009B2.AbstractC0051h.m159r(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.addAll(arrayList4);
                    java.util.ArrayList arrayList10 = c1763b.f7232i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        java.lang.Math.max(!isEmpty2 ? c1763b.f7289c : 0L, isEmpty3 ? 0L : c1763b.f7290d);
                        arrayList9.get(0).getClass();
                        throw new java.lang.ClassCastException();
                    }
                    java.util.Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new java.lang.ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 11:
                ((androidx.recyclerview.widget.StaggeredGridLayoutManager) r8).m2728J();
                return;
            case 12:
                p194t2.C2185a c2185a = (p194t2.C2185a) r8;
                p102a0.C0944H c0944h = c2185a.f8736K;
                if (c0944h == null) {
                    return;
                }
                if (c0944h.m1850m() != c2185a.f8748q) {
                    c2185a.m4335g();
                }
                int m1861x = c2185a.f8736K.m1861x();
                android.os.Handler handler = c2185a.f8740O;
                if (m1861x == 2) {
                    handler.postDelayed(this, 200L);
                    return;
                } else {
                    if (m1861x != 3) {
                        return;
                    }
                    if (c2185a.f8736K.m1860w()) {
                        handler.postDelayed(this, 500L);
                        return;
                    } else {
                        handler.postDelayed(this, 1000L);
                        return;
                    }
                }
            case 13:
                r8.mo3301f();
                return;
            default:
                java.lang.Object obj = ((p129f2.C1408Y) r8).f5729m;
                return;
        }
    }

    public RunnableC0199b(p054N1.AbstractDialogInterfaceOnCancelListenerC0456k abstractDialogInterfaceOnCancelListenerC0456k, p006B.C0020c c0020c) {
        this.f553l = 4;
        this.f554m = c0020c;
    }

    public RunnableC0199b(p129f2.C1408Y c1408y, int i4) {
        this.f553l = 14;
        this.f554m = c1408y;
    }
}
