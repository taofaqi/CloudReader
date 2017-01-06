package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class AppBarMainBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.ll_title_menu, 2);
        sViewsWithIds.put(R.id.iv_title_menu, 3);
        sViewsWithIds.put(R.id.iv_title_gank, 4);
        sViewsWithIds.put(R.id.iv_title_one, 5);
        sViewsWithIds.put(R.id.iv_title_dou, 6);
        sViewsWithIds.put(R.id.vp_content, 7);
        sViewsWithIds.put(R.id.fab, 8);
    }
    // views
    public final android.support.design.widget.FloatingActionButton fab;
    public final android.widget.ImageView ivTitleDou;
    public final android.widget.ImageView ivTitleGank;
    public final android.widget.ImageView ivTitleMenu;
    public final android.widget.ImageView ivTitleOne;
    public final android.widget.FrameLayout llTitleMenu;
    private final android.widget.LinearLayout mboundView0;
    public final android.support.v7.widget.Toolbar toolbar;
    public final android.support.v4.view.ViewPager vpContent;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AppBarMainBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.fab = (android.support.design.widget.FloatingActionButton) bindings[8];
        this.ivTitleDou = (android.widget.ImageView) bindings[6];
        this.ivTitleGank = (android.widget.ImageView) bindings[4];
        this.ivTitleMenu = (android.widget.ImageView) bindings[3];
        this.ivTitleOne = (android.widget.ImageView) bindings[5];
        this.llTitleMenu = (android.widget.FrameLayout) bindings[2];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[1];
        this.vpContent = (android.support.v4.view.ViewPager) bindings[7];
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

    public static AppBarMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AppBarMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AppBarMainBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.app_bar_main, root, attachToRoot, bindingComponent);
    }
    public static AppBarMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AppBarMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.app_bar_main, null, false), bindingComponent);
    }
    public static AppBarMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AppBarMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/app_bar_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AppBarMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}