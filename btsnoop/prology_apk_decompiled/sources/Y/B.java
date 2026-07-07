package Y;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class B implements h {

    /* renamed from: l, reason: collision with root package name */
    public final h f2988l;

    /* renamed from: m, reason: collision with root package name */
    public long f2989m;

    /* renamed from: n, reason: collision with root package name */
    public Uri f2990n;

    public B(h hVar) {
        hVar.getClass();
        this.f2988l = hVar;
        this.f2990n = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // Y.h
    public final long b(l lVar) {
        this.f2990n = lVar.f3029a;
        Collections.emptyMap();
        h hVar = this.f2988l;
        long b4 = hVar.b(lVar);
        Uri o2 = hVar.o();
        o2.getClass();
        this.f2990n = o2;
        hVar.y();
        return b4;
    }

    @Override // Y.h
    public final void close() {
        this.f2988l.close();
    }

    @Override // Y.h
    public final void j(C c4) {
        c4.getClass();
        this.f2988l.j(c4);
    }

    @Override // Y.h
    public final Uri o() {
        return this.f2988l.o();
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.f2988l.read(bArr, i4, i5);
        if (read != -1) {
            this.f2989m += read;
        }
        return read;
    }

    @Override // Y.h
    public final Map y() {
        return this.f2988l.y();
    }
}
