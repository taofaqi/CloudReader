package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class NavHeaderMainBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_header_bg, 1);
        sViewsWithIds.put(R.id.iv_avatar, 2);
        sViewsWithIds.put(R.id.tv_username, 3);
        sViewsWithIds.put(R.id.tv_level, 4);
        sViewsWithIds.put(R.id.ll_nav_homepage, 5);
        sViewsWithIds.put(R.id.ll_nav_scan_download, 6);
        sViewsWithIds.put(R.id.ll_nav_deedback, 7);
        sViewsWithIds.put(R.id.ll_nav_about, 8);
    }
    // views
    public final android.widget.ImageView ivAvatar;
    public final android.widget.LinearLayout llHeaderBg;
    public final android.widget.LinearLayout llNavAbout;
    public final android.widget.LinearLayout llNavDeedback;
    public final android.widget.LinearLayout llNavHomepage;
    public final android.widget.LinearLayout llNavScanDownload;
    private final android.widget.LinearLayout mboundView0;
    public final android.widget.TextView tvLevel;
    public final android.widget.TextView tvUsername;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NavHeaderMainBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.ivAvatar = (android.widget.ImageView) bindings[2];
        this.llHeaderBg = (android.widget.LinearLayout) bindings[1];
        this.llNavAbout = (android.widget.LinearLayout) bindings[8];
        this.llNavDeedback = (android.widget.LinearLayout) bindings[7];
        this.llNavHomepage = (android.widget.LinearLayout) bindings[5];
        this.llNavScanDownload = (android.widget.LinearLayout) bindings[6];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvLevel = (android.widget.TextView) bindings[4];
        this.tvUsername = (android.widget.TextView) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<NavHeaderMainBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.nav_header_main, root, attachToRoot, bindingComponent);
    }
    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.nav_header_main, null, false), bindingComponent);
    }
    public static NavHeaderMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static NavHeaderMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/nav_header_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new NavHeaderMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}