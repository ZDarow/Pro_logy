package p064Q;

/* renamed from: Q.h */
/* loaded from: classes.dex */
public final class RunnableC0536h implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f1577l;

    /* renamed from: m */
    public java.lang.Object f1578m;

    /* renamed from: n */
    public java.lang.Object f1579n;

    /* renamed from: o */
    public java.lang.Object f1580o;

    public /* synthetic */ RunnableC0536h() {
        this.f1577l = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        int i4;
        int i5;
        switch (this.f1577l) {
            case 0:
                p064Q.C0539k c0539k = (p064Q.C0539k) this.f1580o;
                java.util.Iterator it = ((p165n.C1875b) ((p064Q.AbstractServiceC0548t) c0539k.f1584d).f1626p.keySet()).iterator();
                while (true) {
                    p165n.C1874a c1874a = (p165n.C1874a) it;
                    if (!c1874a.hasNext()) {
                        return;
                    }
                    android.os.IBinder iBinder = (android.os.IBinder) c1874a.next();
                    p064Q.AbstractServiceC0548t abstractServiceC0548t = (p064Q.AbstractServiceC0548t) c0539k.f1584d;
                    p064Q.C0534f c0534f = (p064Q.C0534f) abstractServiceC0548t.f1626p.get(iBinder);
                    java.util.HashMap hashMap = c0534f.f1572e;
                    java.lang.String str = (java.lang.String) this.f1578m;
                    java.util.List<p006B.C0019b> list = (java.util.List) hashMap.get(str);
                    if (list != null) {
                        for (p006B.C0019b c0019b : list) {
                            android.os.Bundle bundle = (android.os.Bundle) c0019b.f86b;
                            android.os.Bundle bundle2 = (android.os.Bundle) this.f1579n;
                            int i6 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
                            int i7 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                            int i8 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i9 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i10 = Integer.MAX_VALUE;
                            int i11 = 0;
                            if (i6 == -1 || i8 == -1) {
                                i4 = Integer.MAX_VALUE;
                                i5 = 0;
                            } else {
                                i5 = i6 * i8;
                                i4 = (i8 + i5) - 1;
                            }
                            if (i7 != -1 && i9 != -1) {
                                i11 = i9 * i7;
                                i10 = (i9 + i11) - 1;
                            }
                            if (i4 >= i11 && i10 >= i5) {
                                abstractServiceC0548t.m1060e(str, c0534f, (android.os.Bundle) c0019b.f86b, bundle2);
                            }
                        }
                    }
                }
                break;
            case 1:
                synchronized (p204v2.C2283m.f9054q) {
                    p204v2.C2283m.m4479a((p204v2.C2283m) this.f1580o, (p204v2.C2276f) this.f1578m);
                }
                ((p043K2.C0335k) this.f1579n).mo742b(null);
                return;
            default:
                try {
                    obj = ((p219z.CallableC2433d) this.f1578m).call();
                } catch (java.lang.Exception unused) {
                    obj = null;
                }
                ((android.os.Handler) this.f1580o).post(new p054N1.RunnableC0462q((p219z.C2434e) this.f1579n, obj, 11, false));
                return;
        }
    }

    public /* synthetic */ RunnableC0536h(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i4) {
        this.f1577l = i4;
        this.f1580o = obj;
        this.f1578m = obj2;
        this.f1579n = obj3;
    }
}
