package k1;

import B2.AbstractC0007h;
import java.util.ArrayList;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380b extends q {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f6964e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f6965f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f6966g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f6967h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f6968i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f6969j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f6970k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f6971l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f6972m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f6973n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f6974o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // k1.q
    public final void a() {
        ArrayList arrayList = this.f6966g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            AbstractC0007h.r(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f6964e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f7021a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f6965f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f6967h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            AbstractC0007h.r(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f6969j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    AbstractC0007h.r(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f6968i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f6970k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    AbstractC0007h.r(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f6973n);
            c(this.f6972m);
            c(this.f6971l);
            c(this.f6974o);
            ArrayList arrayList11 = this.f7022b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // k1.q
    public final boolean b() {
        return (this.f6965f.isEmpty() && this.f6967h.isEmpty() && this.f6966g.isEmpty() && this.f6964e.isEmpty() && this.f6972m.isEmpty() && this.f6973n.isEmpty() && this.f6971l.isEmpty() && this.f6974o.isEmpty() && this.f6969j.isEmpty() && this.f6968i.isEmpty() && this.f6970k.isEmpty()) ? false : true;
    }
}
