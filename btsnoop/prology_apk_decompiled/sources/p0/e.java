package p0;

import Q.i;
import T.C0094o;
import T.C0095p;
import T.H;
import W.y;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;
import y0.AbstractC0619b;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: e, reason: collision with root package name */
    public C0095p f7621e;

    public static ArrayList n(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] t4 = y.t(str);
            if (t4.length > 4) {
                int i4 = 0;
                while (true) {
                    byte[] bArr2 = W.a.f2640a;
                    if (i4 >= 4) {
                        ArrayList arrayList2 = new ArrayList();
                        int i5 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i5));
                            i5 += 4;
                            int length = t4.length - 4;
                            while (true) {
                                if (i5 > length) {
                                    i5 = -1;
                                    break;
                                }
                                if (t4.length - i5 > 4) {
                                    for (int i6 = 0; i6 < 4; i6++) {
                                        if (t4[i5 + i6] != bArr2[i6]) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                i5++;
                            }
                        } while (i5 != -1);
                        byte[][] bArr3 = new byte[arrayList2.size()];
                        int i7 = 0;
                        while (i7 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i7)).intValue();
                            int intValue2 = (i7 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i7 + 1)).intValue() : t4.length) - intValue;
                            byte[] bArr4 = new byte[intValue2];
                            System.arraycopy(t4, intValue, bArr4, 0, intValue2);
                            bArr3[i7] = bArr4;
                            i7++;
                        }
                        bArr = bArr3;
                    } else {
                        if (t4[i4] != bArr2[i4]) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            bArr = null;
            if (bArr == null) {
                arrayList.add(t4);
            } else {
                Collections.addAll(arrayList, bArr);
            }
        }
        return arrayList;
    }

    @Override // Q.i
    public final Object b() {
        return this.f7621e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // Q.i
    public final void k(XmlPullParser xmlPullParser) {
        int i4;
        C0094o c0094o = new C0094o();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new E0.d("FourCC", 1);
        }
        String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int intValue = ((Integer) c("Type")).intValue();
        if (intValue == 2) {
            ArrayList n4 = n(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            c0094o.f2289k = H.l("video/mp4");
            c0094o.f2296r = i.j(xmlPullParser, "MaxWidth");
            c0094o.s = i.j(xmlPullParser, "MaxHeight");
            c0094o.f2293o = n4;
        } else if (intValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int j4 = i.j(xmlPullParser, "Channels");
            int j5 = i.j(xmlPullParser, "SamplingRate");
            ArrayList n5 = n(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean isEmpty = n5.isEmpty();
            ArrayList arrayList = n5;
            if (isEmpty) {
                arrayList = n5;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayList = Collections.singletonList(AbstractC0619b.a(j5, j4));
                }
            }
            c0094o.f2289k = H.l("audio/mp4");
            c0094o.f2302z = j4;
            c0094o.f2270A = j5;
            c0094o.f2293o = arrayList;
        } else if (intValue == 3) {
            String str2 = (String) c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i4 = 64;
                } else if (str2.equals("DESC")) {
                    i4 = 1024;
                }
                c0094o.f2289k = H.l("application/mp4");
                c0094o.f2284f = i4;
            }
            i4 = 0;
            c0094o.f2289k = H.l("application/mp4");
            c0094o.f2284f = i4;
        } else {
            c0094o.f2289k = H.l("application/mp4");
        }
        c0094o.f2279a = xmlPullParser.getAttributeValue(null, "Index");
        c0094o.f2280b = (String) c("Name");
        c0094o.f2290l = H.l(str);
        c0094o.f2285g = i.j(xmlPullParser, "Bitrate");
        c0094o.f2282d = (String) c("Language");
        this.f7621e = new C0095p(c0094o);
    }
}
