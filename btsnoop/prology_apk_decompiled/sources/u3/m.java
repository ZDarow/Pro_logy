package u3;

import f2.Y;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import y.ExecutorC0614a;
import z.C0633f;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: l, reason: collision with root package name */
    public final Object f8632l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f8633m;

    public /* synthetic */ m(Object obj, Object obj2) {
        this.f8632l = obj;
        this.f8633m = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(u3.e r6, b3.InterfaceC0190d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u3.l
            if (r0 == 0) goto L13
            r0 = r7
            u3.l r0 = (u3.l) r0
            int r1 = r0.f8629p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8629p = r1
            goto L18
        L13:
            u3.l r0 = new u3.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f8628o
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f8629p
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            R2.n r6 = r0.f8631r
            p1.AbstractC0462a.P(r7)     // Catch: v3.a -> L29
            goto L54
        L29:
            r7 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p1.AbstractC0462a.P(r7)
            java.lang.Object r7 = r5.f8632l
            Y.x r7 = (Y.x) r7
            R2.n r2 = new R2.n
            java.lang.Object r4 = r5.f8633m
            I.p r4 = (I.C0047p) r4
            r2.<init>(r4, r6)
            r0.f8631r = r2     // Catch: v3.a -> L4e
            r0.f8629p = r3     // Catch: v3.a -> L4e
            java.lang.Object r6 = r7.C(r2, r0)     // Catch: v3.a -> L4e
            if (r6 != r1) goto L54
            return r1
        L4e:
            r7 = move-exception
            r6 = r2
        L50:
            u3.e r0 = r7.f8712l
            if (r0 != r6) goto L57
        L54:
            Z2.g r6 = Z2.g.f3186a
            return r6
        L57:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.m.C(u3.e, b3.d):java.lang.Object");
    }

    public y0.o a(Object... objArr) {
        Constructor e4;
        synchronized (((AtomicBoolean) this.f8633m)) {
            if (!((AtomicBoolean) this.f8633m).get()) {
                try {
                    e4 = ((b0.d) this.f8632l).e();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f8633m).set(true);
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating extension", e5);
                }
            }
            e4 = null;
        }
        if (e4 == null) {
            return null;
        }
        try {
            return (y0.o) e4.newInstance(objArr);
        } catch (Exception e6) {
            throw new IllegalStateException("Unexpected error creating extractor", e6);
        }
    }

    public void b(C0633f c0633f) {
        int i4 = c0633f.f9204b;
        ExecutorC0614a executorC0614a = (ExecutorC0614a) this.f8633m;
        Y y4 = (Y) this.f8632l;
        if (i4 == 0) {
            executorC0614a.execute(new N1.q(y4, c0633f.f9203a, 10, false));
        } else {
            executorC0614a.execute(new F.b(y4, i4));
        }
    }

    public m(b0.d dVar) {
        this.f8632l = dVar;
        this.f8633m = new AtomicBoolean(false);
    }
}
