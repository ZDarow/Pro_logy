package L0;

import T.G;
import e2.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class a extends AbstractC0462a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f1041c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f1042a = d.f5436c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f1043b = d.f5435b.newDecoder();

    @Override // p1.AbstractC0462a
    public final G v(H0.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f1043b;
        CharsetDecoder charsetDecoder2 = this.f1042a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new G(new c(null, null, bArr));
        }
        Matcher matcher = f1041c.matcher(str);
        String str3 = null;
        for (int i4 = 0; matcher.find(i4); i4 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String I3 = U1.a.I(group);
                I3.getClass();
                if (I3.equals("streamurl")) {
                    str3 = group2;
                } else if (I3.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new G(new c(str2, str3, bArr));
    }
}
