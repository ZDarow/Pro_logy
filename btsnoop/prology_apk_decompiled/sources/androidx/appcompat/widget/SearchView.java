package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.prology.R;
import d3.e;
import e.AbstractC0248a;
import h.InterfaceC0312a;
import j.AbstractC0358m;
import j.H;
import j.I;
import j.V;
import j.W;
import j.X;
import j.Y;
import j.Z;
import j.a0;
import j.b0;
import j.c0;
import j.d0;
import j.e0;
import j.f0;
import j.h0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends H implements InterfaceC0312a {

    /* renamed from: r0, reason: collision with root package name */
    public static final e f3821r0;

    /* renamed from: A, reason: collision with root package name */
    public final SearchAutoComplete f3822A;

    /* renamed from: B, reason: collision with root package name */
    public final View f3823B;

    /* renamed from: C, reason: collision with root package name */
    public final View f3824C;

    /* renamed from: D, reason: collision with root package name */
    public final View f3825D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f3826E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f3827F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f3828G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f3829H;

    /* renamed from: I, reason: collision with root package name */
    public final View f3830I;
    public f0 J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f3831K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f3832L;

    /* renamed from: M, reason: collision with root package name */
    public final int[] f3833M;

    /* renamed from: N, reason: collision with root package name */
    public final int[] f3834N;

    /* renamed from: O, reason: collision with root package name */
    public final ImageView f3835O;

    /* renamed from: P, reason: collision with root package name */
    public final Drawable f3836P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f3837Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f3838R;

    /* renamed from: S, reason: collision with root package name */
    public final Intent f3839S;

    /* renamed from: T, reason: collision with root package name */
    public final Intent f3840T;

    /* renamed from: U, reason: collision with root package name */
    public final CharSequence f3841U;

    /* renamed from: V, reason: collision with root package name */
    public View.OnFocusChangeListener f3842V;

    /* renamed from: W, reason: collision with root package name */
    public View.OnClickListener f3843W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3844a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3845b0;

    /* renamed from: c0, reason: collision with root package name */
    public G.b f3846c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3847d0;

    /* renamed from: e0, reason: collision with root package name */
    public CharSequence f3848e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3849f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f3850g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f3851h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f3852i0;

    /* renamed from: j0, reason: collision with root package name */
    public CharSequence f3853j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f3854k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f3855l0;

    /* renamed from: m0, reason: collision with root package name */
    public SearchableInfo f3856m0;

    /* renamed from: n0, reason: collision with root package name */
    public Bundle f3857n0;

    /* renamed from: o0, reason: collision with root package name */
    public final W f3858o0;

    /* renamed from: p0, reason: collision with root package name */
    public final W f3859p0;

    /* renamed from: q0, reason: collision with root package name */
    public final WeakHashMap f3860q0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AbstractC0358m {

        /* renamed from: o, reason: collision with root package name */
        public int f3861o;

        /* renamed from: p, reason: collision with root package name */
        public SearchView f3862p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f3863q;

        /* renamed from: r, reason: collision with root package name */
        public final c f3864r;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3864r = new c(this);
            this.f3861o = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
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

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            e eVar = SearchView.f3821r0;
            eVar.getClass();
            e.a();
            Method method = eVar.f4993c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3861o <= 0 || super.enoughToFilter();
        }

        @Override // j.AbstractC0358m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3863q) {
                c cVar = this.f3864r;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i4, Rect rect) {
            super.onFocusChanged(z4, i4, rect);
            SearchView searchView = this.f3862p;
            searchView.u(searchView.f3845b0);
            searchView.post(searchView.f3858o0);
            if (searchView.f3822A.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3862p.clearFocus();
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
            if (z4 && this.f3862p.hasFocus() && getVisibility() == 0) {
                this.f3863q = true;
                Context context = getContext();
                e eVar = SearchView.f3821r0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f3864r;
            if (!z4) {
                this.f3863q = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3863q = true;
                    return;
                }
                this.f3863q = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3862p = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f3861o = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d3.e, java.lang.Object] */
    static {
        e eVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f4991a = null;
            obj.f4992b = null;
            obj.f4993c = null;
            e.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f4991a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f4992b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f4993c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            eVar = obj;
        }
        f3821r0 = eVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f3822A;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3850g0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3822A;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3850g0 = false;
    }

    public int getImeOptions() {
        return this.f3822A.getImeOptions();
    }

    public int getInputType() {
        return this.f3822A.getInputType();
    }

    public int getMaxWidth() {
        return this.f3851h0;
    }

    public CharSequence getQuery() {
        return this.f3822A.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3848e0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3856m0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3841U : getContext().getText(this.f3856m0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3838R;
    }

    public int getSuggestionRowLayout() {
        return this.f3837Q;
    }

    public G.b getSuggestionsAdapter() {
        return this.f3846c0;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3853j0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3857n0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3856m0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3857n0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
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

    public final void j() {
        int i4 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f3822A;
        if (i4 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        e eVar = f3821r0;
        eVar.getClass();
        e.a();
        Method method = eVar.f4991a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        e.a();
        Method method2 = eVar.f4992b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f3822A;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f3844a0) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i4) {
        int i5;
        String h4;
        Cursor cursor = this.f3846c0.f654n;
        if (cursor != null && cursor.moveToPosition(i4)) {
            Intent intent = null;
            try {
                int i6 = h0.f6659I;
                String h5 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h5 == null) {
                    h5 = this.f3856m0.getSuggestIntentAction();
                }
                if (h5 == null) {
                    h5 = "android.intent.action.SEARCH";
                }
                String h6 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h6 == null) {
                    h6 = this.f3856m0.getSuggestIntentData();
                }
                if (h6 != null && (h4 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h6 = h6 + "/" + Uri.encode(h4);
                }
                intent = h(h5, h6 == null ? null : Uri.parse(h6), h0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), h0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e4) {
                try {
                    i5 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i5 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e5) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e5);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3822A;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i4) {
        Editable text = this.f3822A.getText();
        Cursor cursor = this.f3846c0.f654n;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        String c4 = this.f3846c0.c(cursor);
        if (c4 != null) {
            setQuery(c4);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f3822A;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3856m0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3858o0);
        post(this.f3859p0);
        super.onDetachedFromWindow();
    }

    @Override // j.H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            int[] iArr = this.f3833M;
            SearchAutoComplete searchAutoComplete = this.f3822A;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3834N;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.f3831K;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            Rect rect2 = this.f3832L;
            rect2.set(i10, 0, i11, i12);
            f0 f0Var = this.J;
            if (f0Var == null) {
                f0 f0Var2 = new f0(rect2, rect, searchAutoComplete);
                this.J = f0Var2;
                setTouchDelegate(f0Var2);
            } else {
                f0Var.f6647b.set(rect2);
                Rect rect3 = f0Var.f6649d;
                rect3.set(rect2);
                int i13 = -f0Var.f6650e;
                rect3.inset(i13, i13);
                f0Var.f6648c.set(rect);
            }
        }
    }

    @Override // j.H, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f3845b0) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f3851h0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3851h0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f3851h0) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e0 e0Var = (e0) parcelable;
        super.onRestoreInstanceState(e0Var.f698l);
        u(e0Var.f6643n);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, H.c, j.e0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? cVar = new H.c(super.onSaveInstanceState());
        cVar.f6643n = this.f3845b0;
        return cVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f3858o0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f3822A.getText());
        int i4 = (!isEmpty || (this.f3844a0 && !this.f3854k0)) ? 0 : 8;
        ImageView imageView = this.f3828G;
        imageView.setVisibility(i4);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f3822A.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3824C.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3825D.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z4 = this.f3844a0;
        SearchAutoComplete searchAutoComplete = this.f3822A;
        if (z4 && (drawable = this.f3836P) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (this.f3850g0 || !isFocusable()) {
            return false;
        }
        if (this.f3845b0) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.f3822A.requestFocus(i4, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f3825D.setVisibility(((this.f3847d0 || this.f3852i0) && !this.f3845b0 && (this.f3827F.getVisibility() == 0 || this.f3829H.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3857n0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f3822A;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3843W;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f3844a0 == z4) {
            return;
        }
        this.f3844a0 = z4;
        u(z4);
        r();
    }

    public void setImeOptions(int i4) {
        this.f3822A.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f3822A.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f3851h0 = i4;
        requestLayout();
    }

    public void setOnCloseListener(b0 b0Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3842V = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c0 c0Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3843W = onClickListener;
    }

    public void setOnSuggestionListener(d0 d0Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3848e0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f3849f0 = z4;
        G.b bVar = this.f3846c0;
        if (bVar instanceof h0) {
            ((h0) bVar).f6660A = z4 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3856m0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f3822A;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f3856m0.getImeOptions());
            int inputType = this.f3856m0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f3856m0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            G.b bVar = this.f3846c0;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f3856m0.getSuggestAuthority() != null) {
                h0 h0Var = new h0(getContext(), this, this.f3856m0, this.f3860q0);
                this.f3846c0 = h0Var;
                searchAutoComplete.setAdapter(h0Var);
                ((h0) this.f3846c0).f6660A = this.f3849f0 ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f3856m0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3856m0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3839S;
            } else if (this.f3856m0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f3840T;
            }
            if (intent != null) {
                z4 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f3852i0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f3845b0);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f3847d0 = z4;
        u(this.f3845b0);
    }

    public void setSuggestionsAdapter(G.b bVar) {
        this.f3846c0 = bVar;
        this.f3822A.setAdapter(bVar);
    }

    public final void t(boolean z4) {
        boolean z5 = this.f3847d0;
        this.f3827F.setVisibility((!z5 || !(z5 || this.f3852i0) || this.f3845b0 || !hasFocus() || (!z4 && this.f3852i0)) ? 8 : 0);
    }

    public final void u(boolean z4) {
        this.f3845b0 = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f3822A.getText());
        this.f3826E.setVisibility(i5);
        t(!isEmpty);
        this.f3823B.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.f3835O;
        imageView.setVisibility((imageView.getDrawable() == null || this.f3844a0) ? 8 : 0);
        p();
        if (this.f3852i0 && !this.f3845b0 && isEmpty) {
            this.f3827F.setVisibility(8);
            i4 = 0;
        }
        this.f3829H.setVisibility(i4);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3831K = new Rect();
        this.f3832L = new Rect();
        this.f3833M = new int[2];
        this.f3834N = new int[2];
        this.f3858o0 = new W(this, 0);
        this.f3859p0 = new W(this, 1);
        this.f3860q0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        Z z4 = new Z(this);
        a0 a0Var = new a0(this);
        I i5 = new I(1, this);
        V v4 = new V(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0248a.f5014q, i4, 0);
        t tVar = new t(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f3822A = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3823B = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f3824C = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f3825D = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f3826E = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f3827F = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f3828G = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f3829H = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f3835O = imageView5;
        findViewById.setBackground(tVar.g0(10));
        findViewById2.setBackground(tVar.g0(14));
        imageView.setImageDrawable(tVar.g0(13));
        imageView2.setImageDrawable(tVar.g0(7));
        imageView3.setImageDrawable(tVar.g0(4));
        imageView4.setImageDrawable(tVar.g0(16));
        imageView5.setImageDrawable(tVar.g0(13));
        this.f3836P = tVar.g0(12);
        imageView.setTooltipText(getResources().getString(R.string.abc_searchview_description_search));
        this.f3837Q = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f3838R = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(v4);
        searchAutoComplete.setOnEditorActionListener(z4);
        searchAutoComplete.setOnItemClickListener(a0Var);
        searchAutoComplete.setOnItemSelectedListener(i5);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new X(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f3841U = obtainStyledAttributes.getText(6);
        this.f3848e0 = obtainStyledAttributes.getText(11);
        int i6 = obtainStyledAttributes.getInt(3, -1);
        if (i6 != -1) {
            setImeOptions(i6);
        }
        int i7 = obtainStyledAttributes.getInt(2, -1);
        if (i7 != -1) {
            setInputType(i7);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        tVar.u0();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3839S = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3840T = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3830I = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new Y(this));
        }
        u(this.f3844a0);
        r();
    }
}
