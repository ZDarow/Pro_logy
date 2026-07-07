package M0;

import T.D;
import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import f2.I;
import f2.c0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new F.i(19);

    /* renamed from: m, reason: collision with root package name */
    public final String f1154m;

    /* renamed from: n, reason: collision with root package name */
    public final I f1155n;

    public n(String str, String str2, c0 c0Var) {
        super(str);
        W.a.e(!c0Var.isEmpty());
        this.f1154m = str2;
        I j4 = I.j(c0Var);
        this.f1155n = j4;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // T.F
    public final void c(D d4) {
        char c4;
        byte b4;
        Long valueOf;
        byte b5;
        byte b6 = 10;
        String str = this.f1142l;
        str.getClass();
        I i4 = this.f1155n;
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
                    d4.f2076c = (CharSequence) i4.get(0);
                    return;
                case 1:
                case 11:
                    d4.s = (CharSequence) i4.get(0);
                    return;
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                case '\r':
                    String str2 = (String) i4.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    d4.d(Integer.valueOf(parseInt));
                    d4.c(Integer.valueOf(parseInt2));
                    return;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                case 18:
                    d4.f2075b = (CharSequence) i4.get(0);
                    return;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                case 19:
                    d4.f2077d = (CharSequence) i4.get(0);
                    return;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                case 20:
                    d4.f2092t = (CharSequence) i4.get(0);
                    return;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                case 21:
                    String[] W3 = y.W((String) i4.get(0), "/");
                    int parseInt3 = Integer.parseInt(W3[0]);
                    Integer valueOf2 = W3.length > 1 ? Integer.valueOf(Integer.parseInt(W3[1])) : null;
                    d4.f2081h = Integer.valueOf(parseInt3);
                    d4.f2082i = valueOf2;
                    return;
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                case 17:
                    d4.f2074a = (CharSequence) i4.get(0);
                    return;
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                case 16:
                    d4.f2091r = (CharSequence) i4.get(0);
                    return;
                case '\t':
                case 22:
                    d4.e(Integer.valueOf(Integer.parseInt((String) i4.get(0))));
                    return;
                case '\f':
                    String str3 = (String) i4.get(0);
                    str3.getClass();
                    if (!str3.isEmpty()) {
                        int i5 = str3.charAt(0) == '-' ? 1 : 0;
                        if (i5 != str3.length()) {
                            int i6 = i5 + 1;
                            char charAt = str3.charAt(i5);
                            if (charAt < 128) {
                                b4 = i2.c.f6206a[charAt];
                            } else {
                                byte[] bArr = i2.c.f6206a;
                                b4 = -1;
                            }
                            if (b4 >= 0 && b4 < 10) {
                                long j4 = -b4;
                                long j5 = 10;
                                long j6 = Long.MIN_VALUE / j5;
                                while (true) {
                                    if (i6 < str3.length()) {
                                        int i7 = i6 + 1;
                                        char charAt2 = str3.charAt(i6);
                                        if (charAt2 < 128) {
                                            b5 = i2.c.f6206a[charAt2];
                                        } else {
                                            byte[] bArr2 = i2.c.f6206a;
                                            b5 = -1;
                                        }
                                        if (b5 >= 0 && b5 < b6 && j4 >= j6) {
                                            long j7 = j4 * j5;
                                            long j8 = b5;
                                            if (j7 >= j8 - Long.MIN_VALUE) {
                                                j4 = j7 - j8;
                                                i6 = i7;
                                                b6 = 10;
                                            }
                                        }
                                    } else if (i5 != 0) {
                                        valueOf = Long.valueOf(j4);
                                    } else if (j4 != Long.MIN_VALUE) {
                                        valueOf = Long.valueOf(-j4);
                                    }
                                }
                            }
                        }
                    }
                    valueOf = null;
                    Integer valueOf3 = (valueOf == null || valueOf.longValue() != ((long) valueOf.intValue())) ? null : Integer.valueOf(valueOf.intValue());
                    if (valueOf3 == null) {
                        d4.b((CharSequence) i4.get(0));
                        return;
                    }
                    String a4 = j.a(valueOf3.intValue());
                    if (a4 != null) {
                        d4.b(a4);
                        return;
                    }
                    return;
                case 14:
                    ArrayList d5 = d((String) i4.get(0));
                    int size = d5.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                d4.c((Integer) d5.get(2));
                            }
                        }
                        d4.d((Integer) d5.get(1));
                    }
                    d4.e((Integer) d5.get(0));
                    return;
                case 15:
                    ArrayList d6 = d((String) i4.get(0));
                    int size2 = d6.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                d4.f2090q = (Integer) d6.get(2);
                            }
                        }
                        d4.f2089p = (Integer) d6.get(1);
                    }
                    d4.f2088o = (Integer) d6.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return y.a(this.f1142l, nVar.f1142l) && y.a(this.f1154m, nVar.f1154m) && this.f1155n.equals(nVar.f1155n);
    }

    public final int hashCode() {
        int hashCode = (this.f1142l.hashCode() + 527) * 31;
        String str = this.f1154m;
        return this.f1155n.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1142l + ": description=" + this.f1154m + ": values=" + this.f1155n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1142l);
        parcel.writeString(this.f1154m);
        parcel.writeStringArray((String[]) this.f1155n.toArray(new String[0]));
    }
}
