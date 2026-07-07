package m0;

import a.AbstractC0110a;
import android.os.Handler;
import f2.I;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w implements u0.k {

    /* renamed from: l, reason: collision with root package name */
    public final DataInputStream f7306l;

    /* renamed from: m, reason: collision with root package name */
    public final i0.g f7307m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f7308n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y f7309o;

    /* JADX WARN: Type inference failed for: r1v2, types: [i0.g, java.lang.Object] */
    public w(y yVar, InputStream inputStream) {
        this.f7309o = yVar;
        this.f7306l = new DataInputStream(inputStream);
        ?? obj = new Object();
        obj.f6149c = new ArrayList();
        obj.f6147a = 1;
        this.f7307m = obj;
    }

    @Override // u0.k
    public final void b() {
        String str;
        while (!this.f7308n) {
            byte readByte = this.f7306l.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f7306l.readUnsignedByte();
                int readUnsignedShort = this.f7306l.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f7306l.readFully(bArr, 0, readUnsignedShort);
                C0418G c0418g = (C0418G) this.f7309o.f7317n.get(Integer.valueOf(readUnsignedByte));
                if (c0418g != null && !this.f7309o.f7320q) {
                    c0418g.f7171p.add(bArr);
                }
            } else if (this.f7309o.f7320q) {
                continue;
            } else {
                Y.x xVar = this.f7309o.f7315l;
                i0.g gVar = this.f7307m;
                DataInputStream dataInputStream = this.f7306l;
                gVar.getClass();
                I a4 = gVar.a(i0.g.b(readByte, dataInputStream));
                while (a4 == null) {
                    if (gVar.f6147a == 3) {
                        long j4 = gVar.f6148b;
                        if (j4 <= 0) {
                            throw new IllegalStateException("Expects a greater than zero Content-Length.");
                        }
                        int l4 = AbstractC0110a.l(j4);
                        W.a.j(l4 != -1);
                        byte[] bArr2 = new byte[l4];
                        dataInputStream.readFully(bArr2, 0, l4);
                        W.a.j(gVar.f6147a == 3);
                        if (l4 > 0) {
                            int i4 = l4 - 1;
                            if (bArr2[i4] == 10) {
                                if (l4 > 1) {
                                    int i5 = l4 - 2;
                                    if (bArr2[i5] == 13) {
                                        str = new String(bArr2, 0, i5, y.f7314r);
                                        ArrayList arrayList = (ArrayList) gVar.f6149c;
                                        arrayList.add(str);
                                        a4 = I.j(arrayList);
                                        ((ArrayList) gVar.f6149c).clear();
                                        gVar.f6147a = 1;
                                        gVar.f6148b = 0L;
                                    }
                                }
                                str = new String(bArr2, 0, i4, y.f7314r);
                                ArrayList arrayList2 = (ArrayList) gVar.f6149c;
                                arrayList2.add(str);
                                a4 = I.j(arrayList2);
                                ((ArrayList) gVar.f6149c).clear();
                                gVar.f6147a = 1;
                                gVar.f6148b = 0L;
                            }
                        }
                        throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                    }
                    a4 = gVar.a(i0.g.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) xVar.f3065m).post(new W.m(9, xVar, a4));
            }
        }
    }

    @Override // u0.k
    public final void c() {
        this.f7308n = true;
    }
}
