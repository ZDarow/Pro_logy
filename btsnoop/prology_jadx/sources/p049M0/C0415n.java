package p049M0;

/* renamed from: M0.n */
/* loaded from: classes.dex */
public final class C0415n extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0415n> CREATOR = new p024F.C0206i(19);

    /* renamed from: m */
    public final java.lang.String f1193m;

    /* renamed from: n */
    public final p129f2.AbstractC1393I f1194n;

    public C0415n(java.lang.String str, java.lang.String str2, p129f2.C1415c0 c1415c0) {
        super(str);
        p086W.AbstractC0781a.m1416e(!c1415c0.isEmpty());
        this.f1193m = str2;
        p129f2.AbstractC1393I m3162j = p129f2.AbstractC1393I.m3162j(c1415c0);
        this.f1194n = m3162j;
    }

    /* renamed from: d */
    public static java.util.ArrayList m883d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p076T.InterfaceC0663F
    /* renamed from: c */
    public final void mo717c(p076T.C0661D c0661d) {
        char c4;
        byte b4;
        java.lang.Long valueOf;
        byte b5;
        byte b6 = 10;
        java.lang.String str = this.f1181l;
        str.getClass();
        p129f2.AbstractC1393I abstractC1393I = this.f1194n;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c4 = 22;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        try {
            switch (c4) {
                case 0:
                case '\n':
                    c0661d.f2152c = (java.lang.CharSequence) abstractC1393I.get(0);
                    return;
                case 1:
                case 11:
                    c0661d.f2168s = (java.lang.CharSequence) abstractC1393I.get(0);
                    return;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                case '\r':
                    java.lang.String str2 = (java.lang.String) abstractC1393I.get(0);
                    int parseInt = java.lang.Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = java.lang.Integer.parseInt(str2.substring(0, 2));
                    c0661d.m1183d(java.lang.Integer.valueOf(parseInt));
                    c0661d.m1182c(java.lang.Integer.valueOf(parseInt2));
                    return;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                case 18:
                    c0661d.f2151b = (java.lang.CharSequence) abstractC1393I.get(0);
                    return;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                case 19:
                    c0661d.f2153d = (java.lang.CharSequence) abstractC1393I.get(0);
                    return;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                case 20:
                    c0661d.f2169t = (java.lang.CharSequence) abstractC1393I.get(0);
                    return;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                case 21:
                    java.lang.String[] m1602W = p086W.AbstractC0805y.m1602W((java.lang.String) abstractC1393I.get(0), "/");
                    int parseInt3 = java.lang.Integer.parseInt(m1602W[0]);
                    java.lang.Integer valueOf2 = m1602W.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(m1602W[1])) : null;
                    c0661d.f2157h = java.lang.Integer.valueOf(parseInt3);
                    c0661d.f2158i = valueOf2;
                    return;
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                case 17:
                    c0661d.f2150a = (java.lang.CharSequence) abstractC1393I.get(0);
                    return;
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                case 16:
                    c0661d.f2167r = (java.lang.CharSequence) abstractC1393I.get(0);
                    return;
                case '\t':
                case 22:
                    c0661d.m1184e(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) abstractC1393I.get(0))));
                    return;
                case '\f':
                    java.lang.String str3 = (java.lang.String) abstractC1393I.get(0);
                    str3.getClass();
                    if (!str3.isEmpty()) {
                        int i4 = str3.charAt(0) == '-' ? 1 : 0;
                        if (i4 != str3.length()) {
                            int i5 = i4 + 1;
                            char charAt = str3.charAt(i4);
                            if (charAt < 128) {
                                b4 = p143i2.AbstractC1550c.f6436a[charAt];
                            } else {
                                byte[] bArr = p143i2.AbstractC1550c.f6436a;
                                b4 = -1;
                            }
                            if (b4 >= 0 && b4 < 10) {
                                long j4 = -b4;
                                long j5 = 10;
                                long j6 = Long.MIN_VALUE / j5;
                                while (true) {
                                    if (i5 < str3.length()) {
                                        int i6 = i5 + 1;
                                        char charAt2 = str3.charAt(i5);
                                        if (charAt2 < 128) {
                                            b5 = p143i2.AbstractC1550c.f6436a[charAt2];
                                        } else {
                                            byte[] bArr2 = p143i2.AbstractC1550c.f6436a;
                                            b5 = -1;
                                        }
                                        if (b5 >= 0 && b5 < b6 && j4 >= j6) {
                                            long j7 = j4 * j5;
                                            long j8 = b5;
                                            if (j7 >= j8 - Long.MIN_VALUE) {
                                                j4 = j7 - j8;
                                                i5 = i6;
                                                b6 = 10;
                                            }
                                        }
                                    } else if (i4 != 0) {
                                        valueOf = java.lang.Long.valueOf(j4);
                                    } else if (j4 != Long.MIN_VALUE) {
                                        valueOf = java.lang.Long.valueOf(-j4);
                                    }
                                }
                            }
                        }
                    }
                    valueOf = null;
                    java.lang.Integer valueOf3 = (valueOf == null || valueOf.longValue() != ((long) valueOf.intValue())) ? null : java.lang.Integer.valueOf(valueOf.intValue());
                    if (valueOf3 == null) {
                        c0661d.m1181b((java.lang.CharSequence) abstractC1393I.get(0));
                        return;
                    }
                    java.lang.String m882a = p049M0.AbstractC0411j.m882a(valueOf3.intValue());
                    if (m882a != null) {
                        c0661d.m1181b(m882a);
                        return;
                    }
                    return;
                case 14:
                    java.util.ArrayList m883d = m883d((java.lang.String) abstractC1393I.get(0));
                    int size = m883d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                c0661d.m1182c((java.lang.Integer) m883d.get(2));
                            }
                        }
                        c0661d.m1183d((java.lang.Integer) m883d.get(1));
                    }
                    c0661d.m1184e((java.lang.Integer) m883d.get(0));
                    return;
                case 15:
                    java.util.ArrayList m883d2 = m883d((java.lang.String) abstractC1393I.get(0));
                    int size2 = m883d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                c0661d.f2166q = (java.lang.Integer) m883d2.get(2);
                            }
                        }
                        c0661d.f2165p = (java.lang.Integer) m883d2.get(1);
                    }
                    c0661d.f2164o = (java.lang.Integer) m883d2.get(0);
                    return;
                default:
                    return;
            }
        } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0415n.class != obj.getClass()) {
            return false;
        }
        p049M0.C0415n c0415n = (p049M0.C0415n) obj;
        return p086W.AbstractC0805y.m1606a(this.f1181l, c0415n.f1181l) && p086W.AbstractC0805y.m1606a(this.f1193m, c0415n.f1193m) && this.f1194n.equals(c0415n.f1194n);
    }

    public final int hashCode() {
        int hashCode = (this.f1181l.hashCode() + 527) * 31;
        java.lang.String str = this.f1193m;
        return this.f1194n.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p049M0.AbstractC0410i
    public final java.lang.String toString() {
        return this.f1181l + ": description=" + this.f1193m + ": values=" + this.f1194n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1181l);
        parcel.writeString(this.f1193m);
        parcel.writeStringArray((java.lang.String[]) this.f1194n.toArray(new java.lang.String[0]));
    }
}
