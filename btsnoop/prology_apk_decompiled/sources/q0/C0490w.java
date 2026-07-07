package q0;

import android.net.Uri;
import java.util.Map;

/* renamed from: q0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490w implements Y.h {

    /* renamed from: l, reason: collision with root package name */
    public final Y.h f7924l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7925m;

    /* renamed from: n, reason: collision with root package name */
    public final P f7926n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f7927o;

    /* renamed from: p, reason: collision with root package name */
    public int f7928p;

    public C0490w(Y.h hVar, int i4, P p2) {
        W.a.e(i4 > 0);
        this.f7924l = hVar;
        this.f7925m = i4;
        this.f7926n = p2;
        this.f7927o = new byte[1];
        this.f7928p = i4;
    }

    @Override // Y.h
    public final long b(Y.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // Y.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // Y.h
    public final void j(Y.C c4) {
        c4.getClass();
        this.f7924l.j(c4);
    }

    @Override // Y.h
    public final Uri o() {
        return this.f7924l.o();
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = this.f7928p;
        Y.h hVar = this.f7924l;
        if (i6 == 0) {
            byte[] bArr2 = this.f7927o;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i7 = (bArr2[0] & 255) << 4;
                if (i7 != 0) {
                    byte[] bArr3 = new byte[i7];
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 > 0) {
                        int read = hVar.read(bArr3, i9, i8);
                        if (read != -1) {
                            i9 += read;
                            i8 -= read;
                        }
                    }
                    while (i7 > 0 && bArr3[i7 - 1] == 0) {
                        i7--;
                    }
                    if (i7 > 0) {
                        W.r rVar = new W.r(bArr3, i7);
                        P p2 = this.f7926n;
                        long max = !p2.f7710x ? p2.f7708u : Math.max(p2.f7711y.o(true), p2.f7708u);
                        int a4 = rVar.a();
                        y0.F f4 = p2.w;
                        f4.getClass();
                        f4.a(rVar, a4, 0);
                        f4.b(max, 1, a4, 0, null);
                        p2.f7710x = true;
                    }
                }
                this.f7928p = this.f7925m;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i4, Math.min(this.f7928p, i5));
        if (read2 != -1) {
            this.f7928p -= read2;
        }
        return read2;
    }

    @Override // Y.h
    public final Map y() {
        return this.f7924l.y();
    }
}
