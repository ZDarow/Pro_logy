package p121e;

/* renamed from: e.a */
/* loaded from: classes.dex */
public abstract class AbstractC1299a {

    /* renamed from: a */
    public static final int[] f5185a = {com.prology.R.attr.background, com.prology.R.attr.backgroundSplit, com.prology.R.attr.backgroundStacked, com.prology.R.attr.contentInsetEnd, com.prology.R.attr.contentInsetEndWithActions, com.prology.R.attr.contentInsetLeft, com.prology.R.attr.contentInsetRight, com.prology.R.attr.contentInsetStart, com.prology.R.attr.contentInsetStartWithNavigation, com.prology.R.attr.customNavigationLayout, com.prology.R.attr.displayOptions, com.prology.R.attr.divider, com.prology.R.attr.elevation, com.prology.R.attr.height, com.prology.R.attr.hideOnContentScroll, com.prology.R.attr.homeAsUpIndicator, com.prology.R.attr.homeLayout, com.prology.R.attr.icon, com.prology.R.attr.indeterminateProgressStyle, com.prology.R.attr.itemPadding, com.prology.R.attr.logo, com.prology.R.attr.navigationMode, com.prology.R.attr.popupTheme, com.prology.R.attr.progressBarPadding, com.prology.R.attr.progressBarStyle, com.prology.R.attr.subtitle, com.prology.R.attr.subtitleTextStyle, com.prology.R.attr.title, com.prology.R.attr.titleTextStyle};

    /* renamed from: b */
    public static final int[] f5186b = {android.R.attr.layout_gravity};

    /* renamed from: c */
    public static final int[] f5187c = {android.R.attr.minWidth};

    /* renamed from: d */
    public static final int[] f5188d = {com.prology.R.attr.background, com.prology.R.attr.backgroundSplit, com.prology.R.attr.closeItemLayout, com.prology.R.attr.height, com.prology.R.attr.subtitleTextStyle, com.prology.R.attr.titleTextStyle};

    /* renamed from: e */
    public static final int[] f5189e = {android.R.attr.src, com.prology.R.attr.srcCompat, com.prology.R.attr.tint, com.prology.R.attr.tintMode};

    /* renamed from: f */
    public static final int[] f5190f = {android.R.attr.textAppearance, android.R.attr.drawableTop, android.R.attr.drawableBottom, android.R.attr.drawableLeft, android.R.attr.drawableRight, android.R.attr.drawableStart, android.R.attr.drawableEnd};

    /* renamed from: g */
    public static final int[] f5191g = {android.R.attr.textAppearance, com.prology.R.attr.autoSizeMaxTextSize, com.prology.R.attr.autoSizeMinTextSize, com.prology.R.attr.autoSizePresetSizes, com.prology.R.attr.autoSizeStepGranularity, com.prology.R.attr.autoSizeTextType, com.prology.R.attr.drawableBottomCompat, com.prology.R.attr.drawableEndCompat, com.prology.R.attr.drawableLeftCompat, com.prology.R.attr.drawableRightCompat, com.prology.R.attr.drawableStartCompat, com.prology.R.attr.drawableTint, com.prology.R.attr.drawableTintMode, com.prology.R.attr.drawableTopCompat, com.prology.R.attr.firstBaselineToTopHeight, com.prology.R.attr.fontFamily, com.prology.R.attr.fontVariationSettings, com.prology.R.attr.lastBaselineToBottomHeight, com.prology.R.attr.lineHeight, com.prology.R.attr.textAllCaps, com.prology.R.attr.textLocale};

    /* renamed from: h */
    public static final int[] f5192h = {android.R.attr.windowIsFloating, android.R.attr.windowAnimationStyle, com.prology.R.attr.actionBarDivider, com.prology.R.attr.actionBarItemBackground, com.prology.R.attr.actionBarPopupTheme, com.prology.R.attr.actionBarSize, com.prology.R.attr.actionBarSplitStyle, com.prology.R.attr.actionBarStyle, com.prology.R.attr.actionBarTabBarStyle, com.prology.R.attr.actionBarTabStyle, com.prology.R.attr.actionBarTabTextStyle, com.prology.R.attr.actionBarTheme, com.prology.R.attr.actionBarWidgetTheme, com.prology.R.attr.actionButtonStyle, com.prology.R.attr.actionDropDownStyle, com.prology.R.attr.actionMenuTextAppearance, com.prology.R.attr.actionMenuTextColor, com.prology.R.attr.actionModeBackground, com.prology.R.attr.actionModeCloseButtonStyle, com.prology.R.attr.actionModeCloseContentDescription, com.prology.R.attr.actionModeCloseDrawable, com.prology.R.attr.actionModeCopyDrawable, com.prology.R.attr.actionModeCutDrawable, com.prology.R.attr.actionModeFindDrawable, com.prology.R.attr.actionModePasteDrawable, com.prology.R.attr.actionModePopupWindowStyle, com.prology.R.attr.actionModeSelectAllDrawable, com.prology.R.attr.actionModeShareDrawable, com.prology.R.attr.actionModeSplitBackground, com.prology.R.attr.actionModeStyle, com.prology.R.attr.actionModeTheme, com.prology.R.attr.actionModeWebSearchDrawable, com.prology.R.attr.actionOverflowButtonStyle, com.prology.R.attr.actionOverflowMenuStyle, com.prology.R.attr.activityChooserViewStyle, com.prology.R.attr.alertDialogButtonGroupStyle, com.prology.R.attr.alertDialogCenterButtons, com.prology.R.attr.alertDialogStyle, com.prology.R.attr.alertDialogTheme, com.prology.R.attr.autoCompleteTextViewStyle, com.prology.R.attr.borderlessButtonStyle, com.prology.R.attr.buttonBarButtonStyle, com.prology.R.attr.buttonBarNegativeButtonStyle, com.prology.R.attr.buttonBarNeutralButtonStyle, com.prology.R.attr.buttonBarPositiveButtonStyle, com.prology.R.attr.buttonBarStyle, com.prology.R.attr.buttonStyle, com.prology.R.attr.buttonStyleSmall, com.prology.R.attr.checkboxStyle, com.prology.R.attr.checkedTextViewStyle, com.prology.R.attr.colorAccent, com.prology.R.attr.colorBackgroundFloating, com.prology.R.attr.colorButtonNormal, com.prology.R.attr.colorControlActivated, com.prology.R.attr.colorControlHighlight, com.prology.R.attr.colorControlNormal, com.prology.R.attr.colorError, com.prology.R.attr.colorPrimary, com.prology.R.attr.colorPrimaryDark, com.prology.R.attr.colorSwitchThumbNormal, com.prology.R.attr.controlBackground, com.prology.R.attr.dialogCornerRadius, com.prology.R.attr.dialogPreferredPadding, com.prology.R.attr.dialogTheme, com.prology.R.attr.dividerHorizontal, com.prology.R.attr.dividerVertical, com.prology.R.attr.dropDownListViewStyle, com.prology.R.attr.dropdownListPreferredItemHeight, com.prology.R.attr.editTextBackground, com.prology.R.attr.editTextColor, com.prology.R.attr.editTextStyle, com.prology.R.attr.homeAsUpIndicator, com.prology.R.attr.imageButtonStyle, com.prology.R.attr.listChoiceBackgroundIndicator, com.prology.R.attr.listChoiceIndicatorMultipleAnimated, com.prology.R.attr.listChoiceIndicatorSingleAnimated, com.prology.R.attr.listDividerAlertDialog, com.prology.R.attr.listMenuViewStyle, com.prology.R.attr.listPopupWindowStyle, com.prology.R.attr.listPreferredItemHeight, com.prology.R.attr.listPreferredItemHeightLarge, com.prology.R.attr.listPreferredItemHeightSmall, com.prology.R.attr.listPreferredItemPaddingEnd, com.prology.R.attr.listPreferredItemPaddingLeft, com.prology.R.attr.listPreferredItemPaddingRight, com.prology.R.attr.listPreferredItemPaddingStart, com.prology.R.attr.panelBackground, com.prology.R.attr.panelMenuListTheme, com.prology.R.attr.panelMenuListWidth, com.prology.R.attr.popupMenuStyle, com.prology.R.attr.popupWindowStyle, com.prology.R.attr.radioButtonStyle, com.prology.R.attr.ratingBarStyle, com.prology.R.attr.ratingBarStyleIndicator, com.prology.R.attr.ratingBarStyleSmall, com.prology.R.attr.searchViewStyle, com.prology.R.attr.seekBarStyle, com.prology.R.attr.selectableItemBackground, com.prology.R.attr.selectableItemBackgroundBorderless, com.prology.R.attr.spinnerDropDownItemStyle, com.prology.R.attr.spinnerStyle, com.prology.R.attr.switchStyle, com.prology.R.attr.textAppearanceLargePopupMenu, com.prology.R.attr.textAppearanceListItem, com.prology.R.attr.textAppearanceListItemSecondary, com.prology.R.attr.textAppearanceListItemSmall, com.prology.R.attr.textAppearancePopupMenuHeader, com.prology.R.attr.textAppearanceSearchResultSubtitle, com.prology.R.attr.textAppearanceSearchResultTitle, com.prology.R.attr.textAppearanceSmallPopupMenu, com.prology.R.attr.textColorAlertDialogListItem, com.prology.R.attr.textColorSearchUrl, com.prology.R.attr.toolbarNavigationButtonStyle, com.prology.R.attr.toolbarStyle, com.prology.R.attr.tooltipForegroundColor, com.prology.R.attr.tooltipFrameBackground, com.prology.R.attr.viewInflaterClass, com.prology.R.attr.windowActionBar, com.prology.R.attr.windowActionBarOverlay, com.prology.R.attr.windowActionModeOverlay, com.prology.R.attr.windowFixedHeightMajor, com.prology.R.attr.windowFixedHeightMinor, com.prology.R.attr.windowFixedWidthMajor, com.prology.R.attr.windowFixedWidthMinor, com.prology.R.attr.windowMinWidthMajor, com.prology.R.attr.windowMinWidthMinor, com.prology.R.attr.windowNoTitle};

    /* renamed from: i */
    public static final int[] f5193i = {com.prology.R.attr.allowStacking};

    /* renamed from: j */
    public static final int[] f5194j = {android.R.attr.gravity, android.R.attr.orientation, android.R.attr.baselineAligned, android.R.attr.baselineAlignedChildIndex, android.R.attr.weightSum, com.prology.R.attr.divider, com.prology.R.attr.dividerPadding, com.prology.R.attr.measureWithLargestChild, com.prology.R.attr.showDividers};

    /* renamed from: k */
    public static final int[] f5195k = {android.R.attr.dropDownHorizontalOffset, android.R.attr.dropDownVerticalOffset};

    /* renamed from: l */
    public static final int[] f5196l = {android.R.attr.enabled, android.R.attr.id, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.checkableBehavior};

    /* renamed from: m */
    public static final int[] f5197m = {android.R.attr.icon, android.R.attr.enabled, android.R.attr.id, android.R.attr.checked, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.title, android.R.attr.titleCondensed, android.R.attr.alphabeticShortcut, android.R.attr.numericShortcut, android.R.attr.checkable, android.R.attr.onClick, com.prology.R.attr.actionLayout, com.prology.R.attr.actionProviderClass, com.prology.R.attr.actionViewClass, com.prology.R.attr.alphabeticModifiers, com.prology.R.attr.contentDescription, com.prology.R.attr.iconTint, com.prology.R.attr.iconTintMode, com.prology.R.attr.numericModifiers, com.prology.R.attr.showAsAction, com.prology.R.attr.tooltipText};

    /* renamed from: n */
    public static final int[] f5198n = {android.R.attr.windowAnimationStyle, android.R.attr.itemTextAppearance, android.R.attr.horizontalDivider, android.R.attr.verticalDivider, android.R.attr.headerBackground, android.R.attr.itemBackground, android.R.attr.itemIconDisabledAlpha, com.prology.R.attr.preserveIconSpacing, com.prology.R.attr.subMenuArrow};

    /* renamed from: o */
    public static final int[] f5199o = {android.R.attr.popupBackground, android.R.attr.popupAnimationStyle, com.prology.R.attr.overlapAnchor};

    /* renamed from: p */
    public static final int[] f5200p = {com.prology.R.attr.paddingBottomNoButtons, com.prology.R.attr.paddingTopNoTitle};

    /* renamed from: q */
    public static final int[] f5201q = {android.R.attr.focusable, android.R.attr.maxWidth, android.R.attr.inputType, android.R.attr.imeOptions, com.prology.R.attr.closeIcon, com.prology.R.attr.commitIcon, com.prology.R.attr.defaultQueryHint, com.prology.R.attr.goIcon, com.prology.R.attr.iconifiedByDefault, com.prology.R.attr.layout, com.prology.R.attr.queryBackground, com.prology.R.attr.queryHint, com.prology.R.attr.searchHintIcon, com.prology.R.attr.searchIcon, com.prology.R.attr.submitBackground, com.prology.R.attr.suggestionRowLayout, com.prology.R.attr.voiceIcon};

    /* renamed from: r */
    public static final int[] f5202r = {android.R.attr.textOn, android.R.attr.textOff, android.R.attr.thumb, com.prology.R.attr.showText, com.prology.R.attr.splitTrack, com.prology.R.attr.switchMinWidth, com.prology.R.attr.switchPadding, com.prology.R.attr.switchTextAppearance, com.prology.R.attr.thumbTextPadding, com.prology.R.attr.thumbTint, com.prology.R.attr.thumbTintMode, com.prology.R.attr.track, com.prology.R.attr.trackTint, com.prology.R.attr.trackTintMode};

    /* renamed from: s */
    public static final int[] f5203s = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, com.prology.R.attr.fontFamily, com.prology.R.attr.fontVariationSettings, com.prology.R.attr.textAllCaps, com.prology.R.attr.textLocale};

    /* renamed from: t */
    public static final int[] f5204t = {android.R.attr.gravity, android.R.attr.minHeight, com.prology.R.attr.buttonGravity, com.prology.R.attr.collapseContentDescription, com.prology.R.attr.collapseIcon, com.prology.R.attr.contentInsetEnd, com.prology.R.attr.contentInsetEndWithActions, com.prology.R.attr.contentInsetLeft, com.prology.R.attr.contentInsetRight, com.prology.R.attr.contentInsetStart, com.prology.R.attr.contentInsetStartWithNavigation, com.prology.R.attr.logo, com.prology.R.attr.logoDescription, com.prology.R.attr.maxButtonHeight, com.prology.R.attr.menu, com.prology.R.attr.navigationContentDescription, com.prology.R.attr.navigationIcon, com.prology.R.attr.popupTheme, com.prology.R.attr.subtitle, com.prology.R.attr.subtitleTextAppearance, com.prology.R.attr.subtitleTextColor, com.prology.R.attr.title, com.prology.R.attr.titleMargin, com.prology.R.attr.titleMarginBottom, com.prology.R.attr.titleMarginEnd, com.prology.R.attr.titleMarginStart, com.prology.R.attr.titleMarginTop, com.prology.R.attr.titleMargins, com.prology.R.attr.titleTextAppearance, com.prology.R.attr.titleTextColor};

    /* renamed from: u */
    public static final int[] f5205u = {android.R.attr.background, com.prology.R.attr.backgroundTint, com.prology.R.attr.backgroundTintMode};

    /* renamed from: v */
    public static final int[] f5206v = {android.R.attr.id, android.R.attr.layout, android.R.attr.inflatedId};
}
