package io.flutter.plugin.editing;

/* renamed from: io.flutter.plugin.editing.h */
/* loaded from: classes.dex */
public final class SpellCheckerSessionSpellCheckerSessionListenerC1572h implements android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a */
    public final p009B2.C0061r f6522a;

    /* renamed from: b */
    public final android.view.textservice.TextServicesManager f6523b;

    /* renamed from: c */
    public android.view.textservice.SpellCheckerSession f6524c;

    /* renamed from: d */
    public p043K2.C0335k f6525d;

    public SpellCheckerSessionSpellCheckerSessionListenerC1572h(android.view.textservice.TextServicesManager textServicesManager, p009B2.C0061r c0061r) {
        this.f6523b = textServicesManager;
        this.f6522a = c0061r;
        c0061r.f188m = this;
    }

    /* renamed from: a */
    public final void m3493a(java.lang.String str, java.lang.String str2, p043K2.C0335k c0335k) {
        if (this.f6525d != null) {
            c0335k.mo741a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f6525d = c0335k;
        java.util.Locale m903a = p051M2.C0428a.m903a(str);
        if (this.f6524c == null) {
            this.f6524c = this.f6523b.newSpellCheckerSession(null, m903a, this, true);
        }
        this.f6524c.getSentenceSuggestions(new android.view.textservice.TextInfo[]{new android.view.textservice.TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f6525d.mo742b(new java.util.ArrayList());
            this.f6525d = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.textservice.SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f6525d.mo742b(new java.util.ArrayList());
            this.f6525d = null;
            return;
        }
        for (int i4 = 0; i4 < sentenceSuggestionsInfo.getSuggestionsCount(); i4++) {
            android.view.textservice.SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i4);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i4);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i4) + offsetAt;
                hashMap.put("startIndex", java.lang.Integer.valueOf(offsetAt));
                hashMap.put("endIndex", java.lang.Integer.valueOf(lengthAt));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z4 = false;
                for (int i5 = 0; i5 < suggestionsCount; i5++) {
                    java.lang.String suggestionAt = suggestionsInfoAt.getSuggestionAt(i5);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z4 = true;
                    }
                }
                if (z4) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f6525d.mo742b(arrayList);
        this.f6525d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(android.view.textservice.SuggestionsInfo[] suggestionsInfoArr) {
    }
}
