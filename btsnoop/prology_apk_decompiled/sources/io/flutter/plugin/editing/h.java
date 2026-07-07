package io.flutter.plugin.editing;

import B2.r;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final r f6287a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f6288b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f6289c;

    /* renamed from: d, reason: collision with root package name */
    public K2.k f6290d;

    public h(TextServicesManager textServicesManager, r rVar) {
        this.f6288b = textServicesManager;
        this.f6287a = rVar;
        rVar.f185m = this;
    }

    public final void a(String str, String str2, K2.k kVar) {
        if (this.f6290d != null) {
            kVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f6290d = kVar;
        Locale a4 = M2.a.a(str);
        if (this.f6289c == null) {
            this.f6289c = this.f6288b.newSpellCheckerSession(null, a4, this, true);
        }
        this.f6289c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f6290d.b(new ArrayList());
            this.f6290d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f6290d.b(new ArrayList());
            this.f6290d = null;
            return;
        }
        for (int i4 = 0; i4 < sentenceSuggestionsInfo.getSuggestionsCount(); i4++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i4);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i4);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i4) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = false;
                for (int i5 = 0; i5 < suggestionsCount; i5++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i5);
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
        this.f6290d.b(arrayList);
        this.f6290d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
