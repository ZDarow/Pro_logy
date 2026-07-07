package D3;

import H2.b;
import I.C0044m;
import K2.k;
import L2.f;
import L2.n;
import L2.o;
import a3.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import k3.h;

/* loaded from: classes.dex */
public final class a implements b, o {

    /* renamed from: l, reason: collision with root package name */
    public C0044m f503l;

    @Override // L2.o
    public final void I(n nVar, k kVar) {
        h.e(nVar, "call");
        String str = nVar.f1094a;
        if (h.a(str, "encode")) {
            ByteBuffer encode = Charset.forName((String) nVar.a("charset")).encode((String) nVar.a("data"));
            byte[] bArr = new byte[encode.remaining()];
            encode.get(bArr);
            kVar.b(bArr);
            return;
        }
        if (h.a(str, "decode")) {
            kVar.b(Charset.forName((String) nVar.a("charset")).decode(ByteBuffer.wrap((byte[]) nVar.a("data"))).toString());
            return;
        }
        if (!h.a(str, "availableCharsets")) {
            if (!h.a(str, "check")) {
                kVar.c();
                return;
            }
            try {
                kVar.b(Boolean.valueOf(Charset.forName((String) nVar.a("charset")) != null));
                return;
            } catch (Exception unused) {
                kVar.b(Boolean.FALSE);
                return;
            }
        }
        Set<String> keySet = Charset.availableCharsets().keySet();
        h.d(keySet, "<get-keys>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        kVar.b(d.h0(arrayList));
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        h.e(aVar, "binding");
        C0044m c0044m = this.f503l;
        if (c0044m != null) {
            c0044m.s(null);
        } else {
            h.i("channel");
            throw null;
        }
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        h.e(aVar, "flutterPluginBinding");
        C0044m c0044m = new C0044m((f) aVar.f709m, "charset_converter");
        this.f503l = c0044m;
        c0044m.s(this);
    }
}
