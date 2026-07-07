package z;

import java.util.ArrayList;
import u3.m;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632e implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9202b;

    public /* synthetic */ C0632e(int i4, Object obj) {
        this.f9201a = i4;
        this.f9202b = obj;
    }

    @Override // B.a
    public final void accept(Object obj) {
        switch (this.f9201a) {
            case 0:
                C0633f c0633f = (C0633f) obj;
                if (c0633f == null) {
                    c0633f = new C0633f(-3);
                }
                ((m) this.f9202b).b(c0633f);
                return;
            default:
                C0633f c0633f2 = (C0633f) obj;
                synchronized (AbstractC0634g.f9207c) {
                    try {
                        n.j jVar = AbstractC0634g.f9208d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f9202b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f9202b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((B.a) arrayList.get(i4)).accept(c0633f2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
