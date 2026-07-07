package g0;

import Y.C;
import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305a implements Y.h {

    /* renamed from: l, reason: collision with root package name */
    public final Y.h f5635l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f5636m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f5637n;

    /* renamed from: o, reason: collision with root package name */
    public CipherInputStream f5638o;

    public C0305a(Y.h hVar, byte[] bArr, byte[] bArr2) {
        this.f5635l = hVar;
        this.f5636m = bArr;
        this.f5637n = bArr2;
    }

    @Override // Y.h
    public final long b(Y.l lVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f5636m, "AES"), new IvParameterSpec(this.f5637n));
                Y.j jVar = new Y.j(this.f5635l, lVar);
                this.f5638o = new CipherInputStream(jVar, cipher);
                jVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // Y.h
    public final void close() {
        if (this.f5638o != null) {
            this.f5638o = null;
            this.f5635l.close();
        }
    }

    @Override // Y.h
    public final void j(C c4) {
        c4.getClass();
        this.f5635l.j(c4);
    }

    @Override // Y.h
    public final Uri o() {
        return this.f5635l.o();
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        this.f5638o.getClass();
        int read = this.f5638o.read(bArr, i4, i5);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // Y.h
    public final Map y() {
        return this.f5635l.y();
    }
}
