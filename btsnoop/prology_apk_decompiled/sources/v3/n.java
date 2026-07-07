package v3;

import B2.AbstractC0007h;
import b3.C0196j;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1.AbstractC0462a;
import r3.C0532t;
import r3.P;
import r3.Z;

/* loaded from: classes.dex */
public final class n extends d3.b implements u3.e {

    /* renamed from: o, reason: collision with root package name */
    public final u3.e f8734o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0195i f8735p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8736q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0195i f8737r;
    public InterfaceC0190d s;

    public n(u3.e eVar, InterfaceC0195i interfaceC0195i) {
        super(k.f8731l, C0196j.f4462l);
        this.f8734o = eVar;
        this.f8735p = interfaceC0195i;
        this.f8736q = ((Number) interfaceC0195i.k(0, m.f8733m)).intValue();
    }

    @Override // u3.e
    public final Object a(Object obj, InterfaceC0190d interfaceC0190d) {
        try {
            Object p2 = p(interfaceC0190d, obj);
            return p2 == EnumC0225a.f4710l ? p2 : Z2.g.f3186a;
        } catch (Throwable th) {
            this.f8737r = new i(interfaceC0190d.f(), th);
            throw th;
        }
    }

    @Override // d3.b, d3.c
    public final d3.c d() {
        InterfaceC0190d interfaceC0190d = this.s;
        if (interfaceC0190d instanceof d3.c) {
            return (d3.c) interfaceC0190d;
        }
        return null;
    }

    @Override // d3.b, b3.InterfaceC0190d
    public final InterfaceC0195i f() {
        InterfaceC0195i interfaceC0195i = this.f8737r;
        return interfaceC0195i == null ? C0196j.f4462l : interfaceC0195i;
    }

    @Override // d3.b
    public final StackTraceElement j() {
        return null;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        Throwable a4 = Z2.d.a(obj);
        if (a4 != null) {
            this.f8737r = new i(f(), a4);
        }
        InterfaceC0190d interfaceC0190d = this.s;
        if (interfaceC0190d != null) {
            interfaceC0190d.i(obj);
        }
        return EnumC0225a.f4710l;
    }

    public final Object p(InterfaceC0190d interfaceC0190d, Object obj) {
        List list;
        Comparable comparable;
        String str;
        InterfaceC0195i f4 = interfaceC0190d.f();
        P p2 = (P) f4.j(C0532t.f8178m);
        if (p2 != null && !p2.a()) {
            throw ((Z) p2).A();
        }
        InterfaceC0195i interfaceC0195i = this.f8737r;
        if (interfaceC0195i != f4) {
            int i4 = 0;
            if (interfaceC0195i instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) interfaceC0195i).f8729l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                k3.h.e(str2, "<this>");
                q3.b bVar = new q3.b(str2);
                if (bVar.hasNext()) {
                    Object next = bVar.next();
                    if (bVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (bVar.hasNext()) {
                            arrayList.add(bVar.next());
                        }
                        list = arrayList;
                    } else {
                        list = AbstractC0462a.E(next);
                    }
                } else {
                    list = a3.l.f3631l;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!q3.i.l0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            i5 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i5);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 == -1) {
                        i5 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i5));
                }
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int size = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj3;
                    if ((i4 == 0 || i4 == size) && q3.i.l0(str4)) {
                        str = null;
                    } else {
                        k3.h.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(AbstractC0007h.j(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        k3.h.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i4 = i6;
                }
                StringBuilder sb = new StringBuilder(length2);
                a3.d.e0(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) f4.k(0, new q(this))).intValue() != this.f8736q) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8735p + ",\n\t\tbut emission happened in " + f4 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f8737r = f4;
        }
        this.s = interfaceC0190d;
        o oVar = p.f8739a;
        u3.e eVar = this.f8734o;
        k3.h.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object a4 = eVar.a(obj, this);
        if (!k3.h.a(a4, EnumC0225a.f4710l)) {
            this.s = null;
        }
        return a4;
    }
}
