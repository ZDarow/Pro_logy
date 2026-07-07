package U;

import f2.c0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f2461a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2462b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f2463c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f2464d;

    public a(c0 c0Var) {
        this.f2461a = c0Var;
        b bVar = b.f2465e;
        this.f2464d = false;
    }

    public final b a(b bVar) {
        if (bVar.equals(b.f2465e)) {
            throw new c(bVar);
        }
        int i4 = 0;
        while (true) {
            c0 c0Var = this.f2461a;
            if (i4 >= c0Var.size()) {
                return bVar;
            }
            d dVar = (d) c0Var.get(i4);
            b g4 = dVar.g(bVar);
            if (dVar.a()) {
                W.a.j(!g4.equals(b.f2465e));
                bVar = g4;
            }
            i4++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f2462b;
        arrayList.clear();
        this.f2464d = false;
        int i4 = 0;
        while (true) {
            c0 c0Var = this.f2461a;
            if (i4 >= c0Var.size()) {
                break;
            }
            d dVar = (d) c0Var.get(i4);
            dVar.flush();
            if (dVar.a()) {
                arrayList.add(dVar);
            }
            i4++;
        }
        this.f2463c = new ByteBuffer[arrayList.size()];
        for (int i5 = 0; i5 <= c(); i5++) {
            this.f2463c[i5] = ((d) arrayList.get(i5)).c();
        }
    }

    public final int c() {
        return this.f2463c.length - 1;
    }

    public final boolean d() {
        return this.f2464d && ((d) this.f2462b.get(c())).e() && !this.f2463c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f2462b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        c0 c0Var = this.f2461a;
        if (c0Var.size() != aVar.f2461a.size()) {
            return false;
        }
        for (int i4 = 0; i4 < c0Var.size(); i4++) {
            if (c0Var.get(i4) != aVar.f2461a.get(i4)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z4;
        for (boolean z5 = true; z5; z5 = z4) {
            z4 = false;
            int i4 = 0;
            while (i4 <= c()) {
                if (!this.f2463c[i4].hasRemaining()) {
                    ArrayList arrayList = this.f2462b;
                    d dVar = (d) arrayList.get(i4);
                    if (!dVar.e()) {
                        ByteBuffer byteBuffer2 = i4 > 0 ? this.f2463c[i4 - 1] : byteBuffer.hasRemaining() ? byteBuffer : d.f2470a;
                        long remaining = byteBuffer2.remaining();
                        dVar.f(byteBuffer2);
                        this.f2463c[i4] = dVar.c();
                        z4 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f2463c[i4].hasRemaining();
                    } else if (!this.f2463c[i4].hasRemaining() && i4 < c()) {
                        ((d) arrayList.get(i4 + 1)).d();
                    }
                }
                i4++;
            }
        }
    }

    public final int hashCode() {
        return this.f2461a.hashCode();
    }
}
