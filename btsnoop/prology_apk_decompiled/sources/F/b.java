package F;

import B2.AbstractC0007h;
import C.x;
import N1.A;
import N1.o;
import a0.C0118H;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Messenger;
import android.os.SystemClock;
import android.support.v4.media.session.t;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import f2.Y;
import j.C0354i;
import j.D;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k1.C0380b;
import k1.C0384f;
import k1.q;
import t2.C0570a;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f543l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f544m;

    public /* synthetic */ b(int i4, Object obj) {
        this.f543l = i4;
        this.f544m = obj;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, u0.l] */
    @Override // java.lang.Runnable
    public final void run() {
        C0354i c0354i;
        ?? r8 = this.f544m;
        switch (this.f543l) {
            case 0:
                f fVar = (f) r8;
                if (fVar.f561o) {
                    boolean z4 = fVar.f559m;
                    a aVar = fVar.f547a;
                    if (z4) {
                        fVar.f559m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f538e = currentAnimationTimeMillis;
                        aVar.f540g = -1L;
                        aVar.f539f = currentAnimationTimeMillis;
                        aVar.f541h = 0.5f;
                    }
                    if ((aVar.f540g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f540g + aVar.f542i) || !fVar.e()) {
                        fVar.f561o = false;
                        return;
                    }
                    boolean z5 = fVar.f560n;
                    ListView listView = fVar.f549c;
                    if (z5) {
                        fVar.f560n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f539f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a4 = aVar.a(currentAnimationTimeMillis2);
                    long j4 = currentAnimationTimeMillis2 - aVar.f539f;
                    aVar.f539f = currentAnimationTimeMillis2;
                    fVar.f563q.scrollListBy((int) (((float) j4) * ((a4 * 4.0f) + ((-4.0f) * a4 * a4)) * aVar.f537d));
                    Field field = x.f330a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                ((o) r8).e();
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                M1.c cVar = ((o) ((K2.o) r8).f1009m).f1290d;
                cVar.i(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((A) r8).f1246j.c(new L1.a(4));
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                throw null;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                ((t) r8).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                Q.f fVar2 = (Q.f) r8;
                fVar2.f1523g.f1574p.remove(((Messenger) fVar2.f1520d.f1009m).getBinder());
                return;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                D d4 = (D) r8;
                d4.f6567x = null;
                d4.drawableStateChanged();
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                ActionMenuView actionMenuView = ((Toolbar) r8).f3923l;
                if (actionMenuView == null || (c0354i = actionMenuView.f3805D) == null) {
                    return;
                }
                c0354i.k();
                return;
            case 9:
                C0384f c0384f = (C0384f) r8;
                int i4 = c0384f.f7000v;
                ValueAnimator valueAnimator = c0384f.f6999u;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                c0384f.f7000v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 10:
                q qVar = ((RecyclerView) r8).f4264O;
                if (qVar != null) {
                    C0380b c0380b = (C0380b) qVar;
                    ArrayList arrayList = c0380b.f6964e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0380b.f6966g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0380b.f6967h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0380b.f6965f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0380b.f6969j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            AbstractC0007h.r(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            AbstractC0007h.r(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0380b.f6970k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            AbstractC0007h.r(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            AbstractC0007h.r(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0380b.f6968i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0380b.f7023c : 0L, isEmpty3 ? 0L : c0380b.f7024d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 11:
                ((StaggeredGridLayoutManager) r8).J();
                return;
            case 12:
                C0570a c0570a = (C0570a) r8;
                C0118H c0118h = c0570a.f8403K;
                if (c0118h == null) {
                    return;
                }
                if (c0118h.m() != c0570a.f8415q) {
                    c0570a.g();
                }
                int x3 = c0570a.f8403K.x();
                Handler handler = c0570a.f8407O;
                if (x3 == 2) {
                    handler.postDelayed(this, 200L);
                    return;
                } else {
                    if (x3 != 3) {
                        return;
                    }
                    if (c0570a.f8403K.w()) {
                        handler.postDelayed(this, 500L);
                        return;
                    } else {
                        handler.postDelayed(this, 1000L);
                        return;
                    }
                }
            case 13:
                r8.f();
                return;
            default:
                Object obj = ((Y) r8).f5535m;
                return;
        }
    }

    public b(N1.k kVar, B.c cVar) {
        this.f543l = 4;
        this.f544m = cVar;
    }

    public b(Y y4, int i4) {
        this.f543l = 14;
        this.f544m = y4;
    }
}
