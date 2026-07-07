package p175p0;

/* renamed from: p0.d */
/* loaded from: classes.dex */
public final class C1945d extends p064Q.AbstractC0537i {

    /* renamed from: e */
    public boolean f7909e;

    /* renamed from: f */
    public java.util.UUID f7910f;

    /* renamed from: g */
    public byte[] f7911g;

    @Override // p064Q.AbstractC0537i
    /* renamed from: b */
    public final java.lang.Object mo1043b() {
        java.util.UUID uuid = this.f7910f;
        byte[] m1167a = p073S0.AbstractC0642t.m1167a(uuid, null, this.f7911g);
        byte[] bArr = this.f7911g;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i4 = 0; i4 < bArr.length; i4 += 2) {
            sb.append((char) bArr[i4]);
        }
        java.lang.String sb2 = sb.toString();
        byte[] decode = android.util.Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        byte b4 = decode[0];
        decode[0] = decode[3];
        decode[3] = b4;
        byte b5 = decode[1];
        decode[1] = decode[2];
        decode[2] = b5;
        byte b6 = decode[4];
        decode[4] = decode[5];
        decode[5] = b6;
        byte b7 = decode[6];
        decode[6] = decode[7];
        decode[7] = b7;
        return new p175p0.C1942a(uuid, m1167a, new p073S0.C0644v[]{new p073S0.C0644v(true, null, 8, decode, 0, 0, null)});
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: d */
    public final boolean mo1045d(java.lang.String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: g */
    public final void mo1048g(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f7909e = false;
        }
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: k */
    public final void mo1049k(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f7909e = true;
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f7910f = java.util.UUID.fromString(attributeValue);
        }
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: l */
    public final void mo1050l(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (this.f7909e) {
            this.f7911g = android.util.Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
