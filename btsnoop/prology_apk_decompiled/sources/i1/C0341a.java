package i1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6168a;

    /* renamed from: b, reason: collision with root package name */
    public final c f6169b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6170c;

    /* renamed from: d, reason: collision with root package name */
    public final File f6171d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6172e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6173f = false;

    /* renamed from: g, reason: collision with root package name */
    public n0.e[] f6174g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f6175h;

    public C0341a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        this.f6168a = executor;
        this.f6169b = cVar;
        this.f6172e = str;
        this.f6171d = file;
        int i4 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i4 <= 34) {
            switch (i4) {
                case 26:
                    bArr = d.f6183g;
                    break;
                case 27:
                    bArr = d.f6182f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f6181e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f6180d;
                    break;
            }
        }
        this.f6170c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6169b.m();
            }
            return null;
        }
    }

    public final void b(int i4, Serializable serializable) {
        this.f6168a.execute(new W.g(this, i4, serializable, 1));
    }
}
