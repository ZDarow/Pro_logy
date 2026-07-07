package p043K2;

/* renamed from: K2.p */
/* loaded from: classes.dex */
public final class C0340p {

    /* renamed from: a */
    public final boolean f1049a;

    /* renamed from: b */
    public final boolean f1050b;

    /* renamed from: c */
    public final boolean f1051c;

    /* renamed from: d */
    public final boolean f1052d;

    /* renamed from: e */
    public final boolean f1053e;

    /* renamed from: f */
    public final int f1054f;

    /* renamed from: g */
    public final p043K2.C0341q f1055g;

    /* renamed from: h */
    public final java.lang.Integer f1056h;

    /* renamed from: i */
    public final java.lang.String f1057i;

    /* renamed from: j */
    public final p035I.C0291m f1058j;

    /* renamed from: k */
    public final java.lang.String[] f1059k;

    /* renamed from: l */
    public final p043K2.C0340p[] f1060l;

    /* renamed from: m */
    public final java.util.Locale[] f1061m;

    public C0340p(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i4, p043K2.C0341q c0341q, java.lang.Integer num, java.lang.String str, p035I.C0291m c0291m, java.lang.String[] strArr, p043K2.C0340p[] c0340pArr, java.util.Locale[] localeArr) {
        this.f1049a = z4;
        this.f1050b = z5;
        this.f1051c = z6;
        this.f1052d = z7;
        this.f1053e = z8;
        this.f1054f = i4;
        this.f1055g = c0341q;
        this.f1056h = num;
        this.f1057i = str;
        this.f1058j = c0291m;
        this.f1059k = strArr;
        this.f1060l = c0340pArr;
        this.f1061m = localeArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0275. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r11v41, types: [K2.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [I.m, java.lang.Object] */
    /* renamed from: a */
    public static p043K2.C0340p m769a(org.json.JSONObject jSONObject) {
        java.lang.Object obj;
        int i4;
        p043K2.C0340p[] c0340pArr;
        char c4;
        java.lang.Integer num;
        int i5;
        boolean z4;
        java.util.Locale[] localeArr;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        p043K2.C0341q c0341q;
        p035I.C0291m c0291m;
        java.lang.Object obj2;
        java.lang.String str4;
        char c5;
        char c6;
        java.lang.String str5 = "newUsername";
        java.lang.String string = jSONObject.getString("inputAction");
        if (string == null) {
            throw new org.json.JSONException("Configuration JSON missing 'inputAction' property.");
        }
        if (jSONObject.isNull("fields")) {
            obj = "creditCardExpirationMonth";
            i4 = 1;
            c0340pArr = null;
        } else {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("fields");
            int length = jSONArray.length();
            p043K2.C0340p[] c0340pArr2 = new p043K2.C0340p[length];
            obj = "creditCardExpirationMonth";
            for (int i6 = 0; i6 < length; i6++) {
                c0340pArr2[i6] = m769a(jSONArray.getJSONObject(i6));
            }
            i4 = 1;
            c0340pArr = c0340pArr2;
        }
        int valueOf = java.lang.Integer.valueOf(i4);
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
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                num = valueOf;
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                i5 = 4;
                num = i5;
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                i5 = 3;
                num = i5;
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                i5 = 2;
                num = i5;
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                valueOf = 7;
                num = valueOf;
                break;
            default:
                num = 0;
                break;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
        if (jSONArray2 != null) {
            for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                arrayList.add(jSONArray2.optString(i7));
            }
        }
        if (jSONObject.isNull("hintLocales")) {
            z4 = true;
            localeArr = null;
        } else {
            org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
            java.util.Locale[] localeArr2 = new java.util.Locale[jSONArray3.length()];
            for (int i8 = 0; i8 < jSONArray3.length(); i8++) {
                localeArr2[i8] = java.util.Locale.forLanguageTag(jSONArray3.optString(i8));
            }
            z4 = true;
            localeArr = localeArr2;
        }
        boolean optBoolean = jSONObject.optBoolean("obscureText");
        boolean optBoolean2 = jSONObject.optBoolean("autocorrect", z4);
        boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
        boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
        boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
        java.lang.String string2 = jSONObject.getString("textCapitalization");
        int[] m782c = p044L.AbstractC0352j.m782c(4);
        int length2 = m782c.length;
        int i9 = 0;
        while (i9 < length2) {
            int i10 = length2;
            int i11 = m782c[i9];
            int[] iArr = m782c;
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
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
                java.lang.String string3 = jSONObject2.getString("name");
                int[] m782c2 = p044L.AbstractC0352j.m782c(13);
                java.util.ArrayList arrayList2 = arrayList;
                int length3 = m782c2.length;
                java.lang.Object obj3 = "newPassword";
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = length3;
                    int i14 = m782c2[i12];
                    switch (i14) {
                        case 1:
                            str2 = "TextInputType.text";
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            str2 = "TextInputType.datetime";
                            break;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            str2 = "TextInputType.name";
                            break;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            str2 = "TextInputType.address";
                            break;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            str2 = "TextInputType.number";
                            break;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            str2 = "TextInputType.phone";
                            break;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str2 = "TextInputType.multiline";
                            break;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
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
                    int[] iArr2 = m782c2;
                    if (str2.equals(string3)) {
                        boolean optBoolean6 = jSONObject2.optBoolean("signed", false);
                        boolean optBoolean7 = jSONObject2.optBoolean("decimal", false);
                        ?? obj4 = new java.lang.Object();
                        obj4.f1062a = i14;
                        obj4.f1063b = optBoolean6;
                        obj4.f1064c = optBoolean7;
                        java.lang.String string4 = jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel");
                        if (jSONObject.isNull("autofill")) {
                            str3 = string4;
                            c0341q = obj4;
                            c0291m = null;
                        } else {
                            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                            java.lang.String string5 = jSONObject3.getString("uniqueIdentifier");
                            org.json.JSONArray jSONArray4 = jSONObject3.getJSONArray("hints");
                            java.lang.String string6 = jSONObject3.isNull("hintText") ? null : jSONObject3.getString("hintText");
                            org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                            java.lang.String[] strArr = new java.lang.String[jSONArray4.length()];
                            str3 = string4;
                            c0341q = obj4;
                            int i15 = 0;
                            while (i15 < jSONArray4.length()) {
                                java.lang.String string7 = jSONArray4.getString(i15);
                                string7.getClass();
                                org.json.JSONArray jSONArray5 = jSONArray4;
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
                                            java.lang.Object obj5 = obj3;
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
                                            java.lang.Object obj52 = obj3;
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
                                            java.lang.Object obj522 = obj3;
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
                                            java.lang.Object obj5222 = obj3;
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
                                            java.lang.Object obj52222 = obj3;
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
                                            java.lang.Object obj522222 = obj3;
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
                                            java.lang.Object obj5222222 = obj3;
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
                                            java.lang.Object obj52222222 = obj3;
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
                                            java.lang.Object obj522222222 = obj3;
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
                                            java.lang.Object obj5222222222 = obj3;
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
                                            java.lang.Object obj52222222222 = obj3;
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
                                            java.lang.Object obj522222222222 = obj3;
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
                                            java.lang.Object obj5222222222222 = obj3;
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
                                            java.lang.Object obj52222222222222 = obj3;
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
                                            java.lang.Object obj522222222222222 = obj3;
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
                                            java.lang.Object obj5222222222222222 = obj3;
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
                                            java.lang.Object obj52222222222222222 = obj3;
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
                                            java.lang.Object obj522222222222222222 = obj3;
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
                                            java.lang.Object obj5222222222222222222 = obj3;
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
                                            java.lang.Object obj52222222222222222222 = obj3;
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
                                            java.lang.Object obj522222222222222222222 = obj3;
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
                                            java.lang.Object obj5222222222222222222222 = obj3;
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
                                            java.lang.Object obj52222222222222222222222 = obj3;
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
                                            java.lang.Object obj522222222222222222222222 = obj3;
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
                                            java.lang.Object obj5222222222222222222222222 = obj3;
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
                                            java.lang.Object obj52222222222222222222222222 = obj3;
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
                                            java.lang.Object obj522222222222222222222222222 = obj3;
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
                                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                        string7 = obj;
                                        break;
                                    case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                        string7 = "phoneNational";
                                        break;
                                    case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                        string7 = obj2;
                                        break;
                                    case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                        string7 = "creditCardSecurityCode";
                                        break;
                                    case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        string7 = "creditCardExpirationDay";
                                        break;
                                    case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                        string7 = "streetAddress";
                                        break;
                                    case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
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
                            p043K2.C0342r m770a = p043K2.C0342r.m770a(jSONObject4);
                            ?? obj6 = new java.lang.Object();
                            obj6.f876l = string5;
                            obj6.f877m = strArr;
                            obj6.f879o = string6;
                            obj6.f878n = m770a;
                            c0291m = obj6;
                        }
                        return new p043K2.C0340p(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, i11, c0341q, num, str3, c0291m, (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]), c0340pArr, localeArr);
                    }
                    i12++;
                    str5 = str5;
                    m782c2 = iArr2;
                    obj3 = obj3;
                    length3 = i13;
                }
                throw new java.lang.NoSuchFieldException(p009B2.AbstractC0051h.m153l("No such TextInputType: ", string3));
            }
            i9++;
            length2 = i10;
            m782c = iArr;
            arrayList = arrayList;
            str5 = str5;
        }
        throw new java.lang.NoSuchFieldException(p009B2.AbstractC0051h.m153l("No such TextCapitalization: ", string2));
    }
}
