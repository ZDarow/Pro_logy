package p045L0;

/* renamed from: L0.a */
/* loaded from: classes.dex */
public final class C0354a extends p176p1.AbstractC1949a {

    /* renamed from: c */
    public static final java.util.regex.Pattern f1080c = java.util.regex.Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final java.nio.charset.CharsetDecoder f1081a = p124e2.AbstractC1356d.f5630c.newDecoder();

    /* renamed from: b */
    public final java.nio.charset.CharsetDecoder f1082b = p124e2.AbstractC1356d.f5629b.newDecoder();

    @Override // p176p1.AbstractC1949a
    /* renamed from: v */
    public final p076T.C0664G mo709v(p032H0.C0244a c0244a, java.nio.ByteBuffer byteBuffer) {
        java.lang.String str;
        java.nio.charset.CharsetDecoder charsetDecoder = this.f1082b;
        java.nio.charset.CharsetDecoder charsetDecoder2 = this.f1081a;
        java.lang.String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (java.nio.charset.CharacterCodingException unused) {
            try {
                java.lang.String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (java.nio.charset.CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (java.lang.Throwable th) {
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
            return new p076T.C0664G(new p045L0.C0356c(null, null, bArr));
        }
        java.util.regex.Matcher matcher = f1080c.matcher(str);
        java.lang.String str3 = null;
        for (int i4 = 0; matcher.find(i4); i4 = matcher.end()) {
            java.lang.String group = matcher.group(1);
            java.lang.String group2 = matcher.group(2);
            if (group != null) {
                java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(group);
                m1361I.getClass();
                if (m1361I.equals("streamurl")) {
                    str3 = group2;
                } else if (m1361I.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new p076T.C0664G(new p045L0.C0356c(str2, str3, bArr));
    }
}
