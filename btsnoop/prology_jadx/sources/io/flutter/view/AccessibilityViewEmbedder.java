package io.flutter.view;

/* JADX INFO: Access modifiers changed from: package-private */
@androidx.annotation.Keep
/* loaded from: classes.dex */
public class AccessibilityViewEmbedder {
    private static final java.lang.String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final android.view.View rootAccessibilityView;
    private final io.flutter.view.C1614k reflectionAccessors = new io.flutter.view.C1614k();
    private final android.util.SparseArray<io.flutter.view.C1615l> flutterIdToOrigin = new android.util.SparseArray<>();
    private final java.util.Map<io.flutter.view.C1615l, java.lang.Integer> originToFlutterId = new java.util.HashMap();
    private final java.util.Map<android.view.View, android.graphics.Rect> embeddedViewToDisplayBounds = new java.util.HashMap();

    public AccessibilityViewEmbedder(android.view.View view, int i4) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo r7, android.view.View r8, android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            r6 = this;
            r0 = 0
        L1:
            int r1 = r7.getChildCount()
            if (r0 >= r1) goto L9a
            io.flutter.view.k r1 = r6.reflectionAccessors
            java.lang.reflect.Method r2 = r1.f6786f
            r3 = 0
            java.lang.reflect.Field r4 = r1.f6785e
            java.lang.reflect.Method r1 = r1.f6784d
            if (r1 != 0) goto L17
            if (r4 == 0) goto L62
            if (r2 != 0) goto L17
            goto L62
        L17:
            java.lang.String r5 = "AccessibilityBridge"
            if (r1 == 0) goto L3b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            java.lang.Object r1 = r1.invoke(r7, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
        L29:
            r3 = r1
            goto L62
        L2b:
            r1 = move-exception
            goto L2f
        L2d:
            r1 = move-exception
            goto L35
        L2f:
            java.lang.String r2 = "The getChildId method threw an exception when invoked."
            android.util.Log.w(r5, r2, r1)
            goto L62
        L35:
            java.lang.String r2 = "Failed to access getChildId method."
            android.util.Log.w(r5, r2, r1)
            goto L62
        L3b:
            java.lang.Object r1 = r4.get(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Object r1 = r2.invoke(r1, r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            r1.getClass()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            goto L29
        L51:
            r1 = move-exception
            goto L57
        L53:
            r1 = move-exception
            goto L57
        L55:
            r1 = move-exception
            goto L5d
        L57:
            java.lang.String r2 = "The longArrayGetIndex method threw an exception when invoked."
            android.util.Log.w(r5, r2, r1)
            goto L62
        L5d:
            java.lang.String r2 = "Failed to access longArrayGetIndex method or the childNodeId field."
            android.util.Log.w(r5, r2, r1)
        L62:
            if (r3 != 0) goto L65
            goto L96
        L65:
            long r1 = r3.longValue()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            io.flutter.view.l r2 = new io.flutter.view.l
            r2.<init>(r8, r1)
            java.util.Map<io.flutter.view.l, java.lang.Integer> r3 = r6.originToFlutterId
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L87
            java.util.Map<io.flutter.view.l, java.lang.Integer> r1 = r6.originToFlutterId
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L91
        L87:
            int r2 = r6.nextFlutterId
            int r3 = r2 + 1
            r6.nextFlutterId = r3
            r6.cacheVirtualIdMappings(r8, r1, r2)
            r1 = r2
        L91:
            android.view.View r2 = r6.rootAccessibilityView
            r9.addChild(r2, r1)
        L96:
            int r0 = r0 + 1
            goto L1
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void cacheVirtualIdMappings(android.view.View view, int i4, int i5) {
        io.flutter.view.C1615l c1615l = new io.flutter.view.C1615l(view, i4);
        this.originToFlutterId.put(c1615l, java.lang.Integer.valueOf(i5));
        this.flutterIdToOrigin.put(i5, c1615l);
    }

    private android.view.accessibility.AccessibilityNodeInfo convertToFlutterNode(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i4, android.view.View view) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i4);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i4);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        android.graphics.Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
        accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
        accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo r6, android.view.View r7, android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r5 = this;
            io.flutter.view.k r0 = r5.reflectionAccessors
            java.lang.String r1 = "AccessibilityBridge"
            java.lang.reflect.Method r0 = r0.f6782b
            r2 = 0
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
            r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
            goto L68
        L13:
            r0 = move-exception
            goto L17
        L15:
            r0 = move-exception
            goto L1d
        L17:
            java.lang.String r3 = "The getParentNodeId method threw an exception when invoked."
            android.util.Log.w(r1, r3, r0)
            goto L22
        L1d:
            java.lang.String r3 = "Failed to access getParentNodeId method."
            android.util.Log.w(r1, r3, r0)
        L22:
            android.view.accessibility.AccessibilityNodeInfo r6 = android.view.accessibility.AccessibilityNodeInfo.obtain(r6)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r0.setDataPosition(r1)
            r6.writeToParcel(r0, r1)
            r0.setDataPosition(r1)
            long r3 = r0.readLong()
            boolean r6 = io.flutter.view.C1614k.m3570b(r3, r1)
            if (r6 == 0) goto L41
            r0.readInt()
        L41:
            r6 = 1
            boolean r6 = io.flutter.view.C1614k.m3570b(r3, r6)
            if (r6 == 0) goto L4b
            r0.readLong()
        L4b:
            r6 = 2
            boolean r6 = io.flutter.view.C1614k.m3570b(r3, r6)
            if (r6 == 0) goto L55
            r0.readInt()
        L55:
            r6 = 3
            boolean r6 = io.flutter.view.C1614k.m3570b(r3, r6)
            if (r6 == 0) goto L64
            long r1 = r0.readLong()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L64:
            r0.recycle()
            r0 = r2
        L68:
            if (r0 != 0) goto L6b
            return
        L6b:
            long r0 = r0.longValue()
            r6 = 32
            long r0 = r0 >> r6
            int r6 = (int) r0
            java.util.Map<io.flutter.view.l, java.lang.Integer> r0 = r5.originToFlutterId
            io.flutter.view.l r1 = new io.flutter.view.l
            r1.<init>(r7, r6)
            java.lang.Object r6 = r0.get(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L8b
            android.view.View r7 = r5.rootAccessibilityView
            int r6 = r6.intValue()
            r8.setParent(r7, r6)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void setFlutterNodesTranslateBounds(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo;
        io.flutter.view.C1615l c1615l = this.flutterIdToOrigin.get(i4);
        if (c1615l == null) {
            return null;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.embeddedViewToDisplayBounds;
        android.view.View view = c1615l.f6787a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(c1615l.f6788b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i4, view);
    }

    public java.lang.Integer getRecordFlutterId(android.view.View view, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.Long m3569a = io.flutter.view.C1614k.m3569a(this.reflectionAccessors, accessibilityRecord);
        if (m3569a == null) {
            return null;
        }
        return this.originToFlutterId.get(new io.flutter.view.C1615l(view, (int) (m3569a.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View r6, int r7, android.graphics.Rect r8) {
        /*
            r5 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.createAccessibilityNodeInfo()
            io.flutter.view.k r1 = r5.reflectionAccessors
            java.lang.String r2 = "AccessibilityBridge"
            java.lang.reflect.Method r1 = r1.f6781a
            r3 = 0
            if (r1 != 0) goto Lf
        Ld:
            r1 = r3
            goto L26
        Lf:
            java.lang.Object r1 = r1.invoke(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            goto L26
        L16:
            r1 = move-exception
            goto L1a
        L18:
            r1 = move-exception
            goto L20
        L1a:
            java.lang.String r4 = "The getSourceNodeId method threw an exception when invoked."
            android.util.Log.w(r2, r4, r1)
            goto Ld
        L20:
            java.lang.String r4 = "Failed to access getSourceNodeId method."
            android.util.Log.w(r2, r4, r1)
            goto Ld
        L26:
            if (r1 != 0) goto L29
            return r3
        L29:
            java.util.Map<android.view.View, android.graphics.Rect> r2 = r5.embeddedViewToDisplayBounds
            r2.put(r6, r8)
            long r1 = r1.longValue()
            r8 = 32
            long r1 = r1 >> r8
            int r8 = (int) r1
            r5.cacheVirtualIdMappings(r6, r8, r7)
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.convertToFlutterNode(r0, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.getRootNode(android.view.View, int, android.graphics.Rect):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean onAccessibilityHoverEvent(int i4, android.view.MotionEvent motionEvent) {
        io.flutter.view.C1615l c1615l = this.flutterIdToOrigin.get(i4);
        if (c1615l == null) {
            return false;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.embeddedViewToDisplayBounds;
        android.view.View view = c1615l.f6787a;
        android.graphics.Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerPropertiesArr[i5] = pointerProperties;
            motionEvent.getPointerProperties(i5, pointerProperties);
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i5, pointerCoords);
            android.view.MotionEvent.PointerCoords pointerCoords2 = new android.view.MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i5] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i4, int i5, android.os.Bundle bundle) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        io.flutter.view.C1615l c1615l = this.flutterIdToOrigin.get(i4);
        if (c1615l == null || (accessibilityNodeProvider = c1615l.f6787a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(c1615l.f6788b, i5, bundle);
    }

    public android.view.View platformViewOfNode(int i4) {
        io.flutter.view.C1615l c1615l = this.flutterIdToOrigin.get(i4);
        if (c1615l == null) {
            return null;
        }
        return c1615l.f6787a;
    }

    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(accessibilityEvent);
        java.lang.Long m3569a = io.flutter.view.C1614k.m3569a(this.reflectionAccessors, accessibilityEvent);
        if (m3569a == null) {
            return false;
        }
        int longValue = (int) (m3569a.longValue() >> 32);
        java.lang.Integer num = this.originToFlutterId.get(new io.flutter.view.C1615l(view, longValue));
        if (num == null) {
            int i4 = this.nextFlutterId;
            this.nextFlutterId = i4 + 1;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i4);
            cacheVirtualIdMappings(view, longValue, i4);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i5 = 0; i5 < obtain.getRecordCount(); i5++) {
            android.view.accessibility.AccessibilityRecord record = obtain.getRecord(i5);
            java.lang.Long m3569a2 = io.flutter.view.C1614k.m3569a(this.reflectionAccessors, record);
            if (m3569a2 == null) {
                return false;
            }
            io.flutter.view.C1615l c1615l = new io.flutter.view.C1615l(view, (int) (m3569a2.longValue() >> 32));
            if (!this.originToFlutterId.containsKey(c1615l)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(c1615l).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
