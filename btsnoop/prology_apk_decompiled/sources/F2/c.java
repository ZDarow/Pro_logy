package F2;

import L.k;
import S0.g;
import Y.x;
import android.app.NotificationManager;
import android.os.HandlerThread;
import android.widget.Toast;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import c0.J;
import c0.M;
import com.ryanheise.audioservice.AudioService;
import f2.Y;
import io.flutter.plugin.platform.o;
import java.util.ArrayList;
import k3.h;
import o0.C0457c;
import w0.C0597g;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f637l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f638m;

    public /* synthetic */ c(int i4, Object obj) {
        this.f637l = i4;
        this.f638m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f637l) {
            case 0:
                ((d) this.f638m).f640b.f647e.prefetchDefaultFontManager();
                return;
            case 1:
                Toast toast = (Toast) ((x) this.f638m).f3066n;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                r rVar = (r) this.f638m;
                h.e(rVar, "this$0");
                int i4 = rVar.f4178m;
                m mVar = rVar.f4182q;
                if (i4 == 0) {
                    rVar.f4179n = true;
                    mVar.d(androidx.lifecycle.e.ON_PAUSE);
                }
                if (rVar.f4177l == 0 && rVar.f4179n) {
                    mVar.d(androidx.lifecycle.e.ON_STOP);
                    rVar.f4180o = true;
                    return;
                }
                return;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                b0.e eVar = (b0.e) this.f638m;
                eVar.K(eVar.a(), 1028, new b0.c(22));
                eVar.f4346q.d();
                return;
            case k.LONG_FIELD_NUMBER /* 4 */:
                J j4 = (J) this.f638m;
                if (j4.f4543k0 >= 300000) {
                    ((M) j4.s.f1009m).f4569a1 = true;
                    j4.f4543k0 = 0L;
                    return;
                }
                return;
            case k.STRING_FIELD_NUMBER /* 5 */:
                ((Y) this.f638m).D();
                return;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((o) this.f638m).e(false);
                return;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                j0.f fVar = (j0.f) this.f638m;
                synchronized (fVar.f6810a) {
                    try {
                        if (fVar.f6822m) {
                            return;
                        }
                        long j5 = fVar.f6821l - 1;
                        fVar.f6821l = j5;
                        if (j5 > 0) {
                            return;
                        }
                        if (j5 >= 0) {
                            fVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (fVar.f6810a) {
                            fVar.f6823n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case k.BYTES_FIELD_NUMBER /* 8 */:
                ((HandlerThread) this.f638m).quit();
                return;
            case 9:
                ((C0457c) this.f638m).w();
                return;
            case 10:
                AudioService audioService = AudioService.J;
                AudioService audioService2 = (AudioService) this.f638m;
                if (audioService2.f4791F) {
                    ((NotificationManager) audioService2.getSystemService("notification")).notify(1124, audioService2.g());
                    return;
                }
                return;
            case 11:
                ((g) this.f638m).getClass();
                return;
            case 12:
                break;
            default:
                C0597g c0597g = (C0597g) this.f638m;
                int i5 = c0597g.f8779k - 1;
                c0597g.f8779k = i5;
                if (i5 > 0) {
                    return;
                }
                if (i5 < 0) {
                    throw new IllegalStateException(String.valueOf(c0597g.f8779k));
                }
                c0597g.f8771c.a();
                return;
        }
        while (true) {
            v2.f fVar2 = (v2.f) this.f638m;
            ArrayList arrayList = fVar2.f8670f;
            if (arrayList.isEmpty() || fVar2.f8676l != null) {
                return;
            }
            ((w2.d) arrayList.get(0)).f8907a.run();
            arrayList.remove(0);
        }
    }
}
