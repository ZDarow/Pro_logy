package a0;

import T.C0084e;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f3406a;

    /* renamed from: b, reason: collision with root package name */
    public final C0123c f3407b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceHolderCallbackC0115E f3408c;

    /* renamed from: d, reason: collision with root package name */
    public C0084e f3409d;

    /* renamed from: e, reason: collision with root package name */
    public int f3410e;

    /* renamed from: f, reason: collision with root package name */
    public int f3411f;

    /* renamed from: g, reason: collision with root package name */
    public float f3412g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f3413h;

    public C0124d(Context context, Handler handler, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f3406a = audioManager;
        this.f3408c = surfaceHolderCallbackC0115E;
        this.f3407b = new C0123c(this, handler);
        this.f3410e = 0;
    }

    public final void a() {
        int i4 = this.f3410e;
        if (i4 == 1 || i4 == 0) {
            return;
        }
        int i5 = W.y.f2709a;
        AudioManager audioManager = this.f3406a;
        if (i5 < 26) {
            audioManager.abandonAudioFocus(this.f3407b);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f3413h;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r7.f2236a == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(T.C0084e r7) {
        /*
            r6 = this;
            T.e r0 = r6.f3409d
            boolean r0 = W.y.a(r0, r7)
            if (r0 != 0) goto L3b
            r6.f3409d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L10
        Le:
            r2 = r0
            goto L2f
        L10:
            r2 = 3
            r3 = 2
            java.lang.String r4 = "AudioFocusManager"
            int r5 = r7.f2238c
            switch(r5) {
                case 0: goto L29;
                case 1: goto L27;
                case 2: goto L25;
                case 3: goto Le;
                case 4: goto L25;
                case 5: goto L2f;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L21;
                case 12: goto L2f;
                case 13: goto L2f;
                case 14: goto L27;
                case 15: goto L19;
                case 16: goto L1f;
                default: goto L19;
            }
        L19:
            java.lang.String r7 = "Unidentified audio usage: "
            B2.AbstractC0007h.o(r5, r7, r4)
            goto Le
        L1f:
            r2 = 4
            goto L2f
        L21:
            int r7 = r7.f2236a
            if (r7 != r1) goto L2f
        L25:
            r2 = r3
            goto L2f
        L27:
            r2 = r1
            goto L2f
        L29:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            W.a.A(r4, r7)
            goto L27
        L2f:
            r6.f3411f = r2
            if (r2 == r1) goto L35
            if (r2 != 0) goto L36
        L35:
            r0 = r1
        L36:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            W.a.d(r7, r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0124d.b(T.e):void");
    }

    public final void c(int i4) {
        if (this.f3410e == i4) {
            return;
        }
        this.f3410e = i4;
        float f4 = i4 == 4 ? 0.2f : 1.0f;
        if (this.f3412g == f4) {
            return;
        }
        this.f3412g = f4;
        SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E = this.f3408c;
        if (surfaceHolderCallbackC0115E != null) {
            C0118H c0118h = surfaceHolderCallbackC0115E.f3204a;
            c0118h.G(1, 2, Float.valueOf(c0118h.f3230W * c0118h.f3262y.f3412g));
        }
    }

    public final int d(int i4, boolean z4) {
        int requestAudioFocus;
        int i5 = 0;
        r1 = false;
        boolean z5 = false;
        if (i4 == 1 || this.f3411f != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z4) {
            int i6 = this.f3410e;
            if (i6 != 1) {
                return i6 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f3410e == 2) {
            return 1;
        }
        int i7 = W.y.f2709a;
        AudioManager audioManager = this.f3406a;
        C0123c c0123c = this.f3407b;
        if (i7 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f3413h;
            if (audioFocusRequest == null) {
                AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f3411f) : new AudioFocusRequest.Builder(this.f3413h);
                C0084e c0084e = this.f3409d;
                if (c0084e != null && c0084e.f2236a == 1) {
                    z5 = true;
                }
                c0084e.getClass();
                this.f3413h = builder.setAudioAttributes((AudioAttributes) c0084e.a().f1009m).setWillPauseWhenDucked(z5).setOnAudioFocusChangeListener(c0123c).build();
            }
            requestAudioFocus = audioManager.requestAudioFocus(this.f3413h);
        } else {
            C0084e c0084e2 = this.f3409d;
            c0084e2.getClass();
            int i8 = c0084e2.f2238c;
            if (i8 != 13) {
                switch (i8) {
                    case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                        break;
                    case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                        i5 = 8;
                        break;
                    case L.k.LONG_FIELD_NUMBER /* 4 */:
                        i5 = 4;
                        break;
                    case L.k.STRING_FIELD_NUMBER /* 5 */:
                    case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                        i5 = 5;
                        break;
                    case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        i5 = 2;
                        break;
                    default:
                        i5 = 3;
                        break;
                }
            } else {
                i5 = 1;
            }
            requestAudioFocus = audioManager.requestAudioFocus(c0123c, i5, this.f3411f);
        }
        if (requestAudioFocus == 1) {
            c(2);
            return 1;
        }
        c(1);
        return -1;
    }
}
