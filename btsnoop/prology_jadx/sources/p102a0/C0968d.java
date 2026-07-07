package p102a0;

/* renamed from: a0.d */
/* loaded from: classes.dex */
public final class C0968d {

    /* renamed from: a */
    public final android.media.AudioManager f3524a;

    /* renamed from: b */
    public final p102a0.C0966c f3525b;

    /* renamed from: c */
    public p102a0.SurfaceHolderCallbackC0941E f3526c;

    /* renamed from: d */
    public p076T.C0691e f3527d;

    /* renamed from: e */
    public int f3528e;

    /* renamed from: f */
    public int f3529f;

    /* renamed from: g */
    public float f3530g = 1.0f;

    /* renamed from: h */
    public android.media.AudioFocusRequest f3531h;

    public C0968d(android.content.Context context, android.os.Handler handler, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f3524a = audioManager;
        this.f3526c = surfaceHolderCallbackC0941E;
        this.f3525b = new p102a0.C0966c(this, handler);
        this.f3528e = 0;
    }

    /* renamed from: a */
    public final void m1972a() {
        int i4 = this.f3528e;
        if (i4 == 1 || i4 == 0) {
            return;
        }
        int i5 = p086W.AbstractC0805y.f2801a;
        android.media.AudioManager audioManager = this.f3524a;
        if (i5 < 26) {
            audioManager.abandonAudioFocus(this.f3525b);
            return;
        }
        android.media.AudioFocusRequest audioFocusRequest = this.f3531h;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r7.f2316a == 1) goto L13;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1973b(p076T.C0691e r7) {
        /*
            r6 = this;
            T.e r0 = r6.f3527d
            boolean r0 = p086W.AbstractC0805y.m1606a(r0, r7)
            if (r0 != 0) goto L3b
            r6.f3527d = r7
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
            int r5 = r7.f2318c
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
            p009B2.AbstractC0051h.m156o(r5, r7, r4)
            goto Le
        L1f:
            r2 = 4
            goto L2f
        L21:
            int r7 = r7.f2316a
            if (r7 != r1) goto L2f
        L25:
            r2 = r3
            goto L2f
        L27:
            r2 = r1
            goto L2f
        L29:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            p086W.AbstractC0781a.m1410A(r4, r7)
            goto L27
        L2f:
            r6.f3529f = r2
            if (r2 == r1) goto L35
            if (r2 != 0) goto L36
        L35:
            r0 = r1
        L36:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            p086W.AbstractC0781a.m1415d(r7, r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0968d.m1973b(T.e):void");
    }

    /* renamed from: c */
    public final void m1974c(int i4) {
        if (this.f3528e == i4) {
            return;
        }
        this.f3528e = i4;
        float f4 = i4 == 4 ? 0.2f : 1.0f;
        if (this.f3530g == f4) {
            return;
        }
        this.f3530g = f4;
        p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E = this.f3526c;
        if (surfaceHolderCallbackC0941E != null) {
            p102a0.C0944H c0944h = surfaceHolderCallbackC0941E.f3316a;
            c0944h.m1834G(1, 2, java.lang.Float.valueOf(c0944h.f3343W * c0944h.f3377y.f3530g));
        }
    }

    /* renamed from: d */
    public final int m1975d(int i4, boolean z4) {
        int requestAudioFocus;
        int i5 = 0;
        r1 = false;
        boolean z5 = false;
        if (i4 == 1 || this.f3529f != 1) {
            m1972a();
            m1974c(0);
            return 1;
        }
        if (!z4) {
            int i6 = this.f3528e;
            if (i6 != 1) {
                return i6 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f3528e == 2) {
            return 1;
        }
        int i7 = p086W.AbstractC0805y.f2801a;
        android.media.AudioManager audioManager = this.f3524a;
        p102a0.C0966c c0966c = this.f3525b;
        if (i7 >= 26) {
            android.media.AudioFocusRequest audioFocusRequest = this.f3531h;
            if (audioFocusRequest == null) {
                android.media.AudioFocusRequest.Builder builder = audioFocusRequest == null ? new android.media.AudioFocusRequest.Builder(this.f3529f) : new android.media.AudioFocusRequest.Builder(this.f3531h);
                p076T.C0691e c0691e = this.f3527d;
                if (c0691e != null && c0691e.f2316a == 1) {
                    z5 = true;
                }
                c0691e.getClass();
                this.f3531h = builder.setAudioAttributes((android.media.AudioAttributes) c0691e.m1269a().f1048m).setWillPauseWhenDucked(z5).setOnAudioFocusChangeListener(c0966c).build();
            }
            requestAudioFocus = audioManager.requestAudioFocus(this.f3531h);
        } else {
            p076T.C0691e c0691e2 = this.f3527d;
            c0691e2.getClass();
            int i8 = c0691e2.f2318c;
            if (i8 != 13) {
                switch (i8) {
                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                        break;
                    case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                        i5 = 8;
                        break;
                    case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                        i5 = 4;
                        break;
                    case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                        i5 = 5;
                        break;
                    case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                        i5 = 2;
                        break;
                    default:
                        i5 = 3;
                        break;
                }
            } else {
                i5 = 1;
            }
            requestAudioFocus = audioManager.requestAudioFocus(c0966c, i5, this.f3529f);
        }
        if (requestAudioFocus == 1) {
            m1974c(2);
            return 1;
        }
        m1974c(1);
        return -1;
    }
}
