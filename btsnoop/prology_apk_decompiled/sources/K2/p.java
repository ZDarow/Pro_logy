package K2;

import B2.AbstractC0007h;
import I.C0044m;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1011b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1012c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1013d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1014e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1015f;

    /* renamed from: g, reason: collision with root package name */
    public final q f1016g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f1017h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1018i;

    /* renamed from: j, reason: collision with root package name */
    public final C0044m f1019j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f1020k;

    /* renamed from: l, reason: collision with root package name */
    public final p[] f1021l;

    /* renamed from: m, reason: collision with root package name */
    public final Locale[] f1022m;

    public p(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i4, q qVar, Integer num, String str, C0044m c0044m, String[] strArr, p[] pVarArr, Locale[] localeArr) {
        this.f1010a = z4;
        this.f1011b = z5;
        this.f1012c = z6;
        this.f1013d = z7;
        this.f1014e = z8;
        this.f1015f = i4;
        this.f1016g = qVar;
        this.f1017h = num;
        this.f1018i = str;
        this.f1019j = c0044m;
        this.f1020k = strArr;
        this.f1021l = pVarArr;
        this.f1022m = localeArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0275. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r11v41, types: [K2.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [I.m, java.lang.Object] */
    public static p a(JSONObject jSONObject) {
        Object obj;
        int i4;
        p[] pVarArr;
        char c4;
        Integer num;
        int i5;
        boolean z4;
        Locale[] localeArr;
        String str;
        String str2;
        String str3;
        q qVar;
        C0044m c0044m;
        Object obj2;
        String str4;
        char c5;
        char c6;
        String str5 = "newUsername";
        String string = jSONObject.getString("inputAction");
        if (string == null) {
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }
        if (jSONObject.isNull("fields")) {
            obj = "creditCardExpirationMonth";
            i4 = 1;
            pVarArr = null;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            int length = jSONArray.length();
            p[] pVarArr2 = new p[length];
            obj = "creditCardExpirationMonth";
            for (int i6 = 0; i6 < length; i6++) {
                pVarArr2[i6] = a(jSONArray.getJSONObject(i6));
            }
            i4 = 1;
            pVarArr = pVarArr2;
        }
        int valueOf = Integer.valueOf(i4);
        switch (string.hashCode()) {
            case -737377923:
                if (string.equals("TextInputAction.done")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -737089298:
                if (string.equals("TextInputAction.next")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -737080013:
                if (string.equals("TextInputAction.none")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -736940669:
                if (string.equals("TextInputAction.send")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 469250275:
                if (string.equals("TextInputAction.search")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 1241689507:
                if (string.equals("TextInputAction.go")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1539450297:
                if (string.equals("TextInputAction.newline")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 2110497650:
                if (string.equals("TextInputAction.previous")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                num = 6;
                break;
            case 1:
                valueOf = 5;
                num = valueOf;
                break;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                num = valueOf;
                break;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                i5 = 4;
                num = i5;
                break;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                i5 = 3;
                num = i5;
                break;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                i5 = 2;
                num = i5;
                break;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                valueOf = 7;
                num = valueOf;
                break;
            default:
                num = 0;
                break;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
        if (jSONArray2 != null) {
            for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                arrayList.add(jSONArray2.optString(i7));
            }
        }
        if (jSONObject.isNull("hintLocales")) {
            z4 = true;
            localeArr = null;
        } else {
            JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
            Locale[] localeArr2 = new Locale[jSONArray3.length()];
            for (int i8 = 0; i8 < jSONArray3.length(); i8++) {
                localeArr2[i8] = Locale.forLanguageTag(jSONArray3.optString(i8));
            }
            z4 = true;
            localeArr = localeArr2;
        }
        boolean optBoolean = jSONObject.optBoolean("obscureText");
        boolean optBoolean2 = jSONObject.optBoolean("autocorrect", z4);
        boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
        boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
        boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
        String string2 = jSONObject.getString("textCapitalization");
        int[] c7 = L.j.c(4);
        int length2 = c7.length;
        int i9 = 0;
        while (i9 < length2) {
            int i10 = length2;
            int i11 = c7[i9];
            int[] iArr = c7;
            if (i11 == 1) {
                str = "TextCapitalization.characters";
            } else if (i11 == 2) {
                str = "TextCapitalization.words";
            } else if (i11 == 3) {
                str = "TextCapitalization.sentences";
            } else {
                if (i11 != 4) {
                    throw null;
                }
                str = "TextCapitalization.none";
            }
            if (str.equals(string2)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
                String string3 = jSONObject2.getString("name");
                int[] c8 = L.j.c(13);
                ArrayList arrayList2 = arrayList;
                int length3 = c8.length;
                Object obj3 = "newPassword";
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = length3;
                    int i14 = c8[i12];
                    switch (i14) {
                        case 1:
                            str2 = "TextInputType.text";
                            break;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            str2 = "TextInputType.datetime";
                            break;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str2 = "TextInputType.name";
                            break;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            str2 = "TextInputType.address";
                            break;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            str2 = "TextInputType.number";
                            break;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            str2 = "TextInputType.phone";
                            break;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str2 = "TextInputType.multiline";
                            break;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            str2 = "TextInputType.emailAddress";
                            break;
                        case 9:
                            str2 = "TextInputType.url";
                            break;
                        case 10:
                            str2 = "TextInputType.visiblePassword";
                            break;
                        case 11:
                            str2 = "TextInputType.none";
                            break;
                        case 12:
                            str2 = "TextInputType.webSearch";
                            break;
                        case 13:
                            str2 = "TextInputType.twitter";
                            break;
                        default:
                            throw null;
                    }
                    int[] iArr2 = c8;
                    if (str2.equals(string3)) {
                        boolean optBoolean6 = jSONObject2.optBoolean("signed", false);
                        boolean optBoolean7 = jSONObject2.optBoolean("decimal", false);
                        ?? obj4 = new Object();
                        obj4.f1023a = i14;
                        obj4.f1024b = optBoolean6;
                        obj4.f1025c = optBoolean7;
                        String string4 = jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel");
                        if (jSONObject.isNull("autofill")) {
                            str3 = string4;
                            qVar = obj4;
                            c0044m = null;
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                            String string5 = jSONObject3.getString("uniqueIdentifier");
                            JSONArray jSONArray4 = jSONObject3.getJSONArray("hints");
                            String string6 = jSONObject3.isNull("hintText") ? null : jSONObject3.getString("hintText");
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                            String[] strArr = new String[jSONArray4.length()];
                            str3 = string4;
                            qVar = obj4;
                            int i15 = 0;
                            while (i15 < jSONArray4.length()) {
                                String string7 = jSONArray4.getString(i15);
                                string7.getClass();
                                JSONArray jSONArray5 = jSONArray4;
                                switch (string7.hashCode()) {
                                    case -2058889126:
                                        obj2 = obj3;
                                        str4 = str5;
                                        if (string7.equals("birthdayYear")) {
                                            c5 = 0;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1917283616:
                                        obj2 = obj3;
                                        str4 = str5;
                                        if (string7.equals("oneTimeCode")) {
                                            c5 = 1;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1844815832:
                                        obj2 = obj3;
                                        str4 = str5;
                                        if (string7.equals(obj)) {
                                            c5 = 2;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1825589953:
                                        obj2 = obj3;
                                        str4 = str5;
                                        if (string7.equals("telephoneNumberNational")) {
                                            c5 = 3;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1821235109:
                                        obj2 = obj3;
                                        str4 = str5;
                                        if (string7.equals(obj2)) {
                                            c5 = 4;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1757573738:
                                        if (string7.equals("creditCardSecurityCode")) {
                                            obj2 = obj3;
                                            str4 = str5;
                                            c5 = 5;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1682373820:
                                        if (string7.equals("creditCardExpirationDay")) {
                                            obj2 = obj3;
                                            str4 = str5;
                                            c5 = 6;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1658955742:
                                        if (string7.equals("fullStreetAddress")) {
                                            obj2 = obj3;
                                            str4 = str5;
                                            c5 = 7;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1567118045:
                                        if (string7.equals("telephoneNumberDevice")) {
                                            c6 = '\b';
                                            Object obj5 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1476752575:
                                        if (string7.equals("countryName")) {
                                            c6 = '\t';
                                            Object obj52 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1413737489:
                                        if (string7.equals("middleInitial")) {
                                            c6 = '\n';
                                            Object obj522 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1377792129:
                                        if (string7.equals("addressCity")) {
                                            c6 = 11;
                                            Object obj5222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1249512767:
                                        if (string7.equals("gender")) {
                                            c6 = '\f';
                                            Object obj52222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1186060294:
                                        if (string7.equals("postalAddressExtendedPostalCode")) {
                                            obj2 = obj3;
                                            str4 = str5;
                                            c5 = '\r';
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -1151034798:
                                        if (string7.equals("creditCardNumber")) {
                                            c6 = 14;
                                            Object obj522222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -835992323:
                                        if (string7.equals("namePrefix")) {
                                            c6 = 15;
                                            Object obj5222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -818219584:
                                        if (string7.equals("middleName")) {
                                            c6 = 16;
                                            Object obj52222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -747304516:
                                        if (string7.equals("nameSuffix")) {
                                            c6 = 17;
                                            Object obj522222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -613980922:
                                        if (string7.equals("creditCardExpirationDate")) {
                                            c6 = 18;
                                            Object obj5222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -613352043:
                                        if (string7.equals("creditCardExpirationYear")) {
                                            c6 = 19;
                                            Object obj52222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -549230602:
                                        if (string7.equals("telephoneNumberCountryCode")) {
                                            c6 = 20;
                                            Object obj522222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case -265713450:
                                        if (string7.equals("username")) {
                                            c6 = 21;
                                            Object obj5222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 3373707:
                                        if (string7.equals("name")) {
                                            c6 = 22;
                                            Object obj52222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 96619420:
                                        if (string7.equals("email")) {
                                            c6 = 23;
                                            Object obj522222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 253202685:
                                        if (string7.equals("addressState")) {
                                            c6 = 24;
                                            Object obj5222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 588174851:
                                        if (string7.equals("birthdayMonth")) {
                                            c6 = 25;
                                            Object obj52222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 798554127:
                                        if (string7.equals("familyName")) {
                                            c6 = 26;
                                            Object obj522222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 892233837:
                                        if (string7.equals("telephoneNumber")) {
                                            c6 = 27;
                                            Object obj5222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 991032982:
                                        if (string7.equals(str5)) {
                                            c6 = 28;
                                            Object obj52222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 1069376125:
                                        if (string7.equals("birthday")) {
                                            c6 = 29;
                                            Object obj522222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 1216985755:
                                        if (string7.equals("password")) {
                                            c6 = 30;
                                            Object obj5222222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 1469046696:
                                        if (string7.equals("givenName")) {
                                            c6 = 31;
                                            Object obj52222222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 1662667945:
                                        if (string7.equals("postalAddress")) {
                                            c6 = ' ';
                                            Object obj522222222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 1921869058:
                                        if (string7.equals("postalAddressExtended")) {
                                            c6 = '!';
                                            Object obj5222222222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj5222222222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 2011152728:
                                        if (string7.equals("postalCode")) {
                                            c6 = '\"';
                                            Object obj52222222222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj52222222222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    case 2011773919:
                                        if (string7.equals("birthdayDay")) {
                                            c6 = '#';
                                            Object obj522222222222222222222222222 = obj3;
                                            str4 = str5;
                                            c5 = c6;
                                            obj2 = obj522222222222222222222222222;
                                            break;
                                        }
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                    default:
                                        obj2 = obj3;
                                        str4 = str5;
                                        c5 = 65535;
                                        break;
                                }
                                switch (c5) {
                                    case 0:
                                        string7 = "birthDateYear";
                                        break;
                                    case 1:
                                        string7 = "smsOTPCode";
                                        break;
                                    case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                        string7 = obj;
                                        break;
                                    case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                        string7 = "phoneNational";
                                        break;
                                    case L.k.LONG_FIELD_NUMBER /* 4 */:
                                        string7 = obj2;
                                        break;
                                    case L.k.STRING_FIELD_NUMBER /* 5 */:
                                        string7 = "creditCardSecurityCode";
                                        break;
                                    case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        string7 = "creditCardExpirationDay";
                                        break;
                                    case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                        string7 = "streetAddress";
                                        break;
                                    case L.k.BYTES_FIELD_NUMBER /* 8 */:
                                        string7 = "phoneNumberDevice";
                                        break;
                                    case '\t':
                                        string7 = "addressCountry";
                                        break;
                                    case '\n':
                                        string7 = "personMiddleInitial";
                                        break;
                                    case 11:
                                        string7 = "addressLocality";
                                        break;
                                    case '\f':
                                        string7 = "gender";
                                        break;
                                    case '\r':
                                        string7 = "extendedPostalCode";
                                        break;
                                    case 14:
                                        string7 = "creditCardNumber";
                                        break;
                                    case 15:
                                        string7 = "personNamePrefix";
                                        break;
                                    case 16:
                                        string7 = "personMiddleName";
                                        break;
                                    case 17:
                                        string7 = "personNameSuffix";
                                        break;
                                    case 18:
                                        string7 = "creditCardExpirationDate";
                                        break;
                                    case 19:
                                        string7 = "creditCardExpirationYear";
                                        break;
                                    case 20:
                                        string7 = "phoneCountryCode";
                                        break;
                                    case 21:
                                        string7 = "username";
                                        break;
                                    case 22:
                                        string7 = "personName";
                                        break;
                                    case 23:
                                        string7 = "emailAddress";
                                        break;
                                    case 24:
                                        string7 = "addressRegion";
                                        break;
                                    case 25:
                                        string7 = "birthDateMonth";
                                        break;
                                    case 26:
                                        string7 = "personFamilyName";
                                        break;
                                    case 27:
                                        string7 = "phoneNumber";
                                        break;
                                    case 28:
                                        string7 = str4;
                                        break;
                                    case 29:
                                        string7 = "birthDateFull";
                                        break;
                                    case 30:
                                        string7 = "password";
                                        break;
                                    case 31:
                                        string7 = "personGivenName";
                                        break;
                                    case ' ':
                                        string7 = "postalAddress";
                                        break;
                                    case '!':
                                        string7 = "extendedAddress";
                                        break;
                                    case '\"':
                                        string7 = "postalCode";
                                        break;
                                    case '#':
                                        string7 = "birthDateDay";
                                        break;
                                }
                                strArr[i15] = string7;
                                i15++;
                                str5 = str4;
                                obj3 = obj2;
                                jSONArray4 = jSONArray5;
                            }
                            r a4 = r.a(jSONObject4);
                            ?? obj6 = new Object();
                            obj6.f847l = string5;
                            obj6.f848m = strArr;
                            obj6.f850o = string6;
                            obj6.f849n = a4;
                            c0044m = obj6;
                        }
                        return new p(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, i11, qVar, num, str3, c0044m, (String[]) arrayList2.toArray(new String[arrayList2.size()]), pVarArr, localeArr);
                    }
                    i12++;
                    str5 = str5;
                    c8 = iArr2;
                    obj3 = obj3;
                    length3 = i13;
                }
                throw new NoSuchFieldException(AbstractC0007h.l("No such TextInputType: ", string3));
            }
            i9++;
            length2 = i10;
            c7 = iArr;
            arrayList = arrayList;
            str5 = str5;
        }
        throw new NoSuchFieldException(AbstractC0007h.l("No such TextCapitalization: ", string2));
    }
}
