package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SearchView extends p145j.AbstractC1629H implements p135h.InterfaceC1480a {

    /* renamed from: r0 */
    public static final p120d3.C1295e f3958r0;

    /* renamed from: A */
    public final androidx.appcompat.widget.SearchView.SearchAutoComplete f3959A;

    /* renamed from: B */
    public final android.view.View f3960B;

    /* renamed from: C */
    public final android.view.View f3961C;

    /* renamed from: D */
    public final android.view.View f3962D;

    /* renamed from: E */
    public final android.widget.ImageView f3963E;

    /* renamed from: F */
    public final android.widget.ImageView f3964F;

    /* renamed from: G */
    public final android.widget.ImageView f3965G;

    /* renamed from: H */
    public final android.widget.ImageView f3966H;

    /* renamed from: I */
    public final android.view.View f3967I;

    /* renamed from: J */
    public p145j.C1658f0 f3968J;

    /* renamed from: K */
    public final android.graphics.Rect f3969K;

    /* renamed from: L */
    public final android.graphics.Rect f3970L;

    /* renamed from: M */
    public final int[] f3971M;

    /* renamed from: N */
    public final int[] f3972N;

    /* renamed from: O */
    public final android.widget.ImageView f3973O;

    /* renamed from: P */
    public final android.graphics.drawable.Drawable f3974P;

    /* renamed from: Q */
    public final int f3975Q;

    /* renamed from: R */
    public final int f3976R;

    /* renamed from: S */
    public final android.content.Intent f3977S;

    /* renamed from: T */
    public final android.content.Intent f3978T;

    /* renamed from: U */
    public final java.lang.CharSequence f3979U;

    /* renamed from: V */
    public android.view.View.OnFocusChangeListener f3980V;

    /* renamed from: W */
    public android.view.View.OnClickListener f3981W;

    /* renamed from: a0 */
    public boolean f3982a0;

    /* renamed from: b0 */
    public boolean f3983b0;

    /* renamed from: c0 */
    public p027G.AbstractC0231b f3984c0;

    /* renamed from: d0 */
    public boolean f3985d0;

    /* renamed from: e0 */
    public java.lang.CharSequence f3986e0;

    /* renamed from: f0 */
    public boolean f3987f0;

    /* renamed from: g0 */
    public boolean f3988g0;

    /* renamed from: h0 */
    public int f3989h0;

    /* renamed from: i0 */
    public boolean f3990i0;

    /* renamed from: j0 */
    public java.lang.CharSequence f3991j0;

    /* renamed from: k0 */
    public boolean f3992k0;

    /* renamed from: l0 */
    public int f3993l0;

    /* renamed from: m0 */
    public android.app.SearchableInfo f3994m0;

    /* renamed from: n0 */
    public android.os.Bundle f3995n0;

    /* renamed from: o0 */
    public final p145j.RunnableC1643W f3996o0;

    /* renamed from: p0 */
    public final p145j.RunnableC1643W f3997p0;

    /* renamed from: q0 */
    public final java.util.WeakHashMap f3998q0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends p145j.AbstractC1671m {

        /* renamed from: o */
        public int f3999o;

        /* renamed from: p */
        public androidx.appcompat.widget.SearchView f4000p;

        /* renamed from: q */
        public boolean f4001q;

        /* renamed from: r */
        public final androidx.appcompat.widget.RunnableC1067c f4002r;

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4002r = new androidx.appcompat.widget.RunnableC1067c(this);
            this.f3999o = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            android.content.res.Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public final void m2309a() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            p120d3.C1295e c1295e = androidx.appcompat.widget.SearchView.f3958r0;
            c1295e.getClass();
            p120d3.C1295e.m3038a();
            java.lang.reflect.Method method = c1295e.f5180c;
            if (method != null) {
                try {
                    method.invoke(this, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3999o <= 0 || super.enoughToFilter();
        }

        @Override // p145j.AbstractC1671m, android.widget.TextView, android.view.View
        public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4001q) {
                androidx.appcompat.widget.RunnableC1067c runnableC1067c = this.f4002r;
                removeCallbacks(runnableC1067c);
                post(runnableC1067c);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) android.util.TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i4, android.graphics.Rect rect) {
            super.onFocusChanged(z4, i4, rect);
            androidx.appcompat.widget.SearchView searchView = this.f4000p;
            searchView.m2308u(searchView.f3983b0);
            searchView.post(searchView.f3996o0);
            if (searchView.f3959A.hasFocus()) {
                searchView.m2297j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i4, android.view.KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4000p.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f4000p.hasFocus() && getVisibility() == 0) {
                this.f4001q = true;
                android.content.Context context = getContext();
                p120d3.C1295e c1295e = androidx.appcompat.widget.SearchView.f3958r0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m2309a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(java.lang.CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            androidx.appcompat.widget.RunnableC1067c runnableC1067c = this.f4002r;
            if (!z4) {
                this.f4001q = false;
                removeCallbacks(runnableC1067c);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4001q = true;
                    return;
                }
                this.f4001q = false;
                removeCallbacks(runnableC1067c);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(androidx.appcompat.widget.SearchView searchView) {
            this.f4000p = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f3999o = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d3.e, java.lang.Object] */
    static {
        p120d3.C1295e c1295e = null;
        if (android.os.Build.VERSION.SDK_INT < 29) {
            ?? obj = new java.lang.Object();
            obj.f5178a = null;
            obj.f5179b = null;
            obj.f5180c = null;
            p120d3.C1295e.m3038a();
            try {
                java.lang.reflect.Method declaredMethod = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f5178a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            try {
                java.lang.reflect.Method declaredMethod2 = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f5179b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            try {
                java.lang.reflect.Method method = android.widget.AutoCompleteTextView.class.getMethod("ensureImeVisible", java.lang.Boolean.TYPE);
                obj.f5180c = method;
                method.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused3) {
            }
            c1295e = obj;
        }
        f3958r0 = c1295e;
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(com.prology.R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(com.prology.R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(android.text.TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3988g0 = true;
        super.clearFocus();
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3988g0 = false;
    }

    public int getImeOptions() {
        return this.f3959A.getImeOptions();
    }

    public int getInputType() {
        return this.f3959A.getInputType();
    }

    public int getMaxWidth() {
        return this.f3989h0;
    }

    public java.lang.CharSequence getQuery() {
        return this.f3959A.getText();
    }

    public java.lang.CharSequence getQueryHint() {
        java.lang.CharSequence charSequence = this.f3986e0;
        if (charSequence != null) {
            return charSequence;
        }
        android.app.SearchableInfo searchableInfo = this.f3994m0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3979U : getContext().getText(this.f3994m0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3976R;
    }

    public int getSuggestionRowLayout() {
        return this.f3975Q;
    }

    public p027G.AbstractC0231b getSuggestionsAdapter() {
        return this.f3984c0;
    }

    /* renamed from: h */
    public final android.content.Intent m2295h(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3991j0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        android.os.Bundle bundle = this.f3995n0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3994m0.getSearchActivity());
        return intent;
    }

    /* renamed from: i */
    public final android.content.Intent m2296i(android.content.Intent intent, android.app.SearchableInfo searchableInfo) {
        android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.f3995n0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        android.content.Intent intent3 = new android.content.Intent(intent);
        android.content.res.Resources resources = getResources();
        java.lang.String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        java.lang.String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        java.lang.String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: j */
    public final void m2297j() {
        int i4 = android.os.Build.VERSION.SDK_INT;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        if (i4 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        p120d3.C1295e c1295e = f3958r0;
        c1295e.getClass();
        p120d3.C1295e.m3038a();
        java.lang.reflect.Method method = c1295e.f5178a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (java.lang.Exception unused) {
            }
        }
        p120d3.C1295e.m3038a();
        java.lang.reflect.Method method2 = c1295e.f5179b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    /* renamed from: k */
    public final void m2298k() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        if (!android.text.TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f3982a0) {
            clearFocus();
            m2308u(true);
        }
    }

    /* renamed from: l */
    public final void m2299l(int i4) {
        int i5;
        java.lang.String m3599h;
        android.database.Cursor cursor = this.f3984c0.f664n;
        if (cursor != null && cursor.moveToPosition(i4)) {
            android.content.Intent intent = null;
            try {
                int i6 = p145j.ViewOnClickListenerC1662h0.f6913I;
                java.lang.String m3599h2 = p145j.ViewOnClickListenerC1662h0.m3599h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (m3599h2 == null) {
                    m3599h2 = this.f3994m0.getSuggestIntentAction();
                }
                if (m3599h2 == null) {
                    m3599h2 = "android.intent.action.SEARCH";
                }
                java.lang.String m3599h3 = p145j.ViewOnClickListenerC1662h0.m3599h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m3599h3 == null) {
                    m3599h3 = this.f3994m0.getSuggestIntentData();
                }
                if (m3599h3 != null && (m3599h = p145j.ViewOnClickListenerC1662h0.m3599h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    m3599h3 = m3599h3 + "/" + android.net.Uri.encode(m3599h);
                }
                intent = m2295h(m3599h2, m3599h3 == null ? null : android.net.Uri.parse(m3599h3), p145j.ViewOnClickListenerC1662h0.m3599h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), p145j.ViewOnClickListenerC1662h0.m3599h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (java.lang.RuntimeException e4) {
                try {
                    i5 = cursor.getPosition();
                } catch (java.lang.RuntimeException unused) {
                    i5 = -1;
                }
                android.util.Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (java.lang.RuntimeException e5) {
                    android.util.Log.e("SearchView", "Failed launch activity: " + intent, e5);
                }
            }
        }
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: m */
    public final void m2300m(int i4) {
        android.text.Editable text = this.f3959A.getText();
        android.database.Cursor cursor = this.f3984c0.f664n;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        java.lang.String mo614c = this.f3984c0.mo614c(cursor);
        if (mo614c != null) {
            setQuery(mo614c);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: n */
    public final void m2301n(java.lang.CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: o */
    public final void m2302o() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        android.text.Editable text = searchAutoComplete.getText();
        if (text == null || android.text.TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3994m0 != null) {
            getContext().startActivity(m2295h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3996o0);
        post(this.f3997p0);
        super.onDetachedFromWindow();
    }

    @Override // p145j.AbstractC1629H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            int[] iArr = this.f3971M;
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3972N;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            android.graphics.Rect rect = this.f3969K;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            android.graphics.Rect rect2 = this.f3970L;
            rect2.set(i10, 0, i11, i12);
            p145j.C1658f0 c1658f0 = this.f3968J;
            if (c1658f0 == null) {
                p145j.C1658f0 c1658f02 = new p145j.C1658f0(rect2, rect, searchAutoComplete);
                this.f3968J = c1658f02;
                setTouchDelegate(c1658f02);
            } else {
                c1658f0.f6901b.set(rect2);
                android.graphics.Rect rect3 = c1658f0.f6903d;
                rect3.set(rect2);
                int i13 = -c1658f0.f6904e;
                rect3.inset(i13, i13);
                c1658f0.f6902c.set(rect);
            }
        }
    }

    @Override // p145j.AbstractC1629H, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f3983b0) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i4);
        int size = android.view.View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f3989h0;
            size = i7 > 0 ? java.lang.Math.min(i7, size) : java.lang.Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3989h0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f3989h0) > 0) {
            size = java.lang.Math.min(i6, size);
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i5);
        int size2 = android.view.View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = java.lang.Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof p145j.C1656e0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p145j.C1656e0 c1656e0 = (p145j.C1656e0) parcelable;
        super.onRestoreInstanceState(c1656e0.f709l);
        m2308u(c1656e0.f6897n);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, H.c, j.e0] */
    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        ?? abstractC0243c = new p031H.AbstractC0243c(super.onSaveInstanceState());
        abstractC0243c.f6897n = this.f3983b0;
        return abstractC0243c;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f3996o0);
    }

    /* renamed from: p */
    public final void m2303p() {
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f3959A.getText());
        int i4 = (!isEmpty || (this.f3982a0 && !this.f3992k0)) ? 0 : 8;
        android.widget.ImageView imageView = this.f3965G;
        imageView.setVisibility(i4);
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? android.view.ViewGroup.ENABLED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: q */
    public final void m2304q() {
        int[] iArr = this.f3959A.hasFocus() ? android.view.ViewGroup.FOCUSED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.f3961C.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.f3962D.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: r */
    public final void m2305r() {
        android.graphics.drawable.Drawable drawable;
        java.lang.CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z4 = this.f3982a0;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        if (z4 && (drawable = this.f3974P) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, android.graphics.Rect rect) {
        if (this.f3988g0 || !isFocusable()) {
            return false;
        }
        if (this.f3983b0) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.f3959A.requestFocus(i4, rect);
        if (requestFocus) {
            m2308u(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public final void m2306s() {
        this.f3962D.setVisibility(((this.f3985d0 || this.f3990i0) && !this.f3983b0 && (this.f3964F.getVisibility() == 0 || this.f3966H.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(android.os.Bundle bundle) {
        this.f3995n0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            m2298k();
            return;
        }
        m2308u(false);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        android.view.View.OnClickListener onClickListener = this.f3981W;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f3982a0 == z4) {
            return;
        }
        this.f3982a0 = z4;
        m2308u(z4);
        m2305r();
    }

    public void setImeOptions(int i4) {
        this.f3959A.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f3959A.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f3989h0 = i4;
        requestLayout();
    }

    public void setOnCloseListener(p145j.InterfaceC1650b0 interfaceC1650b0) {
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f3980V = onFocusChangeListener;
    }

    public void setOnQueryTextListener(p145j.InterfaceC1652c0 interfaceC1652c0) {
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onClickListener) {
        this.f3981W = onClickListener;
    }

    public void setOnSuggestionListener(p145j.InterfaceC1654d0 interfaceC1654d0) {
    }

    public void setQueryHint(java.lang.CharSequence charSequence) {
        this.f3986e0 = charSequence;
        m2305r();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f3987f0 = z4;
        p027G.AbstractC0231b abstractC0231b = this.f3984c0;
        if (abstractC0231b instanceof p145j.ViewOnClickListenerC1662h0) {
            ((p145j.ViewOnClickListenerC1662h0) abstractC0231b).f6914A = z4 ? 2 : 1;
        }
    }

    public void setSearchableInfo(android.app.SearchableInfo searchableInfo) {
        this.f3994m0 = searchableInfo;
        android.content.Intent intent = null;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f3959A;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f3994m0.getImeOptions());
            int inputType = this.f3994m0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f3994m0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            p027G.AbstractC0231b abstractC0231b = this.f3984c0;
            if (abstractC0231b != null) {
                abstractC0231b.mo613b(null);
            }
            if (this.f3994m0.getSuggestAuthority() != null) {
                p145j.ViewOnClickListenerC1662h0 viewOnClickListenerC1662h0 = new p145j.ViewOnClickListenerC1662h0(getContext(), this, this.f3994m0, this.f3998q0);
                this.f3984c0 = viewOnClickListenerC1662h0;
                searchAutoComplete.setAdapter(viewOnClickListenerC1662h0);
                ((p145j.ViewOnClickListenerC1662h0) this.f3984c0).f6914A = this.f3987f0 ? 2 : 1;
            }
            m2305r();
        }
        android.app.SearchableInfo searchableInfo2 = this.f3994m0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3994m0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3977S;
            } else if (this.f3994m0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f3978T;
            }
            if (intent != null) {
                z4 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f3990i0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        m2308u(this.f3983b0);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f3985d0 = z4;
        m2308u(this.f3983b0);
    }

    public void setSuggestionsAdapter(p027G.AbstractC0231b abstractC0231b) {
        this.f3984c0 = abstractC0231b;
        this.f3959A.setAdapter(abstractC0231b);
    }

    /* renamed from: t */
    public final void m2307t(boolean z4) {
        boolean z5 = this.f3985d0;
        this.f3964F.setVisibility((!z5 || !(z5 || this.f3990i0) || this.f3983b0 || !hasFocus() || (!z4 && this.f3990i0)) ? 8 : 0);
    }

    /* renamed from: u */
    public final void m2308u(boolean z4) {
        this.f3983b0 = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f3959A.getText());
        this.f3963E.setVisibility(i5);
        m2307t(!isEmpty);
        this.f3960B.setVisibility(z4 ? 8 : 0);
        android.widget.ImageView imageView = this.f3973O;
        imageView.setVisibility((imageView.getDrawable() == null || this.f3982a0) ? 8 : 0);
        m2303p();
        if (this.f3990i0 && !this.f3983b0 && isEmpty) {
            this.f3964F.setVisibility(8);
            i4 = 0;
        }
        this.f3966H.setVisibility(i4);
        m2306s();
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.prology.R.attr.searchViewStyle);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3969K = new android.graphics.Rect();
        this.f3970L = new android.graphics.Rect();
        this.f3971M = new int[2];
        this.f3972N = new int[2];
        this.f3996o0 = new p145j.RunnableC1643W(this, 0);
        this.f3997p0 = new p145j.RunnableC1643W(this, 1);
        this.f3998q0 = new java.util.WeakHashMap();
        androidx.appcompat.widget.ViewOnClickListenerC1065a viewOnClickListenerC1065a = new androidx.appcompat.widget.ViewOnClickListenerC1065a(this);
        androidx.appcompat.widget.ViewOnKeyListenerC1066b viewOnKeyListenerC1066b = new androidx.appcompat.widget.ViewOnKeyListenerC1066b(this);
        p145j.C1646Z c1646z = new p145j.C1646Z(this);
        p145j.C1648a0 c1648a0 = new p145j.C1648a0(this);
        p145j.C1630I c1630i = new p145j.C1630I(1, this);
        p145j.C1642V c1642v = new p145j.C1642V(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p121e.AbstractC1299a.f5201q, i4, 0);
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(context, obtainStyledAttributes);
        android.view.LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, com.prology.R.layout.abc_search_view), (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = (androidx.appcompat.widget.SearchView.SearchAutoComplete) findViewById(com.prology.R.id.search_src_text);
        this.f3959A = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3960B = findViewById(com.prology.R.id.search_edit_frame);
        android.view.View findViewById = findViewById(com.prology.R.id.search_plate);
        this.f3961C = findViewById;
        android.view.View findViewById2 = findViewById(com.prology.R.id.submit_area);
        this.f3962D = findViewById2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.prology.R.id.search_button);
        this.f3963E = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.prology.R.id.search_go_btn);
        this.f3964F = imageView2;
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.prology.R.id.search_close_btn);
        this.f3965G = imageView3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.prology.R.id.search_voice_btn);
        this.f3966H = imageView4;
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(com.prology.R.id.search_mag_icon);
        this.f3973O = imageView5;
        findViewById.setBackground(c1061t.m2225g0(10));
        findViewById2.setBackground(c1061t.m2225g0(14));
        imageView.setImageDrawable(c1061t.m2225g0(13));
        imageView2.setImageDrawable(c1061t.m2225g0(7));
        imageView3.setImageDrawable(c1061t.m2225g0(4));
        imageView4.setImageDrawable(c1061t.m2225g0(16));
        imageView5.setImageDrawable(c1061t.m2225g0(13));
        this.f3974P = c1061t.m2225g0(12);
        imageView.setTooltipText(getResources().getString(com.prology.R.string.abc_searchview_description_search));
        this.f3975Q = obtainStyledAttributes.getResourceId(15, com.prology.R.layout.abc_search_dropdown_item_icons_2line);
        this.f3976R = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(viewOnClickListenerC1065a);
        imageView3.setOnClickListener(viewOnClickListenerC1065a);
        imageView2.setOnClickListener(viewOnClickListenerC1065a);
        imageView4.setOnClickListener(viewOnClickListenerC1065a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC1065a);
        searchAutoComplete.addTextChangedListener(c1642v);
        searchAutoComplete.setOnEditorActionListener(c1646z);
        searchAutoComplete.setOnItemClickListener(c1648a0);
        searchAutoComplete.setOnItemSelectedListener(c1630i);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC1066b);
        searchAutoComplete.setOnFocusChangeListener(new p145j.ViewOnFocusChangeListenerC1644X(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f3979U = obtainStyledAttributes.getText(6);
        this.f3986e0 = obtainStyledAttributes.getText(11);
        int i5 = obtainStyledAttributes.getInt(3, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i6 = obtainStyledAttributes.getInt(2, -1);
        if (i6 != -1) {
            setInputType(i6);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        c1061t.m2243u0();
        android.content.Intent intent = new android.content.Intent("android.speech.action.WEB_SEARCH");
        this.f3977S = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        android.content.Intent intent2 = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3978T = intent2;
        intent2.addFlags(268435456);
        android.view.View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3967I = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new p145j.ViewOnLayoutChangeListenerC1645Y(this));
        }
        m2308u(this.f3982a0);
        m2305r();
    }
}
