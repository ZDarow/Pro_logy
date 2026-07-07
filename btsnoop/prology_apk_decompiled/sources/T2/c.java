package T2;

import L1.g;
import T.B;
import T.C0098t;
import T.C0099u;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import T.C0104z;
import T.E;
import android.content.Context;
import android.net.Uri;
import f2.c0;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import m0.u;
import q0.AbstractC0469a;
import q0.C0487t;
import q0.InterfaceC0468E;

/* loaded from: classes.dex */
public final class c extends E0.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2431b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i4) {
        super(str);
        this.f2431b = i4;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T.u, T.v] */
    @Override // E0.e
    public final B g() {
        switch (this.f2431b) {
            case 0:
                C0098t c0098t = new C0098t();
                new F1.g();
                List emptyList = Collections.emptyList();
                c0 c0Var = c0.f5550p;
                C0101w c0101w = new C0101w();
                C0104z c0104z = C0104z.f2370a;
                String str = (String) this.f527a;
                Uri parse = str == null ? null : Uri.parse(str);
                return new B("", new C0099u(c0098t), parse != null ? new C0103y(parse, null, null, emptyList, c0Var, null, -9223372036854775807L) : null, new C0102x(c0101w), E.f2095y, c0104z);
            default:
                C0098t c0098t2 = new C0098t();
                new F1.g();
                List emptyList2 = Collections.emptyList();
                c0 c0Var2 = c0.f5550p;
                C0101w c0101w2 = new C0101w();
                C0104z c0104z2 = C0104z.f2370a;
                String str2 = (String) this.f527a;
                Uri parse2 = str2 == null ? null : Uri.parse(str2);
                return new B("", new C0099u(c0098t2), parse2 != null ? new C0103y(parse2, null, null, emptyList2, c0Var2, null, -9223372036854775807L) : null, new C0102x(c0101w2), E.f2095y, c0104z2);
        }
    }

    @Override // E0.e
    public final InterfaceC0468E h(Context context) {
        switch (this.f2431b) {
            case 0:
                return new C0487t(context);
            default:
                return new InterfaceC0468E() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* renamed from: a, reason: collision with root package name */
                    public final SocketFactory f4218a = SocketFactory.getDefault();

                    @Override // q0.InterfaceC0468E
                    public final AbstractC0469a c(B b4) {
                        b4.f2067b.getClass();
                        return new u(b4, new g(27, false), this.f4218a);
                    }
                };
        }
    }
}
