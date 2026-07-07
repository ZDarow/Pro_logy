package p0;

import Q.i;
import S0.t;
import S0.v;
import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class d extends i {

    /* renamed from: e, reason: collision with root package name */
    public boolean f7618e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f7619f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f7620g;

    @Override // Q.i
    public final Object b() {
        UUID uuid = this.f7619f;
        byte[] a4 = t.a(uuid, null, this.f7620g);
        byte[] bArr = this.f7620g;
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < bArr.length; i4 += 2) {
            sb.append((char) bArr[i4]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
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
        return new C0461a(uuid, a4, new v[]{new v(true, null, 8, decode, 0, 0, null)});
    }

    @Override // Q.i
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // Q.i
    public final void g(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f7618e = false;
        }
    }

    @Override // Q.i
    public final void k(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f7618e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f7619f = UUID.fromString(attributeValue);
        }
    }

    @Override // Q.i
    public final void l(XmlPullParser xmlPullParser) {
        if (this.f7618e) {
            this.f7620g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
