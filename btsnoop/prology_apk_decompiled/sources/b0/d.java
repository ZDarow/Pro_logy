package b0;

import T.I;
import T.V;
import W.w;
import android.graphics.Bitmap;
import e1.C0255A;
import e1.C0257a;
import e1.C0259c;
import e1.C0260d;
import e1.C0262f;
import e1.E;
import f1.C0270d;
import f2.G;
import f2.c0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import q0.InterfaceC0467D;
import q0.X;
import q0.k0;
import r0.C0506h;
import t0.C0569k;
import y0.o;
import y0.r;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements W.h, e2.e, r, W.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4340l;

    public /* synthetic */ d(int i4) {
        this.f4340l = i4;
    }

    public static Bitmap d(byte[] bArr, int i4) {
        try {
            return U1.a.i(bArr, i4);
        } catch (I e4) {
            throw new Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i4 + ")", e4);
        } catch (IOException e5) {
            throw new Exception(e5);
        }
    }

    @Override // W.c
    public void accept(Object obj) {
        ((X) obj).f7776b.getClass();
    }

    @Override // e2.e
    public Object apply(Object obj) {
        switch (this.f4340l) {
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return f2.I.o(Integer.valueOf(((C0506h) obj).f8041l));
            case 12:
                g0.r rVar = (g0.r) obj;
                rVar.a();
                k0 k0Var = rVar.f5766T;
                return f2.I.j(f2.r.w(k0Var.f7878b, new d(19)));
            case 15:
                return f2.I.o(Integer.valueOf(((C0506h) obj).f8041l));
            case 16:
                return ((o) obj).d().getClass().getSimpleName();
            case 17:
                k0 e4 = ((InterfaceC0467D) obj).e();
                return f2.I.j(f2.r.w(e4.f7878b, new d(19)));
            case 19:
                return Integer.valueOf(((V) obj).f2171c);
            case 20:
                return Long.valueOf(((V0.a) obj).f2597b);
            default:
                return Long.valueOf(((V0.a) obj).f2598c);
        }
    }

    @Override // W.h
    public void b(Object obj) {
        j jVar = (j) obj;
        switch (this.f4340l) {
            case 0:
                jVar.getClass();
                return;
            case 1:
                jVar.getClass();
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                jVar.getClass();
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                jVar.getClass();
                return;
            default:
                jVar.getClass();
                return;
        }
    }

    @Override // y0.r
    public o[] c() {
        switch (this.f4340l) {
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new o[]{new C0257a()};
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new o[]{new C0259c()};
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return new o[]{new C0260d(0)};
            case 9:
                return new o[]{new C0255A()};
            case 10:
                F1.g gVar = V0.j.f2619c;
                w wVar = new w(0L);
                G g4 = f2.I.f5510m;
                return new o[]{new E(1, 1, gVar, wVar, new C0262f(0, c0.f5550p))};
            default:
                return new o[]{new C0270d()};
        }
    }

    public Constructor e() {
        switch (this.f4340l) {
            case 22:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(o.class).getConstructor(null);
        }
    }

    public /* synthetic */ d(C0177a c0177a, C0569k c0569k) {
        this.f4340l = 0;
    }
}
