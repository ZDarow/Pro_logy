package p135h;

/* renamed from: h.d */
/* loaded from: classes.dex */
public final class C1483d extends android.view.MenuInflater {

    /* renamed from: e */
    public static final java.lang.Class[] f6055e;

    /* renamed from: f */
    public static final java.lang.Class[] f6056f;

    /* renamed from: a */
    public final java.lang.Object[] f6057a;

    /* renamed from: b */
    public final java.lang.Object[] f6058b;

    /* renamed from: c */
    public final android.content.Context f6059c;

    /* renamed from: d */
    public java.lang.Object f6060d;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        f6055e = clsArr;
        f6056f = clsArr;
    }

    public C1483d(android.content.Context context) {
        super(context);
        this.f6059c = context;
        java.lang.Object[] objArr = {context};
        this.f6057a = objArr;
        this.f6058b = objArr;
    }

    /* renamed from: a */
    public static java.lang.Object m3309a(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? m3309a(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0211, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3310b(android.content.res.XmlResourceParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p135h.C1483d.m3310b(android.content.res.XmlResourceParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, android.view.Menu menu) {
        if (!(menu instanceof p140i.MenuC1517i)) {
            super.inflate(i4, menu);
            return;
        }
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f6059c.getResources().getLayout(i4);
                    m3310b(xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (java.io.IOException e4) {
                    throw new android.view.InflateException("Error inflating menu XML", e4);
                }
            } catch (org.xmlpull.v1.XmlPullParserException e5) {
                throw new android.view.InflateException("Error inflating menu XML", e5);
            }
        } catch (java.lang.Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
