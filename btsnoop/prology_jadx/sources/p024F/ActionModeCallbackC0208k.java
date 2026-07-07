package p024F;

/* renamed from: F.k */
/* loaded from: classes.dex */
public final class ActionModeCallbackC0208k implements android.view.ActionMode.Callback {

    /* renamed from: a */
    public final android.view.ActionMode.Callback f576a;

    /* renamed from: b */
    public final android.widget.TextView f577b;

    /* renamed from: c */
    public java.lang.Class f578c;

    /* renamed from: d */
    public java.lang.reflect.Method f579d;

    /* renamed from: e */
    public boolean f580e;

    /* renamed from: f */
    public boolean f581f = false;

    public ActionModeCallbackC0208k(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
        this.f576a = callback;
        this.f577b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return this.f576a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.f576a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f576a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        android.widget.TextView textView = this.f577b;
        android.content.Context context = textView.getContext();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (!this.f581f) {
            this.f581f = true;
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f578c = cls;
                this.f579d = cls.getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                this.f580e = true;
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                this.f578c = null;
                this.f579d = null;
                this.f580e = false;
            }
        }
        try {
            java.lang.reflect.Method declaredMethod = (this.f580e && this.f578c.isInstance(menu)) ? this.f579d : menu.getClass().getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                android.view.MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, java.lang.Integer.valueOf(size));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (context instanceof android.app.Activity) {
                for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            java.lang.String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) arrayList.get(i4);
                android.view.MenuItem add = menu.add(0, 0, i4 + 100, resolveInfo2.loadLabel(packageManager));
                android.content.Intent putExtra = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof android.text.Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                android.content.pm.ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
        }
        return this.f576a.onPrepareActionMode(actionMode, menu);
    }
}
